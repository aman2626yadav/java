public class polymorphism{
    public static void main(String[] args) {
        student sc = new student();
        sc.name ="AMAN";
        sc.age =20;
        sc.info(sc.age,sc.name);
        // sc.info(sc.name);
    }

}
class student{
    String name;
    int age;
    public void info(String name){
        System.out.println(name);

    }
    public void info(int age){
        System.out.println(age);

    }
    public void info(int age ,String name){
        System.out.println(age +" "+name);

    }
}