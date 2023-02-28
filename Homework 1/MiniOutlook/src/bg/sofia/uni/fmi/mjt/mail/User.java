package bg.sofia.uni.fmi.mjt.mail;

import bg.sofia.uni.fmi.mjt.mail.folders.Inbox;
import bg.sofia.uni.fmi.mjt.mail.folders.Sent;

import java.util.ArrayList;
import java.util.List;

public class User {

    private Account account;
    private Inbox inbox;
    private Sent sent;
    private List<Rule> rules;

    public User(Account account) {
        this.account = account;
        rules = new ArrayList<>();
    }

    public Account getAccount() {
        return account;
    }

}
