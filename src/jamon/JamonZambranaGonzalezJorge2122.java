/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jamon;

/**
 *
 * @author Jorge Zambrana González
 */
public class JamonZambranaGonzalezJorge2122 {

    private String categoria;
    private double precio;
    private int mesesCuracion;
    private int stock;

    /* Constructor sin argumentos */
    public JamonZambranaGonzalezJorge2122() {
    }

    // Constructor con parámetro para iniciar todas las propiedades de la clase
    // jamon
    /**
     * Método para crear objetos de tipo Jamón, con una categoría, precio y
     * stock pasados como parámetros
     *
     * @param cat
     * @param precio
     * @param stock
     */
    public JamonZambranaGonzalezJorge2122(String cat, double precio, int stock) {
        this.categoria = cat;
        this.precio = precio;
        this.stock = stock;
    }
    // Método para asignar la categoría del jamón

    /**
     * Método para establecer una categoría al jamón
     * @param cat Categoría que se quiere establecer
     */
    public void asignarCategoria(String cat) {
        setCategoria(cat);
    }

    // Método que me devuelve la categoría del jamón
    /**
     * Método para devolver la categoría del jamón
     * @return La categoría del jamón
     */
    public String obtenerCategoria() {
        return getCategoria();
    }

    // Método que me devuelve el stock de jamones disponible en cada momento
    /**
     * Método para devolver el stock de jamones
     * @return El stock de jamones
     */
    public int obtenerStock() {
        return getStock();
    }

    /* Método para comprar jamones. Modifica el stock.
     * Este método va a ser probado con Junit
     */
    public void comprar(int cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede comprar un nº negativo de jamones");
        }
        setStock(getStock() + cantidad);
    }

    /**
     * Método para vender una cantidad concreta de jamones
     *
     * @param cantidad Cantidad de jamones que se quieren vender
     * @param paisZambranaGonzalezJorge2122 El jamón concreto que se quiere
     * vender
     * @throws Exception Lanza excepción si se manda una cantidad negativa, o no
     * hay suficiente stock
     */
    public void vender(int cantidad, String paisZambranaGonzalezJorge2122) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede vender una cantidad negativa de jamones");
        }
        if (obtenerStock() < cantidad) {
            throw new Exception("No  hay suficientes jamones para vender");
        }
        setStock(getStock() - cantidad);
    }

    /**
     * Método para obtener la categoría del jamón
     *
     * @return la categoría del jamón
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Método para establecer la categoría del jamón
     *
     * @param categoria La categoría del jamón
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Método para obtener el precio del jamón
     *
     * @return El precio del jamón
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método para establecer el precio del jamón
     *
     * @param precio El precio del jamón
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Método para obtener los meses de curación del jamón
     *
     * @return Los meses de curación
     */
    public int getMesesCuracion() {
        return mesesCuracion;
    }

    /**
     * Método para establecer los meses de curación del jamón
     *
     * @param mesesCuracion Los meses de curación
     */
    public void setMesesCuracion(int mesesCuracion) {
        this.mesesCuracion = mesesCuracion;
    }

    /**
     * Método para obtener el stock del jamón
     *
     * @return El stock del jamón
     */
    public int getStock() {
        return stock;
    }

    /**
     * Método para establecer el stock del jamón
     *
     * @param stock El stock del jamón
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
}
