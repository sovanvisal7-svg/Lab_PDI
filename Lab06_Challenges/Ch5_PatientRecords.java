package Lab06_Challenges;
class PatientRecord {
    private String ssn;                  
    protected String medicalHistory;     

    PatientRecord(String ssn, String medicalHistory) {
        this.ssn = ssn;
        this.medicalHistory = medicalHistory;
    }
}

class OutpatientRecord extends PatientRecord {
    OutpatientRecord(String ssn, String medicalHistory) {
        super(ssn, medicalHistory);
    }

    void showAccess() {
        System.out.println("Outpatient - medicalHistory (protected): " + medicalHistory);   
        
    }
}

class InpatientRecord extends PatientRecord {
    InpatientRecord(String ssn, String medicalHistory) {
        super(ssn, medicalHistory);
    }

    void showAccess() {
        System.out.println("Inpatient  - medicalHistory (protected): " + medicalHistory);   
        
    }
}

public class Ch5_PatientRecords {
    public static void main(String[] args) {
        OutpatientRecord out = new OutpatientRecord("000-00-0000", "Seasonal flu");
        InpatientRecord in = new InpatientRecord("111-11-1111", "Appendectomy surgery");

        out.showAccess();
        in.showAccess();
    }
}
