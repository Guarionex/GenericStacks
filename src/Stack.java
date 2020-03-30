import java.lang.reflect.Array;
import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> _stackArray;

    public Stack()
    {
        _stackArray = new ArrayList<>();
    }

    public int size() {
        return _stackArray.size();
    }

    public void push(T item) {
        _stackArray.add(item);
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        return _stackArray.remove(_stackArray.size() - 1);
    }

    public T peek() {
        return _stackArray.get(_stackArray.size() - 1);
    }

    public boolean empty() {
        return _stackArray.size() == 0;
    }

    public int search(T itemToSearch) {
        var index = 0;
        for (int i = 0; i < _stackArray.size(); i++)
        {
            if(itemToSearch.equals(_stackArray.get(i)))
            {
                index = i;
            }
        }

        return (index - _stackArray.size()) * -1;
    }
}
