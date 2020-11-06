//Justin Bashara
//CTEC 243
//9/14/2020
package paindromedetectorjustinbashara;

import java.util.*;

public class PaindromeDetectorJustinBashara {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        Detector detect;
        
        System.out.print("Enter a string to test if it is a palindrome: ");
        input = scan.nextLine();
        detect = new Detector(input);
        System.out.println(detect.test());
    }
    
}
