package es.danielcr86.numbersToWords;

import java.util.stream.IntStream;

public class NumbersToWords
{
  private final TensToWords tensToWords = new TensToWords();
  private final FirstTwentyToWords firstTwentyToWords = new FirstTwentyToWords();

  public String convert(int inputNumber)
  {
    if (inputNumber < 20)
    {
      return firstTwentyToWords.convert(inputNumber);
    }

    String output = "";

    int tens = inputNumber / 10;
    int units = inputNumber % 10;

    output += tensToWords.convert(tens);

    if (tens == 0 || units != 0)
    {
      output += " " + firstTwentyToWords.convert(units);
    }

    return output.trim();
  }

  public static void main(String[] args)
  {
    NumbersToWords converter = new NumbersToWords();
    IntStream.range(0, 100).forEach(i -> System.out.println(i + " -> " + converter.convert(i)));
  }
}
