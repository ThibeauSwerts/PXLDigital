using Microsoft.Win32;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace Reading
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }
        // op examen steeds meest voorkomende exception opvangen
        // altijd in finally gedeelte sluiten
        private void reading1Button_Click(object sender, RoutedEventArgs e)
        {
            // lezen van een bestand onder \bin\debug
            StreamReader streamReader = null;
            try
            {
                streamReader = File.OpenText("writing1.txt");
                inputTextBox.Text = streamReader.ReadToEnd();
            }
            catch (FileNotFoundException)
            {
                MessageBox.Show("bestand niet gevonden");
            }
            finally
            {
                //if (streamReader != null)
                //{
                //    streamReader.Close();
                //}
                // of korter
                streamReader?.Close();
            }
        }

        private void reading2Button_Click(object sender, RoutedEventArgs e)
        {
            // lezen van bestand H18\Writing\
            StreamReader streamReader = File.OpenText(@"C:\Users\20002375\Documents\Ingrid\C#\20202021\klassen\1TING\H18\Writing\writing2.txt");
            inputTextBox.Text = streamReader.ReadToEnd();
            streamReader.Close();
        }

        private void reading3Button_Click(object sender, RoutedEventArgs e)
        {
            // lezen van bestand op bureaublad
            string pathName = Environment.GetFolderPath(Environment.SpecialFolder.Desktop);
            string filePath = System.IO.Path.Combine(pathName, "writing3.txt");
            StreamReader reader = File.OpenText(filePath);
            int countWords = 0;
            StringBuilder stringBuilder = new StringBuilder();
            string line = reader.ReadLine();
            while (line != null)
            {
                string[] words = line.Split(' ');
                countWords += words.Length;
                stringBuilder.Append(line + "\n");
                line = reader.ReadLine();
            }
            stringBuilder.Append($"Deze tekst bestaat uit {countWords} woorden");
            inputTextBox.Text = stringBuilder.ToString();
            reader.Close();
        }

        private void reading4Button_Click(object sender, RoutedEventArgs e)
        {
            // lezen van bestand onder \bin\debug mbv filestream
            StreamReader reader = null;
            try
            {
                FileStream fileStream = new FileStream("writing1.txt", FileMode.Open, FileAccess.Read);
                reader = new StreamReader(fileStream);
                inputTextBox.Text = reader.ReadToEnd();
            }
            catch(IOException ex)
            {
                MessageBox.Show(ex.Message);
            }
            finally
            {
                reader?.Close();
            }

        }

        private void reading5Button_Click(object sender, RoutedEventArgs e)
        {
            // lezen van bestand mbhv dialoogvenster
            StreamReader reader = null;
            try
            {
                OpenFileDialog openFileDialog = new OpenFileDialog();
                // startdirectory bureaublad
                openFileDialog.InitialDirectory = Environment.GetFolderPath(Environment.SpecialFolder.Desktop);
                // alleen txt bestanden + word documenten
                openFileDialog.Filter = "Text files|*.txt|Word files|*.doc;*.docx";
                if (openFileDialog.ShowDialog() == true) // gebruiker klikt openen
                {
                    reader = File.OpenText(openFileDialog.FileName);
                    inputTextBox.Text = reader.ReadToEnd();
                }
            } catch(IOException ex)
            {
                MessageBox.Show(ex.Message);
            }
            finally
            {
                reader?.Close();
            }
        }
    }
}
