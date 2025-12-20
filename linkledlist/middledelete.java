public class middledelete{
    public static class node{
        int data;
        node next;
        node(int data){
            this.data = data;

        }
    }
    public static node removemid(node head){
        node slow = head;
        node fast = head;
        while(fast.next.next!=null&&fast.next.next.next!=null){
            slow= slow.next;
            fast = fast.next.next;
        }
         slow.next=slow.next.next;
         return head;

    }
     public static void display(node head){
        node temp = head;
        while(temp!=null){
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
        node af = new node(11);

        // connect nodes
        a.next = ab;
        ab.next = ac;
        ac.next = ad;
        ad.next = ae;
        ae.next=af;

        display(a);
       node mid = removemid(a);
        display(a);
        System.out.println("middle rmove elemnt is " + mid.data);
    }
}