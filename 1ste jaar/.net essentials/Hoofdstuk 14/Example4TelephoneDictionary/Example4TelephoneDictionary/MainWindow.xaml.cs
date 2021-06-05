using System.Collections.Generic;
using System.Diagnostics;
using System.Windows;

namespace Example4TelephoneDictionary
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        private string[] names = { "An", "Piet", "Jan", "Mo", "Eray", "Cindy", "Mark", "Semih", "Kathleen", "Jari" };
        private string[] numbers =
            { "0472151698", "0476895896", "011548967", "012457896", "0478596836", "0472345678", "013464545", "011788966", "0478455469", "011234569"};
        private Stopwatch stopwatch = new Stopwatch();
        // aanmaken dictionary
        private Dictionary<string, string> lookup = new Dictionary<string, string>();

        public MainWindow()
        {
            InitializeComponent();
            // elementen toevoegen aan de dictionary
            for (int i = 0; i < names.Length; i++)
            {
                lookup.Add(names[i], numbers[i]);
            }


        }

        private void FindButton_Click(object sender, RoutedEventArgs e)
        {
            string search = nameTextBox.Text;
            StartTiming();
            try
            {
                outputTextBlock.Text = $"number is {lookup[search]}";
                StopTiming("Found");
            }
            catch (KeyNotFoundException)
            {
                outputTextBlock.Text = $"number not found";
                StopTiming("Not found");
            }
        }
        private void StartTiming()
        {
            stopwatch.Start();
        }
        private void StopTiming(string comment)
        {
            stopwatch.Stop();
            MessageBox.Show($"{comment} in {stopwatch.Elapsed.TotalMilliseconds} milliseconds");
            stopwatch.Reset(); // opdat de stopwatch(chronometer) terug van 0 begint te meten
        }

    }
}
