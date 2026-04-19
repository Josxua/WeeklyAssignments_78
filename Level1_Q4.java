import java.util.Scanner;
public class Level1_Q4 
{
    public static int checkNumber(int n) {
        if (n > 0)
            return 1;
        else if (n < 0)
            return -1;
        else
            return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        int result = checkNumber(num);
        if (result == 1)
            System.out.println("Positive number");
        else if (result == -1)
            System.out.println("Negative number");
        else
            System.out.println("Zero");
        sc.close();
    }
}