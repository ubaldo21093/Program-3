/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Student(s) Name(s):
 * Description: prg_03 - Pokemon Collection
 */

public class PokemonCollection extends BST<Pokemon> {

    private String type1;

    public PokemonCollection(String type1) {
        this.type1 = type1;
    }

    public PokemonCollection() {
        this("");
    }

    // TODO #6: add the given pokemon card to the collection; if type1 is defined, check if the given pokemon card has the same type1
    public void add(final Pokemon pokemon) {

    }

    // TODO #7: similar to BST's searchRecursively, returning a Pokemon reference (instead of true/false); return null if the pokemon card is not found
    private Pokemon searchRecursively(final BSTNode<Pokemon> current, final Pokemon value) {
        return null;
    }

    // TODO #8: similar to BST's search; however, this method takes the name of a Pokemon and it should return avPokemon reference (instead of true/false); return null if the pokemon card is not
    public Pokemon search(final String name) {
        return null;
    }

    // TODO #9: return a string representation of a pokemon collection according to specifications in README file
    @Override
    public String toString() {
        return "";
    }
}
