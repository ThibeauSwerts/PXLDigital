using System;
using System.Text;
using System.Windows;

namespace Example1Array2dim
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// vertrekkend van de boekcode H15 Rainfall zie boek oefening 15.1
    /// extra hoe ervoor zorgen dat de code in de main korter en dus leesbaarder wordt? => gebruik maken van een hulpklasse
    /// </summary>
    public partial class MainWindow : Window
    {
        private int[,] rainData = {{10, 7, 3, 28, 5, 6, 3},
                                   {12, 3, 5, 7, 12, 5, 8},
                                   {8, 5, 2, 1, 1, 4, 7}};
        private string[] towns = { "Leuven", "Hasselt", "Brugge" };
        private string[] days = { "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday" };
        public MainWindow()
        {
            InitializeComponent();
            Display();
            CalculateTotal();
        }

        private void changeButton_Click(object sender, RoutedEventArgs e)
        {
            ChangeValue();
            Reset();
        }

        private void ChangeValue() // we gaan er vanuit dat de gebruiker de gegevens juist ingeeft
        {
            int dayNumber = Convert.ToInt32(dayTextBox.Text);
            int location = Convert.ToInt32(locationTextBox.Text);
            int amount = Convert.ToInt32(valueTextBox.Text);
            rainData[location, dayNumber] = amount;
            Display();
            CalculateTotal();
        }

        private void Display()
        {
            dataTextBox.Clear();
            for (int locationIndex = 0; locationIndex < rainData.GetLength(0); locationIndex++)
            {
                for (int dayNumber = 0; dayNumber < rainData.GetLength(1); dayNumber++)
                {
                    dataTextBox.AppendText($"{rainData[locationIndex, dayNumber]}\t");
                }
                dataTextBox.AppendText(Environment.NewLine);
            }
        }

        private void CalculateTotal()
        {
            totalLabel.Content = $"Total rainfall is {ArrayComputation.CalculateTotal(rainData)}";
            
        }

        private void largestButton_Click(object sender, RoutedEventArgs e)
        {
      
            largestTextBox.Text = ArrayComputation.LargestWithTekst(rainData, towns, days);
        }

        private void Reset()
        {
            largestTextBox.Clear();
            dayTextBox.Clear();
            locationTextBox.Clear();
            valueTextBox.Clear();
        }
    }
}
