public class main {

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
