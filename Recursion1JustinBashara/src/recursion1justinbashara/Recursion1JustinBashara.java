// Justin Bashara
// Recursion 1 Assignment
package recursion1justinbashara;

public class Recursion1JustinBashara {
    
    public static void main(String[] args) {
        int[] array = {1,3,8,22,5,6,8,9};
        int count = 0;
        int largest = 0;
        int result = maxElement(array, count, largest);
        System.out.println(result);
    }
    
    public static int maxElement(int array[], int count, int largest){
        if(count == array.length){
            return largest;
        }
        else {
            if (array[count] > largest){
                largest = array[count];
            }
            count++;
            return maxElement(array, count, largest);
        }
        
    }
    
}
