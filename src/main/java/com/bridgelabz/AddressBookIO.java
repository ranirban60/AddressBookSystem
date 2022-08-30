package com.bridgelabz;

import java.io.*;

public class AddressBookIO {
        public static File address_book_file = new File("AddressBook.txt");

        public static void createFile() {
            try {
                //createNewFile() returns true if the named file does not exist and was successfully created; false if the named file already exists
                address_book_file.createNewFile();
                System.out.println("\nEmpty File is created successfully.");
            } catch (IOException e) {
                System.out.println("" + e);
            }
        }
        /**
        * @ Params file – the file to be opened for writing.
         * */
        public static void add_details_to_file(String input) {
            try {
                FileOutputStream fOut = new FileOutputStream(address_book_file);
                //getBytes() returns the resultant byte array
                byte[] b = input.getBytes();
                //write(b) writes b.length bytes from the specified byte array to this file output stream
                fOut.write(b);
                //close() closes this file output stream and releases any system resources associated with this stream.
                fOut.close();
                System.out.println("\nContact added successfully.");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        /**
        * @Params in a reader
        */
        public static void read_details_to_file() {
            try {
                //getAbsolutePath() returns the absolute pathname string denoting the same file or directory as this abstract pathname
                String file = address_book_file.getAbsolutePath();
                // BufferedReader creates a buffering character-input stream that uses a default-sized input buffer.
                //Params: in – A Reader
                //@Params: fileName – the name of the file to read
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line = null;
                while ((line = reader.readLine()) != null) {//readLine() reads a line of text
                    System.out.println("\n" + line);
                }
            } catch (IOException io) {
                System.err.println(io);
            }
        }

    }
