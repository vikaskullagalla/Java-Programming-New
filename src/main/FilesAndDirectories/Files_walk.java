package main.FilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Files_walk {
    public static void main(String[] args) throws IOException {
        Path currentDirectory = Paths.get(".");
        Files.walk(currentDirectory,2).forEach(System.out::println);
        //walk is a method that returns a stream of paths - RECURSIVE
    }
}
