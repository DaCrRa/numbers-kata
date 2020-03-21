package es.danielcr86.numbersToWords;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(Parameterized.class)
public class UnitsToWordsTest
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
      {9, "nine"}
    });
  }

  private int inputNumber;

  private String expectedWords;

  public UnitsToWordsTest(int inputNumber, String expectedWords)
  {
    this.inputNumber = inputNumber;
    this.expectedWords = expectedWords;
  }

  @Test
  public void convertsNumbersToWords() {
    assertThat(new NumbersToWords().convert(inputNumber), is(expectedWords));
  }
}