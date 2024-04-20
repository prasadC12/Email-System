package com.tka.account;

import java.util.ArrayList;
import java.util.List;

public class Email {
	
	class Email {
	    private String to;
	    private String from;
	    private String subject;
	    private String body;

	    public Email(String to, String from, String subject, String body) {
	        this.to = to;
	        this.from = from;
	        this.subject = subject;
	        this.body = body;
	    }

	    @Override
	    public String toString() {
	        return "To: " + to + "\nFrom: " + from + "\nSubject: " + subject + "\nBody: " + body;
	    }
	}

	class Inbox {
	    private List<Email> emails;

	    public Inbox() {
	        emails = new ArrayList<>();
	    }

	    public void addEmail(Email email) {
	        emails.add(email);
	    }

	    public List<Email> getEmails() {
	        return emails;
	    }
	}

	public class GmailSimulation {
	    public static void main(String[] args) {
	        
	        Inbox inbox = new Inbox();

	       
	        Email email1 = new Email();
	        Email email2 = new Email();
	        Email email3 = new Email();

	        inbox.addEmail(email1);
	        inbox.addEmail(email2);
	        inbox.addEmail(email3);

	        
	        List<Email> inboxEmails = inbox.getEmails();
	        for (Email email : inboxEmails) {
	            System.out.println(email);
	            System.out.println("--------------------------");
	        }
	    }
	}
}

	
