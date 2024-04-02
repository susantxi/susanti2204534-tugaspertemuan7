package java_encapsulation_pertemuan7;

/**
 *
 * @author susanti
 */

public class Java_encapsulation_pertemuan7 {
    public static void selectionSort(int[] arr) {
       int n = arr.length;
       for (int i = 0; i < n-1; i++) {
          int minIdx = i;
          for (int j = i+1; j < n; j++) {
             if (arr[j] < arr[minIdx]) {
                 minIdx = j;
             }
          }
          int temp = arr[minIdx];
          arr[minIdx] = arr[i];
          arr[i] = temp;
      }
    }
    
    public static void main(String[] args) {
       int[] arr = new int[100000];
       for (int i = 0; i < arr.length; i++) {
           arr[i] = (int) (Math.random() * 100000);
       }

       StopWatch stopWatch = new StopWatch();

       stopWatch.start();
       selectionSort(arr); 
       stopWatch.stop();

       System.out.println("Waktu yang diperlukan untuk sorting " 
               + stopWatch.getElapsedTime() + " milidetik");
    }
}
