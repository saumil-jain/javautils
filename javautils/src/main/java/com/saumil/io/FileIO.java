package com.saumil.io;

import java.io.*;

public class FileIO {

    /**
     * Method to copy a files contents into another file by reading the bytes one by one.
     *
     * @param inputFile The {@link File} to copy from.
     * @param outputFile The {@link File} to copy to.
     * @throws IOException
     */
    public static void copyFileUsingByteStream(File inputFile, File outputFile) throws IOException {

        try (InputStream inputStream = new FileInputStream(inputFile);
             OutputStream outputStream = new FileOutputStream(outputFile)) {

            int byteRead;
            while ((byteRead = inputStream.read()) != -1) {
                outputStream.write(byteRead);
            }
        }

    }

}
