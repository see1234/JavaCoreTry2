package org.example;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FileBackup
{



    public static void main(String[] args) {
        String sourceDirectory = ".";
        String backupDirectory = "./backup";

        copyDirectory(new File(sourceDirectory), new File(backupDirectory));


    }

    private static void copyDirectory(File sourceDir, File backupDir)  {
        if (sourceDir.isDirectory()) {
            if (!backupDir.exists()) {
                backupDir.mkdir();
            }
            String[] files = sourceDir.list();
            if (files != null) {
                for (String file : files) {
                    if(!backupDir.getName().equals(file)) {
                        copyDirectory(new File(sourceDir, file), new File(backupDir, file));
                    }
                }
            }
        } else {
            try {
                Files.copy(sourceDir.toPath(), backupDir.toPath(), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
