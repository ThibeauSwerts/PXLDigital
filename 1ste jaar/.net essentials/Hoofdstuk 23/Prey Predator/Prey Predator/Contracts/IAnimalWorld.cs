using Prey_Predator.Interfaces;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Prey_Predator.Contracts
{
    interface IAnimalWorld
    {
        IList<IAnimal> AllAnimals { get; }
        int CurrentRoundNumber { get; }
        void AddAnimal(IAnimal animal);
        void ProcessRound();

    }
}
