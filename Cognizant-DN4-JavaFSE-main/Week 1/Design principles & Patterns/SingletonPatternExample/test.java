
public class test {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        System.out.println("Message from logger1: " + logger1.doSomething());
        System.out.println("Message from logger2: " + logger2.doSomething());
        System.out.println("Are logger1 and logger2 equal? : " + (logger1 == logger2));
    }
}