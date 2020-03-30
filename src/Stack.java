import java.util.ArrayList;

public class Stack {
    private ArrayList _stackArrayList;

    public Stack()
    {
        _stackArrayList = new ArrayList();
    }

    public int size() {
        return _stackArrayList.size();
    }

    public void push(Object item) {
        _stackArrayList.add(item);
    }

    public Object pop() {
        return _stackArrayList.remove(_stackArrayList.size() - 1);
    }
}
