class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        int endPtr = m+n+1;
        while(endPtr>=0) {
            if(n<0)
                break;
            if(m>=0 && nums1[m]>nums2[n]){
                nums1[endPtr] = nums1[m];
                m--;
            }
            else{
                nums1[endPtr] = nums2[n];
                n--;
            }
            endPtr--;
        }  
    }
}
