import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Write count of array");
        int count = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Minimum value of array is " + findMin(readIntegers(count)));
//        System.out.println(Arrays.toString(readIntegers(count)));

    }
private static Scanner scanner = new Scanner(System.in);

    public static int[] readIntegers(int count){
        System.out.println("Enter " + count + " integer numbers\r");
        int[] array = new int[count];
for (int i = 0; i < array.length; i++){
    array[i] = scanner.nextInt();
    scanner.nextLine();
}
        return array;
    }
    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){min = array[i];}
        }

        return min;
    }

}
