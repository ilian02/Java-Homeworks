package bg.sofia.uni.fmi.mjt.mail;

import java.util.Collection;

public class Outlook implements MailClient {
    @Override
    public Account addNewAccount(String accountName, String email) {
        return null;
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
