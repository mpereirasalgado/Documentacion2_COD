
package boletin15;
/** @author micaelr*/
public class Integrante 
{
    
//atributos
    private int id;
    private String nome;
    private String apelido;
    private int edade;
    
//constructores
    
    /**
     * constructor por defecto
     */
        
    public Integrante() 
    {
        
    }

    /**
     * constructor con parametros
     * @param id identificacion de integrante
     * @param nome nombre de integrante
     * @param apelido apelido de integrante
     * @param edade edade integrante
     */
    public Integrante(int id, String nome, String apelido, int edade) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.edade = edade;
    }
 
//metodos

    /**
     * devuelve la identificacion
     * @return id de integrante de la seleccion
     */
    
    public int getId() {
        return id;
    }

    /**
     * indroduccion de id
     * @param id de integrante de seleccion
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * devolucion de nome
     * @return nome de integrante de seleccion
     */
    public String getNome() {
        return nome;
    }

    /**
     * introduccion de nome
     * @param nome de integrante de seleccion
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * devolucion de apelido
     * @return apelidpo de integrante de seleccion
     */
    public String getApelido() {
        return apelido;
    }
    /**
     * metodo de introduccion de apelido
     * @param apelido integrante de la seleccion
    */
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    /**
     * metodo de devolucion de edad
     * @return edade int
    */
    public int getEdade() {
        return edade;
    }

    /**
     * introduccion de edade
     * @param edade de integrante de seleccion
     */
    public void setEdade(int edade) {
        this.edade = edade;
    }
   
    /**
     * imprime en pantalla el mensaje concentrase a seleccion
     */
    public void concentrarse()
    {
       System.out.println("concentrase a seleccion");
    }
    /**
     * imprime en pantalla el mensaje viaxa a seleccion 
    */
    public void viaxar()
    {
       System.out.println("viaxa a seleccion");
    }

    /**
     * devuelve datos de la clase
     * @return atributos de la clase
     */
    @Override
    public String toString() 
    {
        return "Integrante{" + "id=" + id + ", nome=" + nome + ", apelido=" + apelido + ", edade=" + edade + '}';
    }
    
    
}
