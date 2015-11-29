package MyCollection;

/**
 * Made by Yakimov Denis, 29/11/2015 for Hillel Java course
 */

public class App {
    public static void main(String[] args) {

        MyCollection arrayOfABCs = new MyCollection();
        arrayOfABCs.add("a");
        arrayOfABCs.add("b");
        arrayOfABCs.add("c");
        arrayOfABCs.add("d");
        arrayOfABCs.add("e");

        MyCollection objectContainer = new MyCollection();
        System.out.println("Creating array of objects "+objectContainer.toString()+", adding a new obj \"FirstOne\"");
        objectContainer.add("FirstOne");
        System.out.println("Array size is "+objectContainer.size());
        System.out.println("Value number 0 is "+objectContainer.getValue(0));
        System.out.println();

        System.out.println("Adding all data from other collection");
        objectContainer.addAll(arrayOfABCs);
        System.out.println("Array size is "+objectContainer.size());
        objectContainer.allToString();
        System.out.println();

        System.out.println("Does collection have an value \"c\"? - "+objectContainer.contains("c"));
        System.out.println("Removing two objects (by value \"c\" and by cell_id=1)");
        objectContainer.remove("c");
        objectContainer.removeById(1);
        objectContainer.allToString();
        System.out.println();

        System.out.println("Clearing the collection");
        objectContainer.clear();
        System.out.println("Array size is "+objectContainer.size());
        System.out.println();
        System.out.println("Copying all from other collection.");
        objectContainer.addAll(arrayOfABCs);
        System.out.println("Array size is "+objectContainer.size());
        objectContainer.allToString();
        System.out.println("Does the data were retained from other object? - "+objectContainer.retainAll(arrayOfABCs));
        System.out.println("But does the data is equal? - "+objectContainer.containsAll(arrayOfABCs));
        System.out.println();


        System.out.println("Clonning links from another array");
        objectContainer=arrayOfABCs;
        System.out.println("Does the data were retained from other object? - "+objectContainer.retainAll(arrayOfABCs));

    }
}
