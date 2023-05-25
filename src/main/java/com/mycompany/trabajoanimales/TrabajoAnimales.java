
package com.mycompany.trabajoanimales;

import javax.swing.JOptionPane;

public class TrabajoAnimales {

    int idMascota;
    int edadMascota;
    String nombreMascota;
    String especieMascota;
    
    public TrabajoAnimales(){
    nombreMascota ="perris";
    especieMascota = "default";
    edadMascota = 0;
    
    }
    
     public void ingresarDatos(){
         this.nombreMascota = JOptionPane.showInputDialog("ingrese nombre animal");
         this.especieMascota = JOptionPane.showInputDialog("ingrese especie animal");
         this.edadMascota = Integer.parseInt(JOptionPane.showInputDialog("ingrese edad animal"));
    }
    
    public void procesos(int opt){
       
	    	switch (opt) {
			case 1:
				ingresarDatos();
				break;
			default:
				break;
			}
    }
    
     public void imprimirDatos(){
        
        String mensaje = "Nombre: " + nombreMascota + "\n";
               mensaje = "especie: " + especieMascota + "\n";
               mensaje = "edad: " + edadMascota + "\n";
    }

     public void buscarmascota(String nombreMas){
        
        if(nombreMascota.equalsIgnoreCase(nombreMas)){
            System.out.println("Nombre: " + this.nombreMascota + "especie : " +
                    this.especieMascota + "\n" + "edad: " + "\n" + this.edadMascota);
            hacerSonido(); 
        }else {
            JOptionPane.showMessageDialog(null, "pailas");
            
        }
    }
    
    public void mascotas(String nombreMascota, String especieMascota, int edadMascota){
         this.nombreMascota = nombreMascota;
         this.especieMascota = especieMascota;
         this.edadMascota = edadMascota;
    }
    
    public void hacerSonido() { 
        if (especieMascota.equalsIgnoreCase("perro")) {
            System.out.println("guaw guaw"); 
        } else if (especieMascota.equalsIgnoreCase("gato")){
            System.out.println("miau miau"); 
        } else if (especieMascota.equalsIgnoreCase("pato")) {
            System.out.println("¡Cua Cua!");
        } else if (especieMascota.equalsIgnoreCase("vaca")) { 
            System.out.println("¡muu muu!"); 
        } else if (especieMascota.equalsIgnoreCase("pollo")) {
            System.out.println("¡pio pio!"); 
        } else { 
            System.out.println("Mascota no identificada"); } 
    }

    void menu(int opt) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
} 