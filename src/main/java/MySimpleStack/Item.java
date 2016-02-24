package MySimpleStack;

/**
 * Created by Thomas on 24/02/2016.
 */
public class Item {

    private Object value;

    public Item (Object value)
    {
         setValue(value);
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}
