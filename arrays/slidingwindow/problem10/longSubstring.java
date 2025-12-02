// problem 10 - leetcode 3, Longest Substring Without Repeating Characters
// Given a string s, find the length of the longest substring without duplicate characters.
// topics - string, variable sliding window

public int lengthOfLongestSubstring(String s) {
        int j=0;
        int i=0;
        int len=0;
        HashSet<Character> set=new HashSet<>();
        while(j<s.length()){
            char c=s.charAt(j);
            while(set.contains(c)){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(c);
            len=Math.max(len,j-i+1);
            j++;
        }
        return len;
}

