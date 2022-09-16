import java.util.Scanner;

class Digits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a five digit number: ");
        int num = s.nextInt();
        int tenThousandDigit = (num / 10000 + 1) % 10;
        int thousandDigit = (num % 10000 / 1000 + 1) % 10;
        int hundredDigit = (num % 1000 / 100 + 1) % 10;
        int tenDigit = (num % 100 / 10 + 1) % 10;
        int oneDigit = (num % 10 + 1) % 10;
        System.out.println("Number: " + tenThousandDigit + thousandDigit + hundredDigit + tenDigit + oneDigit);
        System.out.println("Program done!");

    }
}