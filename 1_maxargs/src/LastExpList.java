public class LastExpList extends ExpList {
  public Exp exp;

  public LastExpList(Exp exp) {
    this.exp = exp;
  }

  @Override
  public int getNumberOfPrintArguments() {
    return 1;
  }
}
