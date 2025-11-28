//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        int [] numbers = new int[10];
        numbers[0] = 11;
        numbers[1] = 32;
        numbers[2] = 35;
        numbers[3] = 4;
        numbers[4] = 75;
        numbers[5] = 96;
        numbers[6] = 17;
        numbers[7] = 38;
        numbers[8] = 59;
        numbers[9] = 10;

        System.out.println("Before the sort: ");
        printArrayElements(numbers);

        System.out.println("\n\nAfter the bubble sort: ");
        bubblesort(numbers);
        printArrayElements(numbers);

//        System.out.println("\n\nAfter the selection sort: ");
//        selectionSort(numbers);
//        printArrayElements(numbers);

    }
    private static void selectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int smallestIndex = 0;
            for (int i = 1; i <= lastSortedIndex; i++)
            {
               if (arr[i] < arr[smallestIndex])
               {
                   smallestIndex = i;
               }
            }
            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }
    private static void bubblesort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] < arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
    private static void printArrayElements(int[] arr)
    {
        for (int j : arr)
        {
            System.out.print(j + " ");
        }
    }
}