public class DocumentService {
    private final Printer printer;

    public DocumentService(Printer printer) {
        this.printer = printer;
    }

    public void printDocument() {
        printer.start();
        System.out.println("Called: start()");

        printer.print("This is the document content.");
        System.out.println("Called: print(\"This is the document content.\")");

        printer.end();
        System.out.println("Called: end()");
    }
}
