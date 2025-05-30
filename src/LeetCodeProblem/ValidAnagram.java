package LeetCodeProblem;

public class ValidAnagram {
    public static void main(String[] args) {
        //        Test case 1
        String s = "anagram", t = "nagaram";
//        Test case 2
//        String s = "rat", t = "car";
        System.out.println(isAnagram(s, t));

    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 97]++;
        }

        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i) - 97]--;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }


}

