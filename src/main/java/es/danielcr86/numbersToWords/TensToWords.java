package es.danielcr86.numbersToWords;

import java.util.ArrayList;
import java.util.Arrays;

public class TensToWords
{
  private static final ArrayList<String> WORDS = new ArrayList(Arrays.asList(
    "",
    "",
    "twenty",
    "thirty",
    "forty",
    "fifty",
    "sixty",
    "seventy",
    "eighty",
    "ninety"
  ));

  public String convert(int inputNumber)
  {
    return WORDS.get(inputNumber);
  }
}
