package palindromedetectorjustinbashara;
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
    
    // Method removes empty spaces.
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
        
        // Adds each character from the testExpression to a stack.
        for(int i = 0; i < testExpression.length(); i++){
            stack.push(testExpression.charAt(i));
        }
        
        // Removes each character from stack.
        // Checks to see if it is equal to the character at the specified position in testExpression.
        for(int i = 0; i < testExpression.length(); i++){
            if(testExpression.charAt(i) != stack.pop()){
                result = "This is not a palindrome.";
            }
            else result = "This is a palindrome";
        }
        return result;
    }
}
