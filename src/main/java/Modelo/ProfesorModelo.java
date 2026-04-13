/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author samue
 */
public class ProfesorModelo extends PersonaModelo {//profesor modelo, hereda de personaModelo. PersonaModelo(padre) -----profesorModelo(hija)
  //atributos
    private String cedula;
    private String area;
    private double salarioHoras;
    private int horasDictadas;
    


//constructor
public ProfesorModelo(String nombre, String telefono, String direccion, String fechaNacimiento, String cedula, String area, double salarioHoras, int horasDictadas){

    super(nombre, direccion, telefono, fechaNacimiento);
    this.cedula = cedula;
    this.area = area;
    this.horasDictadas = horasDictadas;
    this.salarioHoras = salarioHoras;
    
}

//getters
public String getCedula(){
    return cedula;
}
public String getArea(){
    return area;
}
public double getSalarioHoras(){
    return salarioHoras;
}
public int getHorasDictadas(){
    return horasDictadas;
}

//setters
public void setCedula(){
    this.cedula = cedula;
}
public void setArea(){
    this.area = area;
}
public void setSalarioHoras(){
    this.salarioHoras = salarioHoras;
}
public void setHorasDictadas(){
    this.horasDictadas = horasDictadas;
}


}