
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
    
    public Integrante() 
    {
        
    }

    public Integrante(int id, String nome, String apelido, int edade) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.edade = edade;
    }
 
//metodos

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getEdade() {
        return edade;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }
   
    public void concentrarse()
    {
       System.out.println("concentrase a seleccion");
    }
   
    public void viaxar()
    {
       System.out.println("viaxa a seleccion");
    }

    @Override
    public String toString() 
    {
        return "Integrante{" + "id=" + id + ", nome=" + nome + ", apelido=" + apelido + ", edade=" + edade + '}';
    }
    
    
}
