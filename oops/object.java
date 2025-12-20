public class object{
    public static void main(String[] args) {
    car aman = new car();
    aman.name="DEFENDER OCTA";
    aman.num = 001;
    aman.modelnum = 2027;
    car aman1 = new car();   
    // here we can crate a multiple object of single class
    aman1.name ="BMW M5";

    // System.out.println(aman.name);
    // System.out.println(aman.num);
    // System.out.println(aman.modelnum);
    aman.write();
    aman1.printcolor();
  
    
    }


}
  class car{
    String name;
    int num;
    int modelnum;

      public void write(){
        System.out.println(this.name);
    }
      public void printcolor(){
        System.out.println(this.name);
    }

}