package listAsStack;

import java.util.ArrayList;
import java.util.List;

public class CustomStack {
    List<Integer> list = new ArrayList<>();
    int top = 0;

    public void push(int number) { // adding element to stack
        list.add(number);
        top++;
    }

    public int pop() throws Exception { // removing top element
        if (isStackEmpty()) {
            throw new Exception("Stack is empty!");
        }
        top--;
        return list.remove(top);
    }

    public boolean isStackEmpty() {
        return list.isEmpty();
    }

    public void display() {
        System.out.print("[ ");
        for (Integer obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println("]");
    }
}
