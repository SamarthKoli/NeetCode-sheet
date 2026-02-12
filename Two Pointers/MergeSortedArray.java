import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeSortedArray {
     public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
       List<Integer>res=new ArrayList<>();

       for(int i = 0; i < m; i++){
            res.add(nums1[i]);
        }

        // Add n elements of nums2
        for(int i = 0; i < n; i++){
            res.add(nums2[i]);
        }
       Collections.sort(res);
       for(int i=0;i<m+n;i++){
           nums1[i]=res.get(i);

       }
      
    }
    public static void main(String[] args) {
        merge(new int[]{10,20,30,40,0,0}, 4, new int[]{1,2}, 2);
    }
}
