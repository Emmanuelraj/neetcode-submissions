class Solution {
    public int lengthOfLongestSubstring(String s) {

          // Map to store character frequencies in current window
        Map<Character, Integer> freqMap = new HashMap<>();

        int ans = 0;      // Stores the maximum length found so far
        int left = 0;     // Left pointer of sliding window
        
        // Right pointer expands the window
        for(int right = 0; right < s.length(); right++) {
            // Add current character to window and increment its frequency
            freqMap.put(s.charAt(right), freqMap.getOrDefault(s.charAt(right), 0) + 1);

            // Shrink window while current character is a duplicate (freq > 1)
            while(freqMap.get(s.charAt(right)) > 1) {
                // Remove leftmost character from window
                int value = freqMap.get(s.charAt(left));
                freqMap.put(s.charAt(left), value - 1);

                // Clean up - remove character if its frequency reaches 0
                if(freqMap.get(s.charAt(left)) == 0) {
                    freqMap.remove(s.charAt(left));
                }   
                
                left++;  // Move left pointer to shrink window
            }

            // Update answer with current window size
            ans = Math.max(ans, right - left + 1);

            
        }
        return ans;
    }
}
