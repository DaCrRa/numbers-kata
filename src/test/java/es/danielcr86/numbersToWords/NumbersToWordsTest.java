package es.danielcr86.numbersToWords;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(Parameterized.class)
public class NumbersToWordsTest
{
  @Parameterized.Parameters
  public static Collection<Object[]> data()
  {
    return Arrays.asList(new Object[][] {
      {0, "zero"},
      {1, "one"},
      {2, "two"},
      {3, "three"},
      {4, "four"},
      {5, "five"},
      {6, "six"},
      {7, "seven"},
      {8, "eight"},
      {9, "nine"},
      {10, "ten"},
      {11, "eleven"},
      {12, "twelve"},
      {13, "thirteen"},
      {14, "fourteen"},
      {15, "fifteen"},
      {16, "sixteen"},
      {17, "seventeen"},
      {18, "eighteen"},
      {19, "nineteen"},
      {20, "twenty"},
      {21, "twenty one"},
      {22, "twenty two"},
      {30, "thirty"},
      {40, "forty"},
      {50, "fifty"},
      {60, "sixty"},
      {70, "seventy"},
      {80, "eighty"},
      {90, "ninety"}
    });
  }

  private int inputNumber;

  private String expectedWords;

  public NumbersToWordsTest(int inputNumber, String expectedWords)
  {
    this.inputNumber = inputNumber;
    this.expectedWords = expectedWords;
  }

  @Test
  public void convertsNumbersToWords()
  {
    assertThat(new NumbersToWords().convert(inputNumber), is(expectedWords));
  }
}
