/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoquinielas;

/**
 *
 * @author USUARIO
 */

import java.util.ArrayList;
public class Group {
    private ArrayList<Team> teams;
    private ArrayList<Team> qualified;
    private String name;


    Group(String name, Team team1, Team team2, Team team3, Team team4){
        this.name = name;
        teams = new ArrayList<Team>();
        winners = new ArrayList<Team>();
        buildGroup(team1, team2, team3, team4);
    }

    void buildGroup(Team team1, Team team2, Team team3, Team team4){
        teams.add(team1);
        teams.add(team2);
        teams.add(team3);
        teams.add(team4);
    }
}
