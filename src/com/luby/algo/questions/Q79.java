package com.luby.algo.questions;

import java.util.List;

public class Q79 {
  /**
   * Given an m x n grid of characters board and a string word,
   * return true if word exists in the grid.
   * The word can be constructed from letters of sequentially adjacent cells,
   * where adjacent cells are horizontally or vertically neighboring.
   * The same letter cell may not be used more than once.
   *
   * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
   * Output: true
   */
  class Solution {
    public boolean exist(char[][] board, String word) {
      for(int y = 0; y < board.length; y++) {
        for (int x = 0; x < board[0].length; x++) {
          if (existInternal(board, x, y, word, 0)) {
            return true;
          }
        }
      }
      return false;
    }

    public boolean existInternal(char[][] board, int x, int y, String word, int curIdx) {
      // reaches the end, return true
      if (curIdx >= word.length()) {
        return true;
      }
      // check boundary
      int row = board.length;
      int col = board[0].length;
      if (x < 0 || x >= col || y < 0 || y >= row) {
        return false;
      }
      char curChar = word.charAt(curIdx);
      char temp = board[y][x];
      if (board[y][x] == curChar) {
        board[y][x] = '*';
      } else {
        return false;
      }
      boolean res = existInternal(board, x+1, y, word, curIdx+1)
        || existInternal(board, x-1, y, word, curIdx+1)
        || existInternal(board, x, y+1, word, curIdx+1)
        || existInternal(board, x, y-1, word, curIdx+1);
      if(!res) {
        board[y][x] = temp;
      }
      return res;
    }
  }

  public static void main(String[] args) {
    Q79.Solution s = new Q79().new Solution();
    char[][] board = new char[][]{
      new char[]{'A', 'B', 'C', 'E'},
      new char[]{'S', 'F', 'C', 'S'},
      new char[]{'A', 'D', 'E', 'E'}
    };
    //System.out.println(s.exist(board, "ABCCED"));
    //System.out.println(s.exist(board, "SEE"));
    System.out.println(s.exist(board, "ABCB"));
  }
}
