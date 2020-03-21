package es.danielcr86.numbersToWords;

public class NumbersToWords
{
  private final UnitsToWords unitsToWords = new UnitsToWords();

  public String convert(int inputNumber)
  {
    return unitsToWords.convert(inputNumber);
  }
}
