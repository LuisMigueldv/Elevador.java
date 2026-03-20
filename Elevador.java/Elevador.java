public class Elevador {
 
   int andarAtual;
   int andarMaximo;
   boolean portaAberta;
 
   public Elevador() {
       andarAtual = 0;
       andarMaximo = 10;
       portaAberta = false;
   }
 
   public void subir() {
       if (portaAberta) {
           System.out.println("Feche a porta antes de subir!");
       } else if (andarAtual == andarMaximo) {
           System.out.println("Já está no último andar!");
       } else {
           andarAtual = andarAtual + 1;
           System.out.println("Subindo... Andar: " + andarAtual);
       }
   }
 
   public void descer() {
       if (portaAberta) {
           System.out.println("Feche a porta antes de descer!");
       } else if (andarAtual == 0) {
           System.out.println("Já está no térreo!");
       } else {
           andarAtual = andarAtual - 1;
           System.out.println("Descendo... Andar: " + andarAtual);
       }
   }
 
   public void abrirPorta() {
       portaAberta = true;
       System.out.println("Porta aberta.");
   }
 
   public void fecharPorta() {
       portaAberta = false;
       System.out.println("Porta fechada.");
   }
 
   public void mostrarAndar() {
       System.out.println("Andar atual: " + andarAtual);
   }
 
   public void mostrarPorta() {
       if (portaAberta) {
           System.out.println("A porta está ABERTA.");
       } else {
           System.out.println("A porta está FECHADA.");
       }
   }
 
   public static void main(String[] args) {
 
       Elevador elevador = new Elevador();
 
       elevador.mostrarAndar();
       elevador.mostrarPorta();
 
       elevador.subir();
       elevador.subir();
       elevador.subir();
 
       elevador.abrirPorta();
       elevador.subir();
 
       elevador.fecharPorta();
       elevador.subir();
 
       elevador.descer();
       elevador.mostrarAndar();
   }
}




