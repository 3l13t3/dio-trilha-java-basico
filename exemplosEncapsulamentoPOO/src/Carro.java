public class Carro {

    public  void ligar() {
        conferirCambio();
        conferirCombustivel();
        System.out.println("Carro ligado");
    }

    private void conferirCombustivel() {
        System.out.println("Conferindo combustivel");
    }

    private void conferirCambio() {
        System.out.println("Conferindo cambio em P");
    }
}