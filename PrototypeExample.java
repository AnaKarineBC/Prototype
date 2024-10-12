public class PrototypeExample {
    public static void main(String[] args) {
        // Criando um objeto carro original
        Carro carroOriginal = new Carro("Sedan", "Vermelho");
        System.out.println("Carro Original: " + carroOriginal);

        // Clonando o objeto carroOriginal
        Carro carroClonado = carroOriginal.clone();
        System.out.println("Carro Clonado: " + carroClonado);

        // Alterando o carro clonado
        carroClonado.setCor("Azul");
        System.out.println("Carro Clonado (alterado): " + carroClonado);

        // Verificando que o objeto original não foi alterado
        System.out.println("Carro Original após alteração do clone: " + carroOriginal);
    }
}
