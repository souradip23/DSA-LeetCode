// Class to represent a solution for the incremovable subarrays problem
class Solution {

   // Method to check if an ArrayList of integers is strictly increasing
   public boolean increasing(ArrayList<Integer> al) {
       // Iterate through the ArrayList, comparing consecutive elements
       for (int i = 0; i < al.size() - 1; i++) {
           if (al.get(i + 1) <= al.get(i)) { // If any element is not strictly increasing
               return false; // Return false immediately
           }
       }
       return true; // If all elements are strictly increasing, return true
   }

   // Method to count the number of incremovable subarrays in a given array
   public int incremovableSubarrayCount(int[] nums) {
       int count = 0; // Initialize a counter for incremovable subarrays

       // Iterate through all possible subarrays using nested loops
       for (int i = 0; i < nums.length; i++) {
           for (int j = i; j < nums.length; j++) {
               // Create an ArrayList to hold the remaining elements after removing the subarray
               ArrayList<Integer> al = new ArrayList<>();
               for (int k = 0; k < nums.length; k++) {
                   if (k < i || k > j) { // Add elements outside the subarray's range
                       al.add(nums[k]);
                   }
               }

               // Check if the remaining elements are strictly increasing
               if (increasing(al)) {
                   count++; // If so, increment the count of incremovable subarrays
               }
           }
       }

       return count; // Return the total count of incremovable subarrays
   }
}