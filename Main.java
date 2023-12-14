public class Main {
    public static void main(String[] args) {
        int testNumber1 = 10;
        int testNumber2 = 0;

        zeroDividerTryHarder(testNumber1, testNumber2);
    }

    public static void zeroDividerTryHarder(int number1, int number2){
        try {
            int result = number1 / number2;
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println("ERROR");
        }
    }
}
