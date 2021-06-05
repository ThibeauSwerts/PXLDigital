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

namespace ExampleList
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
            MessageBox.Show("open de output window");
            // maak een generische lijst van personen
            List<Person> personList = new List<Person>();
            // voeg 3 personen toe aan deze lijst
            personList.Add(new Person("Bart", "Peeters", "18/5/1964"));
            personList.Add(new Person("Tristan", "Franssen", "12/02/1986"));
            personList.Add(new Person("Piet", "XXXX", "1/12/20"));
            // afdrukken van alle personen in de lijst
            Console.WriteLine("eerste afdruk");
            Print(personList);
            // persoon tussenvoegen tussen 2de en 3de persoon
            personList.Insert(2, new Person("Gert", "Verhulst", "08/04/69"));
            // persoon op de 1ste plaats een nieuwe geboortedatum geven
            personList[0].BirthDay = new DateTime(1958, 5, 19);
            // persoon op de laatste plaats verwijderen
            personList.RemoveAt(personList.Count - 1);
            Console.WriteLine("Tweede afdruk");
            Print(personList);
            // persoon opzoeken op basis van voornaam en naam
            // indexOf, contains, find maakt gebruik van de methode equals => 2 objecten
            // beschouwen we als gelijk als de voornaam en de naam gelijk zijn
            // => equals methode overschrijven +  extra construcotr voorzien met alleen naam en voornaam

            // zit Gert Verhulst in de lijst
            bool found = personList.Contains(new Person("Gert", "Verhulst"));
            Console.WriteLine($"Gert Verhulst in de lijst ? {found}");
            // op welke plaats staat Tristan Franssen
            int place = personList.IndexOf(new Person("Tristan", "Franssen"));
            Console.WriteLine($"Tristan Franssen is op plaats {place}");
        }

        private void Print(List <Person> list)
        {
            foreach (Person person in list)
            {
                Console.WriteLine(person); // ToSTring in klasse person overschrijven
            }
        }
    }
}
