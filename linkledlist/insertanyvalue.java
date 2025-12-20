public class insertanyvalue {

    public static class node {
        int data;
        node next;
        node(int data) {
            this.data = data;
        }
    }

    public static class Linkedlist {
        node head = null;
        node tail = null;

        void insertend(int val) {
            node temp = new node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        void insertvalue(int idx, int val) {
            node t = new node(val);
            node temp = head;
            if(idx==size()){
                insertend(val);
                return;
            }

            // move to (idx-1) position
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }

            t.next = temp.next;
            temp.next = t;
        }

        void display() {
            node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size() {
            node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Linkedlist li = new Linkedlist();
        li.insertend(4);
        li.insertend(5);
        li.insertend(6);
        li.insertend(7);
        li.insertend(8);
        li.insertvalue(3, 10);
        li.display();   // Output: 4 5 6 10 7 8
    }
}
