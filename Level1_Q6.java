import java.util.Scanner;
public class Level1_Q6 
{
    public static int Sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter n: ");
        n = sc.nextInt();
        int result=Sum(n);
        System.out.println("Sum of first " + n + " natural numbers = " + result);
        sc.close();
    }
}