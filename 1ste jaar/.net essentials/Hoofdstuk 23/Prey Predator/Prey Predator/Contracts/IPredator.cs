using Prey_Predator.Interfaces;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Prey_Predator.Contracts
{
    interface IPredator : IAnimal
    {
        bool CanEat(IAnimal animal);
        void Hunt(IList<IAnimal> possibleVictims);
    }
}
