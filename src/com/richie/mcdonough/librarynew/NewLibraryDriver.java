package com.richie.mcdonough.librarynew;

import java.io.*;
import java.util.List;

public class NewLibraryDriver {
    public static void main(String[] args) throws Exception {
        NewLibrary library = new NewLibrary("Richie's Library");
        library.addBooks(new NewBook("Wrecking Ball", "Finn"));
        library.addBooks(new NewBook("Wedding 401", "Roise"));
        library.addBooks(new NewBook("Physios Suck", "Andy"));

        writeToFile(library.getBooks());
        readFromFile();

        serialize(library.getBooks());
        deserialize();
    }

    public static void serialize(List<NewBook> list) throws IOException {
        FileOutputStream fileOut = new FileOutputStream("testSer.txt");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        for (NewBook book: list) {
            out.writeObject(book);
        }
        out.close();
        fileOut.close();
    }

    public static void deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream("testSer.txt");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        NewBook book;
        while ((book = (NewBook) in.readObject()) != null) {
            System.out.println(book);
        }
        in.close();
        fileIn.close();
    }

    public static void writeToFile(List<NewBook> list) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));
        for (NewBook book: list) {
            writer.write(book.getTitle() + " by " + book.getAuthor());
            writer.newLine();
        }
        writer.close();
    }

    public static void readFromFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
