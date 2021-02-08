class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int right = n - 1;
        int left = 0;
        int top = 0;
        int bottom = n - 1;
        int dir = 0;
        int temp;
        for (int i = 0; i < n * n;) {
            switch (dir) {
                case 0: //go left
                    temp = left;
                    while (temp <= right) {
                        matrix[top][temp] = ++i;
                        temp++;
                    }
                    top++;
                    break;

                case 1: //go down
                    temp = top;
                    while (temp <= bottom) {
                        matrix[temp][right] = ++i;
                        temp++;
                    }
                    right--;
                    break;

                case 2: //go left
                    temp = right;
                    while (temp >= left) {
                        matrix[bottom][temp] = ++i;
                        temp--;
                    }
                    bottom--;
                    break;

                case 3: //go up
                    temp = bottom;
                    while (temp >= top) {
                        matrix[temp][left] = ++i;
                        temp--;
                    }
                    left++;
                    break;
            }
            dir = (dir + 1) % 4;
        }

        return matrix;
    }

}
