public class MergeStrings {
     public static String mergeAlternately(String word1, String word2) {
        //ab
        //abbxxc
        int n1=word1.length();
        int n2=word2.length();

       StringBuffer res=new StringBuffer();
       int i=0;
       int j=0;
       while (i<n1 && j<n2) {
              res.append(word1.charAt(i));
              res.append(word2.charAt(j));
              i++;
              j++;
       }

      while (i<n1) {
          res.append(word1.charAt(i));
          i++;
       }
       while (j<n2) {
         res.append(word2.charAt(j));
         j++;
       }

       return res.toString();
    }
    public static void main(String[] args) {
        System.out.println(mergeAlternately("ab", "abbxxc"));
    }
}
