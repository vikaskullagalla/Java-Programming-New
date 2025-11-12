package main.FilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Files_list {
    public static void main(String... args) throws IOException {
        Path currentDirectroy = Paths.get(".");
        Stream<Path> filesAndDirectories = Files.list(currentDirectroy);
        filesAndDirectories.forEach(System.out::println);

        //list is a method that returns a stream of paths - NON RECURSIVE

    }
}
