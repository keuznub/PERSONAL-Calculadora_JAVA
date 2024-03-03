/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
/**
 *
 * @author breix
 */
public class CalcularString {
    

    
    public static double calculo(String expresion){
         
        try {
            double resultado = evaluarExpresion(expresion);
            return resultado;
        } catch (ScriptException e) {
            System.out.println("Error al evaluar la expresión: " + e.getMessage());
        }
        return -1;
        
    }
    
    
    
    public static double evaluarExpresion(String expresion) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        return (double) engine.eval(expresion);
    }
    
    
}
