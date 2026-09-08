public abstract class Persona {
    protected int edad;
    protected float peso;
    protected float altura;

    public Persona(int edad, float peso, float altura) {
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    abstract public float getUML() throws Exception;
}
