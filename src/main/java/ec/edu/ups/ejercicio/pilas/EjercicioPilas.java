/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.ejercicio.pilas;

import static ec.edu.ups.ejercicio.pilas.AgrupacionSignos.AgrupacionSignos.validarGrupoSignos;


/**
 *
 * @author mateo
 */
public class EjercicioPilas {

    public static void main(String[] args) {
        String input = "{[()()]}";
        boolean isValid = validarGrupoSignos(input);

        if (isValid) {
            System.out.println("The grouping signs are valid.");
        } else {
            System.out.println("The grouping signs are not valid.");
        }
    }
}
