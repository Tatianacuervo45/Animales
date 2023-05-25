
package com.mycompany.trabajoanimales;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class mainTrabajoAnimales {
   
     public static void main(String[] args) {
         
         ArrayList<TrabajoAnimales> listaMascotas = new ArrayList<>();
         
       TrabajoAnimales p = new TrabajoAnimales();
     String menu = "Ingreso Mascotas\n\n";
		menu += "1) Ingresar datos\n";
		menu += "2) Buscar por nombre\n\n";
		int opt;

		do {
			opt = Integer.parseInt(JOptionPane.showInputDialog(menu));

			TrabajoAnimales mas = new TrabajoAnimales();
			mas.menu(opt);
			listaMascotas.add(mas);

		} while (opt != 2);

		String validar = JOptionPane.showInputDialog("ingrese 'si' para seguir, de lo contrario 'no' ");
		if (validar.equalsIgnoreCase("si")) {
			for (TrabajoAnimales mascota : listaMascotas) {
				System.out.println(
						"Nombre: " + mascota.nombreMascota +
                                                    "\n Especie: " + mascota.especieMascota +
                                                    "\n Edad: " + mascota.edadMascota + " años");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Operación finalizada");
		}
		String validar2 = JOptionPane.showInputDialog("ingrese  SI  buscar y NO para salir");

		if (validar2.equalsIgnoreCase("si")) {
		    String nombreMasc = JOptionPane.showInputDialog("Nombre");
		    for (TrabajoAnimales masc : listaMascotas) {
		        masc.buscarmascota(nombreMasc);
		        System.out.println("entro");
		    }
		} else {
		    JOptionPane.showMessageDialog(null, "Operación finalizada");
		}


	}
              
              
    }

