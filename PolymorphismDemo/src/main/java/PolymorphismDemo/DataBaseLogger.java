/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolymorphismDemo;

/**
 *
 * @author sb
 */
public class DataBaseLogger extends BaseLogger {

    public void log(String message) {
        System.out.println("Logged to Database : " + message);
    }
}
