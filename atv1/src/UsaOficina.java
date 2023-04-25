public class UsaOficina {
    public static void main(String[] args) throws Exception {
        Oficina oficina = new Oficina();
        Veiculo veiculo;
        for(int i=0;i<4;i++){
            veiculo = oficina.proximo();
            oficina.revisar(veiculo);
        }
        System.out.print("\n\n\tResposta:");
        System.out.print("\n\nO códgo rodará um máximo de 4 vezes, cada vez que rodar será feita uma verificação \npara saber se 'código' é par (uma verificação totalmente aleatória usando o método netxInt(100)), \ncaso seja, o parâmetro utilizado em 'oficina.revisar()' será de 'Automovel()', \ncaso seja impar, será de 'Bicicleta()', o que nos trará resultados diferentes.");
    }
}