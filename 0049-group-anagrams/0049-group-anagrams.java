class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String s : strs) {
            String generate = generatedvalue(s);
            if (!map.containsKey(generate)) {
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                map.put(generate, list);
            }
            else {
                map.get(generate).add(s);
            }
        }
        return new ArrayList<>(map.values());
    }

    public static String generatedvalue(String s) { 
    int[] freq = new int[26];
    for (int i = 0; i < s.length(); i++) {
        freq[s.charAt(i) - 'a']++;
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 26; i++) {
        if (freq[i] > 0) {
            sb.append((char)(i + 'a'));
            sb.append(freq[i]);
        }
    }

    return sb.toString();
}
}