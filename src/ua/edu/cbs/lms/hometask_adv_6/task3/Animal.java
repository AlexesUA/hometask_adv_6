package ua.edu.cbs.lms.hometask_adv_6.task3;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
@interface AnimalAnnotation {
    String name();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MethodAnnotation {
    String value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface FieldAnnotation {
    int order() default 0;
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
@interface ParameterAnnotation {
    String value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.LOCAL_VARIABLE)
@interface LocalVariableAnnotation {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE_PARAMETER)
@interface TypeParameterAnnotation {
    String value();
}

@AnimalAnnotation(name = "Animal")
public class Animal {
    @FieldAnnotation(order = 1)
    private int age;
    @FieldAnnotation(order = 2)
    private String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @MethodAnnotation("The animal makes a sound")
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }

}
