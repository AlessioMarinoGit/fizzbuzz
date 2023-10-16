public class fizzybuzzy {
    public static void fizzbuzz(int divide1, int divide2) {
        int last1 = 0;
        int last2 = 0;
        for (int i = 1; i <= 100; i++) {
            boolean num = true;
            if (last1 != i/divide1) {
                System.out.print("Fizz");
                num = false;
            }
            if (last2 != i/divide2) {
                System.out.print("Buzz");
                num = false;
            }
            if (num == true) {
                System.out.print(i);
            }
            last1 = i/divide1;
            last2 = i/divide2;
            System.out.println("");
        }
    }
}