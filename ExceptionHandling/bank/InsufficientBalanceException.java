package assignments.ExceptionHandling.bank;

public class InsufficientBalanceException extends Exception
{
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
