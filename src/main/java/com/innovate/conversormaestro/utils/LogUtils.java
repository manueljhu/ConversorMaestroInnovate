package com.innovate.conversormaestro.utils;

import java.io.File;
import java.io.IOException;

public class LogUtils {

    public void GenerateLogFile(String logPath) {
        try {
            File file = new File(logPath);
            if (!file.exists()) {
                file.createNewFile();
            } else {
                file.delete();
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo de log: " + e.getMessage());
        }
    }

    public void WriteLog(String message, boolean newError) {
        String logPath = "C:\\conversorlog\\log.txt";

        try {
            if (newError) {
                GenerateLogFile(logPath);
            }
            File file = new File(logPath);
            java.io.FileWriter fileWriter = new java.io.FileWriter(file, true);
            java.io.PrintWriter printWriter = new java.io.PrintWriter(fileWriter);
            printWriter.println(message);
            printWriter.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo de log: " + e.getMessage());
        }
    }
}
