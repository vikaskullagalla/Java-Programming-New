package main.FilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Files_find_BiPredicate1 {
    public static void main(String... args) throws IOException {
        Path currentDirectory = Paths.get(".");
        Files.find(currentDirectory,2, (path,attributes) -> attributes.isDirectory())
        .forEach(System.out::println);
    }
}
