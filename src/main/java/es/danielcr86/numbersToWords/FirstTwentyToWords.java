package es.danielcr86.numbersToWords;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstTwentyToWords
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
    "nine",
    "ten",
    "eleven",
    "twelve",
    "thirteen",
    "fourteen",
    "fifteen",
    "sixteen",
    "seventeen",
    "eighteen",
    "nineteen"
  ));

  public String convert(int inputNumber)
  {
    return WORDS.get(inputNumber);
  }
}