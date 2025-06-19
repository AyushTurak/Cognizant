class Logger {
    private static Logger logger;

    private Logger() {
        // Constructor
    };

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public String doSomething() {
        return new String("Method to implement Logger");
    }
}