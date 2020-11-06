// Justin Bashara
// Comparable Assignment
package comicbooksjustinbashara;

import java.util.ArrayList;
import java.util.Collections;

public class ComicBooksJustinBashara {

    public static void main(String[] args) {
        ArrayList<ComicBook> comics = new ArrayList<ComicBook>(7);
        
        ComicBook comic1 = new ComicBook("The Purple Spider", 1968, 8);
        comics.add(comic1);
        ComicBook comic2 = new ComicBook("The Purple Spider", 1968, 4);
        comics.add(comic2);
        ComicBook comic3 = new ComicBook("The Red Cape", 1985, 7);
        comics.add(comic3);
        ComicBook comic4 = new ComicBook("The Blue Bouncer", 1985, 3);
        comics.add(comic4);
        ComicBook comic5 = new ComicBook("The Great Avenger", 1966, 9);
        comics.add(comic5);
        ComicBook comic6 = new ComicBook("Zebraman", 1968, 8);
        comics.add(comic6);
        ComicBook comic7 = new ComicBook("Incredible Crisis", 1984, 7);
        comics.add(comic7);

        Collections.sort(comics);
        
        for(int i = 0; i < comics.size(); i++){
            System.out.println(comics.get(i));
        }
        
    }
    
}
