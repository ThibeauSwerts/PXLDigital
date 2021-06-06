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
        public MainWindow()
        {
            InitializeComponent();

            displayListBox.Items.Add("Kerstin Nys");
            displayListBox.Items.Add("Rita Lambrechts");
            displayListBox.Items.Add("Carine Derkoningen");
            displayListBox.Items.Add("Nele Custers");
            displayListBox.Items.Add("Jan Willekens");
            displayListBox.Items.Add("Sam Vanderstraeten");
            displayListBox.Items.Add("Ingrid Vanherwegen");
            displayListBox.Items.Add("Heidi Tans");

        }

        private void DeleteItem(object sender, MouseButtonEventArgs e)
        {
            displayListBox.Items.RemoveAt(displayListBox.SelectedIndex);
            displayListBox.Items.Refresh();
        }
    }
}
