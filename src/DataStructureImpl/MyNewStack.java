package DataStructureImpl;

public class MyNewStack {
    private  int[] elements;
    private int lastLocationWritten = -1 ;

    public MyNewStack( int numberOfElements){
        elements = new int[numberOfElements];
    }


    public void push(int elementToPush) {
        elements[++lastLocationWritten] = elementToPush;

    }

    public int peek() {
        return elements[lastLocationWritten];
    }

    public int pop() {
        int lastElement = elements[lastLocationWritten];
        elements[lastLocationWritten--] = 0;
        return lastElement;
    }
}
