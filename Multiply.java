public class Multiply {

    public static int multiplyNumbers(int x, int y) {
        int Multiple = x * y;
        return Multiple;
    }

    public static void main(String[] args) {
        int E = 7;
        int F = 8;


        int value = multiplyNumbers(E, F);

        System.out.println("The Multiple of " + E + " and " + F + " is: " + value);
    }
}



