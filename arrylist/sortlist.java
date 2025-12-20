
import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;

public class sortlist{
  public static void main(String[] args) {
      ArrayList<Integer> li = new ArrayList<>();
      li.add(10);
      li.add(0);
      li.add(20);
      li.add(40);
      li.add(60);
      System.out.println(li);
      Collections.reverse(li); 
      System.out.println(li);
    //   here it can reverse the arry directly or swap this arry list see copy 
       Collections.sort(li);
      System.out.println(li);
    //    ḥere it can sort the array in ascending order
    Collections.sort(li, Collections.reverseOrder());
      System.out.println(li);
    // it can print decending order
  }
}