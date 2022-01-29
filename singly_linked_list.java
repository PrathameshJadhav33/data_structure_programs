
public class singly_linked_list {

    node head = null;
    node tail = null;

    class node {

        int data;
        node next;

        node(int d) {
            data = d;
            next = null;
        }
    }

    public void addnode(int d) {
        node newnode = new node(d);

        if (head == null && tail == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }

    }

    public void display() {
        node disp = head;
        if (disp == null) {
            System.out.println("List is empty");
        }
        while (disp != null) {
            System.out.println(disp.data);
            disp = disp.next;
        }
    }

    public static void main(String[] args) {
        singly_linked_list sl = new singly_linked_list();

        sl.addnode(5);
        sl.addnode(6);

        sl.display();
    }
}