package datastructure.practice.impl;

import java.io.*;

public class ReadFileLines {
    public static void main(String[] args) throws IOException {
        String logFile = "C:\\development\\EcodeService\\input\\VZW_ECODE-WINBACK2HA20180711.txt";
        long start = System.nanoTime();
        int res = countLinesNew(logFile);
        long end = System.nanoTime();
        System.out.println(end - start);
        int e = (res+999)/1000 * 1000;
        System.out.println(res+"->"+e);

    }

    public static int countLinesNew(String filename) throws IOException {
        InputStream is = new BufferedInputStream(new FileInputStream(filename));


        try {
            byte[] c = new byte[1024];

            int readChars = is.read(c);

            if (readChars == -1) {
                // bail out if nothing to read
                return 0;
            }

            // make it easy for the optimizer to tune this loop
            int count = 0;
            while (readChars == 1024) {
                for (int i=0; i<1024;) {
                    if (c[i++] == '\n') {
                        ++count;
                    }
                }
                readChars = is.read(c);
            }

            // count remaining characters
            while (readChars != -1) {
//                System.out.println(readChars);
                for (int i=0; i<readChars; ++i) {
                    if (c[i] == '\n') {
                        ++count;
                    }
                }
                readChars = is.read(c);
            }

            return count == 0 ? 1 : count;
        } finally {
            is.close();
        }
    }

}
