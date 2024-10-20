package kw.fanxing.cachu;

import java.lang.reflect.Field;

/**
 * 类型擦除就是在开始书写的时候会进行判断
 */
public class Demo {
    public static void main(String[] args) {
//        ArrayList<String> strList = new ArrayList<>();
//        ArrayList<Integer> intList =  new ArrayList<>();
//        //区别就是一个带包名，一个不带包名。
//        System.out.println("strList.getName  :"+strList.getClass().getName()
//                + "===  strList.getSimpleName  :"+strList.getClass().getSimpleName());
//        //strList.getName  :java.util.ArrayList===  strList.getSimpleName  :ArrayList
//        //泛型编译之后泛型的类型就会被擦除，仅仅是在编译时期存在，后续就不会存在

        Class<People> peopleClass = People.class;
        Field[] fields = peopleClass.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            System.out.println("name    :"+
                    field.getName()+"\n类型    :"+
                    field.getType()+" \n"+
                    field.getGenericType()+"\n"+
                    field.toGenericString()+"\n"+
                    field.getDeclaringClass()+"\n"+
                    field.getModifiers());
        }
//        name    :name
//        类型    :class java.lang.Object
//        如果给People一个上限，那么最后的数据类型就是上限

    }
}
