/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComponentesDeCasa;

/**
 *
 * @author luisi
 */
public class regadera {
    private String marca;
    private boolean abierta;
    private String material;
    private boolean aguaCaliente;
    private boolean aguaFria;

    public regadera() {
    }

    public regadera(String marca, boolean abierta, String material, boolean aguaCaliente, boolean aguaFria) {
        this.marca = marca;
        this.abierta = abierta;
        this.material = material;
        this.aguaCaliente = aguaCaliente;
        this.aguaFria = aguaFria;
    }

    public boolean isAguaFria() {
        return aguaFria;
    }

    public void setAguaFria(boolean aguaFria) {
        this.aguaFria = aguaFria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isAbierta() {
        return abierta;
    }

    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }
    
    public void abrirLlave (){
        System.out.println("Abriendo la regadera...");
    }
    
    public void cerrarLlave(){
        System.out.println("Cerrando, cuida el agua");
    }
    
}
