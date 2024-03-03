/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.awt.Component;
import java.awt.Container;
import java.awt.Font;

/**
 *
 * @author breix
 */
public class ChangeFonts {
    
    public static void changeFont ( Component component, Font font ){
        component.setFont ( font );
        if ( component instanceof Container ){
            for ( Component child : ( ( Container ) component ).getComponents () )
            {
                changeFont ( child, font );
            }
        } 
    
    }
}
