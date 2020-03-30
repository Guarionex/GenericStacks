import java.util.ArrayList;

public class Stack {
    private int[] _stackArray;

    public Stack()
    {
        _stackArray = new int[]{};
    }

    public int size() {
        return _stackArray.length;
    }

    public void push(int item) {
        var resizedArray = new int[_stackArray.length + 1];
        System.arraycopy(_stackArray, 0, resizedArray, 0, _stackArray.length);
        _stackArray = resizedArray;
        _stackArray[_stackArray.length - 1] = (int) item;
    }

    public int pop() {
        var poppedItem = _stackArray[_stackArray.length - 1];
        var resizedArray = new int[_stackArray.length - 1];
        System.arraycopy(_stackArray, 0, resizedArray, 0, resizedArray.length);
        _stackArray = resizedArray;
        return poppedItem;
    }

    public int peek() {
        return _stackArray[_stackArray.length - 1];
    }

    public boolean empty() {
        return _stackArray.length == 0;
    }

    public int search(int itemToSearch) {
        var index = 0;
        for (int i = 0; i < _stackArray.length; i++)
        {
            if(itemToSearch == _stackArray[i])
            {
                index = i;
            }
        }

        return (index - _stackArray.length) * -1;
    }
}
