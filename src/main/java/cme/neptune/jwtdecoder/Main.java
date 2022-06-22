/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cme.neptune.jwtdecoder;

import cme.neptune.jwtdecoder.globalVars.GlobalVars;
import cme.neptune.jwtdecoder.view.GUI;
import java.awt.Cursor;
import javax.swing.ImageIcon;

/**
 *
 * @author elie.abdallah
 */
public class Main {

    public static void main(String[] args) throws Exception{
        GUI gui = new GUI();
        gui.setTitle("JWT Decoder");
        gui.setSize(900, 650);
        gui.setResizable(false);
        gui.setLocationRelativeTo(null);
        gui.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ImageIcon img = new ImageIcon(GlobalVars.imageIconPath);
        gui.setIconImage(img.getImage());
        gui.setVisible(true);
    }
}
