package ku.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * Class contains utilities for file io.
 * @author Pawat Nakpiphatkul
 */
public class FileUtil {
    public static void copy(InputStream in,OutputStream out) {
        copy(in,out,1);
    }
    public static void copy(InputStream in,OutputStream out,int blocksize) {
        try {
            byte[] buffer = new byte[blocksize];
            while(in.read(buffer) >= 0) {
                out.write(buffer);
            }
            in.close();
            out.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e.getMessage(),e);
        }
    }
    public static void bcopy(InputStream in,OutputStream out) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            PrintWriter writer = new PrintWriter(out);
            String buffer = "";
            while((buffer = reader.readLine()) != null) {
                writer.println(buffer);
            }
            reader.close();
            writer.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e.getMessage(),e);
        }
    }
}
