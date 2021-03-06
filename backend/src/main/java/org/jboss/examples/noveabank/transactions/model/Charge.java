package org.jboss.examples.noveabank.transactions.model;

import org.jboss.examples.noveabank.accounting.model.Account;
import org.jboss.examples.noveabank.money.model.Money;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Charge extends Event {

    @ManyToOne
    private Account collectedFrom;

    public Account getCollectedFrom() {
        return collectedFrom;
    }

    public void setCollectedFrom(Account collectedFrom) {
        this.collectedFrom = collectedFrom;
    }

    @Embedded
    private Money chargeAmount;

    public Money getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(Money chargeAmount) {
        this.chargeAmount = chargeAmount;
    }
}
