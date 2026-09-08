public class Hombre extends Persona {
    public Hombre(int edad, float peso, float altura) {
        super(edad, peso, altura);
    }

    @Override
    public float getUML() throws Exception {

        if (!(60 <= this.peso && this.peso <= 110)) {
            throw new Exception("el peso se encuentra fuera del rango");
        }

        if (!(160 <= this.altura && this.altura <= 195)) {
            throw new Exception("la altura se encuentra fuera del rango");
        }

        if (!(edad > 15)) {
            throw new Exception("la edad se encuentra fuera del rango");
        }

        return (float) (88.362 + (13.397 * this.peso) + (4.799 * this.altura) - (5.677 * this.edad));
    }
}
