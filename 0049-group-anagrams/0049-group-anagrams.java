class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> ans = new ArrayList<>();
    Map<String,List<String>> map = new HashMap<>();
    String[] arr = new String[strs.length];
    int i = 0;
    for(String s:strs){
        char[] toSort = s.toCharArray();
        Arrays.sort(toSort);
        arr[i] =new String(toSort);
        i++;
    }  
    for(int s =0; s <arr.length;s++){
        List<String> list = map.get(arr[s]);
        if(list==null){
            list = new ArrayList<>();
            map.put(arr[s],list);
        }
        list.add(strs[s]);
    }
    for(String s: map.keySet()){
        ans.add(map.get(s));
    }
    return ans;

    }
}