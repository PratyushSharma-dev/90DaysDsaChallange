class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    int []ans = new int[k];
    Map<Integer,Integer> map = new HashMap<>();
    for(int i : nums)  {
        map.put(i,map.getOrDefault(i,0)+1);
    }

    Map<Integer,Integer> sortedMap = map.entrySet()
                                    .stream()
                                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                                    .collect(Collectors.toMap(
                                    Map.Entry::getKey,
                                    Map.Entry::getValue,
                                    (a,b)->a,
                                    LinkedHashMap::new));
    
    int terminate = 0;
    for(int i: sortedMap.keySet()){
        ans[terminate] = i;
        terminate++;
        if(terminate==k) break;

    }
    return ans;
}
}