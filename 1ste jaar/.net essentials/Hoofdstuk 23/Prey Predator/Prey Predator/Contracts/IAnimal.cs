using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Prey_Predator.Interfaces
{
    interface IAnimal : IDisplayable
    {
        Position Position { get; }
        bool IsDead { get; set; }

        void Move();

        IAnimal TryBreed();


    }
}
