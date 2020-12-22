import java.util.Stack;

public class GoogleInterviewCodingChallenge11 {
    public static void main(String[] args) {
        /*
        * Given a string S containing just the characters '(',')','{','}','[' and ']',
        * determine if the input string is valid.
        *
        * An input string is valid if:
        * 1. Open brackets must be closed by the same type of brackets.
        * 2. Open brackets must be closed in the correct order.
        *
        * Example 1:
        * Input: s = "()"
        * Output: true
        *
        * Example 2:
        * Input: s = "()[]{}"
        * Output: true
        *
        * Example 3:
        * Input: s = "(]"
        * Output: false
        *
        * Example 4:
        * Input: s = "([)]"
        * Output: false
        *
        * Example 5:
        * Input: s = "{[]}"
        * Output: true
        *
        * Constraints:
        * - 1 <= s.length <= 10⁴
        * - s consists of parentheses only '()[]{}'.
        **/

        System.out.println(checkBrackets("()[]{}"));
    }

        static boolean checkBrackets(String s){
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) ==')'){
                    if(stack.size() != 0 && stack.peek() == '(') stack.pop();
                    else return false;
                }else if(s.charAt(i) ==']'){
                    if(stack.size() != 0 && stack.peek() == '[') stack.pop();
                    else return false;
                }else if(s.charAt(i) =='}'){
                    if(stack.size() != 0 && stack.peek() == '{') stack.pop();
                    else return false;
                }else{
                    stack.push(s.charAt(i));
                }
            }

            return stack.isEmpty();
        }
}
