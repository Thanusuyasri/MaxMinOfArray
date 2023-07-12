import java.util.Scanner;

public class MaxMinArrayPrograd {
    public static int maxMinSum(int[] array)
    {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i< array.length;i++)
        {
            if(max<array[i])
            {
                max=array[i];
            }
            if(min>array[i])
            {
                min=array[i];
            }
        }
        return max+min;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfarray=scanner.nextInt();
        int[] array = new int[sizeOfarray];
        for(int i =0 ; i < sizeOfarray ; i++)
        {
            array[i]= scanner.nextInt();
        }
        System.out.println(maxMinSum(array));
    }
}
