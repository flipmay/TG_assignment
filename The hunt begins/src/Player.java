import java.util.List;

public class Player {

    private String nome;
    private int posicaoatual;
    private int comidas;
    private int pontos;
    private int charge;

    public Player(String nome) {
        this.nome = nome;
        this.pontos = 0;
        this.comidas = 0;
        this.posicaoatual = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPosicaoAtual() {
        return posicaoatual;
    }

    public void setPosicaoAtual(int posicaoatual) {
        this.posicaoatual = posicaoatual;
    }

    public int getComidas() {
        return comidas;
    }

    public void setComidas(int comidas) {
        this.comidas = comidas;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getPontos() {
        return pontos;
    }
    public void aumentacomidas(){
        comidas += 1;
    }

    public void aumentapontos(){
        pontos += 1;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public int getCharge() {
        return charge;
    }
    public void aumentacharge() {
        charge += 1;
    }
}
