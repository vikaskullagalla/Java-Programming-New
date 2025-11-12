package main.FilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Files_walk_WithPredicateFilter {
    public static void main(String... args) throws IOException {
        Path currentDirectory = Paths.get(".");
        Predicate<? super Path> predicate = (path) -> path.toString().endsWith(".java");
        Stream<Path> javaFiles = Files.walk(currentDirectory,3).filter(predicate);
        javaFiles.forEach(System.out::println);

    }
}
