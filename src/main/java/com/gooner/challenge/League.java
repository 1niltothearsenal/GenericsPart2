package main.java.com.gooner.challenge;

import main.java.com.gooner.Team;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

    public String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeams(T team){
        if(!league.contains(team)){
            league.add(team);
            return true;
        }else{
            System.out.println("The team is already on the table.");
            return false;
        }
    }

    public void showLeagueTable(){
        Collections.sort(league);
        for(T t:league){
            System.out.println(t.getName()+": "+t.ranking());
        }
    }



}
