package main.FilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Files_readAllLines {
    public static void main(String[] args) throws IOException {
        Path filePathToRead = Paths.get("src/main/resources/data.txt");
        List<String> lines = Files.readAllLines(filePathToRead);
        lines.forEach(System.out::println);
    }
}
