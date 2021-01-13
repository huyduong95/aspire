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

    public static String getRandomPhoneNumber() {
        Random rand = new Random();
        int num = rand.nextInt(999999999);
        DecimalFormat df = new DecimalFormat("000000000"); // 4 zeros
        String phoneNumber = df.format(num);
        return phoneNumber;
    }

    public static String getRandomUEN() {
        Random rand = new Random();
        char lastChar = (char)(rand.nextInt(26) + 'A');
        int num = rand.nextInt(99999999);
        DecimalFormat df = new DecimalFormat("00000000");
        String randomUEN = df.format(num) + lastChar;
        return  randomUEN;
    }
}
