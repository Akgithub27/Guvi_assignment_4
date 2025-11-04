package studentManagementSystem;

public class AgeNotWithinRangeException extends Exception{

    public AgeNotWithinRangeException(){
        super("Age is not within 15 to 21");
    }
}
