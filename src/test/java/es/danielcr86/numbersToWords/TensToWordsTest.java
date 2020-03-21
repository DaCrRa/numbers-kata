package es.danielcr86.numbersToWords;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(Parameterized.class)
public class TensToWordsTest
{
  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][] {
      { 0, "" },
      { 1, "" },
      { 2, "twenty" },
      { 3, "thirty" },
      { 4, "forty" },
      { 5, "fifty" },
      { 6, "sixty" },
      { 7, "seventy" },
      { 8, "eighty" },
      { 9, "ninety" }
    });
  }

  private int inputNumber;

  private String expectedWords;

  public TensToWordsTest(int inputNumber, String expectedWords)
  {
    this.inputNumber = inputNumber;
    this.expectedWords = expectedWords;
  }

  @Test
  public void convertsNumbersToWords() {
    assertThat(new TensToWords().convert(inputNumber), is(expectedWords));
  }
}
