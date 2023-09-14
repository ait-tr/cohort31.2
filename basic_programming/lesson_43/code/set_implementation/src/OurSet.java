public interface OurSet<E> extends Iterable<E> {

    /*
    adds a new element to the set
    @param elt to add
    @return true if set was changed
     */
    boolean add(E elt);


    /*
    removes an element from the set
    @param elt to remove
    @return true if the set was changed
     */
    boolean remove(E elt);


    /*
    checks if the elt is in the set

    @param elt to find
    @return true if the set contains the elt
     */

    boolean contains(E elt);

    int size();



}
