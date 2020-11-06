package paindromedetectorjustinbashara;
import java.util.Stack;

public class Detector {
    Stack<Character> stack = new Stack<>();
    String testExpression;
    String newExpression;
    String expression;
    String result;
    
    public Detector(String expression){
        this.expression = expression;
    }
    
    public String sanitize(String expression){
        for(int i = 0; i < expression.length(); i++){
            if(expression.charAt(i) == ' '){
                expression = expression.replace(" ", "");
            }
        }
        newExpression = expression.toLowerCase();
        return newExpression;
    }
    
    public String test(){
        testExpression = sanitize(expression);
        for(int i = 0; i < testExpression.length(); i++){
            stack.push(testExpression.charAt(i));
        }
        for(int i = 0; i < testExpression.length(); i++){
            if(testExpression.charAt(i) != stack.pop()){
                result = "This is not a palindrome.";
            }
            else result = "This is a palindrome";
        }
        return result;
    }
}
