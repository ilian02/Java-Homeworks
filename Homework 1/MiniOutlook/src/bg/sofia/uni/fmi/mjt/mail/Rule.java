package bg.sofia.uni.fmi.mjt.mail;

import bg.sofia.uni.fmi.mjt.mail.exceptions.RuleAlreadyDefinedException;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Rule {

    private Set<String> subjectIncludes;
    private Set<String> subjectOrBodyIncludes;
    private Set<String> listOfRecipientEmails;
    private String senderEmail;
    private final int rulePriority;
    private String targetFolder;

    public Rule(String ruleDefinition, int rulePriority, String path) {

        subjectIncludes = new HashSet<>();
        subjectOrBodyIncludes = new HashSet<>();
        listOfRecipientEmails = new HashSet<>();

        this.rulePriority = rulePriority;

    }
}
