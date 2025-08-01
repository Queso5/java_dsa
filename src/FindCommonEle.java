import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class FindCommonEle {
    public static  int[] findIntersectionValues(int[] nums1, int[] nums2) {
        //defining 2 hashsets
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int cnt1 = 0;
        int cnt2 = 0;

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        for (int num : nums1) {
            if (set2.contains(num)) {
                cnt1++;
            }
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                cnt2++;
            }

        }

        return new int[]{cnt1, cnt2};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] arr2 = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] result = findIntersectionValues(arr1, arr2);
        for(int val : result){
            System.out.print("["+ result[0]+","+result[1]+"]");
        }

    }

}


