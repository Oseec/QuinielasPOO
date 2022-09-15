/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoquinielas;

/**
 *
 * @author USUARIO
 */
public class Team {
    private int goalScored;
    private int goalRecibed;
    private String name; 
    private int score;
    private int ranking;

    public Team(String name, int score, int ranking){
        this.goalScored = 0;
        this.goalRecibed = 0;
        this.name = name;
        this.score = score;
        this.ranking = ranking;
    }
}
