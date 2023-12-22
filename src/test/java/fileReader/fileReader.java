package fileReader;
import java.io.BufferedReader;
import java.util.Properties;

import java.io.FileReader;
import java.io.IOException;

public class fileReader {

    private static Properties properties;
    private static final String propertyFilePath= "config//TestData.properties";

    public static String fileReader1(String Value) throws IOException {
        BufferedReader reader;

        reader = new BufferedReader(new FileReader(propertyFilePath));
        properties = new Properties();
        properties.load(reader);
        reader.close();

        String Value1=properties.getProperty(Value);
        System.out.print(Value1);
    //    return Value1;
        return Value1;
    }

}
