package BaseTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BaseClass {
	private static Properties properties = new Properties();

    static {
        try (InputStream input = BaseClass.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                throw new RuntimeException("Sorry, unable to find config.properties");
            }
            properties.load(input);
        } catch (IOException ex) {
            throw new RuntimeException("Failed to load properties file", ex);
        }
    }

    // Method to get property by key
    protected String getProperty(String key) {
        return properties.getProperty(key);
    }

}
