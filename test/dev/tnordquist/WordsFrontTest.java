package dev.tnordquist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class WordsFrontTest {

  private static Object[][] wordsFront() {
    return new Object[][]{

        {new String[]{"a"}, new String[]{"a", "b", "c", "d"}, 1}
    };
  }

  @ParameterizedTest
  @MethodSource
  void wordsFront(String[] expected, String[] words, int n) {

    String[] actual = WordsFront.wordsFront(words,n);
    assertArrayEquals(expected,actual);

  }
}