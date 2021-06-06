using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Media;

namespace Example1Interfaces
{// van klsse coloredsphere mogen geen subklassen gemaakt worden
    public sealed class ColoredSphere : Sphere // Java final
    {
        private SolidColorBrush _brush;
        // kleur moet kunnen aangepast worden
        public SolidColorBrush Brush // write only property
        {   private get => _brush;
            set { _brush = value; UpdateEllipse(); }
        }

        public ColoredSphere(int x, int y, SolidColorBrush brush) : base(x, y, 20) // super in Java
        {
            Brush = brush; // UpdateEllipse wordt gedaan zie code Bij de property
          
        }

        public override string ToString()
        {
            return "Colored"+base.ToString();
        }

        private void UpdateEllipse()
        {
            _ellipse.Fill = Brush;
            _ellipse.Stroke = Brush;
        }
        // methode Move overschrijven => gekleurde cirkel mag alleen naar boven bewegen
        public override void Move()
        {
            Y -= 5;
          
        }
    }
}
