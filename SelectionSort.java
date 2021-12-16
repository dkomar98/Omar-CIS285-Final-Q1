package Sort;

public class SelectionSort {

    /* Selection Sort function */

			        int n = arr.length;

			        int i, j, pos, temp;

			        for (i = 0; i < n-1; i++)

			        {

			            pos = i;

			            for (j = i+1; j < n; j++)

			            {

			                if (arr[j] < arr[pos])

			                {

			                    pos = j;

			                }

			            }



			            temp = arr[pos];

			            arr[pos] = arr[i];

			            arr[i] = temp;
			                

	        }

	      }

}
