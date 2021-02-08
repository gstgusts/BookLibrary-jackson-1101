package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BookLibraryTests {
    @Test
    public void save_books() {
        var bl = new BookLibrary();

        var author = new Author("Jānis", "Rainis", "janis");

        var book1 = new Book("Lauztās priedes", "1241234", Arrays.asList(author));

        bl.save(Arrays.asList(book1));
    }

    @Test
    public void load_books() {
        var bl = new BookLibrary();
        var result = bl.load();
        Assert.assertTrue(result.size() > 0);
    }

    @Test
    public void save_books_xml() {
        var bl = new BookLibraryXml();

        var author = new Author("Jānis", "Rainis", "janis");
        var author2 = new Author("Reinis", "Kļava", "rk");

        var book1 = new Book("Lauztās priedes", "1241234", Arrays.asList(author));
        var book2 = new Book("Harry Potter", "345634", Arrays.asList(author, author2));

        bl.save(Arrays.asList(book1, book2));
    }

    @Test
    public void load_books_xml() {
        var bl = new BookLibraryXml();
        var result = bl.load();
        Assert.assertTrue(result.size() > 0);
    }
}
