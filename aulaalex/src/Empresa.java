public class Empresa {
    private String funcioanrios;
    private String materiais;
    private String ferramentas;

    public void estadoatual() {
        System.out.println("Funcionários da empresa: " + this.getFuncioanrios());
        System.out.println("Materiais disponiveis: " + this.getMateriais());
        System.out.println("Ferramentas: " + this.getFerramentas());
    }
    public String getFuncioanrios() {
        return funcioanrios;
    }
    public void setFuncioanrios(String funcioanrios) {
        this.funcioanrios = funcioanrios;
    }
    public String getMateriais() {
        return materiais;
    }
    public void setMateriais(String materiais) {
        this.materiais = materiais;
    }
    public String getFerramentas() {
        return ferramentas;
    }
    public void setFerramentas(String ferramentas) {
        this.ferramentas = ferramentas;
    }

    
}
