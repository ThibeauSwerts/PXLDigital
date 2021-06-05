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

namespace Example1Polymorfisme
{
    // vertrekkend van Example2inheritance Hoe kan je de dubbele code in de mainwindow vermijden?
    public partial class MainWindow : Window
    {
        private Shape[] shapes = new Shape[4];
        private bool[] onCanvas = new bool[4];
        public MainWindow()
        {
            InitializeComponent();
            CreateShapes();
            LinkHandlers();
        }
        private void CreateShapes()
        {// ploymorfisme = shape kan meerdere vormen aannemen
            shapes[0] = new Sphere(50, 50, 60);
            // koppeling gebeurt tijdens de uitvoering = late binding =  dynamic dispatching
            shapes[1] = new ColoredSphere(100, 100, new SolidColorBrush(Colors.Red));
            shapes[2] = new Square
            {
                X = 15,
                Y = 15,
                Width = 20
            };
            shapes[3] = new Triangle
            {
                X = 150,
                Y = 150,
                Height = 60,
                Width = 50
            };
        }
        private void LinkHandlers()
        {
            _0sphereButton.Click += Button_Click;
            _1coloredSphereButton.Click += Button_Click;
            _2squareButton.Click += Button_Click;
            _3triangleButton.Click += Button_Click;
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            Button button = (Button)sender; // of sender as Button
            int place = Convert.ToInt32(button.Name.Substring(1, 1));
            if (onCanvas[place])
            {// sphere verplaatsen al de rest naar rechts verplaatsen
             // nagaan dat we te maken hebben met een sphere?
                if (shapes[place] is Sphere)
                {// instanceof in Java
                    ((Sphere)shapes[place]).Move();
                   // of  (shapes[place] as Sphere).Move();
                }
                else
                {// bij een vierkant hoogte en breedte met 10 vergroten
                    if (shapes[place] is Square)
                    {
                        shapes[place].Height += 10;
                    }
                    shapes[place].MoveRight();
                }
            }
            else
            { 

                shapes[place].DisplayOnCanvas(paperCanvas);
                onCanvas[place] = true;
            }
            outputTextBlock.Text = shapes[place].ToString();
        }

       
             
      
    }
}
