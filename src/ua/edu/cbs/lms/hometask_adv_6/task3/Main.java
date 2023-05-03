package ua.edu.cbs.lms.hometask_adv_6.task3;

import ua.edu.cbs.lms.hometask_adv_6.errorshandler.ErrorsHandler;


import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(3, "Whiskers", "Gray");

        Method[] methods = cat.getClass().getDeclaredMethods();

        for (Method method : methods) {
            Annotation[] annotations = method.getDeclaredAnnotations();

            for (Annotation annotation : annotations) {
                try {
                    if (annotation instanceof MethodAnnotation) {
                        MethodAnnotation operation = (MethodAnnotation) annotation;
                        if (operation.value().equals("The cat's sound")) {
                            try {
                                method.setAccessible(true);
                                method.invoke(cat);
                            } catch (Exception error) {
                                ErrorsHandler.errorHandler(error);
                            }
                        }

                    }
                }catch (Exception error){
                    ErrorsHandler.errorHandler(error);
                }
            }
        }


        @LocalVariableAnnotation(description = "The cat's age")
        int age = cat.getAge();
        System.out.println("Age: " + age);
    }
}
