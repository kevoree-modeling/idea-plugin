package org.kevoree.modeling.action;

import com.intellij.openapi.vfs.VirtualFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by duke on 11/18/14.
 */
public class VersionAnalyzer {

    public static String getKMFVersion(VirtualFile file) {
        try {
            String payload = new String(file.contentsToByteArray());
            String[] lines = payload.split("\n");
            for (int i = 0; i < lines.length; i++) {
                String line = lines[i];
                if (line.startsWith("//KMF_VERSION=")) {
                    String version = line.substring("//KMF_VERSION=".length());
                    return version.trim();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "RELEASE";
    }

    public static String getVersion(File file) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            String ls = System.getProperty("line.separator");
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("//VERSION=")) {
                    String version = line.substring("//VERSION=".length());
                    return version.trim();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "1.0.0-SNAPSHOT";
    }

}
