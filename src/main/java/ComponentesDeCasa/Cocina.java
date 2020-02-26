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
public class Cocina {
    private String electrodomesticos;
    private String mueblesDeCocina;
    private String trastes;

    public Cocina() {
    }

    public Cocina(String electrodomesticos, String mueblesDeCocina, String trastes) {
        this.electrodomesticos = electrodomesticos;
        this.mueblesDeCocina = mueblesDeCocina;
        this.trastes = trastes;
    }

    public String getTrastes() {
        return trastes;
    }

    public void setTrastes(String trastes) {
        this.trastes = trastes;
    }

    public String getElectrodomesticos() {
        return electrodomesticos;
    }

    public void setElectrodomesticos(String electrodomesticos) {
        this.electrodomesticos = electrodomesticos;
    }

    public String getMueblesDeCocina() {
        return mueblesDeCocina;
    }

    public void setMueblesDeCocina(String mueblesDeCocina) {
        this.mueblesDeCocina = mueblesDeCocina;
    }
    
    public void cocinando(){
        System.out.println("Cocinando");
    }
    
    public void lavandoTrastes(){
        System.out.println("Lavando");
    }
    
    public void comiendo(){
        System.out.println("Comiendo ");
    }
}
