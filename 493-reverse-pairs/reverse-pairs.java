class Solution {
    static int pairs;
    public int reversePairs(int[] nums) {
        pairs =0;
        mergeSort(nums,0,nums.length-1);
        return pairs;
        
    }
    public void mergeSort(int arr[],int l,int h){
        if(l>=h){
            return;
        }
        
        int m=(l+h)/2;
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,h);
        merge(arr,l,m,h);
        
    }

    public void merge(int arr[],int low,int m,int h){
        List<Integer> temp = new ArrayList<>();
        int lft = low;
        int r = m + 1;
        int i=low,j=m+1;

        while(i<=m&&j<=h){
            if(arr[i]>2L*arr[j]){
                pairs+=(m-i)+1;
             
                j++;
                
            }
            else {
                i++;
            }

        }

        while(lft<=m&&r<=h){
            if(arr[lft]<arr[r]){
                temp.add(arr[lft]);
                lft++;
            }else{
                temp.add(arr[r]);
                r++;
            }


        }

        while(lft<=m){
            temp.add(arr[lft]);
            lft++;
        }
        while(r<=h){
            temp.add(arr[r]);
            r++;
        }
        for (int k = low; k <= h; k++) {
            arr[k] = temp.get(k - low);
        }


    }
}