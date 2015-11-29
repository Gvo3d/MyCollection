package MyCollection;

/**
 * Created by Gvozd on 28.11.2015.
 */
public class MyObject {
    private final Object VALUE;

    public MyObject(Object value) {
        this.VALUE = value;
    }

    public Object getValue() {
        return VALUE;
    }

    public String toString(){
        return VALUE.toString();
    }

}
