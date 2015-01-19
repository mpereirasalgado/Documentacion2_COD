//commit prueba
//aqui haré mis experimentos
//experimento 1
//experiemnto 2
package boletin15;

/**
 * @version 1.0
 * @author mpereirasalgado*/
public class Boletin15 
{

    /**
     * clase principal donde se instancian los objetos
     * @param args
     */
    public static void main(String[] args) 
    {
        //Integrante integrante=new Integrante(34,"Xavi","Paez",24);
        Xogador xogador1=new Xogador(10,"Xavi","Paez",24,"dianteiro");
        Adestrador adestrador=new Adestrador(00,"Alex","Rexa",88,"AAA");
        Masaxista masaxista=new Masaxista(02,"Fabia","Leiza",36,"masaxista",10);
        Integrante xogador2=new Xogador(10,"Xavi","Paez",24,"dianteiro");
        xogador1.concentrarse();
        adestrador.concentrarse();
        masaxista.concentrarse();
        xogador1.viaxar();
        adestrador.viaxar();
        masaxista.viaxar();
        adestrador.setNome("Rober");
        //integrante.setTitulacion(); non se pode facer
        
        
    }
    
}
