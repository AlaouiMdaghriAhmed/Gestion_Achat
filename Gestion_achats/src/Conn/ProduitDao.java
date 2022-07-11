package Conn;

import java.sql.*;
import java.util.*;

import produit.Addproduit;

public class ProduitDao implements IProduit{

	@Override
	public List<Addproduit> getAllProduits() {
		Connection cn = Connexion_BD.getConnection();
		PreparedStatement ps;
		List <Addproduit> Liste = new ArrayList<>();
		
		try {
			ps= cn.prepareStatement("SELECT * FROM Produits");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Addproduit p = new Addproduit();
				p.setId(rs.getInt("Id"));
				p.setNom_produit(rs.getString("Nom_produit"));
				p.setPrix(rs.getDouble("Prix"));
				p.setFournisseur(rs.getString("Fournisseur"));
				
				Liste.add(p); 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Addproduit> getProduitsParMc(String mc) {
		Connection cn = Connexion_BD.getConnection();
		PreparedStatement ps;
		List <Addproduit> Liste = new ArrayList<>();
		
		try {
			ps= cn.prepareStatement("SELECT * FROM Produits WHERE Fournisseur LIKE ?");
			ps.setString(1,"%" + mc + "%");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Addproduit p = new Addproduit();
				p.setId(rs.getInt("Id"));
				p.setNom_produit(rs.getString("Nom_produit"));
				p.setPrix(rs.getDouble("Prix"));
				p.setFournisseur(rs.getString("Fournisseur"));
				
				Liste.add(p); 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void ajouterProduit(Addproduit p) {
		Connection cn = Connexion_BD.getConnection();
		PreparedStatement ps;
		
		try {
			ps = cn.prepareStatement("INSERT INTO Produits (Nom_produit, Prix, Fournisseur) VALUES (?,?,?)");
			
			ps.setString(1, p.getNom_produit());
			ps.setDouble(2, p.getPrix());
			ps.setString(3, p.getFournisseur());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void supprimerProduit(int Id) {
		Connection cn = Connexion_BD.getConnection();
		PreparedStatement ps;
		
		try {
			ps = cn.prepareStatement("DELETE FROM Produits WHERE Id=?");
			ps.setInt(1,Id);
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
