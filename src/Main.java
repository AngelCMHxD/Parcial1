public class Main {
    public static void main(String[] args) throws Exception {
        Persona usuario;

        int edad = Integer.parseInt(args[1]);
        float peso = Float.parseFloat(args[2]);
        float altura = Float.parseFloat(args[3]);

        if (args[0].equals("h")) {
            usuario = new Hombre(edad, peso, altura);
        } else if (args[0].equals("m")) {
            usuario = new Mujer(edad, peso, altura);
        } else {
            throw new Exception("tipo de genero no esperado, solo puede ser h para hombre o m para mujer");
        }

        float uml = usuario.getUML();

        System.out.print("el uml del usuario es: ");
        System.out.print(uml);
    }
}