package FW.Common;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.Properties;
import java.util.Random;

public class CommonFunction {

    public static String getDataFromConfig(String propertyName) {
        Properties properties = new Properties();
        InputStream inputStream = null;
        String propertyValue = "";
        try {
            String currentDir = System.getProperty("user.dir");
            inputStream = new FileInputStream(currentDir + "\\config.properties");
            properties.load(inputStream);
            propertyValue = properties.getProperty(propertyName);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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

    public static String randomPhoneNumber() {
        Random rand = new Random();
        int num1 = (rand.nextInt(7) + 1) * 100 + (rand.nextInt(8) * 10) + rand.nextInt(8);
        int num2 = rand.nextInt(999);
        int num3 = rand.nextInt(99999);

        DecimalFormat df3 = new DecimalFormat("000"); // 3 zeros
        DecimalFormat df4 = new DecimalFormat("0000"); // 4 zeros

        String phoneNumber = df3.format(num1) + df3.format(num2) + df4.format(num3);
        return phoneNumber;
    }
}
