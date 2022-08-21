package com.drbhagwat;

/*
 * Problem Statement: Given a smaller string s and a bigger string b, design an
 * algorithm to find all permutations the shorter string within the longer one.
 * Print the location of each permutation.
 */

public class Main {

  public static void findPermutationsOfSmallerStringInBiggerString(String smaller, String bigger) {
    int smallerLength = smaller.length();
    int biggerLength = bigger.length();
    int i = 0;

    while (i <= (biggerLength - smallerLength)) {
      if (IsAStringPermutationOfOther.isStringPermutationOfOtherString(smaller,
          bigger.substring(i, i + smallerLength))) {
        System.out.println("Found permutation at index = " + i);
      }
      i++;
    }
  }

  public static void main(String[] args) {
    findPermutationsOfSmallerStringInBiggerString("abbc",
        "cbabadcbbabbcbabaabccbabc");
  }
}