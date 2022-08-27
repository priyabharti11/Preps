3. Remove All Occurrences Of A Character
  
  
import java.util.*;
class Main {
    public static void main(String[] args) {
        String s = "Australia";
        // remove A or a
         for(int i=0 ; i<s.length(); i++)
        {
             
            if(s.charAt(i)=='A' || s.charAt(i)=='a')
            {}
            else
            {
            System.out.print(s.charAt(i));
            }
        }
        
      
    }
}


LOGIC ::

1) Take a for loop till strings length -1
2) if charAt index of string = the removing char. then do nothing
3) Else print the character


3.1 REMOVE ALL OCCURRENCES OF CHARACTER GIVEN FROM STRING USING INBUILT STRING METHOD // Using replace("char","char")

class Main {
    public static void main(String[] args)
    {
        String s = "Australia";
        // remove A or a
        s = s.replace("a","");
        System.out.print(s);
    }
}
