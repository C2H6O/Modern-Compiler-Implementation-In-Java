public class PairExpList extends ExpList {
  public Exp head;
  public ExpList tail;

  public PairExpList(Exp head, ExpList tail) {
    this.head = head;
    this.tail = tail;
  }

  @Override
  public int getNumberOfPrintArguments() {
    return 1 + tail.getNumberOfPrintArguments();
  }
}
