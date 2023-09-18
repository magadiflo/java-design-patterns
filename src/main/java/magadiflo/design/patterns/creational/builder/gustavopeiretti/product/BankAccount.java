package magadiflo.design.patterns.creational.builder.gustavopeiretti.product;

public class BankAccount {
    private Long accountNumber;
    private String owner;
    private String type;
    private Double balance;
    private Double interestRate;

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BankAccount{");
        sb.append("accountNumber=").append(accountNumber);
        sb.append(", owner='").append(owner).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", balance=").append(balance);
        sb.append(", interestRate=").append(interestRate);
        sb.append('}');
        return sb.toString();
    }
}
