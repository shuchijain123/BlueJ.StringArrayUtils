 

/**
 * Created by leon on 1/29/18.
 */
import java.util.*;
import java.lang.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        
        
        List <String>list = Arrays.asList(array);
        
        if (list.contains("value")){
         
            
            
        }
        
        return true;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String [] reversearray = new String[array.length];
        for (int i =0 ; i<array.length; i++){
            
           reversearray[i]= array[array.length-(i+1)];
        }
            
        
        
        
        return reversearray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        
        
        String [] reversearray = new String[array.length];
        boolean retval = true;
        for (int i =0 ; i<=array.length/2; i++){
            
           reversearray[i]= array[array.length-(i+1)];
           if(array[i]==reversearray[i]){
               retval=true;
               
        }
        else {
            retval=false;
        
    }
}
    return retval;
            
        
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        StringBuilder sb = new StringBuilder();
        boolean retval=true;
        
        for (int i=0;i<array.length;i++){
            sb.append(array[i]);
        }
        String newString = sb.toString();
        //Set<Character> set = new HashSet <Character>();
        if (newString.length() < 26)  
                return false;  
           else {  
                for (char ch = 'a'; ch <= 'z'; ch++) {  
                     if (newString.indexOf(ch) < 0) {  
                          retval = false;
                     }  
                } 
                 retval = true;
           }  
            return retval;
        }
        
        
        
        
       
    

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        //String str = Arrays.toString(array);
        int temp =0;
        for(int i=0;i<array.length;i++){
        if (array[i] == value){
            
            temp=temp+1;
        }
    }
            
        
        return temp;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> mylist = new  ArrayList<String>(Arrays.asList(array));
       
        mylist.remove(valueToRemove);
       
       String[] arr = mylist.toArray(new String[mylist.size()]);
        
        //array = ArrayUtils.removeElement(array,"valuetoRemove");
        
        return arr;
    }
   

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        
        String str = Arrays.toString(array);
        List<String> mylist = new  ArrayList<String>();
        
        for (int i=0; i<array.length-1; i++){
            
            if (array[i]!=array[i+1])
                
                mylist.add(array[i]);
                    
        }
        mylist.add(array[array.length-1]);
       
        String[] arr = mylist.toArray(new String[mylist.size()]);
        
                 return arr;
            
        
        
       
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
       String str = array[0];
        List<String> mylist = new  ArrayList<String>();
        
        for (int i=1; i<array.length; i++){
            if (array[i]==array[i-1]){
                str = str+array[i];
                
            }
                else{
                mylist.add(str);
                str=array[i];
                
            }
                     
        }
        mylist.add(str);
              
        String[] arr = mylist.toArray(new String[mylist.size()]);
        return arr; 
    }
     
                
    }






