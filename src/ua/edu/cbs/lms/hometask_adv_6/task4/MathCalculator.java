package ua.edu.cbs.lms.hometask_adv_6.task4;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Math {
    int num1();
    int num2();
}

public class MathCalculator {
    @Math(num1 = 100, num2 = 200)
    public void mathSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);
    }
}
