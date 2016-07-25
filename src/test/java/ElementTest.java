import org.junit.Assert;

/**
 * Created by Oleksandra_Dmytrenko on 7/25/2016.
 */
public class ElementTest {

    private Element e1;

    @org.junit.Before
    public void setUp() throws Exception {
        e1 = new Element(null, "I", null);
        Element e2 = new Element(e1, "am", null);
        e1.setNext(e2);
        Element e3 = new Element(e2, "nice", null);
        e2.setNext(e3);
        Element e4 = new Element(e3, ":-)", null);
        e3.setNext(e4);
    }

    @org.junit.Test
    public void outputTest() throws Exception {
        String expected = "I am nice :-)";

        String result = e1.getValue();
        Element e1Next = e1.getNext();// e2
        String e1NextValue = e1Next.getValue();
        Element e2Next = e1Next.getNext(); //e3
        String e2NextValue = e2Next.getValue();
        String e3NextValue = e2Next.getNext().getValue();
        String actual = (result + " " + e1NextValue + " " + e2NextValue + " " + e3NextValue);
//        String actual = ouputStartingFrom(e1);
        Assert.assertEquals(expected,actual);
    }

}