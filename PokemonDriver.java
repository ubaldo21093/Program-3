/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Student(s) Name(s):
 * Description: prg_03 - PokemonDriver
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class PokemonDriver {

    // TODO #10: open the CSV filename and use it to create a return a PokemonCollection of the given type1
    static PokemonCollection load(String filename, String type1) throws FileNotFoundException {
        String pokemonFile = "pokemon.csv";
        FileInputStream input = new FileInputStream(pokemonFile);
        String name;String type;String type2;
        int total; int hp; int attack; int defense; int spAttack; int spDefense; int speed; int generation;
        boolean legendary;

        try {
            // 1,Bulbasaur,Grass,Poison,318,45,49,49,65,65,45,1,False


            Pokemon current = new Pokemon(name, type, type2, total, hp, attack, defense, spAttack, spDefense, speed, generation, legendary);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        while ()
        return null;
    }

    // TODO #11: create a PokemonCollection using "load" and then allow users to search for pokemon cards in the collection
    public static void main(String[] args) throws FileNotFoundException {
        
    }
}



//import java.io.FileInputStream;
//
//public class Main {
//
//    public static void main(String args[]) {
//
//        try {
//            FileInputStream input = new FileInputStream("input.txt");
//
//            System.out.println("Data in the file: ");
//
//            // Reads the first byte
//            int i = input.read();
//
//            while(i != -1) {
//                System.out.print((char)i);
//
//                // Reads next byte from the file
//                i = input.read();
//            }
//            input.close();
//        }
//
//        catch(Exception e) {
//            e.getStackTrace();
//        }
//    }
//}