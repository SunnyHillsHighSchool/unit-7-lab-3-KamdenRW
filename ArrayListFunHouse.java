//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kamden Wright

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
 public static ArrayList<Integer> getListOfFactors(int number)
 {
 ArrayList<Integer>numbers = new ArrayList<Integer>();

  for(int i=2; i<number; i++) {
    if (number % i==0)
    numbers.add(i);
  }

return numbers;

 }
 
 public static void keepOnlyCompositeNumbers( List<Integer> nums )
 {
   for(int i = nums.size()-1; i >= 0; i--){
     if(getListOfFactors(nums.get(i)).size()==0){
       nums.remove(i);
     }

   }
  
 }
}