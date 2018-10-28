package formas;

public class Retangulo extends Quadrilatero{
    public Retangulo(int lado1, int lado2) {
        super(lado1, lado2, lado1, lado2);
    }
    
    @Override
    public String toString(){
        return "Lado1: " + this.getLado1() + " Lado 2 = "+ this.getLado2() + " Area = " + this.calcularArea() + " Perimetro = " + this.calcularPerimetro();
    }
}

