public class ExcelDocument implements Document {
    private String name;
    private double size;
    private String owner;
    private static final String extension = "xlsx";

    public ExcelDocument(String name, double size, String owner) {
        this.name = name;
        this.size = size;
        this.owner = owner;
    };

    @Override
    public String getExtension() {
        return extension;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getOwner() {
        return owner;
    }

    @Override
    public double getSize() {
        return size;
    }

}