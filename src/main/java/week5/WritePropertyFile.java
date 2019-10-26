package week5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try {
             Properties properties = new Properties();
             properties.setProperty("Todayis-", "12");
             properties.setProperty("Wearein-", "3rd Week");
             properties.setProperty("ItsGoing-", "Good So far");

             File file1 = new File("./Resources/Config.properties");
             FileOutputStream fileOut = new FileOutputStream(file1, true);
             properties.store(fileOut, "Favorite Things");
             fileOut.close();
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }




	}

}
