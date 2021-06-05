using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Controls;

namespace Example1Polymorfisme
{
    public abstract class Shape
    {
        // eigenschappen x,y,hoogte, breedte
        private int _x;
        private int _y;
        private double _height;
        private double _width;
        // properties
        public int X { get => _x; set { _x = value; UpdateShape(); } }
        public int Y { get => _y; set { _y = value; UpdateShape(); } }
        // virtual => properties mogen in subklasse overschreven worden
        public virtual double Height { get => _height; set { _height = value; UpdateShape(); } }
        public virtual double Width { get => _width; set { _width = value; UpdateShape(); } }

        public override string ToString()
        {
            return $"({X}, {Y}, {Height}, {Width})";
        }


        // abstracte methode => moeten in subklasse voorzien worden
        public abstract void UpdateShape();
        public abstract void DisplayOnCanvas(Canvas canvas);

        // abstracte property => moet in elke subklasse voorzien worden
        public abstract double Area { get;}

        // MoveRight  => shape wordt 5 pixels naar rechts verplaatst
        // mag niet overschreven kunnen worden in een subklasse=> in Java final in C# niets 
        // om een methode te kunnen overschrijven moet er virtual staan
        public void MoveRight()
        {
           X += 5; // updateShape wordt uitgevoerd (zie property X)
        }
    }
}
