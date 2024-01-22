
public class KthLargestElementInAnArray {

	public static void main(String[] args) {
		public int findKthLargest(int[] nums, int k) {
			PriorityQueue<Integer> pq = new PriorityQueue<>();
			for (int i = 0; i < k; i++) {
			            // Push the current element onto the max heap
			            pq.add(nums[i]);
			}
			            for(int i =k; i<nums.length;i++){
			                 if (pq.peek() < nums[i]) {
			                     pq.poll();
			                     pq.add(nums[i]);
			                 }
			                
			            }
			            // If the size of the max heap exceeds K, remove the largest element
			           return pq.peek();
			        }
			 
	}

}
/*
 * Time Complexity: O(nlog⁡k)O(n \log k)O(nlogk)
Each of the n elements is processed once. However, heap operations take O(log⁡k)O(\log k)O(logk) time, leading to an overall complexity of O(nlog⁡k)O(n \log k)O(nlogk).

Space Complexity: O(k)O(k)O(k)
The solution uses a heap with a maximum of k elements.
 */
