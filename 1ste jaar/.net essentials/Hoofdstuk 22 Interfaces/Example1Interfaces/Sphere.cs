using System.Windows.Controls;
using System.Windows.Media;
using System.Windows.Shapes;
using System.Windows;
using System;

namespace Example1Interfaces
{
    public class Sphere : Shape
    {
        
        protected Ellipse _ellipse;
        // als de property Height wordt aangepast dan moet ook de property Width aangepast en omgekeerd
        // => property uit klasse Shape overschrijven
        public override double Height { get => base.Height; set { base.Height = value; base.Width = value; } }
        public override double Width { get => base.Width; set { base.Height = value; base.Width = value; } }

        // constructor met 3 parameters
        public Sphere(int x, int y, double radius)
        {
            CreateEllipse(); // moet als eerste staan anders hieronder UpdateShape en ellipse bestaat nog niet
            X = x; Y = y; Width = 2 * radius; // Height aanpassen? nee => gebeurt automatisch
           
        }

        public override double Area => Math.PI * (Width /2) * (Width/ 2) ;

        public override string ToString()
        {
            return "Sphere " + base.ToString();
        }

        public void CreateEllipse()
        {
            _ellipse = new Ellipse()
            {
                Stroke = new SolidColorBrush(Colors.Black),
                StrokeThickness = 2,
                //Width = Width, moet hier niet staat gebeurt automatisch met de UpdateShape
                //Height =Width,
                //Margin = new Thickness(X, Y, 0, 0)
            };
           
        }

        public override void DisplayOnCanvas(Canvas drawingCanvas)
        {
            drawingCanvas.Children.Add(_ellipse);
        }

      

        // methode Move 5 pixels naar rechts en 5 pixels naar beneden
        public virtual void Move() // virtual = methode mag overschreven worden in een subklasse
        {
            X += 5; Y+= 5;
            
        }

        public override void UpdateShape()
        {
            _ellipse.Margin = new Thickness(X, Y, 0, 0);
            _ellipse.Width = Width; _ellipse.Height = Height;
        }

        //public override void Scale(double factor) kan beter in shape
        //{
        //    Width *= Math.Sqrt(factor);
        //}
    }
}
