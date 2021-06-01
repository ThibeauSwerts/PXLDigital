using Prey_predator.Contracts;
using Prey_Predator.Interfaces;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Controls;
using System.Windows.Media;
using System.Windows.Shapes;

namespace Prey_predator
{
    public abstract class Animal : IAnimal
    {

        private static Random _randomGenerator = new Random();

        public Position Position => _position;

        public bool isDead { get { return _isDead; } set { _isDead = value; } }
        private bool _isDead;

        protected int _age { get; set; }// plus 1 per ronde
        protected int _maxAge { get; set; }
        protected Color _kleur { get; set; }
        private Position _position;

        protected Ellipse body;


        protected Animal(int maxAge, Color kleur) : this(maxAge, kleur, new Position(_randomGenerator.Next(0, 16), _randomGenerator.Next(0, 16)))
        {  
        }

        protected Animal(int maxAge, Color kleur, Position position) 
        {
            _age = 0;
            _maxAge = maxAge;
            _kleur = kleur;
            _position = position;
            CreateBody();
        }



        public void DisplayOn(Canvas canvas)
        {
            canvas.Children.Add(body);
        }


        public void move()
        {
            _age++;
            checkAge();
            switch (_randomGenerator.Next(1, 5))
            {
                case 1:
                    Position.MoveDown();
                    break;
                case 2:
                    Position.MoveLeft();
                    break;
                case 3:
                    Position.MoveRight();
                    break;
                case 4:
                    Position.MoveUp();
                    break;
            }

            UpdateDisplay();

        }

        public void StopDisplaying(Canvas canvas)
        {
            canvas.Children.Remove(body);
        }

        public abstract  IAnimal TryBreed();


        public void UpdateDisplay()
        {
            body.Margin = new System.Windows.Thickness(_position.X * 10, _position.Y * 10, 0, 0);
        }

        protected void CreateBody()
        {
            body = new Ellipse
            {
                Width = 5,
                Height = 5,
                Fill = new SolidColorBrush(_kleur),
                Margin = new System.Windows.Thickness(_position.X * 10, _position.Y * 10, 0, 0)
            };
        }

        protected void checkAge()
        {
            if(_age > _maxAge)
            {
                isDead = true;
            }
        }



        
    }
}


