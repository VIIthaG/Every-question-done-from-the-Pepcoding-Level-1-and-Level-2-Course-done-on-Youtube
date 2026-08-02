import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        addTwoNumbersOfSameBase();

    }

    public static int addTwoNumbersOfSameBase() {

        Scanner sc = new Scanner(System.in);

        int addition = 0;
        int remainder = 0;
        int count = 0;
        int carry = 0; // this would actually be the quotient
        int Sum = 0;

        while (true) {

            System.out.print("Enter the First Number: ");
            int n1 = sc.nextInt();

            System.out.print("Enter the Second Number: ");
            int n2 = sc.nextInt();

            System.out.print("Enter the base of either numbers: ");
            int b = sc.nextInt();

            // if (n1 < 0 || n1 > 256 || n2 < 0 || n2 > 256) {
            //     System.out.println("Enter the number again.");
            //     continue;
            // }

            if (b < 2 || b > 10) {
                System.out.println("Enter the base again.");
                continue;
            }

            else {

                while (n1 != 0 || n2 != 0 || carry != 0) {

                    int d1 = n1 % 10;
                    int d2 = n2 % 10;

                    addition = d1 + d2 + carry;

                    carry = addition / b;
                    remainder = addition % b;

                    Sum = (int) (Sum + remainder * Math.pow(10, count));

                    n1 = n1 / 10;
                    n2 = n2 / 10;

                    count++;

                }

                System.out.println(Sum);

                break;
            }

        }

        return Sum;
    }
}
