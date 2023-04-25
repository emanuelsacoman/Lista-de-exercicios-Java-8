public class Bicicleta extends Veiculo{
    public Bicicleta(){
        System.out.println("É uma bicicleta");
    }
    @Override
    public void verificar(){
        System.out.println("Verificar bicicleta");
    }
    @Override
    public void ajustar(){
        System.out.println("Ajustar bicicleta");
    }
    @Override
    public void limpar(){
        System.out.println("Limpar bicicleta");
    }
}
