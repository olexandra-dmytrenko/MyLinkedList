/**
 * Created by Oleksandra_Dmytrenko on 7/25/2016.
 */
public class Element {
    Element previos;
    String value;
    Element next;

    public Element(Element previos, String value, Element next) {
        this.previos = previos;
        this.value = value;
        this.next = next;
    }

    public Element getPrevios() {
        return previos;
    }

    public void setPrevios(Element previos) {
        this.previos = previos;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }
}
