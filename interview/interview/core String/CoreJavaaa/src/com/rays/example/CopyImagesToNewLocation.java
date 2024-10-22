package com.rays.example;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Arrays;

public class CopyImagesToNewLocation {

    // List of common image file extensions
    private static final List<String> IMAGE_EXTENSIONS = Arrays.asList(".jpg", ".jpeg", ".png", ".gif", ".bmp", ".tiff");

    public static void main(String[] args) {
        Path startPath = Paths.get("E:\\"); // Source directory (D: drive)
        Path destinationDir = Paths.get("D:\\Images"); // Destination directory for saving images

        try {
            // Create destination directory if it doesn't exist
            if (!Files.exists(destinationDir)) {
                Files.createDirectories(destinationDir);
            }

            Files.walkFileTree(startPath, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    String fileName = file.getFileName().toString().toLowerCase();
                    
                    // Check if the file has an image extension
                    if (IMAGE_EXTENSIONS.stream().anyMatch(fileName::endsWith)) {
                        // Construct the new file path in the destination directory, with .jpg extension
                        String newFileName = file.getFileName().toString().replaceAll("\\.[^.]+$", "") + ".jpg";
                        Path destinationFile = destinationDir.resolve(newFileName);

                        // Copy the image to the destination directory with the new .jpg extension
                        Files.copy(file, destinationFile, StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("Copied: " + file.toAbsolutePath() + " to " + destinationFile.toAbsolutePath());
                    }
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                    // Handle errors accessing files (e.g., permissions issues)
                    System.err.println("Failed to access file: " + file.toAbsolutePath() + " - " + exc.getMessage());
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
