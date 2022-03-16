/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jamon;

/**
 *
 * @author Jorge Zambrana González
 */
public class Main {
    /**
     * Método main
     * @param args 
     */
    public static void main(String[] args) {
        JamonZambranaGonzalezJorge2122 miJamonZambranaGonzalezJorge2122;
        int stockActual;
        
        miJamonZambranaGonzalezJorge2122 = new JamonZambranaGonzalezJorge2122("5Jotas",580,100);
        vendeJamZambranaGonzalezJorge2122(miJamonZambranaGonzalezJorge2122);
        
        compraJamZambranaGonzalezJorge2122(miJamonZambranaGonzalezJorge2122);
        stockActual = miJamonZambranaGonzalezJorge2122.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }
    /**
     * Método para comprar jamones
     * @param miJamonZambranaGonzalezJorge2122 Tipo de jamón que se quiere comprar
     */
    public static void compraJamZambranaGonzalezJorge2122(JamonZambranaGonzalezJorge2122 miJamonZambranaGonzalezJorge2122) {
        try
        {
            System.out.println("Compra de Jamones");
            miJamonZambranaGonzalezJorge2122.comprar(50);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar " + e);
        }
    }
    /**
     * Método para vender jamones
     * @param miJamonZambranaGonzalezJorge2122 Tipo de jamón que se quiere vender
     */
    public static void vendeJamZambranaGonzalezJorge2122(JamonZambranaGonzalezJorge2122 miJamonZambranaGonzalezJorge2122) {
        try
        {
            System.out.println("Venta de Jamones");
            miJamonZambranaGonzalezJorge2122.vender(80, "Espana");
        } catch (Exception e)
        {
            System.out.print("Fallo al vender " + e);
        }
    }
}
