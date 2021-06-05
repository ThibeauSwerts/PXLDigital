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

namespace Example2Polymorfisme
{
    /// <summary>
    /// Interaction logic for WindowList.xaml
    /// vertrekkend van mainwindow ipv met arry met List werken
    /// </summary>
    public partial class WindowList : Window
    {
        private List <IDrawable> thingsList = new List<IDrawable>(); 
        private bool[] onCanvas;
        private Random random = new Random();
        public WindowList()
        {
            InitializeComponent();
            CreateShapes();
            LinkHandlers();
        }
        private void CreateShapes()
        {
            thingsList.Add(new Sphere(50, 50, 60));
            // koppeling gebeurt tijdens de uitvoering = late binding =  dynamic dispatching
            thingsList.Add(new ColoredSphere(100, 100, new SolidColorBrush(Colors.Red)));
            thingsList.Add( new Square
            {
                X = 15,
                Y = 15,
                Width = 20
            });
            thingsList.Add(new Triangle
            {
                X = 150,
                Y = 150,
                Height = 60,
                Width = 50
            });
            thingsList.Add( new Picture
            {
                X = 20,
                Y = 100,
                Height = 300,
                Width = 70
            });
            onCanvas = new bool[thingsList.Count];
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
                thingsList[place].Scale(factor);
                // sphere verplaatsen al de rest naar rechts verplaatsen
                // nagaan dat we te maken hebben met een sphere?
                if (thingsList[place] is Sphere)
                {// instanceof in Java
                    ((Sphere)thingsList[place]).Move();
                    // of  (shapes[place] as Sphere).Move();
                }
                else
                {// bij een vierkant hoogte en breedte met 10 vergroten
                    if (thingsList[place] is Square)
                    {
                        thingsList[place].Height += 10;
                    }
                    thingsList[place].MoveRight();
                }
            }
            else
            {

                thingsList[place].DisplayOnCanvas(paperCanvas);
                onCanvas[place] = true;
            }
            outputTextBlock.Text = thingsList[place].ToString();
        }


     
        
    }
}
