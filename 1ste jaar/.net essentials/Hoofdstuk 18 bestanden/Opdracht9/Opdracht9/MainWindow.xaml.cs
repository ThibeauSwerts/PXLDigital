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

namespace Opdracht9
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    { private string filePath;
        public MainWindow()
        {
            InitializeComponent();
        }

        private void openItem_Click(object sender, RoutedEventArgs e)
        {  // lezen via Dialoogvenster startdirectory MijnDocumenten, alleen txt files
            StreamReader reader = null;
            try
            {
                OpenFileDialog dialog = new OpenFileDialog();
                dialog.InitialDirectory = Environment.GetFolderPath(Environment.SpecialFolder.MyDocuments);
                dialog.Filter = "Text Files|*.txt";
                if (dialog.ShowDialog() == true)
                {
                    filePath = dialog.FileName;
                    reader = File.OpenText(dialog.FileName);
                    outputTextBox.Text = reader.ReadToEnd();
                    if (outputTextBox.Text != "")
                    {
                        rewriteItem.IsEnabled = true;
                    }
                }
            }
            catch (FileNotFoundException ex)
            {
                MessageBox.Show(ex.Message);
            }
            finally
            {
                reader?.Close();
            }

        }

        private void rewriteItem_Click(object sender, RoutedEventArgs e)
        { // zie opgave powerpoint bvb allemAal567 =>LllemLLl567
            string text = outputTextBox.Text.Trim();
            int place = text.Length - 1;
            while (!Char.IsLetter(text[place]))
            {
                place -= 1;
            }
            char last = Char.ToUpper(text[place]);
            char first = text[0];
            text = text.Replace(Char.ToLower(first), last);
            text = text.Replace(Char.ToUpper(first), last);
            outputTextBox.Text = text;
            appendItem.IsEnabled = true;

        }

        private void appendItem_Click(object sender, RoutedEventArgs e)
        {
            StreamWriter writer = null;
            try
            {
                FileStream fileStream = new FileStream(filePath, FileMode.Append, FileAccess.Write);
                writer = new StreamWriter(fileStream);
                writer.WriteLine(outputTextBox.Text);
                outputTextBox.Clear();
                appendItem.IsEnabled = false;
                rewriteItem.IsEnabled = false;
            }
            catch(IOException ex)
            {
                MessageBox.Show(ex.Message);
            }
            finally
            {
                writer?.Close();
            }
        }

        private void MenuItem_Click(object sender, RoutedEventArgs e)
        {
            Environment.Exit(0);
        }
    }
}
