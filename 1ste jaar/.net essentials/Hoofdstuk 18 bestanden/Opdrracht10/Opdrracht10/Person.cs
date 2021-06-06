using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Opdracht10
{ 
    public class Person
    {
        public string FirstName { get; set; }
        public string Name { get; set; }
        public DateTime BirthDay { get; set; }

        public int Age => ComputeAge();

        public override string ToString()
        {
            return FirstName + " " + Name;
        }

        public Person(string firstname, string name)
        {
            FirstName = firstname; Name = name;
            
        }
        public Person(string firstname, string name, string birthday)
        {
            FirstName = firstname; Name = name;
            BirthDay = DateTime.Parse(birthday);
        }

        private int ComputeAge()
        {
            //  TimeSpan time = DateTime.Now - BirthDay; herivan kan je niet de jaren opvragen!!
            int age = DateTime.Now.Year - BirthDay.Year;
            if (BirthDay.AddYears(age) > DateTime.Now)
            {
                age--;
            }
           
            return age;
        }

        public override bool Equals(object obj)
        {
            return obj is Person person &&
                   FirstName == person.FirstName &&
                   Name == person.Name;
        }

        public override int GetHashCode()
        {
            int hashCode = -902933168;
            hashCode = hashCode * -1521134295 + EqualityComparer<string>.Default.GetHashCode(FirstName);
            hashCode = hashCode * -1521134295 + EqualityComparer<string>.Default.GetHashCode(Name);
            return hashCode;
        }
    }
}
