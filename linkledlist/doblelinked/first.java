public class first{
    public static class node{
        int data;
        node next;
        node prev;

        public node(int data) {
            this.data = data;
        }
        

    }
    public static void display(node head){
        node temp = head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(" ");
    }
    public static void displayrev(node tail){
        node temp = tail;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.prev;
        }
        System.out.println(" ");
    }
    public static  void displayran(node random){
        node temp = random;
        while(temp.prev!=null){
            temp =temp.prev;
        }
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(" ");
    }
    public static node inserthead(node head, int x ){
        node t = new node(x);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }
    public static void main(String[] args) {
        node a = new node(4);
        node b = new node(10);
        node c = new node(6);
        node d = new node(8);
        a.prev=null;
        a.next =b;
        b.prev=a;
        b.next =c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=null;
        display(a);
        displayrev(d);
        displayran(c);
        node newnode = inserthead(a,30);
        display(newnode);
        
    }

}