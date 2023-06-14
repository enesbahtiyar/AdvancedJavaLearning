package EnumType;

public class Main
{
    public static void main(String[] args) {
        System.out.println(WeekDays.FRIDAY);

        UseConstant(1);
    }


    private static void UseConstant(int i)
    {
        if(i == TransactionTypeConstant.DEPOSIT)
        {
            System.out.println("Money has been deposited");
        }
        else if (i == TransactionTypeConstant.WITHDRAW)
        {
            System.out.println("Money has been withdrawn");
        }
        else if(i == TransactionTypeConstant.TRANSFER)
        {
            System.out.println("Money has been transferred");
        }
        else if (i == TransactionTypeConstant.PAYMENT)
        {
            System.out.println("Payment successful");
        }
        else if(i == TransactionTypeConstant.OTHER)
        {
            System.out.println("Other");
        }
        else
        {
            System.out.println("no transaction");
        }
    }

    private static void useEnum(TransactionType transactionType)
    {
        if(transactionType == TransactionType.DEPOSIT)
        {
            System.out.println("Money has been deposited");
        }
        else if (transactionType == TransactionType.WITHDRAW)
        {
            System.out.println("Money has been withdrawn");
        }
        else if(transactionType == TransactionType.TRANSFER)
        {
            System.out.println("Money has been transferred");
        }
        else if (transactionType == TransactionType.PAYMENT)
        {
            System.out.println("Payment successful");
        }
        else if(transactionType == TransactionType.OTHER)
        {
            System.out.println("Other");
        }
        else
        {
            System.out.println("no transaction");
        }

        System.out.println("Enum name: " + transactionType.name());
        System.out.println("Enum code: " + transactionType.getTransactionCode());
    }
}
