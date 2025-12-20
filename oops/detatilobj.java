public class detatilobj{
    public static void main(String[] args) {
        student sc = new student();
        sc.name = "AMAN YADAV";
        sc.age = 23;
        sc.rollnum = 221500204;
        sc.details();
        // here it is simple way with creating the method in claass gto easly print. and use this keyword 
        
    }

}
class student{
    String name;
    int age;
    int rollnum;
    
    public void details(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.rollnum);
    }

   student(){
    System.out.println("this is constructor"); 
    // this calling constructor
   }
    

}