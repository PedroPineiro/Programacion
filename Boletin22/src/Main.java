import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[][] goles = new String[4][4];
        String numGoles = "";

        goles[0][0] = "Equixo/xornada";
        goles[0][1] = "X1";
        goles[0][2] = "X2";
        goles[0][3] = "X3";
        goles[1][0] = "Celta";
        goles[1][1] = "3";
        goles[1][2] = "4";
        goles[1][3] = "2";
        goles[2][0] = "Bilbao";
        goles[2][1] = "1";
        goles[2][2] = "2";
        goles[2][3] = "1";
        goles[3][0] = "Malaga";
        goles[3][1] = "3";
        goles[3][2] = "0";
        goles[3][3] = "1";

        for (String[] gol : goles) {
            for (String i : gol) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < goles.length; i++) {
            for(int j = 0; j < goles[i].length; j++) {
                numGoles += goles[i][j];
            }
            Arrays.sort(goles[i]);
            System.out.println(goles);
        }

















        for (int i = 1; i < goles[0].length; i++) {
            int maxGoles = 0;
            String equipo = "";
            for (int j = 1; j < goles.length; j++) {
                if (Integer.parseInt(goles[j][i]) > maxGoles) {
                    maxGoles = Integer.parseInt(goles[j][i]);
                    equipo = goles[j][0];
                }
            }
            System.out.println("Jornada " + i + ": " + equipo + " con " + maxGoles + " goles");
        }

    }

}