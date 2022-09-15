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
public class Quiniela {
    private ArrayList<Group> MatchesGroupPhase;
    private ArrayList<Group> EighthFinalsPhase;
    private ArrayList<Group> QuarterFinalPhase;
    private ArrayList<Group> FinalPhase;
    private ArrayList<Match> Matches;

    public Quiniela(){
        MatchesGroupPhase = new ArrayList<Group>();
        EighthFinalsPhase = new ArrayList<Group>();
        QuarterFinalPhase = new ArrayList<Group>();
        FinalPhase = new ArrayList<Group>();
        Matches = new ArrayList<Match>();
    }
}
