package org.jboss.examples.noveabank.transactions.model;

import org.jboss.examples.noveabank.customer.model.Customer;
import org.jboss.examples.noveabank.money.model.Money;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Deposit extends Event {

    @ManyToOne
    private Customer depositor;

    public Customer getDepositor() {
        return depositor;
    }

    public void setDepositor(Customer depositor) {
        this.depositor = depositor;
    }

    @Embedded
    private Money depositAmount;

    public Money getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(Money depositAmount) {
        this.depositAmount = depositAmount;
    }
}
