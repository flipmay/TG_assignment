import java.util.List;

public class Habilidades {

    private int[] habilidades;
    private List<String> skilltre;

    public Habilidades(int[] habilidades, List<String> skilltre) {
        this.habilidades = habilidades;
        this.skilltre = skilltre;
    }








    public int[] getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(int[] habilidades) {
        this.habilidades = habilidades;
    }

    public List<String> getSkilltre() {
        return skilltre;
    }

    public void setSkilltre(List<String> skilltre) {
        this.skilltre = skilltre;
    }
}
