package justinbasharaiterablesentences;

import java.util.*;

public class Sentence implements Iterable<String> {
    private final String sentenceString;
    
    public Sentence(String sentenceString){
        this.sentenceString = sentenceString;
    }
    
    @Override
    public String toString(){
        return sentenceString;
    }
    
    @Override
    public Iterator<String> iterator(){
        // Returns Iterator over this list.
        return new Iterator<String>(){
            String[] stringArr = sentenceString.split(" ");
            int count = 0;      //counter to track position in stringArr
            String sentence;    //sentence to be returned
            
            @Override
            public boolean hasNext(){
                return count < stringArr.length;
            }
            
            @Override
            public String next(){
                sentence = stringArr[count];
                count++;
                return sentence;
            }
            
            @Override
            public void remove(){
                String removeString = "This function is not supported.";
                System.out.println(removeString);
            }
        };
    }
}
