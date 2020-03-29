package at.campus02.nowa.figures;

import java.util.Arrays;

public abstract class Figure {
    protected int faktor;
    protected char[][] symbol = new char[3][3];

    protected Figure(int faktor){
        this.faktor = faktor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        //TODO: Implementieren der Ausgabe in einen StringBuilder

        for (char i = 0; i < 1; i++) {
            for (char j = 0; j < 3; j++) {
                sb.append(symbol[j][0]);
                sb.append(symbol[j][1]);
                sb.append(symbol[j][2]);
                sb.append("\n");
            }
        }


        return sb.toString();
    }
}

