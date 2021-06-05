using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Media;
using System.Windows.Shapes;

namespace Example1Polymorfisme
{
    public class Square : Shape
    {
        private Rectangle _square;
        // als de property Height wordt aangepast dan moet ook de property Width aangepast en omgekeerd
        // => property uit klasse Shape overschrijven
        public override double Height { get => base.Height; set { base.Height = value; base.Width = value; } }
        public override double Width { get => base.Width; set { base.Height = value; base.Width = value; } }
        public override double Area => Height * Height;
        // aanmaken van de rectangle + het plaatsen op het canvas
        public override void DisplayOnCanvas(Canvas canvas)
        {
            _square = new Rectangle
            {
                Stroke = new SolidColorBrush(Colors.Blue),
                Fill = new SolidColorBrush(Colors.Blue),
                //Height = this.Height, // links property van de rectangle
                //Width = this.Width,   // code in commentaar overbodig
                //Margin = new Thickness(X, Y, 0, 0)

            };
            UpdateShape();
            canvas.Children.Add(_square);
        }

        public override string ToString()
        {
            return "Square " + base.ToString();
        }

        public override void UpdateShape()
        {   if (_square != null)// moet er bij staan want het vierkant wordt pas aangemaakt
                // als de methode DisplayonCanvas wordt opgeroepen.
            {
                _square.Margin = new Thickness(X, Y, 0, 0);
                _square.Height = Height; _square.Width = Width;
            }
        }
    }
}
