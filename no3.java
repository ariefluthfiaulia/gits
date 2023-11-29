import java.util.Stack;

public class BalancedBracket {

    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : s.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }

                char top = stack.pop();
                if (!((top == '(' && bracket == ')') || (top == '[' && bracket == ']') || (top == '{' && bracket == '}'))) {
                    return "NO";
                }
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) {
        String string1 = "{[(])}";
        String string2 = "{(([])[])[]}";

        System.out.println("Result 1: " + isBalanced(string1));
        System.out.println("REsult 2: " + isBalanced(string2));
    }
}
