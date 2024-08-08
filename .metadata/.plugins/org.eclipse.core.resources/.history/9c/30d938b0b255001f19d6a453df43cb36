import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentWithHighestAverageScore {
    static String[][] data = new String[][]{{"Bob","87"}, {"Mike", "35"},{"Bob", "52"}, {"Jason","35"}, {"Mike", "55"}, {"Jessica", "100"}};
 
	public static void main(String[] args) {
	   int a = getBestAverage();
	   System.out.println(a);
		String s[][] = {{"jerry","65"},
				{"bob","91"}, {"jerry","23"}, {"Eric","83"}, {"bob","10"}};
//	int ans=	hishestAverage(s);
	//System.out.println(ans);
	}
	public static int hishestAverage(String[][] scores) {
        if(scores == null || scores.length == 0) {
            return -1;
        }
        int highestAve = 0;
        Map<String, List<Integer>> map = new HashMap<>();
        
        for(int i = 0; i < scores.length; i++) {
            List<Integer> scoreList = map.get(scores[i][0]);
            if(scoreList == null) {
                List<Integer> currentScore = new ArrayList<>();
                currentScore.add(Integer.valueOf(scores[i][1]));
                map.put(scores[i][0], currentScore);
            } else {
                scoreList.add(Integer.valueOf(scores[i][1]));
                map.put(scores[i][0], scoreList);
            }
        }
        
        //go through the map. find the largest ave
        for(Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            int currentAveScore = aveCalculate(entry.getValue());
            
            highestAve = Math.max(highestAve, currentAveScore);
        }
        
        return highestAve;
    }
    
    private static int aveCalculate(List<Integer> scores) {
        int len = scores.size();
        int sum = 0;
        for(int score : scores) {
            sum += score;
        }
        
        float ave = sum / len;
        return (int) ave;
    }
 private static int getBestAverage() {
        
        Map<String, int[]> map = new HashMap<>();
        int best = -1;
        
        for(String[] d : data) {
            String name = d[0];
            int score = Integer.parseInt(d[1]);
            
            if(!map.containsKey(name)) map.put(name, new int[]{1, score});
            
            else {
            
                map.get(name)[0]++;
                map.get(name)[1]+= score;
            }
        }
        
        for(int[] score : map.values()) {
            best = Math.max(best, score[1]/score[0]);
        }
        
        return best;
    }

}
