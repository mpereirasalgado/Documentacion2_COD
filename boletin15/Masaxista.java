
package boletin15;
/**@author micaelr*/
public class Masaxista extends Integrante
{
//atributos
    public String titulacion;
    public int anosExperiencia;
    
//constructores

    public Masaxista(int id, String nome, String apelido, int edade, String titulacion, int anosExperiencia) 
    {
        super(id,nome,apelido,edade);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }
    
//metodos

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    
    public void darMasaxe()
    {
        System.out.println("masaxeame");
    }
    
    @Override
    public void viaxar()
    {
        System.out.println("viaxan os masaxistas");
    }

    @Override
    public String toString() 
    {
        return "Masaxista{" + "titulacion=" + titulacion + ", anosExperiencia=" + anosExperiencia + '}';
    }
}
