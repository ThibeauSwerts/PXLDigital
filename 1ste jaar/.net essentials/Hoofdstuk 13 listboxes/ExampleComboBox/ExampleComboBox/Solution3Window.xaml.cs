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

namespace ExampleComboBox
{
    /// <summary>
    /// Interaction logic for Solution3Window.xaml
    /// oef 13.9 Comboboxitems niet in xaml aangemaakt
    /// </summary>
    public partial class Solution3Window : Window
    {
        private List<SolidColorBrush> colorList;
        private List<string> list;
        public Solution3Window()
        {
            InitializeComponent();
            colorList = new List<SolidColorBrush>()
            {
                new SolidColorBrush(Colors.Red), new SolidColorBrush(Colors.Green),
        new SolidColorBrush(Colors.Blue) };
            list = new List<string>(){"Red", "Green", "Blue"};
            colorComboBox.ItemsSource = list;
        }
        private void colorComboBox_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            int index = colorComboBox.SelectedIndex;
            colorLabel.Background = colorList[index];


        }
    }
}
