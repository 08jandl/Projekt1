package at.campus02.nowa;

import at.campus02.nowa.figures.*;

import java.io.PrintStream;
import java.util.Scanner;

public class App {
    private final Scanner input;
    private final PrintStream output;
    private boolean exit = false;
    private int figure;
    private int faktor;
    private at.campus02.nowa.figures.Figure figureToPrint;

    public App(Scanner input, PrintStream output){
        this.input = input;
        this.output = output;
    }

    public void Run() {
        initialize();
        printState();

        while(!exit) {
            readUserInput();
            updateState();
            printState();

            exit = !askContinue();
        }
    }

    private void initialize() {

    }

    private void readUserInput() {
        inputFigure();
        inputFaktor();
    }

    private void inputFigure() {
        //TODO: Hier die auszugebende Figur einlesen - not sure that works

        output.println("Bitte geben sie eine Zahl zwischen 1-6 ein.");

        //Überprüfen ob es auch eine Zahl zw 1-6 ist

        if (figure < 0 && figure > 6)
        {
            System.out.println("Keine zulässige Zahl, bitte eine Zahl zwischen 1-6 eigeben.");
        }

        figure = input.nextInt();
        }

    private void inputFaktor() {
        //TODO: Hier den Faktor einlesen
        //ist eine Zusatzaufgabe für später
    }

    private void updateState() {
        switch (figure){
            case 1:
                figureToPrint = new at.campus02.nowa.figures.FigureH(faktor);
                break;
            //TODO: hier entsprechend erweitern
            case 2:
                figureToPrint = new at.campus02.nowa.figures.FigureL(faktor);
                break;
            case 3:
                figureToPrint = new at.campus02.nowa.figures.FigureO(faktor);
                break;
            case 4:
                figureToPrint = new at.campus02.nowa.figures.FigureO2(faktor);
                break;
            case 5:
                figureToPrint = new at.campus02.nowa.figures.FigureI(faktor);
                break;
            case 6:
                figureToPrint = new at.campus02.nowa.figures.FigureMinus(faktor);
                break;
            default: break;
        }
    }

    private void printState() {
        if (figureToPrint != null){
            output.println(figureToPrint);
        }
    }

    private boolean askContinue(){
        return true;
    }
}
