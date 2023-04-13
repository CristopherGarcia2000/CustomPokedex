package net.salesianos.pokemitos.legendarios;


import net.salesianos.pokemitos.general.Pokemon;

public class Legendario extends Pokemon {
    private String localizacion;

    public Legendario(String nombre, String tipo, double altura, double peso, String descripcion, String localizacion) {
        super(nombre, tipo, altura, peso, descripcion);
        this.localizacion = localizacion;
    }

    public Legendario(String nombre, String tipo, String localizacion) {
        super(nombre, tipo);
        this.localizacion = localizacion;
    }

    @Override
    public String toString() {
        if (capturado) {
            return nombre + '\n' + tipo + '\n' + altura + '\n' + peso + '\n' + descripcion + '\n'+ localizacion;
        } else {
            return nombre + '\n' + tipo + "???" + "\n" + "???" + "\n" + "???" + "\n" + localizacion;
        }
    }
}