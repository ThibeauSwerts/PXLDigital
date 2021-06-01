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

namespace Opgave_13._8
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {

        private List<Person> personList;
        public MainWindow()
        {
            InitializeComponent();

            personList = new List<Person>()
            {
                new Person("Kris", "Hermans","barry's weg 42","08484595945894","08/08/2000"),
                new Person("Marijke", "Stasik","barry's weg 43","08484595945895","07/04/2000"),
                new Person("Ann", "Beelen","barry's weg 44","08484595945896","06/08/2000"),
                new Person("Jos", "Vastmans","barry's weg 45","08484595945897","08/06/2000"),
                new Person("Ella", "Hermans","barry's weg 46","08484595945898","01/03/2000"),
                new Person("Gilles", "Hermans","barry's weg 47","08484595945899","08/07/2000")
            };

            personListBox.ItemsSource = personList;
        }

        private void Button_Click(object sender, RoutedEventArgs e)=>
            new Details(new Person("", "", "", "", ""),this).ShowDialog();

        private void PersonInfo(object sender, MouseButtonEventArgs e)=>
            new Details(personList[personListBox.SelectedIndex], this).ShowDialog();

        public void AddPerson(Person person)
        {
            personList.Add(person);
            personListBox.Items.Refresh();
        }

        public void UpdatePersonInfo(Person newPerson)
        {
            personList[personListBox.SelectedIndex] = newPerson;
            personListBox.Items.Refresh();
        }
    }
}
