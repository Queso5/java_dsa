public class PracFindCommonElement {
    public static int[] CommonEleBrute(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int cntr1 = 0 ;
        int cntr2 = 0 ;
        for(int i = 0; i < n ; i++ ){
            for(int j = 0 ; j < m ; j++){
                if(arr1[i]==arr2[j]){
                    cntr1++;
                    break;
                }
            }
        }
        for(int i = 0; i < m ; i++ ){
            for(int j = 0 ; j < n ; j++){
                if(arr2[i]==arr1[j]){
                    cntr2++;
                    break;
                }
            }
        }

        return new int[]{cntr1, cntr2};

    }
}
