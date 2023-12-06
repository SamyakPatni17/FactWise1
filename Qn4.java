public class SearchInsertPlace{
    public int searchInsert(int [] nums, int target){
        int l = 0, r = nums.length-1;
        
        while(l<=r){
            int mid = l + (r-l) / 2;
            
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return l;
    }
    public static void main (String []args){
        SearchInsertPlace answer = new SearchInsertPlace();
        int [] nums = {1,3,5,6};
        int target = 6;
        
        System.out.println(answer.searchInsert(nums,target));
    }
}