using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Example1Array2dim
{
    public class ArrayComputation
    {
        public static int CalculateTotal(int[,] array2Dim)
        {
            int total = 0;
            foreach (int data in array2Dim) // veel gemakkelijker dan de dubbele lus met indices
            {
                total += data;
            }
           return total;
        }


        public static string LargestWithTekst(int[,] array2Dim, string[] rowText, string[] columnText)
        {
            int largest = 0; // of op een element van de array
            foreach (int data in array2Dim)
            {
                if (largest < data)
                {
                    largest = data;
                }
            }
            StringBuilder stringBuilder = new StringBuilder($"{largest} \n");
            for (int i = 0; i < array2Dim.GetLength(0); i++)
            {
                for (int j = 0; j < array2Dim.GetLength(1); j++)
                {
                    if (largest == array2Dim[i, j])
                    {
                        stringBuilder.Append($"at {rowText[i]} on {columnText[j]} \n");
                    }
                }
            }
            return stringBuilder.ToString();
        }
    }
}
