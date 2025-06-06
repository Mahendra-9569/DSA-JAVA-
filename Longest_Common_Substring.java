public class Longest_Common_Substring {
    // using recursion 
    public static int longestCommonSubstring(String str1, String str2, int m, int n, int count) {
        if (m == 0 || n == 0) {
            return count;
        }
        
        if (str1.charAt(m - 1) == str2.charAt(n - 1)) {
            count = longestCommonSubstring(str1, str2, m - 1, n - 1, count + 1);

        } 
            int count1 = longestCommonSubstring(str1, str2, m, n - 1, 0);
            int count2 = longestCommonSubstring(str1, str2, m - 1, n, 0);
            
        

          return Math.max(count, Math.max(count1, count2));

    }
    public static void main(String args[]){
        String str1 = "abcdef";
        String str2 = "zcdemf";

        System.out.println("Longest Common Substring: " + longestCommonSubstring(str1, str2, str1.length(), str2.length(), 0 ));
    }
}
