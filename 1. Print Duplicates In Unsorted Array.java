1. Print Duplicates In Unsorted Array If Any.



import java.util.*;
import java.util.Collections.*;
class Main
 {
    public static void main(String[] args) 
  {
        int a[]={1,6,9,0};
        
     // 1) Create empty HashSet
        HashSet<Integer> hs = new HashSet<>();
        boolean flag = false;

     // 2) Loop through the array from 0-array.length
        for(int i =0; i< a.length; i++)
        {
        // 3) Inside that check if the arr[i] element is in HashSet or not..
         if(hs.contains(a[i]))
            {
          // a. YES - then print the element and break the loop
                flag = true;
                System.out.println(a[i]);
                break;
            }
         
         //  b. ELSE - just add the element in HashSet
            hs.add(a[i]);
        }

        if(flag==false)
        {
             System.out.println("No duplicates there");
        }
    }
}

LOGIC ::

1) Create empty HashSet
2) Loop through the array from 0-array.length
3) Inside that check if the arr[i] element is in HashSet or not
     a. YES - then print the element and break the loop
     b. ELSE - just add the element in HashSet 
 
// HashSet or HashMap will never allow duplicate element in it..
//if we add a duplicate , the previous one  will automatically be removed from it
