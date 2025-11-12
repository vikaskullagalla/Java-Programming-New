package main.FilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Files_write {
    public static void main(String[] args) throws IOException {
        Path filePathToWrite = Paths.get("src/main/resources/data_write.txt");
        Files.write(filePathToWrite, List.of("Hello", "World", "Vikas", ":)","Welcome!"));
    }
}

