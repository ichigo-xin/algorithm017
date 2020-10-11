class Solution {
    public boolean isAnagram(String s, String t) {

/*        //1.暴力法
        if (s.length() != t.length()) return false;
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1, str2);*/

        //2.hash表
        if (s.length() != t.length()) return false;
        int[] res = new int[26];
        for (int i = 0; i < s.length(); i++) {
            res[s.charAt(i) - 'a']++;
            res[t.charAt(i) - 'a']--;
        }
        for (int result : res) {
            if (result !=0) return  false;
        }
        return true;

    }
}
