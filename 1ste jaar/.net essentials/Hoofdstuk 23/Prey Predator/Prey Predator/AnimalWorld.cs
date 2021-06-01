using Prey_Predator.Contracts;
using Prey_Predator.Interfaces;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Controls;

namespace Prey_predator
{
    class AnimalWorld : IAnimalWorld
    {
        public IList<IAnimal> AllAnimals => _allAnimals;

   
        public int CurrentRoundNumber => _currentRoundNumber;

        private Canvas _paperCanvas;
        private IList<IAnimal> _allAnimals = new List<IAnimal>();
        private IList<IAnimal> _newBorn = new List<IAnimal>();
        private IList<IAnimal> _deathAnimals = new List<IAnimal>();
        private int _currentRoundNumber = 0;


        public AnimalWorld(Canvas paperCanvas)
        {
            _paperCanvas = paperCanvas;
        }

        public void AddAnimal(IAnimal animal)
        {
            _allAnimals.Add(animal);
            animal.DisplayOn(_paperCanvas);
        }

        public void ProcessRound()
        {
            _newBorn.Clear();
            _deathAnimals.Clear();
            foreach (Animal animal in _allAnimals)
            {
                if (animal.isDead == true)
                {
                    _deathAnimals.Add(animal);
                }
                else
                {
                    animal.move();
                    
                    Animal kind = (Animal)animal.TryBreed();
                    if(kind != null)
                    {
                        _newBorn.Add(kind);
                    }
                    

                    if (animal is LadyBug)
                    {
                        LadyBug bug = (LadyBug)animal;
                        bug.Hunt(_allAnimals);
                    }
                    
                }
            }

            foreach (Animal animal in _newBorn)
            {
                AddAnimal(animal);
                _allAnimals.Add(animal);
            }

            foreach(Animal animal in _deathAnimals)
            {
                animal.StopDisplaying(_paperCanvas);
                _allAnimals.Remove(animal);
            }

            _currentRoundNumber ++;
        }
    }
}
