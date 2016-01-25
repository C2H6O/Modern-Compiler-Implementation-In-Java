public class PrintStm extends Stm {
  public ExpList expList;

  public PrintStm(ExpList expList) {
    this.expList = expList;
  }

  @Override
  public int getNumberOfPrintArguments() {
    return expList.getNumberOfPrintArguments();
  }
}
