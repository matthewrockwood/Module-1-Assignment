public class Main {
    public static void main(String[] args) {
        int age = 25;
        double salary = 50000.0;
        String name = "John";

        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }
        int count = 0;
        while (count < 3) {
            System.out.println("Count: " + count);
            count++;
        }
        int num = 1;
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num <= 3);
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }
        num = 7;
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        num = 1;
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num <= 3);
         x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }
        num = 7;
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        age = 18;
        if (age >= 18) {
            if (age < 21) {
                System.out.println("You're eligible but not for alcohol");
            } else {
                System.out.println("You're eligible for everything");
            }
        } else {
            System.out.println("You're not eligible");
        }
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
// ...
            default:
                System.out.println("Invalid day");
        }

    }
}