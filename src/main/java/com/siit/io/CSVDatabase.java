package com.siit.io;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
import static java.time.temporal.ChronoUnit.SECONDS;

public class CSVDatabase {

    public static void main(String... args) throws IOException {
        Path fileDB = Paths.get("files", "bank_account.csv");
//        Files.setPosixFilePermissions()
        List<BankAccount> bankAccounts = Files.lines(fileDB)
                                              .skip(1) //igonram headerul
                                              .filter(StringUtils::isNotBlank)
                                              .map(CSVDatabase::mapLineToBankAccount)
                                              .peek(System.out::println)
                                              .collect(Collectors.toList());
        //modificam lista: de ex, depui bani
        //rescrii fisierul --> suprascrii cu ce ai in lista dupa modificare

        bankAccounts.add(BankAccount.builder()
                                    .balance(50.5)
                                    .iban("RO19RNCB07452873278389237397")
                                    .bank("BCR")
                                    .build());

        bankAccounts.get(1).setBalance(1000000);

        rewriteBankAccountsDB(fileDB, bankAccounts);
    }

    private static void rewriteBankAccountsDB(Path fileDB, List<BankAccount> bankAccounts) throws IOException {
        String currentTimeString = LocalDateTime.now().truncatedTo(SECONDS).format(ISO_LOCAL_DATE_TIME);
        String newFileName = fileDB.toString().substring(0, fileDB.toString().length() - 4) + "_" + currentTimeString + ".csv";

        BufferedWriter writer = Files.newBufferedWriter(Paths.get(newFileName), UTF_8, StandardOpenOption.CREATE);
        writeHearer(writer);
        bankAccounts.forEach(bankAccount -> writeBankAccountEntry(writer, bankAccount));
        writer.flush();
    }

    private static void writeHearer(BufferedWriter writer) {
        try {
            writer.write("bank,IBAN,balance");
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Exception while writing header ");
        }
    }

    private static void writeBankAccountEntry(BufferedWriter writer, BankAccount bankAccount) {
        try {
            writer.write(bankAccount.getBank() + "," + bankAccount.getIban() + "," + bankAccount.getBalance());
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Exception while writing bankAccount: " + bankAccount);
        }
    }

    static BankAccount mapLineToBankAccount(String line) {
        String[] fields = line.split(",");
        return BankAccount.builder()
                          .bank(fields[0])
                          .iban(fields[1])
                          .balance(Double.parseDouble(fields[2].trim()))
                          .build();
    }
}
