package com.dimitri;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class ListMakerTest {
    String[] names = {"James", "John", "Mark", "Mike", "Sean", "Dave", "James", "Dave"};

    List<String> nameList = new ArrayList<>();/** making an Arraylist**/
    List<String> linkName = new LinkedList<>();
    Collection<String> vect = new Vector<String>();
    Set<String> set;
    Map<Integer, String> employees = new HashMap(); // making a hashMap

    public ListMaker list = new ListMaker();





    @Test
    public void collectList() {
        for (String name : names) {            //add names to the arraylist
            nameList.add(name);

        }
        assertEquals("Check if the names were added ArrayList", 8, nameList.size());
    }

    @Test
    public void linkUser() {
        for (String name : names) {            //add names to the arraylist
            nameList.add(name);

        }
        linkName.addAll(nameList);
        assertEquals("Check if the names were added to the LinkedList", 8, linkName.size());
    }

    @Test
    public void setUser() {
        for (String name : names) {            //add names to the arraylist
            nameList.add(name);

        }
        set = new HashSet<String>(nameList);
        assertEquals("Check the number of unique names were added to the Set", 6, set.size());
    }

    @Test
    public void mapUser() {
        assertEquals("Check if the names were added", 0, employees.size());
    }


    @Test
    public void removeList() {
        for (String name : names) {            //add names to the arraylist
            nameList.add(name);

        }

        nameList.remove("Mike");
        assertEquals("Check if the a name was removed", 7, nameList.size());
    }

    @Test
    public void removeRange() {
        for (String name : names) {            //add names to the arraylist
            nameList.add(name);
        }
        linkName.addAll(nameList);
        linkName.subList(1, 3).clear();
        assertEquals("Range has been successfully removed", 6, linkName.size());

    }

    @Test
    public void vectorCheck() {
        for (String name : names) {            //add names to the arraylist
            nameList.add(name);
        }
        vect.addAll(nameList);
        String tester = "Sean";
        assertEquals("Sean is contained in the vector", tester, "Sean");

    }
}