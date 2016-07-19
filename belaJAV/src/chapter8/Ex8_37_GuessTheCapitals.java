package chapter8;

import java.util.Scanner;

/**
 * Created by bnamora on 7/19/16.
 */

public class Ex8_37_GuessTheCapitals {

    public static void main(String[] args) {

            String[][] stateCapitalUS = {
                            {"Alabama", "Montgomery"},
                            {"Alaska", "Juneau"},
                            {"Arizona", "Phoenix"},
                            {"Arkansas", "Little Rock"},
                            {"California", "Sacramento"},
                            {"Colorado", "Denver"},
                            {"Connecticut", "Hartford"},
                            {"Delaware", "Dover"},
                            {"Florida", "Tallahassee"},
                            {"Georgia", "Atlanta"},
                            {"Hawaii", "Honolulu"},
                            {"Idaho", "Boise"},
                            {"Illinois", "Springfield"},
                            {"Indiana", "Indianapolis"},
                            {"Iowa", "Des Moines"},
                            {"Kansas", "Topeka"},
                            {"Kentucky", "Frankfort"},
                            {"Louisiana", "Baton Rouge"},
                            {"Maine", "Augusta"},
                            {"Maryland", "Annapolis"},
                            {"Massachusetts", "Boston"},
                            {"Michigan", "Lansing"},
                            {"Minnesota", "St. Paul"},
                            {"Mississippi", "Jackson"},
                            {"Missouri", "Jefferson City"},
                            {"Montana", "Helena"},
                            {"Nebraska", "Lincoln"},
                            {"Nevada", "Carson City"},
                            {"New Hampshire", "Concord"},
                            {"New Jersey", "Trenton"},
                            {"New Mexico", "Santa Fe"},
                            {"New York", "Albany"},
                            {"North Carolina", "Raleigh"},
                            {"North Dakota", "Bismarck"},
                            {"Ohio", "Columbus"},
                            {"Oklahoma", "Oklahoma City"},
                            {"Oregon", "Salem"},
                            {"Pennsylvania", "Harrisburg"},
                            {"Rhode Island", "Providence"},
                            {"South Carolina", "Columbia"},
                            {"South Dakota", "Pierre"},
                            {"Tennessee", "Nashville"},
                            {"Texas", "Austin"},
                            {"Utah", "Salt Lake City"},
                            {"Vermont", "Montpelier"},
                            {"Virginia", "Richmond"},
                            {"Washington", "Olympia"},
                            {"West Virginia", "Charleston"},
                            {"Wisconsin", "Madison"},
                            {"Wyoming", "Cheyenne"}};

            guessTheCapitals(stateCapitalUS);

    }

    public static void guessTheCapitals(String[][] stateCapitals) {

        Scanner input = new Scanner(System.in);

        int correctCount = 0;

        for (String[] stateCap : stateCapitals) {
            // ask question
            System.out.printf("What is the capital of %s: ",
                    stateCap[0]);

            // get answer
            String answer = input.nextLine();

            // check answer
            if (answer.equalsIgnoreCase(stateCap[1])) {
                System.out.println("Your answer is correct");
                correctCount++;
            } else {
                System.out.printf("The correct answer should be %s\n",
                        stateCap[1]);
            }
        }

        // display correct count
        System.out.println("The correct count is " + correctCount);

    }

}





