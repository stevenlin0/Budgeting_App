package org.example;

import java.util.List;
import java.util.Objects;

public final class WalletInfo {
    private final double balance;
    private final List<Transaction> transactions;
    private final double currentPrice;
    private final double priceChange24h;

    public WalletInfo(
            double balance,
            List<Transaction> transactions,
            double currentPrice,
            double priceChange24h
    ) {
        this.balance = balance;
        this.transactions = transactions;
        this.currentPrice = currentPrice;
        this.priceChange24h = priceChange24h;
    }

    public double balance() {
        return balance;
    }

    public List<Transaction> transactions() {
        return transactions;
    }

    public double currentPrice() {
        return currentPrice;
    }

    public double priceChange24h() {
        return priceChange24h;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (WalletInfo) obj;
        return Double.doubleToLongBits(this.balance) == Double.doubleToLongBits(that.balance) &&
                Objects.equals(this.transactions, that.transactions) &&
                Double.doubleToLongBits(this.currentPrice) == Double.doubleToLongBits(that.currentPrice) &&
                Double.doubleToLongBits(this.priceChange24h) == Double.doubleToLongBits(that.priceChange24h);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance, transactions, currentPrice, priceChange24h);
    }

    @Override
    public String toString() {
        return "WalletInfo[" +
                "balance=" + balance + ", " +
                "transactions=" + transactions + ", " +
                "currentPrice=" + currentPrice + ", " +
                "priceChange24h=" + priceChange24h + ']';
    }
}
