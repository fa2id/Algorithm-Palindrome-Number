/**
 * Created by Farid on 2017-07-28.
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class Solution {

    public boolean isPalindrome(int x) {
        if (x<0)return false;
        String string = Integer.toString(x);
        int pointerForward = 0;
        int pointerBackward = string.length()-1;
        boolean identical = false;

        while (pointerForward<=pointerBackward){
            if(string.charAt(pointerForward) == string.charAt(pointerBackward)){
                identical = true;
            }
            else {
                return false;
            }
            pointerForward++;
            pointerBackward--;
        }
        return identical;
    }

    public static void main(String[] args) {
        
        Solution SL = new Solution();

        System.out.println(SL.isPalindrome(56765));
        System.out.println(SL.isPalindrome(5665));
    }
}
