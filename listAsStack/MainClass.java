package listAsStack;

public class MainClass {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack();

        try {
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
            stack.push(50);

            stack.display();
            stack.pop();

            stack.display();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
