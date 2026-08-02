import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        subtractTwoNumbersOfSameBase();

    }

    public static int subtractTwoNumbersOfSameBase() {

        Scanner sc = new Scanner(System.in);

        int difference = 0;
        int count = 0;
        int borrow = 0;
        int Sum = 0;

        while (true) {

            System.out.print("Enter the First Number: ");
            int n1 = sc.nextInt();

            System.out.print("Enter the Second Number: ");
            int n2 = sc.nextInt();

            System.out.print("Enter the base of either numbers: ");
            int b = sc.nextInt();

            if (b < 2 || b > 10) {
                System.out.println("Enter the base again.");
                
                
            // if (n1 < 0 || n1 > 256 || n2 < 0 || n2 > 256 || n1>n2)
            // System.out.println("Enter the number again."); // continue; // }
            }

            else {

                while (n1 != 0 || n2 != 0) {

                    int d2 = n2 % 10;
                    int d1 = n1 % 10;

                    d2 = d2 - borrow;

                    if (d2 < d1) {
                        d2 = d2 + b;
                        borrow = 1;
                    } 
                    else {
                        borrow = 0;
                    }

                    difference = d2-d1;

                    Sum = (int) (Sum + difference * Math.pow(10, count));

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
