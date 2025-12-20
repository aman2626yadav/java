public class inheritance{
    public static void main(String[] args) {
        tringle tc = new tringle();
        tc.color= "red";
        System.out.println(tc.color);
    }

}
class shape{
    String color;
    // base class
}
class tringle extends shape{
    // derive class
    // here it used by upper clASS due to extands keyword so all the propertiews of shape in it claed inheritance; aor we can sy single 
    // single level inheretance 

}