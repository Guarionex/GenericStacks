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

    public Object peek() {
        return _stackArrayList.get(_stackArrayList.size() - 1);
    }

    public boolean empty() {
        return _stackArrayList.size() == 0;
    }

    public Object search(Object itemToSearch) {
        return (_stackArrayList.indexOf(itemToSearch) - _stackArrayList.size()) * -1;
    }

    public Object addAll() {
        var total = (int) _stackArrayList.get(0);
        for (var i = 1; i < _stackArrayList.size(); i++)
        {
            total += (int) _stackArrayList.get(i);
        }

        return total;
    }
}
