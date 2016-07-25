/**
 * Created by Oleksandra_Dmytrenko on 7/25/2016.
 */
public class MakeLinkedList {
    public static void main(String[] args) {
        Element e1 = new Element(null, "I", null);
        Element e2 = new Element(e1, "am", null);
        e1.setNext(e2);
        Element e3 = new Element(e2, "nice", null);
        e2.setNext(e3);
        Element e4 = new Element (e3, ":-)", null);
        e3.setNext(e4);


        String result = e1.getValue();
        Element e1Next = e1.getNext();// e2
        String e1NextValue = e1Next.getValue();
        Element e2Next = e1Next.getNext(); //e3
        String e2NextValue = e2Next.getValue();
        String e3NextValue = e2Next.getNext().getValue();
        System.out.println(result + " " + e1NextValue + " " + e2NextValue + " " + e3NextValue);


        //    Element e1 = new Element(null, "I", e1);
//    Element e2 = new Element(e1, "am", e3);
//    Element e3 = new Element(e2, "nice", null);

    }

}
