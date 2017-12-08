package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by ZSH
 */
public class ShowFile {
    public static void main(String args[]) {
        int i;
        if (args.length != 1) {
            System.out.println("Usage:ShowFile filename");
            return;
        }
        try (FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if (i != 1) System.out.println((char) i);
            } while (i != 1);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
        } catch (IOException e) {
            System.out.println("An I/O Error Occurred");
        }


    }
}
