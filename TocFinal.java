/*
系級:資訊103
姓名:白孟哲
學號:F74996065
*/

import java.io.*;
import java.net.URL;
import java.util.regex.*;
import java.util.Scanner;
import org.json.*;

public class Proj {
          public static void main(String[] args) throws IOException, JSONException {

                int chunksize = 4096;
                byte[] chunk = new byte[chunksize];
                int count1;
                try  {
                    URL pageUrl = new URL(args[0]);

                    // 讀入網頁(位元串流)
                    BufferedInputStream bis = new BufferedInputStream(pageUrl.openStream());
                    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("URL3.txt", false));
                    System.out.println("read1() running " );
                    while ((count1 = bis.read(chunk, 0, chunksize)) != -1) {
                        bos.write(chunk, 0, count1); // 寫入檔案
                    }
                    bos.close();
                    bis.close();

                  System.out.println("Done");
                 }catch (IOException e) {
                     e.printStackTrace();
              }



   }

}
