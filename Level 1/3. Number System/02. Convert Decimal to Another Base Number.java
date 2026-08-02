import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        convertDecimalToBase();

    }

    public static int convertDecimalToBase() {

        Scanner sc = new Scanner(System.in);

        int num = 0;
        int count = 0;

        while (true) {

            System.out.print("Enter the Decimal Number: ");
            int d = sc.nextInt();

            System.out.print("Enter the Base: ");
            int b = sc.nextInt();

            if (d < 0 || d > 512) {
                System.out.println("Enter the number again.");
                    continue;
            }

            if (b < 2 || b > 10) {
                System.out.println("Enter the base again.");
                continue;
            }

            else {

                while (d != 0) {

                    int rem = d % b;
                    num = (int) (num + rem * (Math.pow(10, count)));
                    d = d / b;
                    count++;

                }

                System.out.println(num);

                break;
            }
        }

        return num;
    }
}
