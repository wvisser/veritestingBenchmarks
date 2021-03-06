package minepump.product20.drivers;

import java.util.Random;

import minepump.product20.Main;

public class RandomDriver {

  private static Random rand;

  public static void main(String[] args) {
    if (args.length != 1) {
      System.err.println("A single integer argument is expected denoting time in seconds");
      return;
    }

    int timeLimit = Integer.parseInt(args[0]);
    System.out.println("Time limit: " + timeLimit + " [s]");

    final long startTime = System.currentTimeMillis();

    rand = new Random(42); // the parameter is a random seed
    int count = 0;

    boolean[] x = new boolean[12];

    while((System.currentTimeMillis() - startTime) / 1000 < timeLimit) {
      for(int i = 0; i < x.length; ++i) {
        x[i] = rand.nextBoolean();
        System.err.print(x[i]);
        if (i != x.length - 1)
          System.err.print(",");
      }
      System.err.println();

      Main.performActions3(x[0], x[1], x[2], x[3], x[4], x[5], x[6], x[7],
          x[8], x[9], x[10], x[11]);
      count++;
    }
    System.out.println("In total, there were " + count + " invocations of the target");
  }
}
