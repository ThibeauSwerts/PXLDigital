using System;
using System.Collections.Generic;
using System.Text;
using System.Windows;

namespace Example1Array1dim
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// vertrekkend van boekcode Rainfall => oef 14.4
    /// </summary>
    public partial class MainWindow : Window
    {
        private int[] rainAmounts = { 7, 8, 0, 4, 3, 8, 1 };
        private string[] days = {"monday", "tuesday", "wednesday", "thursday",
        "friday", "saturday", "sunday"};
        
        public MainWindow()
        {
            InitializeComponent();
            Display();
            ShowLargest();
            ShowTotal();
        }

        private void Display()
        {
            rainfallTextBox.Clear();
            for (int dayNumber = 0; dayNumber < rainAmounts.Length; dayNumber++)
            {           
                rainfallTextBox.AppendText($"day {dayNumber} rain {rainAmounts[dayNumber]}");
                rainfallTextBox.AppendText(Environment.NewLine); // \n
            }
        }
        // invoercontrole op de raindata => >=0 en <=100 => exceptionhandling
        // hulpklasse Validation om te controleren
        // hier geen Exceptions afhandelen maar wel in de eventhandler van de changebutton
        // andere exceptions hier ook niet afhandelen maar in de eventhandler van de changebutton
        // wel met een eigen boodschap
        private void ModifyAmount()
        {
            try
            {
                int index = Convert.ToInt32(indexTextBox.Text);
                int data = Validation.ValidateRain(Convert.ToInt32(valueTextBox.Text));
                rainAmounts[index] = data;
                Display();
                ShowLargest();
                ShowTotal();
            } 
            catch (FormatException)
            {
                throw new InputException("data should be an integer");
            }
            catch (IndexOutOfRangeException)
            {
                throw new InputException($"index should be >= 0 and < {rainAmounts.Length}");
            }
        }

        private void ShowLargest()
        {
            int largest = rainAmounts[0];
            for (int index = 1; index < rainAmounts.Length; index++)
            {
                if (largest < rainAmounts[index])
                {
                    largest = rainAmounts[index];
                }
            }
            List<int> indexLargestList = new List<int>();
            for (int index = 0; index <rainAmounts.Length; index++)
            {
                if (largest == rainAmounts[index])
                {
                    indexLargestList.Add(index);
                }
            }
            StringBuilder stringBuilder = new StringBuilder($"on days: {days[indexLargestList[0]]}");
            for (int index = 1; index < indexLargestList.Count; index++)
            {
                stringBuilder.Append($" and {days[indexLargestList[index]]}");
            }
            largestTextBlock.Text = $"Largest value is {largest} {stringBuilder}";
        }

        private void changeButton_Click(object sender, RoutedEventArgs e)
        {
            try
            {
                ModifyAmount();
            }
            catch (InputException ex)
            {
                MessageBox.Show(ex.Message);
            }
        }
        // totaal berekenen van de raindata: oef 14.4
        private void ShowTotal()
        {
            int total = 0;
            foreach (int rain in rainAmounts)
            {
                total += rain;
            }
            totalLabel.Content = $"Weektotal is: {total}";
        }

        
    }
}
