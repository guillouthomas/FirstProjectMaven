package MySimpleStack;

import java.util.EmptyStackException;
import java.util.Observable;
import java.util.Stack;

/**
 * Created by Thomas on 24/02/2016.
 */
public class Impl implements SimpleStack {

    Stack<Object> wrappedStack = new Stack<Object>();

    @Override
    public boolean isEmpty() {
        return wrappedStack.isEmpty();
    }

    @Override
    public int getSize() {
        return wrappedStack.size();
    }

    @Override
    public void push(Item item) {
        wrappedStack.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return (Item)wrappedStack.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return (Item)wrappedStack.pop();
    }
}
