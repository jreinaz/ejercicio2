/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;

/**
 *
 * @author Estudiante
 */
public class Carro {
    
    private String placa;
    private String modelo;
    private String nSerie;
    private Rueda[] ruedas;
    private Chasis chasis;
    private Motor motor;
   

    public Carro(String placa, String modelo, String nSerie, Rueda[] ruedas,String material, String envergadura, Motor motor) {
        this.placa = placa;
        this.modelo = modelo;
        this.nSerie = nSerie;
        this.ruedas = new Rueda[4];
        this.chasis = new Chasis(material,envergadura);
        this.motor = motor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getnSerie() {
        return nSerie;
    }

    public void setnSerie(String nSerie) {
        this.nSerie = nSerie;
    }

    public Rueda[] getRuedas(){
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

}
