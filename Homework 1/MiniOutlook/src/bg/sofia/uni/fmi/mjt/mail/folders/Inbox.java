package bg.sofia.uni.fmi.mjt.mail.folders;

import bg.sofia.uni.fmi.mjt.mail.Mail;

import java.util.ArrayList;
import java.util.List;

public class Inbox {

    private String name;
    private List<Inbox> subFolders;
    private List<Mail> mails;

    public Inbox(String name) {
        this.name = name;
        subFolders = new ArrayList<>();
        mails = new ArrayList<>();
    }
}
