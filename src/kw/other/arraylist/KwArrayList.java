//package kw.other.arraylist;
//
//public class KwArrayList<T> {
//    private Object[] element;
//    private Object[] emptyElement = {};
//    private int DEFAULT_SIZE = 10;
//    private int size;
//
//    public KwArrayList(){
//        this.element = emptyElement;
//    }
//
//    public KwArrayList(int size){
//        if (size>0){
//            element = new Object[size];
//        }else if (size == 0){
//            element = emptyElement;
//        }else {
//            throw new IllegalArgumentException("size is error!");
//        }
//    }
//
//    public KwArrayList(KwArrayList arrayList){
////        arrayList.
//    }
//
//    private int modCount = 0;
//    public boolean add(T e){
//        ensureCapacityInternal();
//        element[size ++] = e;
//        return true;
//    }
//
//    public void ensureCapacityInternal(int minCapacity){
//        ensureExplicitCapacity(calculateCapacity(element,minCapacity));
//    }
//
//    private static int calculateCapacity(Object[] elementData, int minCapacity) {
//        if (elementData == ) {
//            return Math.max(DEFAULT_CAPACITY, minCapacity);
//        }
//        return minCapacity;
//    }
//
//    public void ensureExplicitCapacity(int minCapacity){
//
//    }
//}
