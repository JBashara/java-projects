// Class uses the Comparable interface and overrides the compareTo method.
package comicbooksjustinbashara;

public class ComicBook implements Comparable<ComicBook> {
    int year, score, compare;
    String name;
    
    public ComicBook(String name, int year, int score){
        this.name = name;
        this.year = year;
        this.score = score;
    }
    
    @Override
    public int compareTo(ComicBook comic){
        // Method returns -1 or 1 if current object is less than or greater than passed in object.
        if (this.score > comic.score){
            return 1;
        }
        else if (this.score == comic.score){
            if (this.year < comic.year){
                return 1;
            }
            else return -1;
        }
        else if (this.score == comic.score && this.year == comic.year){
            return compare = this.name.compareToIgnoreCase(comic.name);
        }
        else return -1;   
    }
    
    @Override
    public String toString(){
        String result;
        result = name + ", " + year + ", " + score + ".";
        return result;
    }
}
