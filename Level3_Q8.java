public class Level3_Q8 
{
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }
    public static boolean areOTPsUnique(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[] otpArr = new int[10];

        // generate 10 OTPs
        for (int i = 0; i < 10; i++) {
            otpArr[i] = generateOTP();
        }
        System.out.println("Generated OTPs:");
        for (int i = 0; i < 10; i++) {
            System.out.println(otpArr[i]);
        }
        if (areOTPsUnique(otpArr)) {
            System.out.println("\nAll OTPs are not the same (Valid)");
        } else {
            System.out.println("\nAll OTPs are the same (Invalid)");
        }
    }
}