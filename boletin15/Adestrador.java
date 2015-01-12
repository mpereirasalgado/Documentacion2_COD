
package boletin15;

/**@author micaelr*/
public class Adestrador extends Integrante
{
//atributos

    /**
     * atributos de la clase
     */
        public String idFederacion;

//constructores

    /**
     * constructor por defecto sin parametros
     */
    
    public Adestrador() 
    {
        
    }

    /**
     * constructor por defecto con parametros
     * @param id identificacion de adestrador
     * @param nome nome de adestrador
     * @param apelido apelido de adestrador
     * @param edade edade de adestrador
     * @param idFederacion identificacion de la federacion
     */
    public Adestrador(int id, String nome, String apelido, int edade, String idFederacion) 
    {
        super(id,nome,apelido,edade);
        this.idFederacion = idFederacion;
    }
    
//metodos

    /**
     * devuelve el idFederacion
     * @return identificacion federacion
     */
    
    public String getIdFederacion() {
        return idFederacion;
    }

    /**
     * introduccion de identificacion de federacion
     * @param idFederacion
     */
    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    /**
     *
     */
    public void dirixirPartido()
    {
        
    }
    
    /**
     *
     */
    public void dirixirAdeestramento()
    {
        
    }
    
    @Override
    public void viaxar ()
    {
        System.out.println("viaxan os adestradores");
    }

    /**
     * devuelve los atributos de la clase
     * @return idFederacion
     */
    @Override
    public String toString() 
    {
        return "Adestrador{" + "idFederacion=" + idFederacion + '}';
    }
    
}
