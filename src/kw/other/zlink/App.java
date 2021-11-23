package kw.other.zlink;

public class App {

    public static void main(String[] args) {
        InfoLogger infoLogger = new InfoLogger();
        ErrorLogger errorLogger = new ErrorLogger();
        infoLogger.nextLogger(errorLogger);


    }
}
