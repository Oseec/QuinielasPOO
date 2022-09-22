/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoquinielas;

/**
 *
 * @author USUARIO
 */

import java.io.Serializable;
import java.util.ArrayList;

public class UsersDataBase implements Serializable{
    String filepath = "users.dat";
    ArrayList<User> users;
    
    public UsersDataBase(){
        users = new ArrayList<User>();
        users.add(new User("admin", "isaac", "admin"));
    }
    
    public void guardar(){
        FileManager.writeObject(this, filepath);
        
    }
    
       public void restaurar(){
        UsersDataBase dataBase = (UsersDataBase) FileManager.readObject(filepath);
        users = dataBase.users;
           for (User user : users) {
               System.out.println(user.toString());
           }
    }
       
    public boolean buscarUsuario(String ID, String password){
        for (User user : users) {
            if (user.getID().equals(ID) && user.getPassword().equals(password))
                return true;
        }
        return false;
    }
    
    public void darDeAlta(String ID, String name, String password){
        boolean buscado = buscarUsuario(ID, password);
        if(users == null){
            User toAdd = new User(ID, name, password);
            users.add(toAdd);
            this.guardar();
        }
            else if(buscado != true){
                User toAdd = new User(ID, name, password);
                users.add(toAdd);
                this.guardar();
        }
    
    }
    
    
}

