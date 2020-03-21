package es.danielcr86.numbersToWords;

import java.util.ArrayList;
import java.util.Arrays;

public class NumbersToWords
{
  private static final ArrayList<String> WORDS = new ArrayList(Arrays.asList(
    "zero",
    "one",
    "two",
    "three",
    "four",
    "five",
    "six",
    "seven",
    "eight",
    "nine"
  ));

  public String convert(int inputNumber)
  {
    return WORDS.get(inputNumber);
  }
}
