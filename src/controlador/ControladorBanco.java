/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDate;

import modelo.*;


public class ControladorBanco {
    
    /*
    *Nombre del metrodo: Crear cliente
    *Parametros recibidos: Documento, Nombre, Correo, Fecha Nacimiento, Estatura, tipo
    *Tipo de retorno: Cliente
    *Descripcion: Crear un nuevo cliente
    */
    public Cliente crearCliente(String tipo, String documento, String nombre, String correo, String telefono, int diaNacimiento,int mesNacimiento, int anioNacimiento, double estatura){
        
        Cliente cliente = null;
        
        try {
            LocalDate fechaNacimiento = LocalDate.of(diaNacimiento, mesNacimiento, anioNacimiento);
            
            cliente = new Cliente(tipo, documento, nombre, correo, telefono, LocalDate.MIN, estatura);
            
            return cliente;
       
        }catch (Exception ex) {
            System.out.println("error al crear cliente; " + ex.getMessage());
            return null;
        }
 
        
        
    }
    
}
