// Justin Bashara
// Iterable Sentences
package justinbasharaiterablesentences;

import java.util.*;

public class JustinBasharaIterableSentences {

    public static void main(String[] args) {
        Sentence sentence1 = new Sentence("This is the first sentence.");
        Sentence sentence2 = new Sentence("This is a longer second sentence.");
        
        for(String sentence : sentence1){
            System.out.println(sentence);
        }
        
        System.out.println();
        
        for(String sentence : sentence2){
            System.out.println(sentence);
        }
        
        
    }
    
}
