package chapter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeakWithHook extends CaffeineBeverageWithHook {
    @Override
    void addCondiments() {
        System.out.println("Steeping the tea");
    }

    @Override
    void brew() {
        System.out.println("Adding Lemon");
    }

    @Override
    boolean customerWantsConditions() {

        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        // get the user's response
        String answer = null;

        System.out.print("Would you like lemon with your tea (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
