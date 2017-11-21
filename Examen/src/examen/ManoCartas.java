/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author ROG
 */
public class ManoCartas {
   
	private String categoria;
	private int numero;
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String Categoria) {
		this.categoria = Categoria.toLowerCase();
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int Numero) {
		this.numero= Numero;
	}
	
	LinkedPositionalList<ManoCartas> deck = new LinkedPositionalList<>();
	Position<ManoCartas> initailP0,cloverCards,hearthPosition,spadeCards,diamondCards;
	public void agregarCarta(int Numero, String categoria)
	{
		ManoCartas card = new ManoCartas();
                card.setCategoria(categoria);
		card.setNumero(Numero);
		initailP0 = deck.addFirst(card);
                switch(card.getCategoria())
                {
                    case "corazon":
                        hearthPosition = deck.addFirst(card);
                        break;
                        case"espada":
                          spadeCards   = deck.addBefore(hearthPosition, card);
                            break;
                        case "diamante":
                            diamondCards = deck.addBefore(spadeCards, card);
                            break;
                        case "trebol":
                            deck.addBefore(diamondCards, card);
                            break;
                        default:
                            System.out.println("Categoria Invalida, solo existen cuatro categorias (trebol,corazon,espada y diamante)");
                            
                }
		
	}
	
        public int cartaExtraida; 
        
	public void jugar(String categoria)
	{
            //si la categoriaa de la ultima 
            
		if(deck.first().getElement().getCategoria() == categoria)
		{
                   
			cartaExtraida= deck.remove(diamondCards).getNumero();
		}
                
		else
		{
			cartaExtraida = deck.remove(initailP0).getNumero();
		}
	}
        public void Extraida()
        {
            System.out.println(cartaExtraida);
        }
}
