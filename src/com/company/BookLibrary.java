package com.company;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookLibrary {

    public static final String FILE_PATH = "src/com/company/books.json";

    public List<Book> load() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(new File(FILE_PATH), new TypeReference<>(){});
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public void save(List<Book> books) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writerWithDefaultPrettyPrinter()
                    .writeValue(new File(FILE_PATH), books);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
