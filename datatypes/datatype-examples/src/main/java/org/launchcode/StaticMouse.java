package org.launchcode;

public class StaticMouse {
    public static double weight = 1.5;

    public static void main(String[] args)
    {
      Mouse m = new Mouse();
      System.out.println(m.weight);
      m.weight = 55;
      System.out.println(m.weight);
      m.squeak();

        System.out.println(StaticMouse.weight);
        StaticMouse.squeak();
    }
}