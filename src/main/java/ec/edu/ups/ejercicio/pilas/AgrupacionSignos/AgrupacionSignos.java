/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejercicio.pilas.AgrupacionSignos;

import java.util.Stack;

/**
 *
 * @author mateo
 */
public class AgrupacionSignos {
    public static boolean validarGrupoSignos(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);

            if (symbol == '(' || symbol == '{' || symbol == '[') {
                stack.push(symbol);
            } else if (symbol == ')' || symbol == '}' || symbol == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char topSymbol = stack.pop();

                if ((symbol == ')' && topSymbol != '(') ||
                        (symbol == '}' && topSymbol != '{') ||
                        (symbol == ']' && topSymbol != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
