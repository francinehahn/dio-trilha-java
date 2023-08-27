package Tarefas;

public class TarefaSet {
   private String descricao;
   private boolean concluida;

   public TarefaSet(String descricao) {
      this.descricao = descricao;
      this.concluida = false;
   }

   public String getDescricao() {
      return this.descricao;
   }

   public boolean getConcluida() {
      return this.concluida;
   }

   public void setConcluida(boolean concluida) {
      this.concluida = concluida;
   }

   public String toString() {
      return "{descricao: " + this.descricao + ", concluida: " + this.concluida + "}";
   }
}
