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

namespace Oefening_3._2
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void DrawGrid(int lines, float totalSize, SolidColorBrush brush)
        {
            DrawHorizontalLines(lines, totalSize, brush);
            DrawVerticalLines(lines, totalSize, brush);
        }

        private void DrawHorizontalLines(int lines, float totalSize, SolidColorBrush brush)
        {
            float increase = totalSize / (lines - 1);

            for (int i = 0; i < lines; i++)
            {
                Line line = new Line()
                {
                    X1 = 0,
                    X2 = totalSize,
                    Y1 = increase * i,
                    Y2 = increase * i,
                    Stroke = brush
                };
                paperCanvas.Children.Add(line);
            }
        }

        private void DrawVerticalLines(int lines, float totalSize, SolidColorBrush brush)
        {
            float increase = totalSize / (lines - 1);

            for (int i = 0; i < lines; i++)
            {
                Line line = new Line()
                {
                    X1 = increase * i,
                    X2 = increase * i,
                    Y1 = 0,
                    Y2 = totalSize,
                    Stroke = brush
                };
                paperCanvas.Children.Add(line);
            }
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            DrawGrid(4, 150, new SolidColorBrush(Colors.Black));
        }
    }
}
