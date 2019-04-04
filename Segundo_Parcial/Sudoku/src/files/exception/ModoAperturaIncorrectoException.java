/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files.exception;

/**
 *
 * @author Victor
 */
public class ModoAperturaIncorrectoException extends Exception {

    /**
     * Creates a new instance of <code>ModoAperturaIncorrectoException</code>
     * without detail message.
     */
    public ModoAperturaIncorrectoException() {
    }

    /**
     * Constructs an instance of <code>ModoAperturaIncorrectoException</code>
     * with the specified detail message.
     *
     * @param msg the detail message.
     */
    public ModoAperturaIncorrectoException(String msg) {
        super(msg);
    }
}
