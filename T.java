import java.util.*;
import java.util.Collections.*;
class Main
 {
    public static void main(String[] args) 
  {
        int a[]={1,6,9,0};
        
        HashSet<Integer> hs = new HashSet<>();
        boolean flag = false;

        for(int i =0; i< a.length; i++)
        {    if(hs.contains(a[i]))
            {
                flag = true;
                System.out.println(a[i]);
                break;
            }
            hs.add(a[i]);
        }

        if(flag==false)
        {
             System.out.println("No duplicates there");
        }
    }
}