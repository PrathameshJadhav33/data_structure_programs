import java.util.Arrays;

public class Simple_tree {

    static int arr[] = new int[4];
    static int size = 1;

    public int getleft(int index) {

        return 2 * index + 1;
    }

    public int getright(int index) {

        return 2 * index + 2;
    }

    public int getparent(int index) {
        return (index - 1) / 2;
    }

    public boolean hasleft(int index) {
        return getleft(index) < arr.length - 1;
    }

    public boolean hasright(int index) {
        return getright(index) < arr.length - 1;
    }

    public boolean isfull(int index) {
        if (arr.length < index) {
            return true;
        }

        return true;
    }

    private void insert(int value, int index) {
        ensurecapacity();
        int root = arr[index];
        if (root == 0) {
            arr[index] = value;
            System.out.println(index + ":" + value);
            size = (size + 1) * 2;

        } else if (value < root) {
            index = getleft(index);
            insert(value, index);
        } else if (value > root) {
            index = getright(index);
            insert(value, index);
        }

    }

    public void insert(int value) {
        insert(value, 0);
    }

    private void display(int index) {
        if (arr[index] != 0) {
            System.out.println(index + ":" + arr[index]);
        }
        if (hasleft(index)) {
            display(getleft(index));
        }
        if (hasright(index)) {
            display(getright(index));
        }

    }

    public void display() {
        display(0);
    }

    public void ensurecapacity() {
        if (size >= arr.length - 1) {
            System.out.println("In ensure capacity");
            arr = Arrays.copyOf(arr, arr.length * 2);
        }
    }

    public static void main(String args[]) {

        Simple_tree st = new Simple_tree();

        st.insert(8);
        st.insert(9);
        st.insert(10);
        st.insert(11);
        st.insert(12);
        st.insert(13);
        st.insert(14);
        st.insert(1);
        st.insert(2);
        st.insert(3);
        st.insert(4);
        st.insert(5);
        st.insert(6);
        st.insert(7);

        st.display();

    }
}
