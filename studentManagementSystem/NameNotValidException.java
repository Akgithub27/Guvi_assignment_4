package studentManagementSystem;

public class NameNotValidException extends Exception{

    public NameNotValidException() {
        super("Name should contain only alphabets");
    }

}
