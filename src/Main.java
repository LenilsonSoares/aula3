public class Main {
    public static void main(String[] Args) {

        Carro meuCarro = new  Carro("Toyota", "Corolla", 2020, "Azul", 15689, 149000.00);



        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Ano: " + meuCarro.getAno());
        System.out.println("Cor: " + meuCarro.getCor());
        System.out.println("Quilometragem: " + meuCarro.getQuilometragem());
        System.out.println("Preço: " + meuCarro.getPreco());
    }
}
