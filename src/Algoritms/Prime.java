package Algoritms;

public class Prime {

    public static void primeNumber(int number) {

        if (number < 1) {
            System.out.println("Not Prime");
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    System.out.println("Not Prime");
                    return;
                }
            }
            System.out.println("Prime");
        }
    }

}
