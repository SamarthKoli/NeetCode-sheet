import java.util.ArrayList;

public class firstOccurance {
      public int strStr(String haystack, String needle) {
    

        int i=0;
        int j=0;
        int h=haystack.length();
        int n=needle.length();
        while (i<h) {
            if (haystack.charAt(i)==needle.charAt(j)) {
                j++;
                i++;

                 if (j==n) {
                return i-n;
                }
              

            } 
            else{
                i=i-j+1;
                j=0;
            }
            
           

        }
        
        
        return -1;
    }
}
