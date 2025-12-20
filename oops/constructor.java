public class constructor{
    public static void main(String[] args) {
        student aman = new student("AMAN" , 24);
        aman.detail();


    }

}
class student{
    String name;
    int age;

//  student(){               this is  non parameterize constructor
//     this.name= "AMAN";
//     this.age= 23;

//  }

 student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // this is parameterise constructor
    public void detail(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
 
    

}