package edu.cmu.cs.cs214.rec04;

import java.util.List;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

// HINT: Take a look at the UML diagram to see what DelegationSortedIntList
//       should implement.
public class DelegationSortedIntList {
    private int totalAdded;
    SortedIntList sortedIntList = new SortedIntList();

    public DelegationSortedIntList(){
        super();
    }

    public int getTotalAdded(IntegerList list){
        sortedIntList.addAll(list);

        return sortedIntList.get(1);
    }

}