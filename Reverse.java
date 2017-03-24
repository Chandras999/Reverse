public class Reverse {
  public static void main(String[] args) {
    // Loop backwards through the array of arguments
    for(int i = args.length-1; i >= 0; i--) {
      // Loop backwards through the characters in each argument
      for(int j=args[i].length()-1; j>=0; j--) {
        // Print out character j of argument i.
        System.out.print(args[i].charAt(j));
      }
      System.out.print(" ");  // add a space at the end of each argument
    }
    System.out.println();     // and terminate the line when we're done.
  }
}

