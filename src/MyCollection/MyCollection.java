package MyCollection;

/**
 * Created by Gvozd on 28.11.2015.
 */
public class MyCollection {
    private static final int ARRAYSTARTINGLENGTH = 0;
    private MyObject[] data;

    public MyCollection() {
        data = new MyObject[ARRAYSTARTINGLENGTH];
    }

    public void allToString() {
        for (int i = 0; i < data.length; i++) {
            System.out.println("Cell: "+i+" data: "+data[i].getValue());
        }
    }

    public int size() {
        return data.length;
    }

    public void add(Object object) {
        dataArrayChangeLength(data.length + 1);
        data[data.length - 1] = new MyObject(object);
    }

    public void addAll(MyCollection newcollections) {
        int dataArrayId = data.length;
        int dataNewLength = newcollections.size() + data.length;
        dataArrayChangeLength(dataNewLength);
        for (MyObject newobject : newcollections.data) {
//            System.out.println("Putting "+newobject.toString()+" in data cell"+dataArrayId);
            data[dataArrayId] = new MyObject(newobject);
            dataArrayId++;
        }
        dataArrayTrim();
    }

    private void dataArrayChangeLength(int newLength) {
        MyObject[] newArrayOfObjects = new MyObject[newLength];
        System.arraycopy(data, 0, newArrayOfObjects, 0, data.length);
        data = newArrayOfObjects;
    }

    private void dataArrayTrim() {
        int resultingArrayLength = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) resultingArrayLength++;
        }
        MyObject[] newArrayOfObjects = new MyObject[resultingArrayLength];
        int newValueOfNewArrayOfObjects = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                newArrayOfObjects[newValueOfNewArrayOfObjects] = data[i];
                newValueOfNewArrayOfObjects++;
            }
        }
        data = newArrayOfObjects;
    }

    public void remove(Object object) {
        for (int i = 0; i < data.length; i++) {
            if (object.toString() == (data[i].toString())) {
                data[i] = null;
            }
            ;
        }
        dataArrayTrim();
    }

    public void removeById(int objectId) {
        data[objectId] = null;
        dataArrayTrim();
    }

    public boolean isEmpty() {
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) return false;
        }
        return true;
    }

    public boolean contains(Object object) {
        for (int i = 0; i < data.length; i++) {
            if (object.equals(data[i].toString())) return true;
        }
        return false;
    }

    public void clear() {
        data = new MyObject[ARRAYSTARTINGLENGTH];
    }

    public boolean retainAll(MyCollection collection) {
        int coincidenceNumber = 0;
        for (int i = 0; i < data.length; i++) {
            for (MyObject searchableObject : collection.data) {
                if (searchableObject == data[i]) coincidenceNumber++;
            }
        }
        if (coincidenceNumber == collection.size()) return true;
        return false;
    }

    public boolean removeAll(MyCollection collection) {
        int removingDataNumber = 0;
        for (int i = 0; i < data.length; i++) {
            for (MyObject searchableObject : collection.data) {
                if (searchableObject.equals(data[i])) {
                    data[i] = null;
                    removingDataNumber++;
                }
            }
        }
        dataArrayTrim();
        if (removingDataNumber == collection.size()) return true;
        return false;
    }

    public boolean containsAll(MyCollection collection) {
        int coincidenceNumber = 0;
        for (int i = 0; i < data.length; i++) {
            for (MyObject searchableObject : collection.data) {
                if (searchableObject.toString() == data[i].toString()) coincidenceNumber++;
            }
        }
        if (coincidenceNumber == collection.size()) return true;
        return false;
    }

    public Object getValue(int valueID) {
        return data[valueID].getValue();
    }


}
