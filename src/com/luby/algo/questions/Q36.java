package com.luby.algo.questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Q36 {
  class Solution {
    /**
     * Determine if a 9 x 9 Sudoku board is valid.
     * Only the filled cells need to be validated according to the following rules:
     *
     * 1. Each row must contain the digits 1-9 without repetition.
     * 2. Each column must contain the digits 1-9 without repetition.
     * 3. Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
     */
    private List<Character> getRow(char[][] board, int rowIdx) {
      char[] row = board[rowIdx];
      List<Character> filtered = new ArrayList<>();
      for (int i = 0; i < 9; i++) {
        if (row[i] != '.') {
          filtered.add(row[i]);
        }
      }
      return filtered;
    }

    private List<Character> getColumn(char[][] board, int colIdx) {
      List<Character> filtered = new ArrayList<>();
      for (int i = 0; i < 9; i++) {
        char c = board[i][colIdx];
        if (c != '.') {
          filtered.add(c);
        }
      }
      return filtered;
    }

    private List<Character> getSubArea(char[][] board, int subIdx) {
      List<Character> filtered = new ArrayList<>();
      int row = subIdx / 3;
      int col = subIdx % 3;
      for (int i = row * 3; i < row * 3 + 3; i++) {
        for (int j = col * 3; j < col * 3 + 3; j++) {
          char c = board[i][j];
          if (c != '.') {
            filtered.add(c);
          }
        }
      }
      return filtered;
    }

    private boolean isValid(List<Character> list) {
      return list.size() == new HashSet<>(list).size();
    }

    public boolean isValidSudoku(char[][] board) {
      // check rows
      for (int i = 0; i < 9; i++) {
        List<Character> row = getRow(board, i);
        boolean isRowValid = isValid(row);
        if (!isRowValid) {
          return false;
        }
      }

      // check columns
      for (int i = 0; i < 9; i++) {
        List<Character> col = getColumn(board, i);
        boolean isColumnValid = isValid(col);
        if (!isColumnValid) {
          return false;
        }
      }

      // check sub area
      for (int i = 0; i < 9; i++) {
        List<Character> sub = getSubArea(board, i);
        boolean isSubValid = isValid(sub);
        if (!isSubValid) {
          return false;
        }
      }

      return true;
    }
  }
}
