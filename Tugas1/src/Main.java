import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CalculateGrade calc = new CalculateGrade();

        String studentName, className;
        char finalGrade;
        float finalScore, assignmentScore, midTermScore, finalTermScore;

        System.out.print("Nama : ");
        studentName = input.nextLine();
        System.out.print("Kelas : ");
        className = input.nextLine();

        System.out.printf("\nHalo %s dari kelas %s ! \n", studentName, className);
        System.out.print("Masukkan nilai tugas Anda: ");
        assignmentScore = input.nextFloat();
        System.out.print("Masukkan nilai UTS Anda: ");
        midTermScore = input.nextFloat();
        System.out.print("Masukkan nilai UAS Anda: ");
        finalTermScore = input.nextFloat();

        finalScore = calc.calculateFinalScore(assignmentScore, midTermScore, finalTermScore);
        finalGrade = calc.setGrade(finalScore);

        System.out.println("=========================");
        System.out.println("== LAPORAN NILAI AKHIR ==");
        System.out.println("Nama : " + studentName);
        System.out.println("Kelas : " + className);
        System.out.println("Kalkulasi Nilai : " + finalScore);
        System.out.println("Predikat Akhir : " + finalGrade);
        System.out.println("=========================");
    }
}