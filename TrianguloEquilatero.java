public class TrianguloEquilatero extends FiguraGeometrica {
    private double lado;

    public TrianguloEquilatero(String cor, double lado){
        super(cor);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return (Math.sqrt(3)/4) * (Math.pow(lado, 2));
    }

    @Override
    public double calcularPerimetro(){
        return 3 * lado;
    }

    @Override
    public String getTipoFigura() {
        return "Triângulo Equilátero";
    }

    @Override
    public String getDetalhes() {
        return getTipoFigura() + ", " + getInfo() + ", Lado: " + lado;
    }
}
