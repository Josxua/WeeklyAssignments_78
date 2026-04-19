import java.util.Scanner;
public class Level2_Q1 
{
    public static int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int findProduct(int[] arr) {
        int prod = 1;
        for (int i = 0; i < arr.length; i++) {
            prod *= arr[i];
        }
        return prod;
    }
    public static double findSumOfSquares(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.pow(arr[i], 2);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter number: ");
        num = sc.nextInt();
        int[] factors = getFactors(num);
        System.out.println("\nFactors:");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        int sum = findSum(factors);
        int product = findProduct(factors);
        double sumSquares = findSumOfSquares(factors);
        System.out.println("\n\nSum = " + sum);
        System.out.println("Product = " + product);
        System.out.println("Sum of squares = " + sumSquares);
        sc.close();
    }
}