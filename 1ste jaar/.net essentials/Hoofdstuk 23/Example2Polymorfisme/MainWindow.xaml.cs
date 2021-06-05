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

namespace Example2Polymorfisme
{
    // vertrekkend van Example1Interfaces H22 
    // 
    public partial class MainWindow : Window
    {
        private IDrawable [] things = new IDrawable[5]; // polymorfisme met interfaces
        private bool[] onCanvas = new bool[5];
        private Random random = new Random();
        public MainWindow()
        {
            InitializeComponent();
            CreateShapes();
            LinkHandlers();
        }
        private void CreateShapes()
        {// polymorfisme = shape kan meerdere vormen aannemen
            things[0] = new Sphere(50, 50, 60);
            // koppeling gebeurt tijdens de uitvoering = late binding =  dynamic dispatching
            things[1] = new ColoredSphere(100, 100, new SolidColorBrush(Colors.Red));
            things[2] = new Square
            {
                X = 15,
                Y = 15,
                Width = 20
            };
            things[3] = new Triangle
            {
                X = 150,
                Y = 150,
                Height = 60,
                Width = 50
            };
            things[4] = new Picture
            {
                X = 20,
                Y = 100,
                Height = 300,
                Width = 70
            };
        }
        private void LinkHandlers()
        {
            _0sphereButton.Click += Button_Click;
            _1coloredSphereButton.Click += Button_Click;
            _2squareButton.Click += Button_Click;
            _3triangleButton.Click += Button_Click;
            _4imageButton.Click += Button_Click;
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            Button button = (Button)sender; // of sender as Button
            int place = Convert.ToInt32(button.Name.Substring(1, 1));
            if (onCanvas[place])
            {
                double factor = random.Next(5, 20) / 10.0;
                things[place].Scale(factor);
                // sphere verplaatsen al de rest naar rechts verplaatsen
             // nagaan dat we te maken hebben met een sphere?
                if (things[place] is Sphere)
                {// instanceof in Java
                    ((Sphere)things[place]).Move();
                   // of  (shapes[place] as Sphere).Move();
                }
                else
                {// bij een vierkant hoogte en breedte met 10 vergroten
                    if (things[place] is Square)
                    {
                        things[place].Height += 10;
                    }
                    things[place].MoveRight();
                }
            }
            else
            { 

                things[place].DisplayOnCanvas(paperCanvas);
                onCanvas[place] = true;
            }
            outputTextBlock.Text = things[place].ToString();
        }

       
             
      
    }
}
