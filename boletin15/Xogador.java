
package boletin15;

/**
 * @version 1.0
 * @author micaelr*/
public class Xogador extends Integrante
{
    
//atributos
    
    /**
     * atributos de la clase
     */
        
    public String demarcacion;
    
//constructores

    /**
     * constructor por defecto
     */
    
    public Xogador() 
    {
        
    }

    /**
     * constructor con parametros
     * @param id identificacion de xogador
     * @param nome nome de xogador
     * @param apelido apelido de xogador
     * @param edade edade de xogador
     * @param demarcacion posicion de xogador
     */
    public Xogador(int id, String nome, String apelido, int edade, String demarcacion) 
    {
        super(id,nome,apelido,edade);
        this.demarcacion = demarcacion;
    }
    
//metodos

    /**
     * devuelve posicion de xogador
     * @return posicion de xogador
     */
    
    public String getDemarcacion() {
        return demarcacion;
    }

    /**
     * introduccion del parametro
     * @param demarcacion
     */
    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    /**
     *
     */
    public void xogarPartido()
    {

    }
    
    /**
     *
     */
    public void entrenar()
    {

    }
    
    @Override
    public void viaxar()
    {
        System.out.println("viaxan os xogadores");
    }

    /**
     * devuelve los atributos de la clase
     * @return datos de la clase
     */
    @Override
    public String toString() 
    {
        return "Xogador{" + "demarcacion=" + demarcacion + '}';
    }
}
