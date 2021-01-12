package FW.Common;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class CommonFunction {

    public static String getDataFromConfig(String propertyName) {
        Properties properties = new Properties();
        InputStream inputStream = null;
        String propertyValue = "";
        try {
            String currentDir = System.getProperty("user.dir");
            inputStream = new FileInputStream(currentDir + "\\config.properties");

            // load properties from file
            properties.load(inputStream);

            // get property by name
            propertyValue = properties.getProperty(propertyName);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // close objects
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return propertyValue;
    }
}
