package net.salesianos.pokemitos.general;

public class Pokemon {
    protected String nombre;
    protected String tipo;
    protected double altura;
    protected double peso;
    protected String descripcion;

    protected boolean capturado = false;

    public Pokemon(String nombre, String tipo, double altura, double peso, String descripcion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.altura = altura;
        this.peso = peso;
        this.descripcion = descripcion;
    }

    public Pokemon(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        if(capturado) {
            return nombre + '\n' + tipo + '\n' + altura + '\n' + peso + '\n' + descripcion;
        }
        else {
            return nombre + '\n' + tipo + "???"+ "\n" + "???"+ "\n" + "???";
        }
    }
}

