public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void q1() {
		//Write question 1 code here
	}

	public static void q2() {
		//Write question 2 code here
	}

	public static void q3() {
		//Write question 3 code here
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}
	public static int sum2D(int[][] arr2d) {
        int sum = 0;
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                if (j < arr2d[i].length) {
                    sum += arr2d[i][j];
                }
            }
        }
        return sum;
    }
    public static int sumRow(int[][] arr2d, int row) {
        int sum = 0;
        for (int i = 0; i < arr2d[row].length; i++) {
            sum += arr2d[row][i];
        }
        return sum;
    }
    public static int sumColumn(int[][] arr2d, int col) {
        int sum = 0;
        for (int i = 0; i < arr2d.length; i++) {
            if (col < arr2d[i].length) {
                sum += arr2d[i][col];
            }
        }
        return sum;
    }

}
