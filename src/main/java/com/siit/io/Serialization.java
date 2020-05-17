package com.siit.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Serialization {

    public static void main(String... args) throws Exception {
        BankAccount account = BankAccount.builder()
                                         .balance(50.5)
                                         .iban("RO19RNCB07452873278389237397")
                                         .build();

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("files/bank_account.ser"));
        // java.io.NotSerializableException: com.siit.io.BankAccount in caz ca BankAccount nu implementeaza java.io.Serializable
        account.setBalance(100);
//        BankAccount.bank = "BCR";
        objectOutputStream.writeObject(account);
        objectOutputStream.writeObject(account);
        objectOutputStream.writeObject(account);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("files/bank_account.ser"));
        BankAccount o = (BankAccount) objectInputStream.readObject();
        BankAccount o1 = (BankAccount) objectInputStream.readObject();
        BankAccount o2 = (BankAccount) objectInputStream.readObject();

        System.out.println(o.getIban() + " - " + o.getBalance() + "-" + o.getBank());
//        System.out.println(o1.getIban() + " - " + o1.getBalance() + " - " + o1.bank);
//        System.out.println(o2.getIban() + " - " + o2.getBalance() + " - " + o2.bank);

        Class<BankAccount> bankAccountClass = BankAccount.class;
        Field[] fileds = bankAccountClass.getDeclaredFields();
        Method[] methods = bankAccountClass.getMethods();
        Annotation[] annotations = bankAccountClass.getDeclaredAnnotations();

        Field balanceField = bankAccountClass.getDeclaredField("balance");
        BankAccount bankAccount = bankAccountClass.getConstructor().newInstance();
//        balanceField.setAccessible(true);
//        balanceField.set(10, 10);

        /*
            {
                "iban":"RO19RNCB07452873278389237397",
                "balance":50.5
            }
         */

//        ObjectMapper objectMapper = new ObjectMapper();
//        String accountSerialized = objectMapper.writeValueAsString(account);
//        System.out.println("accountSerialized = " + accountSerialized);
//
//        BankAccount bankAccount = objectMapper.readValue(accountSerialized, BankAccount.class);
//        System.out.println("deserialized bankAccount balance = " + bankAccount.getBalance());

    }
}
