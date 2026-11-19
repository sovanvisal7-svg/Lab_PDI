class Person {
    protected String name;

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    protected String studentId;

    Student(String name, String studentId) {
        super(name);
        this.studentId = studentId;
    }
}

class OnlineStudent extends Student {
    private String zoomId;

    OnlineStudent(String name, String studentId, String zoomId) {
        super(name, studentId);
        this.zoomId = zoomId;
    }

    void showInfo() {
        System.out.println("Name       : " + name);       
        System.out.println("Student ID : " + studentId);  
        System.out.println("Zoom ID    : " + zoomId);     
    }
}

public class Ex3_PersonStudent {
    public static void main(String[] args) {
        OnlineStudent s = new OnlineStudent("Sovan", "S001", "123-456-789");
        s.showInfo();
    }
}
