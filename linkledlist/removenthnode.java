public class removenthnode {
    public static class node {
        int data;
        node next;
        node(int data) {
            this.data = data;
        }
    }

    public static node remove(node head, int n) {
        node fast = head;
        node slow = head;

        for (int i = 1; i < n; i++) {
            fast = fast.next;
        }

        if (fast == null) {   // if we need to remove head
            head = head.next;
            return head;
        }

        while (fast.next != null) {  // fix: use fast.next != null
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;  // remove nth node from end
        return head;
    }

    public static void display(node head) {
        node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        node a = new node(4);
        node ab = new node(5);
        node ac = new node(6);
        node ad = new node(7);
        node ae = new node(10);

        // connect nodes
        a.next = ab;
        ab.next = ac;
        ac.next = ad;
        ad.next = ae;

        display(a);
        a = remove(a, 2);   // remove 1st node from end
        display(a);
    }
}
