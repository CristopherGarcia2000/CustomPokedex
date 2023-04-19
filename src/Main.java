import net.salesianos.pokemitos.general.Pokemon;
import net.salesianos.pokemitos.legendarios.Legendario;
import net.salesianos.utilidades.ListaPokemon;

import java.util.Scanner;
//TODO: commit fix método ahora pide String y capturado público para cambiarlo en el 3  y push origin
public class Main {
    public static void main(String[] args) {
        int opcion = -1;
        String nombrePokemon,tipo,localizacion,descripcion;
        double peso,altura;
        ListaPokemon avistados = new ListaPokemon();
        ListaPokemon capturados = new ListaPokemon();
        Scanner teclao = new Scanner(System.in);
        while (opcion != 6){
            System.out.println("Elija la opcion que desea: ");
            System.out.println("1.-Añadir pokemon avistado");
            System.out.println("2.-Añadir pokemon legendario avistado");
            System.out.println("3.-Pasar a Capturados");
            System.out.println("4.-Mostrar lista de avistados");
            System.out.println("5.-Mostrar lista de capturados");
            System.out.println("6.-Cerrar Pokedex");
            opcion = teclao.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Introduzca el nombre del pokemon legendario:");
                    nombrePokemon = teclao.nextLine();
                    System.out.println("Introduzca el tipo del pokemon legendario:");
                    tipo = teclao.nextLine();
                    Pokemon pokemonito = new Pokemon(nombrePokemon,tipo);
                    avistados.addPokemon(pokemonito);
                    break;
                case 2:
                    System.out.println("Introduzca el nombre del pokemon:");
                    nombrePokemon = teclao.nextLine();
                    System.out.println("Introduzca el tipo del pokemon:");
                    tipo = teclao.nextLine();
                    System.out.println("Introduzca la localizacion del pokemon:");
                    localizacion = teclao.nextLine();
                    Legendario pokemonLegendario = new Legendario(nombrePokemon,tipo,localizacion);
                    avistados.addPokemon(pokemonLegendario);
                    break;
                case 3:
                    System.out.println("Introduzca el nombre del pokemon que haya capturado");
                    nombrePokemon = teclao.nextLine();
                    if(avistados.devolverPokemon(nombrePokemon) != null){
                        capturados.addPokemon(avistados.devolverPokemon(nombrePokemon));
                        for (int i = 0; i < capturados.listaPokemon.length; i++) {
                            if (capturados.listaPokemon[i].getNombre().equals(nombrePokemon)){
                                capturados.listaPokemon[i].Capturado();
                                System.out.println("Introduce la altura: ");
                                altura = teclao.nextDouble();
                                capturados.listaPokemon[i].setAltura(altura);
                                System.out.println("Introduce el peso: ");
                                peso = teclao.nextDouble();
                                capturados.listaPokemon[i].setPeso(peso);
                                System.out.println("Introduce una breve descripción: ");
                                descripcion = teclao.nextLine();
                                capturados.listaPokemon[i].setDescripcion(descripcion);

                            }
                        }
                        avistados.deletePokemon(nombrePokemon);

                    }else {
                        System.out.println(nombrePokemon + " no está");
                    }

                    break;
                case 4:
                    avistados.mostrarPokemon();
                    break;
                case 5:
                    capturados.mostrarPokemon();
                    break;
                case 6:
                    System.out.println("Hasta la próxima");
                    break;
                default:
                    System.out.println("Mostro, un número válido");
            }
        }

    }
}