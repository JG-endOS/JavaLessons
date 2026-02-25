abstract class FiguraGeometrica {
    public abstract float calcularArea();
    public abstract float calcularPerimetro();
}

class Retangulo extends FiguraGeometrica {
    private float alt;
    private float lar;

    public Retangulo(float alt, float lar) {
        this.alt = alt;
        this.lar = lar;
    }

    @Override
    public float calcularArea() {
       return alt * lar;
    }

    @Override
    public float calcularPerimetro() {
        return (alt * 2) + (lar * 2);
    }

    void resultados() {
        System.out.println("Area do retangulo: " + this.calcularArea());
        System.out.println("Perimetro do retangulo: " + this.calcularPerimetro());
    }
}

public class FigGeo {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5, 7);

        retangulo.resultados();

    }
}