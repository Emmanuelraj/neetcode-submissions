class Solution {
    public boolean isAnagram(String s, String t) {

        int[] carrS = new int[26];
        int[] carrT = new int[26];
        int sLen = s.length();
        int tLen = t.length();

        if(sLen != tLen) return false; 

        for(int i =0;i<sLen;i++)
        {
            carrS[s.charAt(i)-'a']++;
        }

        for(int i =0;i<tLen;i++)
        {
            carrT[t.charAt(i)-'a']++;
        }


// T.C = O(n)
// S.C = O(1)



      return Arrays.toString(carrS).equals(Arrays.toString(carrT));
    }
}
