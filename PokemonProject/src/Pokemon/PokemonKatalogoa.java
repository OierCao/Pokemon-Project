package Pokemon;

public class PokemonKatalogoa {

	private PokemonZerrenda lista;
	private static PokemonKatalogoa nPK;

	private PokemonKatalogoa() {
		lista = new PokemonZerrenda();
		Pokemon p1= new Pokemon("Charmander", "Fire");
		Pokemon p2= new Pokemon("Bulbasuar", "Grass");
		Pokemon p3= new Pokemon("Squirtle", "Water");
		Pokemon p4= new Pokemon("Pikachu", "Electric");
	}

	public static PokemonKatalogoa getPK() {
		if (nPK==null) {
			nPK = new PokemonKatalogoa();
		}
		return nPK;
	}

	
}