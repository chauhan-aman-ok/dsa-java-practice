// problem 2 : reverse string leetcode 344
// topics - string, two pointer
public void reverseString(char[] s) {
        int i=0,j=s.length-1;
        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;j--;
        }

}

