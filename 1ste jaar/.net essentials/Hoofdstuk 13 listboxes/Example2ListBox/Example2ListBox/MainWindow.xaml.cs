using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
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

namespace Example2ListBox
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        private IList<string> list;
        public MainWindow()
        {
            InitializeComponent();
            // list = new List<string>() { "coffee", "milk", "bread" };
            list = new ObservableCollection<string>() { "coffee", "milk", "bread" };
            shoppingListBox.ItemsSource = list; // data binding
        }
        // bij toevoegen aan list wordt de listbox niet automatisch bijgewerkt
        // geen synchronisatie tussen list en listbox
        // oplossing 1: refreshen
        // oplossing 2: gebruik maken van ObservableCollection klasse => wel synchronisatie
        private void addButton_Click(object sender, RoutedEventArgs e)
        {


            list.Add(itemTextBox.Text);
            //shoppingListBox.Items.Refresh();  // bij oplossing 1

        }
        // klikken op een item
        private void shoppingListBox_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            if (shoppingListBox.SelectedItem != null) // zie resetButton
            {
                MessageBox.Show($"selected index {shoppingListBox.SelectedIndex}");
            }
        }
        // bij dubbel klikken
        private void shoppingListBox_MouseDoubleClick(object sender, MouseButtonEventArgs e)
        {

            MessageBox.Show($"{list[shoppingListBox.SelectedIndex]}");
        }

        private void removeButton_Click(object sender, RoutedEventArgs e)
        {
            int index = Int32.Parse(indexTexBox.Text);
            list.RemoveAt(index);
            // shoppingListBox.Items.Refresh();// bij oplossing 1
        }

        private void insertButton_Click(object sender, RoutedEventArgs e)
        {
            int index = Int32.Parse(indexTexBox.Text);

            list.Insert(index, itemTextBox.Text);
            // shoppingListBox.Items.Refresh(); // bij oplossing 1
        }

        private void displayButton_Click(object sender, RoutedEventArgs e)
        {
            int index = Int32.Parse(indexTexBox.Text);

            MessageBox.Show($"item on position {index}: {list[index]}");
        }

        private void findButton_Click(object sender, RoutedEventArgs e)
        {
            string search = itemTextBox.Text; // je kan gebruik maken van ingebouwde methoden => deze werken op basis van de equals methode
            int index = list.IndexOf(search);
            if (index != -1)
            {
                MessageBox.Show($"item {search} found on position {index}");

            }
            else { MessageBox.Show($"item {search} not found"); }


        }

        private void resetButton_Click(object sender, RoutedEventArgs e)
        {
            itemTextBox.Clear();
            indexTexBox.Clear();
            // selectie moet ongedaan gemaakt worden
            shoppingListBox.SelectedItem = null; // of alternatief shoppingLitBox.SelectedIndex = -1
            // opgepast veroorzaakt een selectionChanged event
        }
        // alfabetsch sorteren of van klein naar groot
        private void sortButton_Click(object sender, RoutedEventArgs e)
        {// opgepast Sort werkt niet bij een ObservableCollection
            //list.Sort();
            //// alfabetisch het laatste eerst of van groot naar klein
            //list.Reverse();
            //shoppingListBox.Items.Refresh();
        }
    }
}
