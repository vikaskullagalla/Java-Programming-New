package main.FilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Files_lines {
    public static void main(String[] args) throws IOException {
        Path filePathToRead = Paths.get("src/main/resources/data.txt");
        Files.lines(filePathToRead).forEach(System.out::println);
    }
}
