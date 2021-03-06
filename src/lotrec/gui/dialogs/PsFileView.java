/*
 * XMLFileView.java
 *
 * Created on 26 octobre 2007, 15:05
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package lotrec.gui.dialogs;

import java.io.File;
import javax.swing.*;
import javax.swing.filechooser.*;
/**
 *
 * @author said
 */
public class PsFileView extends FileView{
    
    
    /** Creates a new instance of XMLFileView */
    public PsFileView() {
    }
 
    @Override
    public String getName(File f) {
        return null; //let the L&F FileView figure this out
    }
    
    @Override
    public String getDescription(File f) {
        return null; //let the L&F FileView figure this out
    }
    
    @Override
    public Boolean isTraversable(File f) {
        return null; //let the L&F FileView figure this out
    }
    
    @Override
    public String getTypeDescription(File f) {
        String extension = Utils.getExtension(f);
        String typeDescription = null;
        
        if (extension != null) {
            if (extension.equals(Utils.PS_EXTENSION)){
                typeDescription = Utils.PS_TYPE_DESC;
            }
        }
        return typeDescription;
    }
    
    @Override
    public Icon getIcon(File f) {
        String extension = Utils.getExtension(f);
        Icon icon = null;
        
        if (extension != null) {
            if (extension.equals(Utils.PS_EXTENSION)) {
                icon = Utils.PS_ICON;
            }
        }
        return icon;
    } 
}