import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        convertAnyBaseToDecimal();

    }

    public static int convertAnyBaseToDecimal() {

        Scanner sc = new Scanner(System.in);

        int decimalNum = 0;
        int count = 0;

        while (true) {

            System.out.print("Enter the Number That You Would Like To Convert To Decimal: ");
            int d = sc.nextInt();

            System.out.print("Enter the base for that number: ");
            int b = sc.nextInt();

            if (d < 0 || d > 1000000000) {
                System.out.println("Enter the number again.");
                continue;
            }

            if (b < 2 || b > 10) {
                System.out.println("Enter the base again.");
                continue;
            }

            else {

                while (d != 0) {

                    int trailingDigit = d % 10;

                    decimalNum = (int) (decimalNum 
                            + trailingDigit * (Math.pow(b, count)));

                    d = d / 10;
                    count++;

                }

                System.out.println(decimalNum);

                break;
            }
        }

        return decimalNum;
    }
}
