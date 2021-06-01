using Prey_predator.Contracts;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Media;

namespace Prey_predator
{
    public class Louse : Animal
    {
        const int _breedInterval = 2;
        int _breedTime = 0;

        public Louse() : base(6, Colors.YellowGreen)
        {
        }

        public Louse(Position position): base(6, Colors.YellowGreen, position)
        {
        }

        public override IAnimal TryBreed()
        {
            _breedTime ++;
            if (_age > 0)
            {
                if (_breedInterval == _breedTime)
                {
                    _breedTime = 0;
                    return new Louse(Position);
                }
            }
            return null;
        }
    }
}
