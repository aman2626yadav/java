public class deletion{
   public static class node{
    int data;
    node next;
    node(int data){
      this.data = data;

    }

    }
    public static class Linkedlist{
        node head = null;
        node tail = null;
        int size =0;
      void  insertend(int val){
        node temp = new node(val);
        if(head==null){
            head =temp;
            tail=temp;
        }else{
            tail.next=temp;
            tail = temp;
        }

       }
       void deletion(int idx){
        node temp = head;
        if(idx==0) head = head.next;
        for(int i =1;i<=idx-1;i++){
            temp = temp.next;
        }
        // if(temp.next==null) return;
        temp.next = temp.next.next;
        if(idx==size-1) tail = temp;
        size--;
       }
       void display(){
        node temp =head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;

        }
        System.out.println();
       }
    }
    public static void main(String[] args){
        Linkedlist li = new Linkedlist();
         li.insertend(4);
        li.insertend(5);
        li.insertend(6);
        li.insertend(7);
        li.insertend(8);
        li.deletion(4);
        li.display();
    }
}