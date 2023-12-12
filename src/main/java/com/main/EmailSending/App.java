package com.main.EmailSending;


import Email.GmailSender;

public class App 
{
    public static void main( String[] args )
    {
        GmailSender gmailSender=new GmailSender();
        String to="jaykumarzade@gmail.com";
        String from="jayzade0131@gmail.com";
        String subject ="sending email.....";
        String message="hello.. my name is jay zade.. how are u ?";
       
       boolean result= gmailSender.sendEmail(to, from, subject, message);
       
       if(result)
       {
    	   System.out.println("email send successfully");
       }
       else {
    	   System.out.println("there is problem in sending mail");
    	   
       }
    }
}
