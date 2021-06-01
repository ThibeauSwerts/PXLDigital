using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Opgave_17._6
{
    public class InvalidEmailException : Exception
    {
        public int Severity { get; set; }

        public InvalidEmailException(string message) : base(message)
        {
        }
    }
}
