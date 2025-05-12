package assignments.Packages.Library.Transactions;

import java.util.ArrayList;
import java.util.List;

public class TransactionObj
{
    List<Transaction> transactionList=new ArrayList<>();
    public void addTransaction(Transaction tr)
    {
        transactionList.add(tr);
    }
    public void displayTransactions()
    {
        for(Transaction tr:transactionList)
        {
            System.out.println(tr);
        }
    }
}
