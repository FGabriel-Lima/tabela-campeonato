import java.lang.Comparable;

public class Participante implements Comparable{
  private String nome;
  private Integer vitorias, empates, derrotas, golsAFavor, golsContra;

  public Participante(String nome){
    this.nome = nome;
    vitorias = empates = derrotas = golsAFavor = golsContra = 0;
  }

  public void addVitoria(Integer v){
    this.vitorias += v;
  }

  public void addEmpates(Integer e){
    this.empates += e;
  }

  public void addDerrotas(Integer d){
    this.derrotas += d;
  }

  public void addGolsAfavor(Integer gf){
    this.golsAFavor += gf;
  }

  public void addGolsContra(Integer gc){
    this.golsContra += gc;
  }

  public String getResumo(){
    return this.nome + ", " +
           this.vitorias + ", " +
           this.empates + ", " +
           this.derrotas + ", " +
           this.golsAFavor + ", " +
           this.golsContra;
  }

  public int compareTo(Participante outro) {
    if(this.vitorias > outro.vitorias){
      return -1;
    }else if(this.vitorias < outro.vitorias){
      return 1;
    }else{
      return 0;
    }
  }
}
