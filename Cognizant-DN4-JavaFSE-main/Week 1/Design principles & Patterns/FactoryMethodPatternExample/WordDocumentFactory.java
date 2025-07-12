public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument(String name, int size, String owner) {
        return new WordDocument(name, size, owner);
    }
}
