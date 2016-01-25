public class OpExp extends Exp {
  public Exp left;
  public Exp right;
  public int oper;
  public static final int Plus = 1, Minus = 2, Times = 3, Div = 4;

  public OpExp(Exp left, int oper, Exp right) {
    this.left = left;
    this.oper = oper;
    this.right = right;
  }

  @Override
  public int getNumberOfPrintArguments() {
    return Math.max(left.getNumberOfPrintArguments(), right.getNumberOfPrintArguments());
  }
}
