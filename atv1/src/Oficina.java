import java.util.Random;
public class Oficina {
    Random random = new Random();
    public Veiculo proximo(){
        Veiculo veiculo;
        int codigo = random.nextInt(100);
        if (codigo %2 == 0)
            veiculo = new Automovel();
        else
            veiculo = new Bicicleta();
        return veiculo;
    }
    public void revisar(Veiculo veiculo){
        veiculo.verificar();
        veiculo.ajustar();
        veiculo.limpar();
    }
}
