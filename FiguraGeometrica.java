public abstract class FiguraGeometrica {
    private int id;
    private String cor;
    private static int totalFiguras = 0;

    public FiguraGeometrica(String cor){
        FiguraGeometrica.totalFiguras += 1;
        id = FiguraGeometrica.totalFiguras;
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getInfo(){
       return "Id: " + id + ", Cor: " + cor;
    }

    public static int getTotalFiguras(){
        return totalFiguras;
    }
    
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    public abstract String getTipoFigura();
    public abstract String getDetalhes();

}
