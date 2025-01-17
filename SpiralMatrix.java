// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        if (matrix.length == 0 || matrix == null){
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0, bottom = m - 1, left = 0, right = n - 1;

        while (left <= right && top <= bottom) {
            if (left <= right && top <= bottom) {
                for (int i = left; i <= right; i++) {
                    result.add(matrix[top][i]);
                }
            }
            top++;

            if (left <= right && top <= bottom) {
                for (int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }
            }
            right--;

            if (left <= right && top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
            }
            bottom--;

            if (left <= right && top <= bottom) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
            }
            left++;
        }

        return result;
    }

}