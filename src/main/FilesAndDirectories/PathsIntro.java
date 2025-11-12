package main.FilesAndDirectories;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsIntro {
    public static void main(String... args){
        //Path path = Paths.get("/Users/vikaskullagalla/IdeaProjects/Java-Programming-New/src/main.FilesAndDirectories/PathsIntro.java");
        Path currentDirectory = Paths.get(".");
        System.out.println("Current Directory: " + currentDirectory);
    }
}
