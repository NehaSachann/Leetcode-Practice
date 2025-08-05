class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] extra = new int[m];
        for(int i=0; i<m; i++){
            extra[i]=nums1[i];
        }
        int i=0, j=0,k=0;
        while(i<m && j<n){
            if(extra[i]<nums2[j]){
                nums1[k]=extra[i];
                i++;
                k++;
            }else{
                nums1[k]=nums2[j];
                j++;
                k++;
            }
        }
        if(i<m){
            for(int l=k; l<m+n; l++){
                nums1[l]=extra[i];
                i++;
            }
        }else if(j<n){
            for(int l=k; l<m+n; l++){
                nums1[l]=nums2[j];
                j++;
            }
        }
    }
}