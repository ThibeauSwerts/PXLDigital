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

namespace Example2Array1dim
{
    /// <summary>
    /// Interaction logic for InputWindow.xaml
    /// </summary>
    public partial class InputWindow : Window
    {
        private int[] _rainData;
        public InputWindow(int [] rainData)
        {
            InitializeComponent();
            _rainData = rainData;
        }

        private void ModifyAmount()
        {
            try
            {
                int index = Convert.ToInt32(indexTextBox.Text);
                int data = Validation.ValidateRain(Convert.ToInt32(valueTextBox.Text));
                _rainData[index] = data;
              
            }
            catch (FormatException)
            {
                throw new InputException("data should be an integer");
            }
            catch (IndexOutOfRangeException)
            {
                throw new InputException($"index should be >= 0 and < {_rainData.Length}");
            }
        }
        private void Window_Closing(object sender, System.ComponentModel.CancelEventArgs e)
        {
            try
            {
                ModifyAmount();
            }
            catch (InputException ex)
            {
                MessageBox.Show(ex.Message);
            }
        }
    }
}
