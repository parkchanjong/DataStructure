import java.util.*;

public class ExStack {
    public static void main() {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }
        while(!stack.isEmpty()) {
            int element = stack.pop();
            System.out.println(element);

        }
    }
}