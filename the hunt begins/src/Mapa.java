public class Mapa {

    private int[][] mapa;
    private int tamanho;

    public Mapa(int numVertices) {
        this.tamanho = numVertices;
        mapa = new int[numVertices][numVertices];
    }

    public void addpath(int v1, int v2) {
        mapa[v1][v2] = 1;
    }

    public void mostramapa() {
        System.out.println("Mapa:");
        System.out.print("  ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < tamanho; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < tamanho; j++) {
                System.out.print(mapa[i][j] + " ");
            }
            System.out.println();
        }
    }






    public int[][] getMapa() {
        return mapa;
    }

    public void setMapa(int[][] mapa) {
        this.mapa = mapa;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

}
