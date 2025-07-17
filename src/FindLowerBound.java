public class FindLowerBound {
    public static int lowerBound(int[] arr , int target){
        int n = arr.length;
        int low = 0 ;
        int high = n -1;
        int ans = n;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] >= target){
                ans = mid;
                high = mid -1;
            }else {
                low = mid + 1;

            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 3, 5, 8, 8, 10, 10, 11};

        int target = 9;

        int result = lowerBound(arr, target);
        System.out.println("the lower bound is:"+ result);
    }
}

