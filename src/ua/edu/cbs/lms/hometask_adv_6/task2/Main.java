package ua.edu.cbs.lms.hometask_adv_6.task2;

import ua.edu.cbs.lms.hometask_adv_6.errorshandler.ErrorsHandler;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Method[] methods = calculator.getClass().getDeclaredMethods();

        int num1 = 10, num2 = 5;
        for (Method method : methods) {
            Annotation[] annotations = method.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                try {
                    if (annotation instanceof Operation) {
                        Operation operation = (Operation) annotation;
                        double result = (double) method.invoke(null, num1, num2);
                        System.out.printf("%1$s (%2$d) %3$s %4$s (%5$d) = %6$.2f \n",
                                operation.params()[0], num1, operation.value(), operation.params()[1], num2, result);
                    }
                }catch (Exception error){
                    ErrorsHandler.errorHandler(error);
                }
            }
        }
    }
}
