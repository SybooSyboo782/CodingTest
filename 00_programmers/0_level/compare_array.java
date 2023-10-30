// 배열 비교하기 https://school.programmers.co.kr/learn/courses/30/lessons/181856
class Solution {
    public int solution(int[] arr1, int[] arr2) {
        
        int arr_length1 = arr1.length;
        int arr_length2 = arr2.length;
        int total1 = 0;
        int total2 = 0;
        
        if(arr_length1 == arr_length2) {
            for (int i = 0; i < arr_length1; i++) {
                total1 += arr1[i];
                total2 += arr2[i];
            }
            if(total1 > total2) {
                return 1;
            } else if (total1 == total2) {
                return 0;
            } else {
                return -1;
            }
        } else if (arr_length1 > arr_length2) {
            return 1;
        } else {
            return -1;
        }
        
    }
}