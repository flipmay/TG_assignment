//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Mapa mapa = new Mapa(5);
        mapa.addpath(0, 1);
        mapa.addpath(0, 2);
        mapa.addpath(1, 2);
        mapa.addpath(1, 3);
        mapa.addpath(2, 4);
        mapa.mostramapa();
    }


}