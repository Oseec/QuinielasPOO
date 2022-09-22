/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoquinielas;

/**
 *
 * @author USUARIO
 */
public class User {
    private String ID;
    private String name;
    private String password;
    private String sexo;
    private String cambio;
    
    
    public User(String ID, String name, String password){
        this.ID = ID;
        this.name = name;
        this.password = password; 
        
    }
    
    //TO DO 
    public void darDeAlta(String ID, String name, String password){
        
    
    }
    
    
    //setters & getters

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setNombre(String name) {
        this.name = name;
    }

    public void setContraseña(String password) {
        this.password = password;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
