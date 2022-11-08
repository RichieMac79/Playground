package com.richie.mcdonough.library;

import java.io.*;
import java.util.List;

public class LibraryDriver {
    public static void main(String[] args) throws Exception {
        Library library = new Library("Richie's Library");
        library.addBooks(new Book("Wrecking Ball", "Finn"));
        library.addBooks(new Book("Wedding 401", "Roise"));
        library.addBooks(new Book("Physios Suck", "Andy"));

        writeToFile(library.getBooks());
        readFromFile();
    }

    public static void writeToFile(List<Book> list) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));
        for (Book book: list) {
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
