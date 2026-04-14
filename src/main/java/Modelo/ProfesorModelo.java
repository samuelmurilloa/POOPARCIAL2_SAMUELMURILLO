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

    super(nombre, direccion, telefono, fechaNacimiento);//el super hace que se envien los datos al constrcutor de persona
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

//metodo para calcular salario
public double calcularSalario(){
    return salarioHoras * horasDictadas;
}
public double calcularPrepClase(){
    return calcularSalario() * 0.3;//se calcula el 30% del salario base, que se le suma al final del mes por preparar las clases
}
public double salarioTotal(){
    return calcularSalario() + calcularPrepClase(); 
}
public double calcularPrestaciones(){
    return salarioTotal() * 0.19;
}

@Override 
public String toString(){
    return super.toString() +
            "\nCedula: " + cedula +
            "\nArea: " + area +
            "\nSalario base: " + calcularSalario() +
            "\nPreparacion Clase: " + calcularPrepClase() +
            "\nSalario Total: " + salarioTotal() +
            "\nPrestaciones: " + calcularPrestaciones();
}
}