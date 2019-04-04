/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author Victor
 */
import files.GenericFile;
import files.Modo;
import files.exception.ModoAperturaIncorrectoException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author karimnot
 */
public class TextFile extends GenericFile {

    public static final Integer EOL = 10;
    public static final Integer SPACE = 32;

    private FileWriter writer;
    private FileReader reader;

    public TextFile(String filename, Modo modo) throws IOException, IOException, FileNotFoundException, ModoAperturaIncorrectoException {
        super(filename);
        super.setMode(modo);
        openFile(modo);
    }

    public void changeMode(Modo modo) throws IOException, IOException, ModoAperturaIncorrectoException {
        if (getMode() != modo) {
            switch (getMode()) {
                case READ:
                    reader.close();
                    break;
                case REWRITE:
                case APPEND:
                    writer.close();
                default:
                    throw new ModoAperturaIncorrectoException();
            }
            openFile(modo);
            setMode(modo);
        }
    }

    public void close() throws IOException {
        if (writer != null) {
            writer.close();
        }
        if (reader != null) {
            reader.close();
        }
    }

    private void openFile(Modo modo) throws FileNotFoundException, IOException, ModoAperturaIncorrectoException {
        switch (modo) {
            case READ:
                reader = new FileReader(getFile());
                break;
            case REWRITE:
                writer = new FileWriter(getFile());
                break;
            case APPEND:
                writer = new FileWriter(getFile(), true);
                break;
            default:
                throw new ModoAperturaIncorrectoException();
        }
    }

    public String ReadLn() throws IOException, ModoAperturaIncorrectoException {
        super.validateOperation(Modo.READ);
        StringBuilder salida = new StringBuilder();
        int ascii = reader.read();
        while ((ascii != -1) && (ascii != EOL)) {
            salida.append((char) ascii);
            ascii = reader.read();
        }
        if (ascii == -1) {
            return null;
        }
        return salida.toString();
    }

    public String readWord() throws IOException, ModoAperturaIncorrectoException {
        super.validateOperation(Modo.READ);
        StringBuilder salida = new StringBuilder();
        int ascii = 0;
        do {
            ascii = reader.read();
            while ((ascii != -1) && (ascii != EOL) && (ascii != SPACE)) {
                salida.append((char) ascii);
                ascii = reader.read();
            }
        } while ((salida.length() == 0) && ((ascii != -1)));
        if (ascii == -1) {
            return null;
        }
        return salida.toString();
    }

    public Character readChar() throws IOException, ModoAperturaIncorrectoException {
        super.validateOperation(Modo.READ);
        int ascii = reader.read();
        return ascii == -1 ? null : new Character((char) ascii);
    }

    private void write(String text, String formato) throws IOException, ModoAperturaIncorrectoException {
        if (getMode() == Modo.APPEND) {
            writer.append(String.format(formato, text));
        } else if (getMode() == Modo.REWRITE) {
            writer.write(String.format(formato, text));
        } else {
            throw new ModoAperturaIncorrectoException();
        }
    }

    public void writeLn(String text) throws IOException, ModoAperturaIncorrectoException {
        write(text, "%s\n");
    }

    public void write(String text) throws IOException, ModoAperturaIncorrectoException {
        write(text, "%s");
    }

    public void write(char character) throws IOException, ModoAperturaIncorrectoException {
        write(String.valueOf(character), "%s");
    }

    @Override
    public void finalize() throws IOException {
        close();
    }

}
