class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int number : arr) {
            countMap.merge(number, 1, Integer::sum);
        }
      
       
        Set<Integer> occurrenceSet = new HashSet<>(countMap.values());
      
        
        return occurrenceSet.size() == countMap.size();


    }
}