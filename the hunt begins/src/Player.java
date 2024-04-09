import java.util.List;

public class Player {

    private String nome;
    private int[][] posicaoatual;
    private List<String> comidas;
    private List<Habilidades> skills;

    public Player(String nome) {
        this.nome = nome;
    }










    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[][] getPosicaoAtual() {
        return posicaoatual;
    }

    public void setPosicaoAtual(int[][] posicaoatual) {
        this.posicaoatual = posicaoatual;
    }

    public List<String> getComidas() {
        return comidas;
    }

    public void setComidas(List<String> comidas) {
        this.comidas = comidas;
    }

    public List<Habilidades> getHabilidades() {
        return skills;
    }

    public void setHabilidades(List<Habilidades> habilidades) {
        this.skills = habilidades;
    }
}
