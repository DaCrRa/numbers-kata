package es.danielcr86.numbersToWords;

public class NumbersToWords
{
  private final TensToWords tensToWords = new TensToWords();
  private final UnitsToWords unitsToWords = new UnitsToWords();

  public String convert(int inputNumber)
  {
    String output = "";

    int tens = inputNumber / 10;
    int units = inputNumber % 10;

    output += tensToWords.convert(tens);

    if (tens == 0 || units != 0)
    {
      output += " " + unitsToWords.convert(units);
    }

    return output.trim();
  }
}
