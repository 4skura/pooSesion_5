/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseCasa;

import ComponentesDeCasa.Cocina;
import ComponentesDeCasa.Puerta;
import ComponentesDeCasa.regadera;

/**
 *
 * @author luisi
 */
public class Casa {
    private String propietario;
    private int avaluo;
    private String color;
    private String colorPuerta;
    private Puerta material;
    private Cocina trastes;
    private regadera marca;

    public Casa() {
    }

    public Casa(String propietario, int avaluo, String color, String colorPuerta, Puerta material, Cocina trastes, regadera marca) {
        this.propietario = propietario;
        this.avaluo = avaluo;
        this.color = color;
        this.colorPuerta = colorPuerta;
        this.material = material;
        this.trastes = trastes;
        this.marca = marca;
    }

    

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getAvaluo() {
        return avaluo;
    }

    public void setAvaluo(int avaluo) {
        this.avaluo = avaluo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColorPuerta() {
        return colorPuerta;
    }

    public void setColorPuerta(String colorPuerta) {
        this.colorPuerta = colorPuerta;
    }

    public Puerta getMaterial() {
        return material;
    }

    public void setMaterial(Puerta material) {
        this.material = material;
    }

    public Cocina getTrastes() {
        return trastes;
    }

    public void setTrastes(Cocina trastes) {
        this.trastes = trastes;
    }

    public regadera getMarca() {
        return marca;
    }

    public void setMarca(regadera marca) {
        this.marca = marca;
    }
    
    public void alojarPersonas(){
        System.out.println("Esta casa esta siendo habitada");
    }
    
        
    
}
