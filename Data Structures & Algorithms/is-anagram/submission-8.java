class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> tab = new HashMap<>();
        if(s.length() != t.length())
            return false;
        for(int i=0; i<s.length(); i++){
            char charS = s.charAt(i);
            if(!tab.containsKey(charS))
                tab.put(charS, 1);
            else
                tab.put(charS, tab.get(charS)+1);

            char charT = t.charAt(i);
            if(!tab.containsKey(charT))
                tab.put(charT, -1);
            else
                tab.put(charT, tab.get(charT)-1);
        }
        for(char key: tab.keySet()){
            if(tab.get(key)!=0)
                return false;
        }
        return true;
    }
}
