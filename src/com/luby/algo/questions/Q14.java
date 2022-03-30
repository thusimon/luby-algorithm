package com.luby.algo.questions;

import java.util.*;

public class Q14 {
  public class Solution {
    public String longestCommonPrefixAnyWhere(String[] strs) {
      String result = "";
      if (strs == null || strs.length == 0) {
        return result;
      }
      if (strs.length == 1) {
        return strs[0];
      }
      // convert strs to collection
      List<String> strList = Arrays.asList(strs);
      Collections.sort(strList, new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
          return o1.length() - o2.length();
        }
      });
      String shortestStr = strList.get(0);
      int shortestStrLen = shortestStr.length();
      int len = 1;
      while (len <= shortestStrLen) {
        boolean foundCommonWithLen = false;
        for(int i = 0; i < shortestStrLen; i++) {
          int endIdx = i + len > shortestStrLen ? shortestStrLen : i + len;
          String subStr = shortestStr.substring(i, endIdx);
          if (subStr.length() <= result.length()) {
            break;
          }
          // subStr length is greater than result, need to examine
          boolean isFoundInAllStrs = strList.stream().allMatch(str -> {
            return str.indexOf(subStr) > -1;
          });
          if (isFoundInAllStrs) {
            result = subStr;
            foundCommonWithLen = true;
          }
        }
        if (!foundCommonWithLen) {
          break;
        }
        len++;
      }

      return result;
    }

    public String longestCommonPrefix(String[] strs) {
      String result = "";
      if (strs == null || strs.length == 0) {
        return result;
      }
      if (strs.length == 1) {
        return strs[0];
      }
      // convert strs to collection
      List<String> strList = Arrays.asList(strs);
      Collections.sort(strList, new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
          return o1.length() - o2.length();
        }
      });
      String shortestStr = strList.get(0);
      int shortestStrLen = shortestStr.length();
      int len = 1;
      while(len <= shortestStrLen) {
        boolean foundCommonWithLen = false;
        String subStr = shortestStr.substring(0, len);
        boolean isFoundInAllStrs = strList.stream().allMatch(str -> {
          return str.indexOf(subStr) == 0;
        });
        if (isFoundInAllStrs) {
          result = subStr;
        } else {
          break;
        }
        len++;
      }
      return result;
    }

    public String longestCommonPrefixBinarySearch(String[] strs) {
      if (strs == null || strs.length == 0) {
        return "";
      }
      if (strs.length == 1) {
        return strs[0];
      }
      // find the min len string
      int minLen = Integer.MAX_VALUE;
      for (String str: strs) {
        if (minLen > str.length()) {
          minLen = str.length();
        }
      }
      int lowIdx = 1;
      int highIdx = minLen;
      while(lowIdx <= highIdx) {
        int middleIdx = (lowIdx + highIdx) / 2;
        String firstHalf = strs[0].substring(0, middleIdx);
        boolean firstHalfCommon = true;
        for (int i = 1; i < strs.length; i++) {
          if (strs[i].indexOf(firstHalf) != 0) {
            firstHalfCommon = false;
            break;
          }
        }
        if (firstHalfCommon) {
          lowIdx = middleIdx + 1;
        } else {
          highIdx = middleIdx - 1;
        }
      }
      return strs[0].substring(0, (lowIdx + highIdx) / 2);
    }
  }

  public static void main(String[] args) {
    Solution s = new Q14().new Solution();
    String[] test1 = new String[]{"flower","flow","flight"};
    String[] test2 = new String[]{"flowlower","flowlo","fliflowghtlowlo"};
    String[] test3 = new String[]{"dog","racecar","car"};
    String[] test4 = new String[]{"a","b"};
    System.out.println(s.longestCommonPrefixBinarySearch(test1));
    System.out.println(s.longestCommonPrefixBinarySearch(test2));
    System.out.println(s.longestCommonPrefixBinarySearch(test3));
    System.out.println(s.longestCommonPrefixBinarySearch(test4));
  }
}
