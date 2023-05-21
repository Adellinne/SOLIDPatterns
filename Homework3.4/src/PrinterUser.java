public class PrinterUser
{
    private MultifunctionalPrinter multifunctionalPrinter;
    private FullyFunctionalPrinter fullyFunctionalPrinter;

    public PrinterUser()
    {
        this.multifunctionalPrinter = new MultifunctionalPrinter();
        this.fullyFunctionalPrinter = new FullyFunctionalPrinter();
    }
    public void usePrinter()
    {
        multifunctionalPrinter.print();
        multifunctionalPrinter.scan();

        fullyFunctionalPrinter.print();
        fullyFunctionalPrinter.scan();
        fullyFunctionalPrinter.fax();
    }
}