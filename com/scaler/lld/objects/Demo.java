package com.scaler.lld.objects;

import java.util.Date;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        CreditCard c1 = new CreditCard("11111", 232, new Date(2025, 01, 01));
        CreditCard c2 = new CreditCard("111112", 232, new Date(2025, 01, 01));
        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));
        System.out.println(c1.toString());
        System.out.println(c1.hashCode() + " " + c2.hashCode());
        c1 = null;
        Thread.sleep(10000);
    }
}

class CreditCard{
    private final String number;
    private final int cvv;
    private final Date expiryDate;

    public CreditCard(String number, int cvv, Date expiryDate) {
        this.number = number;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    public String getNumber() {
        return number;
    }

    public int getCvv() {
        return cvv;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "number='" + number + '\'' +
                ", cvv=" + cvv +
                ", expiryDate=" + expiryDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreditCard)){
            return false;
        }
        CreditCard that = (CreditCard) o;

        if (cvv != that.cvv) return false;
        if (!number.equals(that.number)) return false;
        return expiryDate.equals(that.expiryDate);
    }

    @Override
    public int hashCode() {
        int result = number.hashCode();
        result = 31 * result + cvv;
        result = 31 * result + expiryDate.hashCode();
        return result;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Obj is about to be garbage collected");
    }
}
