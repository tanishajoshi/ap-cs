package org.redbasin.bitalgebra;

public class BitDouble {
   public static void main(String[] args) throws NumberFormatException {
       if (args.length == 0) {
          System.out.println("Usage: java BitDouble <double>");
          System.exit(1);
       }
       System.out.println(Integer.toBinaryString(Double.doubleToRawIntBits(new Double(args[0]))));
   }
}
