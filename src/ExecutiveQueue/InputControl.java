package ExecutiveQueue;

public class InputControl
{
    Business business;

    public InputControl()
    {
        business = new Business();
    }

    public boolean take(String input)
    {
        if (input.equals("Exit")) {
            return false;
        }


        return true;
    }

}
