package linkedlistzanatie;

// ¬ключает в себ€ данные

public class Element {
    private Element next;
    private Object data;


    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
