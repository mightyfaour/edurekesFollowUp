package org.example.timbChalka.POLIMORPHYSM;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No Plot Here!";
    }

    public String getName() {
        return name;
    }
}

class  Jaws extends Movie {

    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats lots of people";
    }
}

class  IndependenceDay extends Movie{

    public IndependenceDay() {
        super("IndependenceDay");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over the earth";
    }
}

class MazeRunner extends Movie{

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape amaze";
    }
}
class StarWar extends Movie{

    public StarWar() {
        super("StarWar");
    }

    @Override
    public String plot() {
        return "Imperial forces try to takeover the universe!";
    }
}


class Forgettable extends Movie {

    public Forgettable() {
        super("Forgettable");
    }
//No methods here

}

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie # "+ i + " : " + movie.getName()+ "\n"+ "Plot: "+movie.plot()+"\n");
            
        }
    }
    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random()*5)+1;
        System.out.println("random number generated is: "+randomNumber);
//        return switch (randomNumber) {
//            case 1 -> new Jaws();
//            case 2 -> new IndependenceDay();
//            case 3 -> new MazeRunner();
//            case 4 -> new StarWar();
//            case 5 -> new Forgettable();
//            default -> null;
//        };

        switch (randomNumber){
            case 1:
                return  new Jaws();

            case 2:
                return new IndependenceDay();

            case 3:
                return  new MazeRunner();

            case 4:
                return new StarWar();

            case 5:
                return new Forgettable();
            default:
                return null;
        }
//        return null;
    }
}
