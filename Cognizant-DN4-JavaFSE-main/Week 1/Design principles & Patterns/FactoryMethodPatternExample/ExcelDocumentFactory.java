public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument(String name, int size, String owner) {
        return new ExcelDocument(name, size, owner);
    }
}
