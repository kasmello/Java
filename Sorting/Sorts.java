/** 
** Software Technology 152
** Class to hold various static sort methods.
*/
class Sorts
{
    // bubble sort
    public static int [] bubbleSort(int[] A)
    {
      Boolean sorted = false;
      Integer pass = 0;
      while (!sorted) {
        sorted = true;
        for (int i = 0; i<(A.length-1-pass); i++) {
          if (A[i] > A[i+1]) {
            swap(A, i, i+1);
            sorted=false;
          }
        }
        pass = pass + 1;
      }
      
      return A;
    }//bubbleSort()

    // selection sort
    public static void selectionSort(int[] A)
    {
    }// selectionSort()

    // insertion sort
    public static int[] insertionSort(int[] A)
    {
      Integer ii = 1;
      while (ii  < A.length) {
        Boolean turnSorted=false;
        Integer i = ii;
        while (!turnSorted && i != 0) {
          turnSorted=true;
          if (A[i] < A[i-1]) {
            swap(A, i-1, i);
            // Integer temp = A[i-1];
            // A[i-1] = A[i];
            // A[i] = temp;
            i -= 1;
            turnSorted=false;
          }
        }
        ii += 1;
      }
      return A;
      
    }// insertionSort()

    // mergeSort - front-end for kick-starting the recursive algorithm
    public static void mergeSort(int[] A)
    {
    }//mergeSort()
    private static void mergeSortRecurse(int[] A, int leftIdx, int rightIdx)
    {
    }//mergeSortRecurse()
    private static void merge(int[] A, int leftIdx, int midIdx, int rightIdx)
    {
    }//merge()

    private static void swap(int[] A, int i, int ii) {
      Integer temp = A[i];
      A[i] = A[ii];
      A[ii] = temp;

    }


    // quickSort - front-end for kick-starting the recursive algorithm
    public static void quickSort(int[] A)
    {
    }//quickSort()
    private static void quickSortRecurse(int[] A, int leftIdx, int rightIdx)
    {
    }//quickSortRecurse()
    private static int doPartitioning(int[] A, int leftIdx, int rightIdx, int pivotIdx)
    {
		return 0;	// TEMP - Replace this when you implement QuickSort
    }//doPartitioning


}//end Sorts calss
