import java.util.Arrays;

public class Task_4 {
    public void selectedSort (int [] arr) {
        for (int i = 0; i < arr.length; i++){
            int min = arr [i];
            int minInd = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr [j] < min ) {
                    min = arr [j];
                    minInd = j;
                }
            }
            if (i != minInd) {
                int temp = arr [i];
                arr [i] = arr [minInd];
                arr [minInd] = temp;
            }
        }
    }

    public void bubbleSorter(int [] arr){
        for (int i = arr.length - 1; i > 0; i--){
            for (int a = 0; a < i; a++){
                if(arr[i] > arr[a + 1]){
                    int temp = arr [a];
                    arr[a] = arr [a+1];
                    arr [a+1] = temp;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
    }

    public static void shakerSorter(int [] array) {
        int left = 0;
        int right = array.length - 1;

        do
        {
            for (int i = left; i < right; i++)
            {
                if(array[i] > array[i+1])
                {
                    array[i] ^= array[i+1];
                    array[i+1] ^= array[i];
                    array[i] ^= array[i+1];
                }
            }
            right--;

            for (int i = right; i > left ; i--)
            {
                if(array[i] < array[i-1])
                {
                    array[i] ^= array[i-1];
                    array[i-1] ^= array[i];
                    array[i] ^= array[i-1];
                }
            }
            left++;
        } while (left <= right);

        for (int i : array) System.out.print(i + " ");
    }

    public void Sort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        int index = i;
        int temp = arr[i];

        while (index > 0 && arr[index - 1] >= temp) {
            arr[index] = arr[index - 1];
            index--;
        }
        arr[index] = temp;
    }

}
    public void merge(int[]c, int[]leftArray, int[]rightArray, int left, int right) {
        int p = 0, u = 0, m = 0;
        while (p < left && u < right) {
            if (leftArray[p]<= rightArray[u]) {
                c[m++]= leftArray[p++];
            }
            else {
                c[m++]= rightArray[u++];
            }
        }
        while (p < left) {
            c[m++]= leftArray[p++];
        }
        while (u < right) {
            c[m++]= rightArray[u++];
        }
    }

    public static void quickSort(int[] a, int left, int right) {
        int leftMarker = left;
        int rightMarker = right;
        int b = a [(leftMarker + rightMarker) / 2];
        do {
            while (a[leftMarker] < b) {
                leftMarker++;
            }
            while (a[rightMarker] > b) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int tmp = a [leftMarker];
                    a [leftMarker] = a [rightMarker];
                    a[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < right) {
            quickSort(a, leftMarker, right);
        }
        if (left < rightMarker) {
            quickSort(a, left, rightMarker);
        }
    }
}

