package org.coursera.ita;

import java.io.InputStream;
import java.util.Properties;

public class Dictionary {

    private static Properties properties;

    static {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        try (InputStream input = loader.getResourceAsStream("dictionary.properties")) {
            properties = new Properties();
            properties.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String traduzir(String from) {
        return properties.getProperty(from, from);
    }

}
