using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Controls;
using System.Windows.Shapes;

namespace DominationGame
{
    class Block
    {
        private Player _owner { get; set; }
        private Rectangle _rectangle;

        public Block(int rowIndex, int columnIndex, double sizeBlock)
        {

        }
        void DisplayOn(Canvas canvas)
        {

        }

        bool IsEmpty()
        {
            return true;
        }
    }
}
