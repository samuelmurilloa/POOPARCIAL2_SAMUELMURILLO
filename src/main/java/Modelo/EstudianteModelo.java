/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author samue
 */
public class EstudianteModelo extends PersonaModelo {//estudiante modelo, hereda de persona modelo. estudiante modelo es hija de persona modelo
    //atributos
    private String grado;


//constructor 
public EstudianteModelo (String nombre, String telefono, String direccion, String fechaNacimiento, String grado){

    super(nombre, direccion, telefono, fechaNacimiento);//aqui en el super no se llama la cedula porque como son estudiantes no tienen
    this.grado = grado;
}
//getters
public String getGrado(){
    return grado;
}
//setters
public void setGrado(){
    this.grado = grado;
}

@Override
public String toString(){
    return super.toString() +
            "\nGrado: " + grado;
}

}