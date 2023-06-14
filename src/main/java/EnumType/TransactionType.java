package EnumType;

public enum TransactionType
{
    DEPOSIT(1),
    WITHDRAW(2),
    TRANSFER(3),
    PAYMENT(4),
    OTHER(5);

    private final int transactionCode;

    TransactionType(int transactionCode)
    {
        this.transactionCode = transactionCode;
    }

    public int getTransactionCode() {
        return transactionCode;
    }
}
