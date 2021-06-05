using System.Diagnostics;
using System.Windows;

namespace Example3TelephoneArray
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

        public MainWindow()
        {
            InitializeComponent();

        }

        private void FindButton_Click(object sender, RoutedEventArgs e)
        {
            string search = nameTextBox.Text;
            StartTiming();
            for (int i = 0; i < names.Length; i++)
            {
                if (search == names[i])
                {
                    outputTextBlock.Text = $"number is {numbers[i]}";
                    StopTiming("Found");
                    return;
                }
            }
            outputTextBlock.Text = $"number not found";
            StopTiming("Not found");
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
