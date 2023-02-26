package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();


    public void start() {
        //cast 1.1 a 1.2
        zofka.setLocation(100.0,100.0);
        nakresliRovnostrannyTrojuhelnik(50.0);

        zofka.setLocation(200.0,100.0);
        nakresliRovnostrannyTrojuhelnik(70.0);

        zofka.setLocation(250,100);
        nakresliCtverec(80);

        zofka.setLocation(400, 100);
        nakresliObdelnik(50, 150);

        zofka.setLocation(650,100);
        nakresliKolecko(20);

    }
    public void nakresliRovnostrannyTrojuhelnik (double velikostStrany){
        zofka.move(velikostStrany);
        zofka.turnLeft(120);
        zofka.move(velikostStrany);
        zofka.turnLeft(120);
        zofka.move(velikostStrany);
        zofka.turnLeft(120);
    }
    public void nakresliCtverec(double velikostStrany){
     for (int i = 0; i<4; i++){
         zofka.move(velikostStrany);
         zofka.turnRight(90);
     }

    }
    public void nakresliObdelnik(double delkaStranyA, double delkaStranyB){
        for (int i = 0; i<2;i++){
            zofka.move(delkaStranyA);
            zofka.turnRight(90);
            zofka.move(delkaStranyB);
            zofka.turnRight(90);
        }
    }

public void nakresliKolecko(double polomer){
        for (int i=0; i<36;i++){
            zofka.move(polomer);
            zofka.turnRight(20);
        }
}

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
