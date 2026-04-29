class Solution {
    public boolean isPalindrome(String s) {

           s = s.toLowerCase();
        s = s.replace(" ","");
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");


        int leftPtr = 0;
        int rightPtr = s.length()-1;

        while(leftPtr<=rightPtr){

            if(s.charAt(leftPtr)!=s.charAt(rightPtr)){
                return false;
            }

            leftPtr++;
            rightPtr--;
        }


        return true;
        
    }
}
