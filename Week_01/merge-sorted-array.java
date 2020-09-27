class Solution {

    public  void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] res = new int[m + n];

        int i = 0, j = 0;
        while (i < m && j < n) {
            res[i + j] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
        }

        //最终有一个数组走到了终点,将另一个数组的续借到res的末尾
        if (i == m ) {
            System.arraycopy(nums2,j,res,i+j,n-j);
        } else {
            System.arraycopy(nums1,i,res,i+j,m-i);
        }
        System.arraycopy(res,0,nums1,0,m+n);

    }

}
