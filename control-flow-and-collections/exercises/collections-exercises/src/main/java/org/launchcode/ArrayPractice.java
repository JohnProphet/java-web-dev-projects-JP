package org.launchcode;


public class ArrayPractice
{
  int[] integerArray = { 1, 1, 2, 3, 5, 8 };
  String quote = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
  String[] words = quote.split(" ");
  System.out.println(Arrays.toString(words));
  String[] sentences = quote.split("\\.");
  public void setSentences(String[] sentences)
  {
    this.sentences = sentences;
  }
  System.out.println(Arrays.toString(sentences));
}