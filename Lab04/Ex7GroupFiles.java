package Lab04;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Ex7GroupFiles {

    static ArrayList<String> readRows(String fileName) {
        ArrayList<String> rows = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] p = line.split(",");
                if (p.length < 10) {
                    continue;
                }
                try {
                    Integer.parseInt(p[5].trim());
                    rows.add(line);
                } catch (NumberFormatException e) {
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rows;
    }

    static ArrayList<String> rowsOfGroup(ArrayList<String> rows, String group) {
        ArrayList<String> members = new ArrayList<>();
        for (String row : rows) {
            if (row.split(",")[2].trim().equals(group)) {
                members.add(row);
            }
        }
        return members;
    }

    static int countGender(ArrayList<String> rows, String gender) {
        int count = 0;
        for (String row : rows) {
            if (row.split(",")[1].trim().equals(gender)) {
                count++;
            }
        }
        return count;
    }

    static double percent(int part, int whole) {
        if (whole == 0) {
            return 0;
        }
        return part * 100.0 / whole;
    }

    static void printGroupStats(String group, ArrayList<String> members) {
        int total = members.size();
        System.out.println(group + ": " + total + " students");
        System.out.printf("  Percentage of male candidates: %.2f%%%n", percent(countGender(members, "male"), total));
        System.out.printf("  Percentage of female candidates: %.2f%%%n", percent(countGender(members, "female"), total));
    }

    static void writeGroupFile(String fileName, ArrayList<String> members) {
        int total = members.size();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("ID,gender,group,Education,test preparation course,Math,English,Computer,Total,Average");
            writer.newLine();
            for (String row : members) {
                writer.write(row);
                writer.newLine();
            }
            writer.write("Total students," + total);
            writer.newLine();
            writer.write("%male," + String.format("%.2f", percent(countGender(members, "male"), total)));
            writer.newLine();
            writer.write("%female," + String.format("%.2f", percent(countGender(members, "female"), total)));
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void studentsInEachGroup(ArrayList<String> rows, String[] groups) {
        for (String g : groups) {
            printGroupStats(g, rowsOfGroup(rows, g));
        }
    }

    static void writeGroupFiles(ArrayList<String> rows, String[] groups, String[] fileNames) {
        for (int i = 0; i < fileNames.length; i++) {
            writeGroupFile(fileNames[i], rowsOfGroup(rows, groups[i]));
        }
    }

    public static void main(String[] args) {
        ArrayList<String> rows = readRows("CandidatePerformanceTest.csv");

        System.out.println("ID,gender,group,Education,test preparation course,Math,English,Computer,Total,Average");
        for (String row : rows) {
            System.out.println(row);
        }

        System.out.println();
        String[] groups = {"group A", "group B", "group C", "group D", "group E"};
        String[] fileNames = {"groupA.csv", "groupB.csv", "groupC.csv", "groupD.csv"};

        studentsInEachGroup(rows, groups);
        writeGroupFiles(rows, groups, fileNames);
    }
}