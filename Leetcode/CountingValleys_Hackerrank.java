package leetcode;

public class CountingValleys_Hackerrank {
	
	 public static int countingValleys(int steps, String path) {
			int countValleys = 0;
			int count = 0;
			for (int i = 0; i <= steps - 1; i++) {
				if (path.charAt(i) == 'D') {
					count += -1;
				} else {
					count += 1;
				}
				if (path.charAt(i) == 'U' && count == 0) {
					countValleys += 1;
				}
			}
			return countValleys;
		}

	public static void main(String[] args) {
		int steps = 8;
		String path = "UDDDUDUU";
		countingValleys(8, path);
	 
	}

}
