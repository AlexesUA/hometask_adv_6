package ua.edu.cbs.lms.hometask_adv_6.task3;

public class Cat extends Animal{
    @FieldAnnotation(description = "Cats color")
    private String color;

    public Cat(int age, String name, String color) {
        super(age, name);
        this.color = color;
    }

    @Override
    @MethodAnnotation("The cat's sound")
    public void makeSound() {
        System.out.println("The cat meows");
    }

    @MethodAnnotation("Get color")
    public String getColor() {
        return color;
    }

    @MethodAnnotation("set color")
    public void setColor(String color) {
        this.color = color;
    }
}
