package org.example;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleMain {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("vi","VN"));

        ResourceBundle messages = ResourceBundle.getBundle("messages");
        String hello = messages.getString("hello");
        System.out.println(hello);
    }
}
