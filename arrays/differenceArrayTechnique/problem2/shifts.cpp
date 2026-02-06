problem 2 : leetcode 2381. Shifting Letters II

topics - difference array technique, string, prefix sum

cpp code-


class Solution {
public:
    string shiftingLetters(string s, vector<vector<int>>& shifts) {
        vector<int> diff(s.length(), 0);
        int sum = 0;
        for (auto q : shifts) {
            int l = q[0];
            int r = q[1];
            int val = q[2];
            int x = 0;
            if (val == 0) x = -1;
            else x = 1;
            diff[l] += x;
            if (r + 1 < diff.size())
                diff[r + 1] -= x;
        }
        for (int i = 1; i < diff.size(); i++)
            diff[i] += diff[i - 1];

        for (int i = 0; i < s.size(); i++) {
            int shift=diff[i];
            shift=shift%26;
            if(shift<0) shift+=26;
             s[i] = ('a'+((s[i]-'a') + shift)%26);
        }
        return s;
    }
};



in cpp - if we subtract a character from another character, then it gives an integer value which is the distance between then like if you subtract a-b then it return 1, as it has 1 position difference, if a-a then 0 if a-c then 2 and so on
this is for converting a character into integer value s[i]-'a'

and this is for converting the integer value back to the character 2+'a' = c

shift=shift%26; this is if the diff value exceeds the range of characters that is 1 to 26, it will manage, you can try it by dry run, will have better understanding. Thank you.


java code -

class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] diff = new int[n];

        for (int[] q : shifts) {
            int l = q[0];
            int r = q[1];
            int val = q[2];

            int x = (val == 0) ? -1 : 1;

            diff[l] += x;
            if (r + 1 < n) {
                diff[r + 1] -= x;
            }
        }

        for (int i = 1; i < n; i++) {
            diff[i] += diff[i - 1];
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < n; i++) {
            int shift = diff[i] % 26;
            if (shift < 0) shift += 26;

            chars[i] = (char) ('a' + (chars[i] - 'a' + shift) % 26);
        }

        return new String(chars);
    }
}






