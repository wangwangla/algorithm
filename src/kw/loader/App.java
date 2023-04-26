//package kw.loader;
//
//import sun.text.resources.ar.CollationData_ar;
//
//public class App {
//    public static void main(String[] args) {
//        ClassLoader classLoader = Object.class.getClassLoader();
//        System.out.println(classLoader);
//
//        CollationData_ar ar = new CollationData_ar();
//        System.out.println(CollationData_ar.class.getClassLoader());
//
//        ClassLoader classLoader1 = App.class.getClassLoader();
//        System.out.println(classLoader1);
//
//        while (classLoader1!=null){
//            classLoader1 = classLoader1.getParent();
//            System.out.println(classLoader1);
//        }
//
//    }
//}
