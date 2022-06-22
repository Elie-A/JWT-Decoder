/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cme.neptune.jwtdecoder.utils.appUtils;

import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author elie.abdallah
 */
public class Utils {

    public void saveToFile(File file, String data) throws Exception {
        try (FileWriter fileWriter = new FileWriter(file.getAbsolutePath())) {
            fileWriter.write(data);
            fileWriter.flush();
            JOptionPane.showMessageDialog(null, "Save to " + file.getName());
        }
    }
}
