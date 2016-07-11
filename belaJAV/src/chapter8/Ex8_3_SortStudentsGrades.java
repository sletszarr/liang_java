package chapter8;

/**
 * Created by Acer-756 on 7/12/2016.
 */

public class Ex8_3_SortStudentsGrades {

    public static void main(String[] args) {

        char[][] studentsAnswers =
                {{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                        {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                        {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                        {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                        {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                        {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                        {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                        {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] answerKey = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        // get student score
        int[][] studentScore = gradeExam(studentsAnswers, answerKey);

        // sort student score
        sortStudentByScore(studentScore);

        // display
        displayScore(studentScore);

    }

    public static int[][] gradeExam(char[][] answers, char[] key) {
        int[][] studentScore = new int[answers.length][2];

        for (int student = 0; student < answers.length; student++) {
            int correctCount = 0;
            for (int choice = 0; choice < answers[student].length; choice++) {
                if (answers[student][choice] == key[choice])
                    correctCount++;
            }
            studentScore[student][0] = student;
            studentScore[student][1] = correctCount;
        }

        return studentScore;
    }

    public static void sortStudentByScore(int[][] studentScore) {
        for (int i = 0; i < studentScore.length; i++) {

            int maxScoreIndex = i;
            int studentTemp;
            int studentScoreTemp;

            for (int k = i + 1; k < studentScore.length; k++) {
                if (studentScore[k][1] > studentScore[maxScoreIndex][1])
                    maxScoreIndex = k;
            }

            if (maxScoreIndex != i) {
                // swap student
                studentTemp = studentScore[i][0];
                studentScore[i][0] = studentScore[maxScoreIndex][0];
                studentScore[maxScoreIndex][0] = studentTemp;

                // swap student score
                studentScoreTemp = studentScore[i][1];
                studentScore[i][1] = studentScore[maxScoreIndex][1];
                studentScore[maxScoreIndex][1] = studentScoreTemp;
            }
        }
    }

    public static void displayScore(int[][] studentScore) {
        for (int[] student : studentScore) {
            System.out.printf("Student %d's correct count is %d\n",
                    student[0],student[1]);
        }
    }
}
