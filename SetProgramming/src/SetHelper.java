import java.util.HashSet;

/**
 * Created by jimtryon on 1/22/15.
 */
import java.util.*;

public class SetHelper<E> {

    // no fields
    // methods
    public  Set<E> intersect(Set<E> s1, Set<E> s2) {
        Set<E> intersection = new HashSet<E>(s1);
        intersection.retainAll(s2);
        return intersection;
    }

    public Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> union = new HashSet<E>(s1);
        union.addAll(s2);
        return union;
    }

    public Set<E> difference(Set<E> s1, Set<E> s2) {
        Set<E> difference = new HashSet<E>(s1);
        difference.removeAll(s2);
        return difference;

    }

    public Set<E> symmetricDifference(Set<E> s1, Set<E> s2) {
        Set<E> unionOfS1andS2 = union(s1, s2);
        Set<E> intersectionOfS1andS2 = intersect(s1, s2);
        Set<E> symDiff = difference(unionOfS1andS2, intersectionOfS1andS2);
        return symDiff;
    }
}
