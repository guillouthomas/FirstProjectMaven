package MySimpleStack;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.StringHolder;

import static org.junit.Assert.*;

/**
 * Created by Thomas on 24/02/2016.
 */
public class ImplTest {

    Impl simpleStack;

    @Before
    public void setUp() throws Exception {
        simpleStack = new Impl();
        System.out.println("Je suis executé avant chaque test");
    }

    @Test
    public void testIsEmpty() throws Exception {
        Assert.assertEquals(true,simpleStack.isEmpty());
        String element1 = "toto";
        simpleStack.push(new Item(new String(element1)));
        Assert.assertEquals(false,simpleStack.isEmpty());

    }

    @Test
    public void testGetSize() throws Exception {
        Assert.assertEquals(0, simpleStack.getSize());
        String element1 = "toto";
        simpleStack.push(new Item(new String(element1)));
        simpleStack.push(new Item(new String(element1+"2")));
        // La taille doit augmenter de 2
        Assert.assertEquals(2, simpleStack.getSize());
    }

    @Test
    public void testPush() throws Exception {

    }

    @Test
    public void testPeek() throws Exception {

    }

    @Test
    public void testPop() throws Exception {
        Item ita = new Item(new Integer(8));
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        Assert.assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.pop();
        // On doit retirer l'objet de la pile
        Assert.assertEquals(0, simpleStack.getSize());
        // On doit retrouver l'objet initial


    }
}