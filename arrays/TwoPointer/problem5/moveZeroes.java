// problem 5 : Move Zeroes leetcode : 283
// topics - arrays, two pointer

public void moveZeroes(int[] a) {
        int i = 0;
        int j = 0;
        while (j < a.length) {
            if (a[j] != 0) {
                a[i] = a[j];
                i++;
            }
            j++;
        }
        while(i<a.length){
            a[i]=0;i++;
        }
}

