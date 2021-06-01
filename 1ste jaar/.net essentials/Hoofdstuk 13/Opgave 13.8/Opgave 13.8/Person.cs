using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Opgave_13._8
{
    public class Person
    {
        public string Lastname { get; set; }
        public string FirstName { get; set; }
        public string Adress { get; set; }
        public enum gender { Male, Female };
        public string Phone { get; set; }
        public string BirthDate { get; set; }

        public Person(string lastname, string firstName, string adress, string phone, string birthDate)
        {
            Lastname = lastname;
            FirstName = firstName;
            Adress = adress;
            Phone = phone;
            BirthDate = birthDate;
        }
        public override string ToString()
        {
            return FirstName + " " + Lastname;
        }
    }
}
