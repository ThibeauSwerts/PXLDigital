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
    /// Interaction logic for Solution2Window.xaml
    /// oefening 13.9 combobos in xaml aangemaakt
    /// betere oplossing als de vorige = zonder gebruik te maken van if of switch
    /// extra: extra button reset => hierop klikken moet startscherm geven
    /// </summary>
    public partial class Solution2Window : Window
    {

        private List<SolidColorBrush> colorList;
        public Solution2Window()
        {
            InitializeComponent();
            colorList = new List<SolidColorBrush>()
            {
                new SolidColorBrush(Colors.Red), new SolidColorBrush(Colors.Green),
        new SolidColorBrush(Colors.Blue) };

        }
        private void colorComboBox_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {   
            
            int index = colorComboBox.SelectedIndex;
            if (index != -1)
            {
                colorLabel.Background = colorList[index];
            }


        }

        private void resetButton_Click(object sender, RoutedEventArgs e)
        {
            colorLabel.Background = new SolidColorBrush(Colors.Transparent);
            colorComboBox.SelectedItem = null; // opgepast selectionchanged event
        }
    }
}
