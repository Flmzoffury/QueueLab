package ExecutiveQueue;

import java.util.Scanner;

public class Simulation
{
    public static void main(String[] args)
    {
        InputControl input = new InputControl();
        Scanner textInput = new Scanner(System.in);
        String currentInput;
        boolean programActive = true;

        do
        {
            System.out.println("Enter a command (enter H for help): ");
            currentInput = textInput.nextLine();
            input.take(currentInput);
        } while (input.take(currentInput));

    }
}
