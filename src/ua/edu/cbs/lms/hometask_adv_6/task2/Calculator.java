package ua.edu.cbs.lms.hometask_adv_6.task2;

import ua.edu.cbs.lms.hometask_adv_6.errorshandler.ErrorsHandler;

import java.lang.annotation.*;

/**
 * Анотація для вказівки операцій та їх параметрів.
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Operation {
    String value();
    String[] params();
}

/**
 * Клас-калькулятор з документаційними коментарями.
 */
public class Calculator {

    /**
     * Метод додавання двох чисел.
     *
     * @return сума чисел
     */
    @Operation(value = "Add", params = {"num1", "num2"})
    public static double add(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Метод віднімання двох чисел.
     *
     * @return різниця чисел
     */
    @Operation(value = "Subtract", params = {"num1", "num2"})
    public static double subtract(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Метод множення двох чисел.
     *
     * @return добуток чисел
     */
    @Operation(value = "Multiply", params = {"num1", "num2"})
    public static double multiply(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Метод ділення двох чисел.
     *
     * @return частка чисел
     * @throws ArithmeticException якщо друге число дорівнює 0
     */
    @Operation(value = "Divide", params = {"num1", "num2"})
    public static double divide(int num1, int num2) throws ArithmeticException{

            if (num2 == 0) {
                throw new ArithmeticException("Divide by 0");
            }
            return num1 / num2;


    }
}
