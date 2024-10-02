public class Funcionarios {
    private int data;
    private float salario;
    public String itensproduzidos;
    private String ferramentas;

    public void estadoatual() {
        System.out.println("Data de ingresso: " + this.getData());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Itens Produzidos: " + this.getItensproduzidos());
        System.out.println("Ferramentas: " +this.getFerramentas());
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public String getItensproduzidos() {
        return itensproduzidos;
    }
    public void setItensproduzidos(String itensproduzidos) {
        this.itensproduzidos = itensproduzidos;
    }
    public String getFerramentas() {
        return ferramentas;
    }
    public void setFerramentas(String ferramentas) {
        this.ferramentas = ferramentas;
    }
    

}
