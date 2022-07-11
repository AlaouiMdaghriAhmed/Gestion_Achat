package produit;

public class Addproduit {
	private int Id;
	private String Nom_produit;
	private double Prix;
	private String Fournisseur;
	
	
	
	public Addproduit(int id, String nom_produit, double prix, String fournisseur) {
		super();
		Id = id;
		Nom_produit = nom_produit;
		Prix = prix;
		Fournisseur = fournisseur;
	}
	
	
	public Addproduit(String nom_produit, double prix, String fournisseur) {
		super();
		Nom_produit = nom_produit;
		Prix = prix;
		Fournisseur = fournisseur;
	}


	public Addproduit() {
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNom_produit() {
		return Nom_produit;
	}
	public void setNom_produit(String nom_produit) {
		Nom_produit = nom_produit;
	}
	public double getPrix() {
		return Prix;
	}
	public void setPrix(double prix) {
		Prix = prix;
	}
	public String getFournisseur() {
		return Fournisseur;
	}
	public void setFournisseur(String fournisseur) {
		Fournisseur = fournisseur;
	}
	

}
