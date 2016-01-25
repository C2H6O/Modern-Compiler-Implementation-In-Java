public class IdExp extends Exp {
    public String id;

    public IdExp(String id) {
        this.id = id;
    }

    @Override
    public int getNumberOfPrintArguments() {
        return 0;
    }
}
