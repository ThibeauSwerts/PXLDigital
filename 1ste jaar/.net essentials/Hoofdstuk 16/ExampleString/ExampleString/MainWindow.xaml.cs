using System;
using System.Collections.Generic;
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

namespace ExampleString
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

        private void inputTextBox_MouseEnter(object sender, MouseEventArgs e)
        {
            inputTextBox.Clear();
        }

        private void executeButton_Click(object sender, RoutedEventArgs e)
        {
            // alle woorden waaruit de tekst bestaat alfabetisch rangschikken spaties tussen de woorden
            //string[] wordsArray = inputTextBox.Text.Trim().Split(' ');
            // wat als je spatie , ? : en . toelaat
            char[] signs = { ' ', ',', ':', '.', '?' };
            string[] wordsArray = inputTextBox.Text.Trim().Split(signs);
            List<string> list = new List<string>(); // om te kunnen sorteren
            foreach(string word in wordsArray)
            {// woorden beginnend met A of a mogen niet in de lijst voorkomen, mogen niet beginnen met een cijfer
                if (word !="" && Char.ToUpper(word[0]) != 'A' && !Char.IsDigit(word[0]))
                { // nagaan of er minstens 2 e's voorkomen (hoofdletter of kleine letter) + de juiste locatie
                    int firstIndex = word.ToLower().IndexOf("e");
                    int lastIndex = word.ToLower().LastIndexOf("e");
                    if (firstIndex != lastIndex)
                    {
                        StringBuilder stringBuilder1 = new StringBuilder(word.Substring(firstIndex + 1, lastIndex - (firstIndex + 1)));
                        // opgepast dit is in Java anders  2de argument is de lengte van de substring
                        // vooraan X toevoegen
                        for (int i = 0; i <= firstIndex; i++)
                        {
                            stringBuilder1.Insert(0, "X");
                        }

                        // achteraan Y toevoegen
                        for (int i = lastIndex; i < word.Length; i++)
                        {
                            stringBuilder1.Append("Y");
                        }
                        list.Add(stringBuilder1.ToString());
                    }
                    else
                    {


                        list.Add(word);
                    }
                }
               

            }
            list.Sort();
            StringBuilder stringBuilder = new StringBuilder();
            foreach (string word in list)
            {
                stringBuilder.Append(word + " ");
            }
            inputTextBox.Text = stringBuilder.ToString();



        }
    }
}
