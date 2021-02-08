package com.company;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class BookLibraryXml {

    public static final String FILE_PATH = "src/com/company/books.xml";

    public List<Book> load() {
        var mapper = new XmlMapper();
        try {
            return mapper.readValue(new File(FILE_PATH), new TypeReference<>(){});
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public void save(List<Book> books) {
        var mapper = new XmlMapper();
        try {
            mapper.writerWithDefaultPrettyPrinter()
                    .writeValue(new File(FILE_PATH), books);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
