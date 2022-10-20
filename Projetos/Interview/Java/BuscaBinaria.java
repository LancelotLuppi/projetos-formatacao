public class BuscaBinaria {
    public static void main(String[] args) {
        int[] vetor = new int[10000];

        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = i*2;
            //System.out.println(vetor[i]);
        }

        System.out.println("Qual número vc busca?");
        int buscado = 3;

        int contador = 0;
        boolean achou = false;
        int inicio = 0;
        int fim = vetor.length -1;
        int meio;

        while(inicio <= fim){
            meio = (int) ((inicio + fim) /2);
            contador++;
            if(vetor[meio] == buscado) {
                achou = true;
                break;
            } else if(vetor[meio] < buscado) {
                inicio = meio +1;
            } else {
                fim = meio -1;
            }
        }
        if(achou == true) {
            System.out.println("Achou");
        } else {

            System.out.println("Não achou");
        }
        System.out.println("Testes feitos: " + contador);
    }
}
