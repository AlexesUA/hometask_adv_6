package ua.edu.cbs.lms.hometask_adv_6.errorshandler;

public class ErrorsHandler {
    public static void errorHandler(Exception error){
        System.out.println("ERROR: " + error.getMessage());
        System.out.print("TRACE: ");
        error.printStackTrace();
    }
}
