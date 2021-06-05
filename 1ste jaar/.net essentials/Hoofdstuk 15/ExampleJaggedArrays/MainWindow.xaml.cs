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

namespace ExampleJaggedArrays
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

        private void displayButton_Click(object sender, RoutedEventArgs e)
        {

            CreateTriangle();
        }

        private void CreateTriangle()
        {
            int size = Int32.Parse(sizeTextBox.Text);
            char start = Char.ToUpper(startTextBox.Text[0]);
            char[][] alfa = new char[size][];
            for (int i = 0; i < size; i++)
            {
                alfa[i] = new char[i + 1];
            }
            for (int i = 0; i < alfa.Length; i++)
            {
                char kar = start;
                for (int j = 0; j < alfa[i].Length; j++)
                {
                    alfa[i][j] = kar;
                    kar++;     // of kar =(char)( kar + 1);
                    if (kar > 'Z')
                    {
                        kar = 'A';
                    }
                }
            }
            Print(alfa);
        }
        private void Print(char[][] data)
        {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < data.Length; i++)
            {
                for (int j = 0; j < data[i].Length; j++)
                {
                    stringBuilder.Append(data[i][j] + "\t");
                }
                stringBuilder.Append(Environment.NewLine);
            }
            infoTextBox.Text = stringBuilder.ToString();
        }
    }
}
