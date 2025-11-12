package main.FilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class Files_find_BiPredicate2 {
    public static void main(String... args) throws IOException {
        Path currentDirectory = Paths.get(".");
        BiPredicate<Path, BasicFileAttributes> javaDirecotryMatcher
                = (path,attributes) -> path.toString().contains("File") && attributes.isDirectory();
        Stream<Path> fileNamedDirecotries = Files.find(currentDirectory,5, javaDirecotryMatcher);
        fileNamedDirecotries.forEach(System.out::println);
    }
}
