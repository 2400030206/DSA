class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);

            String sorted = new String(ch);

            if (map.containsKey(sorted)) {
                map.get(sorted).add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(sorted, list);
            }
        }

        return new ArrayList<>(map.values());
    }
}