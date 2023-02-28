package bg.sofia.uni.fmi.mjt.mail;

import bg.sofia.uni.fmi.mjt.mail.exceptions.AccountAlreadyExistsException;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Outlook implements MailClient {

    Map<String, User> accounts;

    public Outlook() {
        accounts = new HashMap<>();
    }


    @Override
    public Account addNewAccount(String accountName, String email) {
        if (!isValidAccountName(accountName) || isValidEmail(email)) {
            throw new IllegalArgumentException();
        }

        try {
            if (accounts.containsKey(accountName)) {
                throw new AccountAlreadyExistsException();
            }

            accounts.put(accountName, createUser(accountName, email));
            return accounts.get(accountName).getAccount();
        } catch (AccountAlreadyExistsException e) {
            e.printStackTrace();
        }
        return null;
    }

    private User createUser(String accountName, String email) {
        Account toCreate = new Account(accountName, email);
        User user = new User(toCreate);
        return user;
    }

    private boolean isValidAccountName(String accountName) {
        if (accountName == null || accountName.isEmpty()) {
            return false;
        }
        return true;
    }

    private boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override
    public void createFolder(String accountName, String path) {

    }

    @Override
    public void addRule(String accountName, String folderPath, String ruleDefinition, int priority) {

    }

    @Override
    public void receiveMail(String accountName, String mailMetadata, String mailContent) {

    }

    @Override
    public Collection<Mail> getMailsFromFolder(String account, String folderPath) {
        return null;
    }

    @Override
    public void sendMail(String accountName, String mailMetadata, String mailContent) {

    }
}
