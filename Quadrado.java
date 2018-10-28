package formas;

public class Quadrado extends Quadrilatero{
    public Quadrado(int lado){
        super(lado, lado, lado, lado);
    }
    @Override
    public String toString(){
        return "Lado: " + this.getLado1() + " Area = " + this.calcularArea() + " Perimetro = " + this.calcularPerimetro();
    }
}
