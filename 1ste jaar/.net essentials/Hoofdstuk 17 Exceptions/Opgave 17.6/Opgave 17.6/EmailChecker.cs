using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Opgave_17._6
{
    class EmailChecker
    {
        public string Email {get; set;}

        public void checkAdress()
        {
            string ErrorMessage = "";
            int Severity = 0;
            if (!Email.Contains('@'))
            {
                ErrorMessage = "email doesn't contain @";
                Severity = 15;
            }
            else if (!Email.Contains('.'))
            {
                ErrorMessage = "email doesn't contain .";
                Severity = 5;
            }
            if (ErrorMessage != "")
            {
                throw new InvalidEmailException(ErrorMessage) {Severity = Severity};
            }
           
        }

    }
}
