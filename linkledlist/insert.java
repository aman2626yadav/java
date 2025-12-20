public class insert{
    public static class node{
        int data;
        node next;
        node(int data){
            this.data= data;
        }

    }
    public static class Linkedlist{
        node head =null;
        node tail = null;
        void insertend(int val){
            node temp = new node(val);
            if(head==null){
                head = temp;
                tail = temp;
            }else{
                tail.next= temp;
                tail = temp;
            }
        }
         void inserthead(int val) {
            node temp = new node(val);
            if (head == null) {
                // if there is one node then we can use this condion 
                head = temp;
                tail = temp;
            } else {
                temp.next = head;  
                head = temp;
            }
        }
        void insertmiddle(int idx, int val){
            node t = new node(val);
            node temp = head;
            if(idx==size()){
             insertend(val);
                return; 
                // this is used for tail value if=s going to last
            }if(idx==0){
                inserthead(val);
                return;
            }
            for(int i = 0; i<=idx-1;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t.next;
        }
        void display(){
            node temp = head;
            while(temp!=null){
                System.out.println(temp.data + " ");
                temp = temp.next;
            }

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
    public static void main(String[] args){
        Linkedlist li = new Linkedlist();
        li.insertend(6);
        li.insertend(5);
        li.insertend(6);
        li.insertend(7);
        li.insertend(8);
        li.display();
        li.insertmiddle(3 , 10);
        li.display();
    }


}