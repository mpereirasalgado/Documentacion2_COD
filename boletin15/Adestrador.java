
package boletin15;

/**@author micaelr*/
public class Adestrador extends Integrante
{
//atributos
    public String idFederacion;

//constructores

    public Adestrador() 
    {
        
    }

    public Adestrador(int id, String nome, String apelido, int edade, String idFederacion) 
    {
        super(id,nome,apelido,edade);
        this.idFederacion = idFederacion;
    }
    
//metodos

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    public void dirixirPartido()
    {
        
    }
    
    public void dirixirAdeestramento()
    {
        
    }
    
    @Override
    public void viaxar ()
    {
        System.out.println("viaxan os adestradores");
    }

    @Override
    public String toString() 
    {
        return "Adestrador{" + "idFederacion=" + idFederacion + '}';
    }
    
}
