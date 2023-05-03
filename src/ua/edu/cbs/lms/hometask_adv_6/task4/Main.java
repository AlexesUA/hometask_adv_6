package ua.edu.cbs.lms.hometask_adv_6.task4;

import ua.edu.cbs.lms.hometask_adv_6.errorshandler.ErrorsHandler;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        MathCalculator calculator = new MathCalculator();
        Class<?> calculatorClass = calculator.getClass();
        Method[] methods = calculatorClass.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Math.class)) {
                Math mathAnnotation = method.getAnnotation(Math.class);
                int num1 = mathAnnotation.num1();
                int num2 = mathAnnotation.num2();
                try {
                    method.invoke(calculator, num1, num2);
                } catch (Exception error) {
                    ErrorsHandler.errorHandler(error);
                }
            }
        }
    }
}
