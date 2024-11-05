import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {
  public static void main(final String[] args) {

    List<Participante> participantes = new ArrayList<Participante>();

    System.out.println("Olá, seja bem vindo ao programa");

    Participante b = new Participante("fogo");
    b.addVitoria(5);
    b.addGolsAfavor(20);

    Participante c = new Participante("agua");
    c.addVitoria(5);
    c.addGolsAfavor(20);

    Participante d = new Participante("terra");
    d.addVitoria(5);
    d.addGolsAfavor(20);

    participantes.add(b);
    participantes.add(c);
    participantes.add(d);

    for(Participante p : participantes){
      System.out.println(p.getResumo());
    }
    
    //... criacao dos objetos
    
    //... inclusao de valores
    
   // Collections.sort(participantes)
   
    // imprimir todas as linhas dos participantes

}
}
