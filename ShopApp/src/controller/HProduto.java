package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Produto;
import service.SProdutos;




@WebServlet("/HProduto")
public class HProduto extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
      
	
	private SProdutos sp;
	

    public HProduto() 
    {
       super();
       sp =  new SProdutos();
    }


    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.setAttribute("listaProduto", sp.getArProdutos());
		request.getRequestDispatcher("produtos.jsp").forward(request, response);
	}


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String nome = request.getParameter("nome");
		double preco = Double.parseDouble(request.getParameter("preco"));
		int quantidade = Integer.parseInt(request.getParameter("quantidade"));
		
		Produto prod = new Produto(request.getParameter("nome"), quantidade, preco);
		
		sp.addProduto(nome, quantidade, preco);
	
		
		doGet(request, response);
		
	}

}
