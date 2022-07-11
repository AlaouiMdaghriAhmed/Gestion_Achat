package Conn;

import java.util.List;

import produit.Addproduit;

public interface IProduit {
	List <Addproduit> getAllProduits();
	List <Addproduit> getProduitsParMc(String mc);
	void ajouterProduit (Addproduit p);
	void supprimerProduit (int Id);
	
	

}
