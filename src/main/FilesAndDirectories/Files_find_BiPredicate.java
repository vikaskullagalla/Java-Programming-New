package main.FilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;

public class Files_find_BiPredicate {
    public static void main(String... args) throws IOException {
        Path currentDirectroy = Paths.get(".");
        BiPredicate<Path, BasicFileAttributes> javaMatcher = (path,attribute) -> String.valueOf(path).contains("File");
        Files.find(currentDirectroy,3,javaMatcher).forEach(System.out::println);
    }
}
