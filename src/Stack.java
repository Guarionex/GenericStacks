import java.lang.reflect.Array;

public class Stack<T> {
    private T[] _stackArray;
    private Class<T> _type;

    @SuppressWarnings("unchecked")
    public Stack(Class<T> type)
    {
        _type = type;
        _stackArray = (T[]) Array.newInstance(_type, 0);
    }

    public int size() {
        return _stackArray.length;
    }

    @SuppressWarnings("unchecked")
    public void push(T item) {
        var resizedArray = (T[]) Array.newInstance(_type, _stackArray.length + 1);
        System.arraycopy(_stackArray, 0, resizedArray, 0, _stackArray.length);
        _stackArray = resizedArray;
        _stackArray[_stackArray.length - 1] = item;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        var poppedItem = _stackArray[_stackArray.length - 1];
        var resizedArray = (T[]) Array.newInstance(_type, _stackArray.length - 1);//new T[_stackArray.length - 1];
        System.arraycopy(_stackArray, 0, resizedArray, 0, resizedArray.length);
        _stackArray = resizedArray;
        return poppedItem;
    }

    public T peek() {
        return _stackArray[_stackArray.length - 1];
    }

    public boolean empty() {
        return _stackArray.length == 0;
    }

    public int search(T itemToSearch) {
        var index = 0;
        for (int i = 0; i < _stackArray.length; i++)
        {
            if(itemToSearch.equals(_stackArray[i]))
            {
                index = i;
            }
        }

        return (index - _stackArray.length) * -1;
    }
}
