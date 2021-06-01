using Prey_predator.Contracts;
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

namespace Prey_predator
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {

        private IAnimalWorld _insectWorld;
        public MainWindow()
        {

            InitializeComponent();

            _insectWorld = new AnimalWorld(paperCanvas);

            for (int i = 0; i < 10; i++)
            {
                _insectWorld.AddAnimal(new LadyBug());
            }

            for (int i=0; i<100; i++)
            {
                _insectWorld.AddAnimal(new Louse());
            }
            
            DisplayStatistics();
        }

        private void volgendeRondeButton_Click(object sender, RoutedEventArgs e)
        {
            _insectWorld.ProcessRound();
            DisplayStatistics();
        }

        private void DisplayStatistics()
        {
            int aantalLadyBugs = 0;
            rondeNummerLabel.Content = _insectWorld.CurrentRoundNumber;
            foreach(Animal animal in _insectWorld.AllAnimals)
            {
                if (animal is LadyBug)
                {
                    aantalLadyBugs++;
                }
            }
            lieveheersbeesjesNummerLabel.Content = aantalLadyBugs;
            luizenNummerLabel.Content = (_insectWorld.AllAnimals.Count - aantalLadyBugs);
        }
    }
}
