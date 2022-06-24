package ReadWriteFile;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadWriteFile {
    public void readData() {
        try {
            File f = new File("test.txt");
            FileInputStream fis = new FileInputStream(f);
            BufferedInputStream bis = new BufferedInputStream(fis);
            int i;
            while ((i = bis.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println("");
            fis.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    public void writeData(String str) {
        //chuyen chuoi byte
        byte[] b = str.getBytes();
        try {
            FileOutputStream fos = new FileOutputStream("test.txt");
            fos.write(b);
            fos.flush();
            fos.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ReadWriteFile d = new ReadWriteFile();
        d.readData();
        d.writeData("Hom nay hoc java.io");
    }
}
