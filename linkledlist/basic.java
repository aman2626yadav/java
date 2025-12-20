public class basic {
    public static void main(String[] args) {
        node a = new node(2);
        node b = new node(4);
        node c = new node(5);
        node d = new node(6);

        a.next = b; // directly assign, no casting
        b.next=c;
        c.next=d;
        System.out.println(a.next.data);
        // 4 
        System.out.println(a.next.next.data);
        // 5
        System.out.println(a.next.next.next.data);
        // 6 or we can used loop fpe print
        node temp = a;
        for (int i = 0; i < 5; i++) {
            System.out.println(temp.data + " ");
            temp=temp.next;
            // for print all node i
            // f we cant given a num fo nodes we print then used this only knows parent node not end node
            // used while loop
            while (temp!=null) { 
                System.out.println(temp.data);
                temp = temp.next;
                
            }
            
        }
    }
}

class node {
    int data;
    node next; // aadrres of next node

    node(int data) {
        this.data = data;
    }
}
