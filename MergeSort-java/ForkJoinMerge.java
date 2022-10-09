import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinMerge{

    private static final int SIZE = 100;
    public static void main(String[] args) {
      int[] data1 = new int[SIZE];
      Random rand = new Random();
      for (int i = 0; i < data1.length; i++) {
        int randomNum = rand.nextInt((SIZE) + 1);
  
        data1[i] = randomNum;
  
      }
      System.out.println("Merge Sort/ before  " + Arrays.toString(data1));
      MergeSort quickSort = new MergeSort(data1, 0, data1.length - 1);
  
      ForkJoinPool pool = new ForkJoinPool();
      pool.invoke(quickSort);
  
      pool.shutdown();
      System.out.println("----------------------------------------");
      System.out.println("Merge Sort/ after = " + Arrays.toString(data1));
    }
  }
