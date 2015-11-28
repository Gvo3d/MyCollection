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
        System.out.println("Creating array of objects, adding a new obj \"FirstOne\"");
        objectContainer.add("FirstOne");
        System.out.println("Array size is "+objectContainer.size());
        System.out.println("Value n 0 is "+objectContainer.getValue(0));
        System.out.println();

        System.out.println("Adding all data from other Collection");
        objectContainer.addAll(arrayOfABCs);
        System.out.println("Array size is "+objectContainer.size());
        objectContainer.allToString();
        System.out.println();
        System.out.println("Value n 0 is "+objectContainer.getValue(0));
    }
}
