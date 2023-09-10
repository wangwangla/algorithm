# 注解

> 注解是需要其他工具处理的标签，他作为一种修改标签。

## 可以做什么

注解可以用来检查代码是否正确，运行时候访问，增加程序的动态性。

java提供零零修饰成员变量  修饰方法  修饰类等注解  修饰注解的注解元注解

### 元注解

- @Target:目标的范围
- @Retension：保持性
- @Documented：文档
- @Inherited： 注解继承
- @Repeatable:可以重复修饰


## 自定义注解

使用@interface

```java
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Target(ElementType.FIELD)  //给字段
@Retention(RetentionPolicy.RUNTIME)  //运行时
@Documented //文档
public @interface Value{
    String value() default "test value"; //默认值
}
```


#### 自定义注解类型

8种基本数据类型：
```java
char boolean byte int double float long short
String/class/enum/注解类型
```
