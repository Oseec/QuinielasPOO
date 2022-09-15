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
public class WorldCup {
    ArrayList<Group> groups;
    ArrayList<Group> eighthFinals;
    ArrayList<Group> quarterFinals;
    ArrayList<Group> finals;
    ArrayList<Match> matchPlayed;


    public WorldCup(){
        groups = new ArrayList<Group>();
        eighthFinals = new ArrayList<Group>();
        quarterFinals = new ArrayList<Group>();
        finals = new ArrayList<Group>();
    }

    void init(){
        //Grupo A
        Team Qatar = new Team("Qatar", 0, 1441);
        Team Ecuador = new Team("Ecuador", 0, 1463);
        Team Senegal = new Team("Senegal", 0, 1584);
        Team PaisesBajos = new Team("Paises Bajos", 0, 1679);
        groups.add(new Group("A", Qatar, Ecuador, Senegal, PaisesBajos));
        //Grupo B 
        Team Inglaterra = new Team("Inglaterra", 0, 1737);
        Team Iran = new Team("Iran", 0, 1558);
        Team Gales = new Team("Gales", 0, 1582);
        Team EEUU = new Team("EEUU", 0, 1635);
        groups.add(new Group("B", Inglaterra, Iran, Gales, EEUU));
        //Grupo C
        Team Argentina = new Team("Argentina", 0, 1770);
        Team ArabiaSaudi = new Team("ArabiaSaudi", 0, 1435);
        Team Mexico = new Team("Mexico", 0, 1649);
        Team Polonia = new Team("Polonia", 0, 1546);
        groups.add(new Group("C", Argentina, ArabiaSaudi, Mexico, Polonia));
        //Grupo D
        Team Francia = new Team("Francia", 0, 1764);
        Team Australia = new Team("Australia", 0, 1483);
        Team Dinamarca = new Team("Dinamarca", 0, 1665);
        Team Tunez = new Team("Tunez", 0, 1507);
        groups.add(new Group("D", Francia, Australia, Dinamarca, Tunez));
        //Grupo E
        Team Espana = new Team("Espana", 0, 1716);
        Team CostaRica = new Team("CostaRica", 0, 1500);
        Team Alemania = new Team("Alemania", 0, 1658);
        Team Japon = new Team("Japon", 0, 1554);
        groups.add(new Group("E", Espana, CostaRica, Alemania, Japon));
        //Grupo F
        Team Belgica = new Team("Belgica", 0, 1821);
        Team Canada = new Team("Canada", 0, 1475);
        Team Marruecos = new Team("Marruecos", 0, 1558);
        Team Croacia = new Team("Croacia", 0, 1632);
        groups.add(new Group("F", Belgica, Canada, Marruecos, Croacia));
        //Grupo G
        Team Brasil = new Team("Brasil", 0, 1837);
        Team Serbia = new Team("Serbia", 0, 1549);
        Team Suiza = new Team("Suiza", 0, 1621);
        Team Camerun = new Team("Camerun", 0, 1484);
        groups.add(new Group("G", Brasil, Serbia, Suiza, Camerun));
        //Grupo H
        Team Portugal = new Team("Portugal", 0, 1678);
        Team Ghana = new Team("Ghana", 0, 1393);
        Team Uruguay = new Team("Uruguay", 0, 1640);
        Team CoreaDelSur = new Team("CoreaDelSur", 0, 1526);
        groups.add(new Group("G", Portugal, Ghana, Uruguay, CoreaDelSur));

    
    }
}
