package magadiflo.design.patterns.creational.builder.gustavopeiretti.builder;

import magadiflo.design.patterns.creational.builder.gustavopeiretti.product.BankAccount;

public class BankAccountBuilder implements IBankAccountBuilder {
    private Long accountNumber;
    private String owner;
    private String type;
    private Double balance;
    private Double interestRate;

    public BankAccountBuilder(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankAccountBuilder owner(String owner) {
        this.owner = owner;
        return this;
    }

    public BankAccountBuilder type(String type) {
        this.type = type;
        return this;
    }

    public BankAccountBuilder balance(Double balance) {
        this.balance = balance;
        return this;
    }

    public BankAccountBuilder interestRate(Double interestRate) {
        this.interestRate = interestRate;
        return this;
    }

    @Override
    public BankAccount build() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(this.accountNumber);
        bankAccount.setOwner(this.owner);
        bankAccount.setType(this.type);
        bankAccount.setBalance(this.balance);
        bankAccount.setInterestRate(this.interestRate);
        return bankAccount;
    }
}
