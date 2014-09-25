/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rw;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author tedr
 */
public class rwWsFileFilter implements FilenameFilter{

    private String ext = "rws";

    public boolean accept(File dir, String name){
        return name.endsWith(ext);
    }

}
