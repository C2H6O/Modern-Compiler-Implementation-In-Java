public class NumExp extends Exp {
  public int num;

  public NumExp(int num) {
    this.num = num;
  }

  @Override
  public int getNumberOfPrintArguments() {
    return 0;
  }
}
