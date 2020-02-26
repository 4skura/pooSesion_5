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
public class Puerta {
    private String material;
    private int altura;
    private int ancho;
    private String materialPomo;

    public Puerta() {
    }

    public Puerta(String material, int altura, int ancho, String materialPomo) {
        this.material = material;
        this.altura = altura;
        this.ancho = ancho;
        this.materialPomo = materialPomo;
    }

    public String getMaterialPomo() {
        return materialPomo;
    }

    public void setMaterialPomo(String materialPomo) {
        this.materialPomo = materialPomo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    public void abrirPuerta(){
        System.out.println("Bienvenido");
    }
    
    public void cerrarPuerta(){
        System.out.println("Cerrando la puerta. . .");
    }
    
}
