/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class test {
    public static void main(String[] args) {
        String expresion = "1+5-9*7";
        
        try {
            double resultado = evaluarExpresion(expresion);
            System.out.println("Resultado: " + resultado);
        } catch (ScriptException e) {
            System.out.println("Error al evaluar la expresión: " + e.getMessage());
        }
    }
    
    public static double evaluarExpresion(String expresion) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("Groovy");
        return (double) engine.eval(expresion);
    }
}