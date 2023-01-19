package Modelos;

import Enum.Porte;
import Enum.EstadoAnimal;
import java.util.Date;
import java.util.List;

public abstract class Animais {
   protected String nome;
   protected Date nascimento;
   protected String raca;
   protected Porte porte;
   protected Double peso;
   protected EstadoAnimal estadoanimal;
   protected List<EsquemaVacinal> vacinas;
   protected String observacao;

   public Animais(String nome, String raca, Porte porte, Double peso, EstadoAnimal estadoanimal, List<EsquemaVacinal> vacinas, String observacao) {
      this.nome = nome;
      this.raca = raca;
      this.porte = porte;
      this.peso = peso;
      this.estadoanimal = estadoanimal;
      this.vacinas = vacinas;
      this.observacao = observacao;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public Date getNascimento() {
      return nascimento;
   }

   public void setNascimento(Date nascimento) {
      this.nascimento = nascimento;
   }

   public String getRaca() {
      return raca;
   }

   public void setRaca(String raca) {
      this.raca = raca;
   }

   public Porte getPorte() {
      return porte;
   }

   public void setPorte(Porte porte) {
      this.porte = porte;
   }

   public Double getPeso() {
      return peso;
   }

   public void setPeso(Double peso) {
      this.peso = peso;
   }

   public Enum getEstadoanimal() {
      return estadoanimal;
   }

   public void setEstadoanimal(EstadoAnimal estadoanimal) {
      this.estadoanimal = estadoanimal;
   }

   public List<EsquemaVacinal> getVacinas() {
      return vacinas;
   }

   public void setVacinas(EsquemaVacinal vacinas) {
      this.vacinas.add(vacinas);
   }

   public String getObservacao() {
      return observacao;
   }

   public void setObservacao(String observacao) {
      this.observacao = observacao;
   }
}