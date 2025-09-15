public class Retangulo extends FiguraGeometrica {
    private double largura;
    private double altura;

    public Retangulo(String cor, double largura, double altura){
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return largura * altura;
    }

    @Override
    public double calcularPerimetro(){
        return 2 * (largura + altura);
    }

    @Override
    public String getTipoFigura() {
        return "Retângulo";
    }

    @Override
    public String getDetalhes() {
        return getTipoFigura() + ", " + getInfo() + ", Largura: " + largura + ", Altura: " + altura;
    }
}
