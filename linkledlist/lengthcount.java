public class lengthcount{
    public static int length(node head){
        int count=0;
        while (head!=null) { 
            count++;
            head=head.next;
            
        }
        return count;
    }


      public static class node{
        int data;
       node next;

         node(int data) {
            this.data = data;
            
        }
       
        
    }
    public static void main(String[] args) {
        node a = new node(2);
        node b = new node(4);
        node c = new node(5);
        node d = new node(6);
         a.next=b;
        b.next=c;
        c.next=d;

        System.out.println(length(a));

}
}