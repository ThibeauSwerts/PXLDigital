using Prey_predator.Contracts;
using Prey_Predator.Interfaces;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Media;

namespace Prey_predator
{
    class LadyBug : Animal, IPredator
    {
        const int _breedInterval = 4;
        private int _breedTime = 0;
        private int _starvingTime = 3;
        private int _roundsNotEaten = 0;

        public LadyBug() : base(16, Colors.Red)
        {
        }

        public LadyBug(Position position) : base(16, Colors.Red, position)
        {
        }


        public bool CanEat(IAnimal animal)
        {
            if (animal is LadyBug){
                return false;
            }else { 
                Double _distance = Math.Sqrt(Math.Pow(animal.Position.X- Position.X, 2)+Math.Pow(animal.Position.Y - Position.Y, 2));
                if(_distance <= 3)
                {

                    animal.isDead = true;
                    return true;
                }
                else
                {
                    return false;
                }
            }

        }

        public void Hunt(IList<IAnimal> possibleVictims)
        {
            bool hasEaten=false;
            foreach(Animal animal in possibleVictims)
            {
                hasEaten = CanEat(animal);
                if (hasEaten) {
                    _roundsNotEaten = 0;
                   //break; 1 luis per keer eten max?
                }
            }

            if (!hasEaten)
            {
                _roundsNotEaten++;
                if(_roundsNotEaten == _starvingTime)
                {
                    isDead = true;
                }
            }
            
        }

        public override IAnimal TryBreed()
        {
            _breedTime++;
            if (_age > 0)
            {
                if (_breedInterval == _breedTime)
                {
                    _breedTime = 0;
                    return new LadyBug(Position);   
                }
            }
            return null;
        }
    }
}
