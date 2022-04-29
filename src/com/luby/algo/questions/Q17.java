package com.luby.algo.questions;

import java.util.*;

public class Q17 {
  class Solution {
    /**
     * 2: a,b,c
     * 3: d,e,f
     * 4: g,h,i
     * 5: j,k,l
     * 6: m,n,o
     * 7: p,q,r,s
     * 8: t,u,v
     * 9: w,x,y,z
     * Given a string containing digits from 2-9 inclusive,
     * return all possible letter combinations that the number could represent.
     * Return the answer in any order.
     * A mapping of digit to letters (just like on the telephone buttons) is given below.
     * Note that 1 does not map to any letters.
     * Input: digits = "23"
     * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
     * @param digits
     * @return
     */
    public List<String> letterCombinationsIter(String digits) {
      List<String> letters = new ArrayList<>();
      if (digits == null || digits.length() < 1) {
        return letters;
      }
      Map<String, String[]> num2LetterMap = new HashMap<>();
      num2LetterMap.put("2", new String[] {"a", "b", "c"});
      num2LetterMap.put("3", new String[] {"d", "e", "f"});
      num2LetterMap.put("4", new String[] {"g", "h", "i"});
      num2LetterMap.put("5", new String[] {"j", "k", "l"});
      num2LetterMap.put("6", new String[] {"m", "n", "o"});
      num2LetterMap.put("7", new String[] {"p", "q", "r", "s"});
      num2LetterMap.put("8", new String[] {"t", "u", "v"});
      num2LetterMap.put("9", new String[] {"w", "x", "y", "z"});

      // add first num letters
      int startIdx = 0;
      while (startIdx < digits.length() && !num2LetterMap.containsKey(digits.substring(startIdx, startIdx + 1))) {
        startIdx++;
      }
      if (startIdx < digits.length()) {
        String[] s0 = num2LetterMap.get(digits.substring(startIdx, startIdx + 1));
        for (int i = 0; i < s0.length; i++) {
          letters.add(s0[i]);
        }
      }

      for (int i = startIdx + 1; i < digits.length(); i++) {
        String si = digits.substring(i, i + 1);
        if (num2LetterMap.containsKey(si)) {
          String[] numLetters = num2LetterMap.get(si);
          List<String> tempLetters = new ArrayList<>();
          for (int j = 0; j < letters.size(); j++) {
            String sj = letters.get(j);
            for (int k = 0; k < numLetters.length; k++) {
              tempLetters.add(sj + numLetters[k]);
            }
          }
          letters = tempLetters;
        }
      }
      return letters;
    }

    private List<String> getLetterCombinations(Map<String, List<String>> historyMap, String digits) {
      if (historyMap.containsKey(digits)) {
        return historyMap.get(digits);
      }
      String frontPart = digits.substring(0, digits.length() - 1);
      String lastStr = digits.substring(digits.length() - 1);
      List<String> frontList = getLetterCombinations(historyMap, frontPart);
      List<String> lastList = getLetterCombinations(historyMap, lastStr);
      if (lastList.isEmpty() && frontList.isEmpty()) {
        historyMap.put(digits, frontList);
        return frontList;
      } else if (frontList.isEmpty()) {
        historyMap.put(digits, lastList);
        return lastList;
      } else if (lastList.isEmpty()) {
        historyMap.put(digits, frontList);
        return frontList;
      } else {
        List<String> newList = new ArrayList<>();
        for (String front : frontList) {
          for (String last : lastList) {
            newList.add(front + last);
          }
        }
        historyMap.put(digits, newList);
        return newList;
      }
    }

    public List<String> letterCombinations(String digits) {
      if (digits == null || digits.length() < 1) {
        return new ArrayList<>();
      }
      Map<String, List<String>> num2LetterMap = new HashMap<>();
      num2LetterMap.put("1", Arrays.asList(new String[] {}));
      num2LetterMap.put("2", Arrays.asList(new String[] {"a", "b", "c"}));
      num2LetterMap.put("3", Arrays.asList(new String[] {"d", "e", "f"}));
      num2LetterMap.put("4", Arrays.asList(new String[] {"g", "h", "i"}));
      num2LetterMap.put("5", Arrays.asList(new String[] {"j", "k", "l"}));
      num2LetterMap.put("6", Arrays.asList(new String[] {"m", "n", "o"}));
      num2LetterMap.put("7", Arrays.asList(new String[] {"p", "q", "r", "s"}));
      num2LetterMap.put("8", Arrays.asList(new String[] {"t", "u", "v"}));
      num2LetterMap.put("9", Arrays.asList(new String[] {"w", "x", "y", "z"}));

      return getLetterCombinations(num2LetterMap, digits);
    }
  }

  public static void main(String[] args) {
    Solution s = new Q17().new Solution();
    System.out.println(s.letterCombinations("1"));
    System.out.println(s.letterCombinations("2"));
    System.out.println(s.letterCombinations("121"));
    System.out.println(s.letterCombinations("111121"));
    System.out.println(s.letterCombinations("23"));
  }
}
