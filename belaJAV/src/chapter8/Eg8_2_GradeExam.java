package chapter8;

/**
 * Created by Acer-756 on 7/10/2016.
 */

public class Eg8_2_GradeExam {

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

        gradeExam(studentsAnswers, answerKey);

    }

    public static void gradeExam(char[][] answers, char[] key) {

        for (int student = 0; student < answers.length; student++) {
            int correctCount = 0;
            for (int choice = 0; choice < answers[student].length; choice++) {
                if (answers[student][choice] == key[choice])
                    correctCount++;
            }

            System.out.println("Student " + student + "'s correct count is " + correctCount);
        }
    }
}
