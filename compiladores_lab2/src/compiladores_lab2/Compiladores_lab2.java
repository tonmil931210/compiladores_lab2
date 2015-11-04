/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladores_lab2;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author dell
 */
public class Compiladores_lab2 {

    /**
     * @param args the command line arguments
     */
    
    public static void fileChooser(){
        JFileChooser fileIn = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TXT File","txt");
        fileIn.setFileFilter(filter);
        int returnVal = fileIn.showOpenDialog(fileIn);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            File fileGrammar = fileIn.getSelectedFile();
        }else{
            System.out.println("No escogio ningun archivo"); 
        }
            
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        fileChooser();
    }
    
    
}
