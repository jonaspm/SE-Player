/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JButton;

/**
 *
 * @author jonaspm
 */
public class indexedButton extends JButton {

    public indexedButton(String text, int index) {
        setText(text);
        this.index = index;
    }
    private int index;
    
    public int getIndex() {
        return this.index;
    }
    
}
