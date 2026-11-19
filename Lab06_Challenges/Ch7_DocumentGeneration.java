package Lab06_Challenges;
abstract class Document {
    
    final void generate() {
        writeHeader();
        writeBody();
        writeFooter();
        System.out.println();
    }

    abstract void writeHeader();
    abstract void writeBody();
    abstract void writeFooter();
}

class InvoiceDocument extends Document {
    @Override
    void writeHeader() {
        System.out.println("=== INVOICE #001 ===");
    }

    @Override
    void writeBody() {
        System.out.println("Item: Laptop x1 ........ $750.00");
    }

    @Override
    void writeFooter() {
        System.out.println("Total due: $750.00");
    }
}

class ResumeDocument extends Document {
    @Override
    void writeHeader() {
        System.out.println("=== RESUME: Sovan ===");
    }

    @Override
    void writeBody() {
        System.out.println("Education: Institute of Technology of Cambodia");
    }

    @Override
    void writeFooter() {
        System.out.println("References available on request.");
    }
}

class ReportDocument extends Document {
    @Override
    void writeHeader() {
        System.out.println("=== LAB REPORT ===");
    }

    @Override
    void writeBody() {
        System.out.println("This report explains inheritance in Java.");
    }

    @Override
    void writeFooter() {
        System.out.println("Page 1 of 1");
    }
}

public class Ch7_DocumentGeneration {
    public static void main(String[] args) {
        Document[] docs = { new InvoiceDocument(), new ResumeDocument(), new ReportDocument() };

        for (Document d : docs) {
            d.generate();
        }
    }
}
