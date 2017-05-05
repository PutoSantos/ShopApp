package service;

import java.util.ArrayList;

import model.Produto;

public class SProdutos 
{
	ArrayList<Produto> arProdutos;
	
	
	public SProdutos()
	{
		arProdutos = new ArrayList<Produto>();
	}


	public ArrayList<Produto> getArProdutos() 
	{
		return arProdutos;
	}


	public void setArProdutos(ArrayList<Produto> arProdutos) 
	{
		this.arProdutos = arProdutos;
	}
	
	
	public void addProduto(String nome, int quantidade, double preco)
	{
		Produto p = new Produto(nome, quantidade, preco);
		
		this.arProdutos.add(p);
	}
	
	
}
