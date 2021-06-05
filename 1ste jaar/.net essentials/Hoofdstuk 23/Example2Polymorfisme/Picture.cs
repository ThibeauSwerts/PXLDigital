using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Media.Imaging;

namespace Example2Polymorfisme
{
    public class Picture : IDrawable
    {
        private Image _image;
        private int _x;
        private int _y;
        private double _height;
        private double _width;
        public int X { get => _x; set { _x = value; UpdateShape(); } }
        public int Y { get => _y; set { _y = value; UpdateShape(); } }
        public double Height { get => _height; set { _height = value; UpdateShape(); } }
        public double Width { get => _width; set { _width = value; UpdateShape(); } }
        // image aanmaken + op canvas zetten
        // zie H3 boekcode Some Shapes (handboek p 47)
        public void DisplayOnCanvas(Canvas canvas)
        {
            BitmapImage demoBitmapImage = new BitmapImage();
            demoBitmapImage.BeginInit();
            demoBitmapImage.UriSource = new Uri("logo_pxl_digital.png", UriKind.RelativeOrAbsolute);
          
            demoBitmapImage.EndInit();
            _image = new Image
            {
                Source = demoBitmapImage,
                
            };
            UpdateShape();
            canvas.Children.Add(_image);
        }

        public override string ToString()
        {
            return $"Picture ({X}, {Y}, {Height:0}, {Width:0})";
        }

        public void MoveRight()
        {
           
            X += 5;
        }

        public void Scale(double factor)
        {
            Height *= Math.Sqrt(factor);
            Width *= Math.Sqrt(factor);
        }

        public void UpdateShape()
        {if (_image != null)
            {
                _image.Margin = new Thickness(X, Y, 0, 0);
                _image.Height = Height; _image.Width = Width;
            }
        }
    }
}
