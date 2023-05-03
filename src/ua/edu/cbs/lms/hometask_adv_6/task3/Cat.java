package ua.edu.cbs.lms.hometask_adv_6.task3;

public class Cat extends Animal{
    @FieldAnnotation(order = 3)
    private String color;

    public Cat(int age, String name, String color) {
        super(age, name);
        this.color = color;
    }

    @Override
    @MethodAnnotation("The cat sound")
    public void makeSound() {
        System.out.println("The cat meows");
    }
}
