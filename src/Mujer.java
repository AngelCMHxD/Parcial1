public class Mujer extends Persona {
    public Mujer(int edad, float peso, float altura) {
        super(edad, peso, altura);
    }

    @Override
    public float getUML() throws Exception {
        if (!(40 <= this.peso && this.peso <= 80)) {
            throw new Exception("el peso se encuentra fuera del rango");
        }

        if (!(140 <= this.altura && this.altura <= 180)) {
            throw new Exception("la altura se encuentra fuera del rango");
        }

        if (!(edad > 15)) {
            throw new Exception("la edad se encuentra fuera del rango");
        }

        return (float) (447.593 + (9.247 * this.peso) + (3.098 * this.altura) - (4.33 * this.edad));
    }
}
