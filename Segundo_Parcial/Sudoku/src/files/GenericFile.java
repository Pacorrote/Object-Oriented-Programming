/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

/**
 *
 * @author Victor
 */
import files.exception.ModoAperturaIncorrectoException;
import java.io.File;

public class GenericFile {
    
    private File file;
    private Modo mode;
    
    public GenericFile(String file){
        this.file = new File(file);
    }
    
    protected void validateOperation(Modo modo) throws ModoAperturaIncorrectoException {
        if (getMode() != modo) {
            throw new ModoAperturaIncorrectoException();
        }
    }

    protected File getFile() {
        return file;
    }

    protected void setFile(File file) {
        this.file = file;
    }

    protected Modo getMode() {
        return mode;
    }

    protected void setMode(Modo mode) {
        this.mode = mode;
    }
}
