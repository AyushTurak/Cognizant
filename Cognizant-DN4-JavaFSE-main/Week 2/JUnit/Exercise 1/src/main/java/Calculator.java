public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        System.out.println("2 + 3 = " + result);
    }
}

