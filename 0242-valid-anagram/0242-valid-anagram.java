class Solution {
    public boolean isAnagram(String s, String t) {
           char[] S = s.toCharArray();
           char[] T = t.toCharArray();
       
          Arrays.sort(S);
          Arrays.sort(T);

        
  
        String sorted1 = new String(S);
        String sorted2 = new String(T);
        return sorted1.equals(sorted2);
    }
    
}