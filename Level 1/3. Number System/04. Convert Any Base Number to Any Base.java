import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        convertAnyBaseToAnyBase();

    }

    public static int convertAnyBaseToAnyBase() {

        Scanner sc = new Scanner(System.in);

        int decimalNum = 0;
        int count = 0;
        int newNum = 0;

        while (true) {

            System.out.print("Enter the Number That You Would Like To Convert To The Other Base: ");
            int d = sc.nextInt();

            System.out.print("Enter the base for This number: ");
            int b1 = sc.nextInt();

            System.out.print("Enter the base You would like the number to be converted into: ");
            int b2 = sc.nextInt();

            if (d < 0 || d > 1000000000) {
                System.out.println("Enter the number again.");
                continue;
            }

            if (b1 < 2 || b1 > 10) {
                System.out.println("Enter the first base again.");
                continue;
            }

            if (b2 < 2 || b2 > 10) {
                System.out.println("Enter the second base again.");
                continue;
            }

            else {

                while (d != 0) {

                    int trailingDigit = d % 10;

                    decimalNum = (int) (decimalNum 
                            + trailingDigit * Math.pow(b1, count));

                    d = d / 10;
                    count++;

                }

                count = 0;

                System.out.println("The Number in decimal: " + decimalNum);

                while (decimalNum != 0) {

                    int rem = decimalNum % b2;

                    newNum = (int) (newNum + (rem * Math.pow(10, count)));

                    decimalNum = decimalNum / b2;

                    count++;

                }

                System.out.println("The Number in Base " + b2 + ": " + newNum);

                break;
            }
        }

        return decimalNum;
    }
}
