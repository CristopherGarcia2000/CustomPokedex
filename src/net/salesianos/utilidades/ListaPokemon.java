package net.salesianos.utilidades;

import net.salesianos.pokemitos.general.Pokemon;

public class ListaPokemon {
    private int contador = 0;
    public Pokemon listaPokemon[] = new Pokemon[1];

    public ListaPokemon() {

    }


    public void addPokemon(Pokemon pokemon) {
        listaPokemon[contador] = pokemon;
        contador++;

        Pokemon listaTemporal[] = new Pokemon[contador + 1];
        for (int i = 0; i < listaPokemon.length; i++) {
            listaTemporal[i] = listaPokemon[i];
        }
        this.listaPokemon = listaTemporal;

    }

    public void deletePokemon(String pokeNombre) {
        int size = 0;
        for (int i = 0; i < listaPokemon.length - 1; i++) {
            if (listaPokemon[i].getNombre().equals(pokeNombre)) {
                listaPokemon[i] = null;
                System.out.println("El pokemon ha sido borrado");
            } else {
                if (i == listaPokemon.length) {
                    System.out.println("El pokemon no está registrado33");
                }
                size++;
            }
        }
        Pokemon temporalList[] = new Pokemon[contador - 1];
        int includedPokemons = 0;
        for (int i = 0; i < listaPokemon.length - 1; i++) {

            if (listaPokemon[i] != null) {
                temporalList[includedPokemons] = listaPokemon[i];
            }
        }
        this.listaPokemon = temporalList;
    }

    public void mostrarPokemon() {
        String msg = "";
        for (int i = 0; i < listaPokemon.length; i++) {
            if (listaPokemon[i] != null) {
                msg += '\n' + listaPokemon[i].toString();
            }
        }
        System.out.println(msg);
    }

    public Pokemon devolverPokemon(String nombrePokemon) {
        for (int i = 0; i < listaPokemon.length; i++) {
            if (listaPokemon[i].getNombre().equals(nombrePokemon)) {
                return listaPokemon[i];
            }
        }
        return null;
    }
}


