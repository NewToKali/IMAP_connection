package com.email.app;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;
import java.io.*;

public class App {
    public static void main( String[] args ){
        // Properties props = new Properties();

        Properties props = System.getProperties();

        props.setProperty("mail.store.protocol", "imaps");
        try{
            Session session = Session.getDefaultInstance(props, null);
            Store store = session.getStore("imaps");
            store.connect("imap.gmail.com",993, "hannmohammed731@gmail.com", "password");
            System.out.println(store);

            Folder[] f = store.getDefaultFolder().list();
            for(Folder folder:f)
                System.out.println(">> "+folder.getName());

        
        
        }catch (Exception e) {
            System.out.println(e);
        }
}
}
