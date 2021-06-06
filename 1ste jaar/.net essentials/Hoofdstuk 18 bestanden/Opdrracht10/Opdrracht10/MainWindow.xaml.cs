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

namespace Opdracht10
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// listbox met Person objecten (klasse Person uit H22 ExampleList)
    /// </summary>
    public partial class MainWindow : Window
    {
        private List<Person> personlist;
        public MainWindow()
        {
            InitializeComponent();
            personlist = new List<Person>()
            {
                new Person("Tristan", "Franssen", "12/5/1985"),
                new Person("Joeri", "Gerrits", "12/12/1981"),
                new Person("Rob", "XXX", "4/8/2012")
            };
            personListBox.ItemsSource = personlist;
        }
        // wat is de visuele voorstelling van een object? ToString methode wordt gebruikt!

        private void personListBox_MouseDoubleClick(object sender, MouseButtonEventArgs e)
        {
            Person person = personListBox.SelectedItem as Person; // of personList[personListBox.SelectedIndex]
            MessageBox.Show($"{person} is {person.Age} years old");
            // extra selectie ongedaan maken na tonen van de MessageBox?
            personListBox.SelectedItem = null; // opgepast er wordt een selectionChanged event gegeneerd



        }
        // bij klikken geselecteerde al dan niet verwijderen
        private void personListBox_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            int index = personListBox.SelectedIndex;
            if (index != -1)
            {
                if (MessageBox.Show("Do you want to delete this person", personlist[index].ToString(), MessageBoxButton.OKCancel, MessageBoxImage.Warning) == MessageBoxResult.OK)
                {
                    personlist.RemoveAt(index);
                    personListBox.Items.Refresh(); // listbox en list zijn niet gesynchroniseerd
                }
            }
        }
    }
}
