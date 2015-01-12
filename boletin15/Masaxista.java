
package boletin15;
/**@author micaelr*/
public class Masaxista extends Integrante
{
//atributos

    /**
     * atributos de la clase
     */
        public String titulacion;

    /**
     * atributos de la clase
     */
    public int anosExperiencia;
    
//constructores

    /**
     * constructor con parametros
     * @param id 
     * @param nome
     * @param apelido
     * @param edade
     * @param titulacion
     * @param anosExperiencia
     */
    
    public Masaxista(int id, String nome, String apelido, int edade, String titulacion, int anosExperiencia) 
    {
        super(id,nome,apelido,edade);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }
    
//metodos

    /**
     * metodo que devuelve la titulacion
     * @return titulacion de masaxista
     */
    
    public String getTitulacion() {
        return titulacion;
    }

    /**
     * introduccion de titulacion
     * @param titulacion de masaxista
     */
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    /**
     * metodo que devuelve la experiencia del masaxista
     * @return AnosExperencia de masaxista
     */
    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    /**
     * metodo de introduccion de anos de experiencia
     * @param anosExperiencia de masaxista
     */
    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    
    /**
     *
     */
    public void darMasaxe()
    {
        System.out.println("masaxeame");
    }
    
    @Override
    public void viaxar()
    {
        System.out.println("viaxan os masaxistas");
    }

    /**
     * devuelve los atributos de la clase
     * @return datos de la clase
     */
    @Override
    public String toString() 
    {
        return "Masaxista{" + "titulacion=" + titulacion + ", anosExperiencia=" + anosExperiencia + '}';
    }
}
