package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();


    public void start() {
        //cast 1.1 a 1.2
      /* zofka.setLocation(100.0,100.0);
        nakresliRovnostrannyTrojuhelnik(50.0);

        zofka.setLocation(200.0,100.0);
        nakresliRovnostrannyTrojuhelnik(70.0);

        zofka.setLocation(250,100);
        nakresliCtverec(80);

        zofka.setLocation(400, 100);
        nakresliObdelnik(50, 150);

        zofka.setLocation(650,100);
        nakresliKolecko(20);

       */


zofka.setLocation(100,100);
        nakresliZmrzlinu(100,100);


        nakresliSnehulak(20,30,35,10);

        nakresliMasinku(95,150,90, 15, 8);



    }
    public void nakresliRovnostrannyTrojuhelnik (double velikostStranyT){
        zofka.turnRight(90);
        zofka.move(velikostStranyT);
        zofka.turnRight(120);
        zofka.move(velikostStranyT);
        zofka.turnRight(120);
        zofka.move(velikostStranyT);
        zofka.turnRight(120);
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


//cast 2

    public void nakresliZmrzlinu(double polomer, double velikostStrany){
        nakresliKolecko(20);
        nakresliRovnostrannyTrojuhelnik(120);
    }

    public void nakresliSnehulak(double polomerA, double polomerB, double polomerC, double polomerD){
        zofka.setLocation(400,100);
        nakresliKolecko(polomerA);
        zofka.setLocation(400,210);
        nakresliKolecko(polomerB);
        zofka.setLocation(400,380);
        nakresliKolecko(polomerC);
        zofka.setLocation(530,280);
        nakresliKolecko(polomerD);
        zofka.setLocation(290,280);
        nakresliKolecko(polomerD);


    }

    public void nakresliMasinku(double velikostStranyT, double delkaStranyA, double delkaStranyB, double polomerA, double polomerB){
        zofka.setLocation(700, 400);
        nakresliRovnostrannyTrojuhelnik(velikostStranyT);
        zofka.setLocation(850,380);
        nakresliObdelnik(delkaStranyB,delkaStranyA);
        zofka.setLocation(940, 320);
        nakresliObdelnik(delkaStranyA,delkaStranyB);
        zofka.setLocation(940,470);
        nakresliKolecko(polomerA);
        zofka.setLocation(820,495);
        nakresliKolecko(polomerB);
        zofka.setLocation(765, 495);
        nakresliKolecko(polomerB);
    }





    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
