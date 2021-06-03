using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DominationGame
{
    class DominationException : Exception
    {
        public DominationException(string message) : base(message)
        {
        }
    }
}
