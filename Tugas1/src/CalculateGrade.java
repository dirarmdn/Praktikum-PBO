public class CalculateGrade {

    public float calculateFinalScore(float assignmentScore, float midTermScore, float finalTermScore) {
        float finalGrade;

        finalGrade = ((float) 20 /100 * assignmentScore) + ((float) 35 /100 * midTermScore) + ((float) 45 /100 * finalTermScore);
        return finalGrade;
    }

    public char setGrade(float finalScore) {
        char grade;
        if (finalScore > 80) {
            grade = 'A';
        } else if (finalScore >= 75 && finalScore < 85) {
            grade = 'B';
        } else if (finalScore >= 65 && finalScore < 75) {
            grade = 'C';
        } else if (finalScore >= 49 && finalScore < 65) {
            grade = 'D';
        } else {
            grade = 'E';
        }
        return grade;
    }
}
