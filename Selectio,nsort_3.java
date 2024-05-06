public class SelectionSort {
    static void selectionSort(int[] array) {
    int size = array.length;
    for (int i = 0; i < size - 1; i++) {
    int min_index = i;
    for (int j = i + 1; j < size; j++) {
    if (array[j] < array[min_index]) {
    min_index = j;
    }
    }
    // swapping the elements to sort the array
    int temp = array[min_index];
    array[min_index] = array[i];
    array[i] = temp;
    }
    }
    public static void main(String[] args) {
    int[] arr = {-2, 45, 0, 11, -9, 88, -97, -202, 747};
    selectionSort(arr);
    System.out.println("The array after sorting in Ascending Order by selection sort is:");
    for (int num : arr) {
    System.out.print(num + " ");
    }
    }
    }