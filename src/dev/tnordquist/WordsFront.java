package dev.tnordquist;

/**
 * Given an array of strings, return a new array containing the first N strings. N will be in the
 * range 1..length. Ex. {new String[]{"a"}, new String[]{"a", "b", "c", "d"}, 1}
 */

class WordsFront {

  public static String[] wordsFront(String[] words, int n) {

    String[] newWord = new String[n];

    for(int i = 0; i < n; ++i) {

      newWord[i] = words[i];

    }
    return newWord;
  }


}
