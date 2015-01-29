import com.sun.tools.classfile.Opcode;

import java.util.*;

/**
 * Created by jimtryon on 1/22/15.
 */
public class MovieDriver {
    public static void main(String[] args) {
        System.out.println("Welcome to Moviefone");

        Movie mObj1 = new Movie("Jurassic Park", 2000);
        Movie mObj2 = new Movie("Toy Story", 2005);
        Movie mObj3 = new Movie("Transformers", 2012);
        Movie mObj4 = new Movie("The Hangover", 2001);
        Movie mObj5 = new Movie("Final Destination", 2003);

        Set<Movie> library = new HashSet<Movie>();
        Set<Movie> favorites = new HashSet<Movie>();
        Set<Movie> watched = new HashSet<Movie>();
        Set<Movie> action = new HashSet<Movie>();
        Set<Movie> comedy = new HashSet<Movie>();

        library.add(mObj1);
        library.add(mObj2);
        library.add(mObj3);
        library.add(mObj4);
        library.add(mObj5);

        favorites.add(mObj1);
        favorites.add(mObj2);

        // Walk through the set
        Iterator<Movie> currentFav = favorites.iterator();
        System.out.println(currentFav.next());
        System.out.println(currentFav.next());


        watched.add(mObj1);
        watched.add(mObj2);
        watched.add(mObj3);

        action.add(mObj3);
        action.add(mObj5);

        comedy.add(mObj4);

        favorites.clear();      // empty out the favorites set

        System.out.println("Library is " + library);
        System.out.println("Favorites is " + favorites);

        SetHelper helper = new SetHelper();

        // calc the intersection of watched and action
        Set<Movie> watchedActions = helper.intersect(watched, action);
        Set<Movie> unwatched = helper.difference(library, watched);

        // actions that I haven't watched
        Set<Movie> unWatchedAction = helper.difference(unwatched, action);
        System.out.println(unWatchedAction);

        // movies after 2010 that I haven't watched
        Set<Movie> unWatchedNewReleases = new HashSet<Movie>();
        Iterator<Movie> currMovie = unwatched.iterator();
        while (currMovie.hasNext()) {
            Movie tmp = currMovie.next();

            if (tmp.getYear() > 2010) {
                unWatchedNewReleases.add(tmp);

            }
        }

        // Dictionary
        // Associative Array (key, value) pairs
        Map<Movie, Integer> watchedCount = new HashMap<Movie, Integer>();
        watchedCount.put(mObj1, 4);
        watchedCount.put(mObj2, 2);
        watchedCount.put(mObj5, 3);

        int howManyTimes = watchedCount.get(mObj1);

        watchedCount.remove(mObj3);

        watchedCount.clear();

    }

}
