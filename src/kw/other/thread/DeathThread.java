package kw.other.thread;

public class DeathThread {
    static A a = new A();
    static A b = new A();
    public static void main(String[] args) {
        new Thread(()->{
            synchronized (a){
                try {

                }catch (Exception e){

                }
                synchronized (b){

                }
            }
        }).start();

        new Thread(()->{
            synchronized (b){
                synchronized (a){
                    
                }
            }
        }).start();
    }
}

class A{

}