package Lab04;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ex6CandidateAnalysis {

    static class Candidate {
        String id, gender, group, education, prepCourse;
        int math, english, computer, total;
        double average;

        Candidate(String id, String gender, String group, String education, String prepCourse,
                  int math, int english, int computer, int total, double average) {
            this.id = id;
            this.gender = gender;
            this.group = group;
            this.education = education;
            this.prepCourse = prepCourse;
            this.math = math;
            this.english = english;
            this.computer = computer;
            this.total = total;
            this.average = average;
        }

        public String toString() {
            return id + "," + gender + "," + group + "," + education + "," + prepCourse + ","
                    + math + "," + english + "," + computer + "," + total + "," + String.format("%.2f", average);
        }
    }

    static ArrayList<Candidate> readData(String fileName) {
        ArrayList<Candidate> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] p = line.split(",");
                if (p.length < 10) {
                    continue;
                }
                try {
                    list.add(new Candidate(p[0].trim(), p[1].trim(), p[2].trim(), p[3].trim(), p[4].trim(),
                            Integer.parseInt(p[5].trim()), Integer.parseInt(p[6].trim()),
                            Integer.parseInt(p[7].trim()), Integer.parseInt(p[8].trim()),
                            Double.parseDouble(p[9].trim())));
                } catch (NumberFormatException e) {
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    static void display(ArrayList<Candidate> list) {
        System.out.println("ID,gender,group,Education,test preparation course,Math,English,Computer,Total,Average");
        for (Candidate c : list) {
            System.out.println(c);
        }
    }

    static int countGender(ArrayList<Candidate> list, String gender) {
        int count = 0;
        for (Candidate c : list) {
            if (c.gender.equals(gender)) {
                count++;
            }
        }
        return count;
    }

    static void printStats(String label, ArrayList<Candidate> list) {
        int total = list.size();
        double male = 0, female = 0;
        if (total > 0) {
            male = countGender(list, "male") * 100.0 / total;
            female = countGender(list, "female") * 100.0 / total;
        }
        System.out.println(label + ": " + total);
        System.out.printf("  Percentage of male candidates: %.2f%%%n", male);
        System.out.printf("  Percentage of female candidates: %.2f%%%n", female);
    }

    static void question1(ArrayList<Candidate> all) {
        System.out.println("Q1");
        printStats("Total candidates", all);
    }

    static void question2(ArrayList<Candidate> all) {
        System.out.println("Q2");
        ArrayList<Candidate> high = new ArrayList<>();
        for (Candidate c : all) {
            if (c.average >= 90) {
                high.add(c);
            }
        }
        printStats("Candidates with average score at least 90", high);
    }

    static void question3(ArrayList<Candidate> all) {
        System.out.println("Q3");
        int count = 0;
        for (Candidate c : all) {
            if (c.math >= 85 && c.english >= 85 && c.computer >= 85) {
                count++;
            }
        }
        System.out.println("Candidates with score at least 85 in each subject: " + count);
    }

    static void question4(ArrayList<Candidate> all) {
        System.out.println("Q4");
        String[] groups = {"group A", "group B", "group C", "group D", "group E"};
        for (String g : groups) {
            ArrayList<Candidate> members = new ArrayList<>();
            for (Candidate c : all) {
                if (c.group.equals(g)) {
                    members.add(c);
                }
            }
            printStats("Students in " + g, members);
        }
    }

    public static void main(String[] args) {
        ArrayList<Candidate> all = readData("CandidatePerformanceTest.csv");

        display(all);

        System.out.println();
        question1(all);
        question2(all);
        question3(all);
        question4(all);
    }
}
