public class Mapa {

    private int[][] mapa;
    private int tamanho;
    private int toca;

    public Mapa(int numVertices) {
        this.tamanho = numVertices;
        mapa = new int[numVertices][numVertices];
        this.toca = 0;
    }

    public void addpath(int v1, int v2) {
        mapa[v1][v2] = 1;
        mapa[v2][v1] = 1;
    }

    public void verificaadj(int v1){
        for(int i=0; i<tamanho; i++){
            if(mapa[v1][i] == 1){
                System.out.println(i);
            }
        }
        System.out.println("\n");
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

    public void setToca(int toca) {
        this.toca = toca;
    }
    public int getToca(){
        return toca;
    }

}
