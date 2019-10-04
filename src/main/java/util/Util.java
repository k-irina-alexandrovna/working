package util;

import java.io.File;

public class Util {

    public static void sleep(int millis){
        try{
            Thread.sleep(millis);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void checkFolderContents(String path){
        path = (path != null) ? path : "src/main/driver/";
        File myFolder = new File(path);
        File[] files = myFolder.listFiles();
    }
}

