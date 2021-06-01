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
using System.Windows.Shapes;

namespace Opgave_13._8
{
    /// <summary>
    /// Interaction logic for Details.xaml
    /// </summary>
    public partial class Details : Window
    {
        private Person person;
        private bool newPerson;
        private MainWindow parentWindow;


        public Details(Person person, MainWindow parent)
        {
            InitializeComponent();

            if (person.FirstName == ""){newPerson = true;}
            this.parentWindow = parent;
            this.person = person;

            LastNameTextBox.Text = person.Lastname;
            FirstNameTextBox.Text = person.FirstName;
            AddressTextBox.Text = person.Adress;
            PhoneTextBox.Text = person.Phone;
            BirthdateTextBox.Text = person.BirthDate;
        }

        private void Button_Click_Cancel(object sender, RoutedEventArgs e) => this.Close();

        private void Button_Click_Save(object sender, RoutedEventArgs e)
        {
            person.Lastname = LastNameTextBox.Text;
            person.FirstName = FirstNameTextBox.Text;
            person.Adress = AddressTextBox.Text;
            person.Phone = PhoneTextBox.Text;
            person.BirthDate = BirthdateTextBox.Text;

            if (newPerson)
            {
                parentWindow.AddPerson(person);
            }
            else
            {
                parentWindow.UpdatePersonInfo(person);
            }
        }
    }
}
