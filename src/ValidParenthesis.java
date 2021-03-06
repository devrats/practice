import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        stack.push('a');
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        String check = scanner.nextLine();
        for (int index = 0; index < check.length(); index++) {
            if (check.charAt(index) == '{' || check.charAt(index) == '[' || check.charAt(index) == '(') {
                stack.push(check.charAt(index));
                counter++;
            } else if (stack.peek() == '{' && check.charAt(index) == '}'
                    || stack.peek() == '[' && check.charAt(index) == ']'
                    || stack.peek() == '(' && check.charAt(index) == ')') {
                stack.pop();
            } else {
                System.out.println("unbalanced");
                break;
            }
        }
        if (counter == 0) {
        } else {
            if (stack.peek() == 'a') {
                System.out.println("balanced");
            }
        }
    }
}
