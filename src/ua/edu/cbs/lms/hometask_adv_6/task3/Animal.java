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
    String description();
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
    @FieldAnnotation(description = "Animals age")
    private int age;
    @FieldAnnotation(description = "Animals name")
    private String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @MethodAnnotation("The animal makes a sound")
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }

    @MethodAnnotation("Get age")
    public int getAge() {
        return age;
    }

    @MethodAnnotation("Set age")
    public void setAge(int age) {
        this.age = age;
    }

    @MethodAnnotation("Get name")
    public String getName() {
        return name;
    }

    @MethodAnnotation("Set name")
    public void setName(String name) {
        this.name = name;
    }
}
