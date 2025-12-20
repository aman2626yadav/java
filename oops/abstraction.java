public class abstraction{
    public static void main(String[] args) {
        horse Horse = new horse();
        Horse.walks();
        // animal Animal = new animal(); 
        // it can acces
        Animal.walks;
    }

}
abstract class animal{
    // it is blue print it can hide we can show it
    public void walks(){
        System.out.println("it is the wprrior");

    }
}
class horse extends animal{
    public void walks(){
        System.out.println("it has a four leg");
    }

}
class chicken extends animal{
    public void walks(){
        System.out.println("it has 2 leg");
    }
}