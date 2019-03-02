package com.dimitri;
import java.util.*;

/**
 * Name: Dimtri Ferus
 * Student number: 216058570
 *
 */
public class ListMaker
{

    String[] names = {"James", "John", "Mark", "Mike", "Sean", "Dave", "James", "Dave"};
    List<String> nameList = new ArrayList<>();/** making an Arraylist**/
    List<String> linkName = new LinkedList<>(); //making a LinkedList
    Collection<String> vect = new Vector<String>();
    Set<String> set;
    Map<Integer, String> employees = new HashMap(); // making a hashMap

    public static void main( String[] args ) {

            ListMaker lister = new ListMaker();
            lister.collectList();
            lister.linkUser();
            lister.vectorCheck();
            lister.setUser();
            lister.mapUser();
            lister.removeList("Mike");
            lister.removeRange();

    }

    public void collectList() {

        for (String name : names) {            //add names to the arraylist
            nameList.add(name);

        }
        System.out.println(" ");
        System.out.println("List of friends are:");     //print out names in the list
        for (int i = 0; i < nameList.size(); i++) {

            System.out.println(nameList.get(i));
        }
        Collections.sort(nameList);                             //sort the list using and print out its content
        System.out.println(" ");
        System.out.println("Sorted list of friends are:");
        for (int i = 0; i < nameList.size(); i++) {

            System.out.println(nameList.get(i));
        }

    }

    public void removeList(String removed){

        nameList.remove(removed);

        for (int i = 0; i < nameList.size(); i++) {

            System.out.println(nameList.get(i));
        }
        System.out.println(" ");
        System.out.println("The amount of names are: "+nameList.size());
    }

    public void linkUser() {

        linkName.addAll(nameList);                              //use the addAll method to populate linkName

        System.out.println(" ");
        System.out.println("The content of my LinkedList is:");

        Iterator<String> iterator = linkName.iterator();           //iterate through the list using an iterator
        while (iterator.hasNext()) {                                 //and set content to uppercase

            System.out.println(iterator.next().toUpperCase());

        }
    }

    public void setUser() {

        set = new HashSet<String>(nameList);
                   //Testing Set
        System.out.println(" ");
        System.out.println("Unique names printed using a HashSet: ");
        for (String name : set) {                                 // testing for unique names and printing them out

            System.out.println(name);

        }
    }
    //demonstrating the use of maps

    public void mapUser() {
                            //creating a hashmap

        //adding employees to the hashmap
        employees.put(110, "James Marks");
        employees.put(111, "Mark Mayes");
        employees.put(112, "Pat Lambie");
        employees.put(113, "Dave East");
        employees.put(114, "Ann Hammond");
        employees.put(115, "Mark Hunt");

        System.out.println(" ");
        System.out.println("Number of employees in the HashMap: " + employees.size());

        //iterate through the hashmap
        for (int key : employees.keySet()) {
            System.out.println(key + " - " + employees.get(key));
        }
        System.out.println(" ");

        //searching for a key
        int search = 114;
        if (employees.containsKey(search)) {
            System.out.println("Found the specified employee key of: " + employees.get(search));
        }

        //empty the hasmap
        employees.clear();
        System.out.println(" ");
        System.out.println("Number of employees left in the HashMap " + employees.size());
    }

    public void removeRange(){
        linkName.subList(1, 3).clear();

        Iterator<String> iterator = linkName.iterator();           //iterate through the list using an iterator
        System.out.println(" ");
        System.out.println("The remaining names in the LinkedList are: ");
        while (iterator.hasNext()) {                                 //and set content to uppercase

            System.out.println(iterator.next());

        }
    }
    public void vectorCheck(){

        vect.addAll(nameList);
    System.out.println(" ");
        if(vect.contains("Sean")){
            System.out.println("Sean exists in the Vector");

        }

    }



}
