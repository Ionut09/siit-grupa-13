package com.siit.strings.exampleATMDenisa;

import lombok.AllArgsConstructor;

/**
 * Write an app that simulates an ATM machine.
 * Requirements:
 * the app should run indefinitely, allowing customers to enter their cards and withdraw money, deposit money, interogate sold and change pin.
 * class design (just a recomandation):
 * - User has one or more BankAccounts
 * - User has one or more Cards
 * - Cards are emitted to a single BankAccount
 * - User interacts with Cards via a withdraw(Card), deposit(Card), changePin(Card)
 * or interogateBalance(Card) action from ATM class based on the option he inputs to the keyboard.
 */
@AllArgsConstructor
public class ATMService {

    private BankDataBase dataBase;

    void changePin(Card card, String newPin) {
        card.setPin(newPin);
    }

    void deposit(Card card, double amount) {
        if (amount > 0) {
            BankAccount account = dataBase.getBankAccountByCardNumber(card.getNumber());
            account.setBalance(account.getBalance() + amount);
        } else {
            System.out.println("Amount must be greater than 0.");
        }
    }

    double interrogateBalance(Card card) {
        BankAccount account = dataBase.getBankAccountByCardNumber(card.getNumber());
        return account.getBalance();
    }

    Card logIn(String cardNumber, String pin) {
        Card card = dataBase.getCardByNumber(cardNumber);

        if ((card == null) || !(verifyPin(card, pin))) {
            return null;
        }
        return card;
    }

    boolean verifyPin(Card card, String pin) {
        return card.getPin().equals(pin);
    }

    void printMenu() {
        System.out.println("Please select an interaction:" +
                "\n1 --> Interrogate balance." +
                "\n2 --> Deposit cash." +
                "\n3 --> Withdraw cash." +
                "\n4 --> Change pin." +
                "\n5 --> Quit.");
    }

    void withdraw(Card card, double amount) {
        if (amount > 0) {
            BankAccount account = dataBase.getBankAccountByCardNumber(card.getNumber());

            double balance = account.getBalance();
            if ((balance - amount) > 0) {
                account.setBalance(balance - amount);
            } else {
                System.out.println("Insufficient funds.");
            }

        } else {
            System.out.println("Amount must be greater than 0.");
        }
    }
}
