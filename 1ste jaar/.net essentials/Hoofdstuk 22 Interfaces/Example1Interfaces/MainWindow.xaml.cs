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

namespace Example1Interfaces
{
    // vertrekkend van Example1Polymorfisme H23 implementeren van een interface
    // telkens als een figuur verplaatst wordt, moet ze ook van grootte gewijzigd worden met een bepaalde factor
    // factor is een willekeurig getal met 1 cijfer achter de komma >= 0.5 en <= 1.9
    public partial class MainWindow : Window
    {
        private Shape[] shapes = new Shape[4];
        private bool[] onCanvas = new bool[4];
        private Random random = new Random();
        public MainWindow()
        {
            InitializeComponent();
            CreateShapes();
            LinkHandlers();
        }
        private void CreateShapes()
        {// polymorfisme = shape kan meerdere vormen aannemen
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
            {
                double factor = random.Next(5, 20) / 10.0;
                shapes[place].Scale(factor);
                // sphere verplaatsen al de rest naar rechts verplaatsen
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
