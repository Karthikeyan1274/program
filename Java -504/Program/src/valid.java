import java.util.Stack;
public class valid {    
    public static boolean isValidParenthesis(String s){
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()){
            if (ch == '(' || ch == '[' || ch == '{') stack.push(ch);
            else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') stack.pop();
            else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') stack.pop();
            else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') stack.pop();
            else return false;
        }
        return stack.isEmpty();
    }
}
