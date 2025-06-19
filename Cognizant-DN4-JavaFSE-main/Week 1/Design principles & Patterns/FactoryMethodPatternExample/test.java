import javax.print.Doc;

public class test {
    public static void main(String[] args) {
        DocumentFactory wordDocumentFactory = new WordDocumentFactory();
        Document wordDocument = wordDocumentFactory.createDocument("Design Patterns and Principles", 20, "Cognizant");
        System.out.println("Name: " + wordDocument.getName());
        System.out.println("Extension: " + wordDocument.getExtension() );
        System.out.println("Owner: " + wordDocument.getOwner());
        System.out.println("Size: " + wordDocument.getSize()+ "KB");
        System.out.println("\n");

        DocumentFactory pdfDocumentFactory = new PdfDocumentFactory();
        Document pdfDocument = pdfDocumentFactory.createDocument("DN4.0-Deepskilling-Handbook-Java-FSE", 844, "Cognizant");
        System.out.println("Name: " + pdfDocument.getName());
        System.out.println("Extension: " + pdfDocument.getExtension());
        System.out.println("Owner: " + pdfDocument.getOwner());
        System.out.println("Size: " + pdfDocument.getSize()+ "KB");
        System.out.println("\n");

        DocumentFactory excelDocumentFactory = new ExcelDocumentFactory();
        Document excelDocument = excelDocumentFactory.createDocument("DN 4.0 - Java FSE Mandatory hands-on detail", 20, "Cognizant");
        System.out.println("Name: " + excelDocument.getName());
        System.out.println("Extension: " + excelDocument.getExtension() );
        System.out.println("Owner: " + excelDocument.getOwner());
        System.out.println("Size: " + excelDocument.getSize()+ "KB");
        System.out.println("\n");


    }
}