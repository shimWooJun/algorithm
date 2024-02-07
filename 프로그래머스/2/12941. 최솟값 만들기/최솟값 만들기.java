import java.util.Arrays;

class Solution
{
    public int solution(int[] A, int[] B)
    {
        int answer = 0;

        // A 배열 오름차순 정렬
        Arrays.sort(A);

        // B 배열 내림차순 정렬
        Arrays.sort(B);
        reverseArray(B);

        // 정렬된 A와 B 배열을 곱하고 더하기
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[i];
        }

        return answer;
    }

    // 배열을 역순으로 바꾸는 메서드
    private void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}