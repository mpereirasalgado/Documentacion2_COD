
package boletin15;

/**@author micaelr*/
public class Xogador extends Integrante
{
    
//atributos
    
    public String demarcacion;
    
//constructores

    public Xogador() 
    {
        
    }

    public Xogador(int id, String nome, String apelido, int edade, String demarcacion) 
    {
        super(id,nome,apelido,edade);
        this.demarcacion = demarcacion;
    }
    
//metodos

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    public void xogarPartido()
    {

    }
    
    public void entrenar()
    {

    }
    
    @Override
    public void viaxar()
    {
        System.out.println("viaxan os xogadores");
    }

    @Override
    public String toString() 
    {
        return "Xogador{" + "demarcacion=" + demarcacion + '}';
    }
}
