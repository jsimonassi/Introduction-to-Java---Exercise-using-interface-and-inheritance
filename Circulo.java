
package formas;

public class Circulo implements Formas{
    private int raio;
    
    public Circulo(int raio){
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
    
    @Override
    public int calcularPerimetro() {
        return (int)(Math.PI * (2*this.raio));
    }

    @Override
    public int calcularArea() {
        return (int) (Math.PI * (raio * raio));
    }
    
    @Override
    public String toString(){
        return "Raio " + this.getRaio() + " Area = " + this.calcularArea() + " Perimetro = " + this.calcularPerimetro();
    }
}
