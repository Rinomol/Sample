package com.constructor;

public class CopyConstructor {
    public static void main(String[] args) {
        Player orginalPlayer = new Player("Messi",10, 780);
        orginalPlayer.display();
        Player duplicatePlayer = new Player(orginalPlayer);
        duplicatePlayer.display();
    }
}

class Player{
    private String name;
    private int jerseyno;
    private int goals;
    Player(String name, int jerseyno, int goals){
        this.name = name;
        this.jerseyno = jerseyno;
        this.goals = goals;
    }

    Player(Player play){
        name = play.name;
        jerseyno = play.jerseyno;
        goals = play.goals;

    }
    public void display(){
        System.out.println("Name of the player:" +name +"\n" +"Jersey number:" +jerseyno +"\n" +"Career goals:" +goals);
    }
}
