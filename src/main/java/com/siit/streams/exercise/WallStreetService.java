package com.siit.streams.exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class WallStreetService {

    static Trader raoul = new Trader("Raoul", "Cambridge");

    static Trader mario = new Trader("Mario", "Milan");

    static Trader alan = new Trader("Alan", "Cambridge");

    static Trader brian = new Trader("Brian", "Cambridge");

    static List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
    );

    public static void main(String... args) {
        findSortedTransactionsFromYear(2012).forEach(System.out::println);
    }
    /*
    1. Find all transactions in the year 2011 and sort them by value (small to high).
    2. What are all the unique cities where the traders work?
    3. Find all traders from Cambridge and sort them by name.
    4. Return a string of all traders’ names sorted alphabetically.
    5. Are any traders based in Milan?
    6. Print all transactions’ values from the traders living in Cambridge.
    7. What’s the highest value of all the transactions?
    8. Find the transaction with the smallest value.
     */

    static List<Transaction> findSortedTransactionsFromYear(int year) {
        return transactions.stream()
                           .filter(transaction -> transaction.getYear() == year)
//                           .sorted((t1, t2) -> t1.getValue() - t2.getValue())
                           .sorted(Comparator.comparingInt(Transaction::getValue))
//                           .collect(Collectors.toCollection(ArrayList::new));
                           .collect(toList());
    }

    static Set<String> findUniqueCitiesOfTraders() {
        return transactions.stream() //Transaction
//                           .map(transaction -> transaction.getTrader().getCity())

//                          .map(transaction -> transaction.getTrader())
                           .map(Transaction::getTrader) //String::isEmpty

//                           .map(trader -> trader.getCity()) //String==city apply(Trader t)
                           .map(Trader::getCity) //String==city apply(Trader t)

                           .collect(Collectors.toSet());
    }
}
