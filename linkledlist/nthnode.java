public class nthnode {

    public static class node {
        int data;
        node next;
        node(int data) {
            this.data = data;
        }
    }

    public static node nth(node head, int n) {
        int size = 0;
        node temp = head;

        while (temp != null) {   // count total nodes
            size++;
            temp = temp.next;
        }

        int m = size - n + 1;    // position from start
        temp = head;

        for (int i = 1; i < m; i++) {   // move to that node
            temp = temp.next;
        }

        return temp;
    }
    // second approch using fast and slow pointer
    public static node nth2(node head, int n){
        node slow = head;
        node fast = head;
        for(int i =1; i<=n;i++){
            fast = fast.next;
        }
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
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

        node ans = nth2(a, 3);   
        System.out.println(ans.data);   // print 3rd node from end (value = 6)
    }
}
