    /*
     * Lotto Picker. Generate random number 1-30.  Return 5 random numbers to user. */


    import java.util.Random;

    public class LottoPicker {
        public static void main(String[] args) {
            Random random = new Random();

            int numberOfNumbersGenerated = 0;
            int total = 5;


            while (numberOfNumbersGenerated < total) {
                int randomNumber = random.nextInt(30);
                System.out.println(randomNumber);
                numberOfNumbersGenerated++;
            }
        }
    }

