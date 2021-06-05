using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Example2Array1dim
{
    public class Validation
    {
        public static int ValidateRain(int rain)
        {
            if (rain < 0) throw new InputException("Data should be >=0");
            if (rain > 100) throw new InputException("Data should be <=100");
            return rain;
        }
    }
}
