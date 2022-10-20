public class BubbleSort {


    public static void sort(int[] vet){
        int aux = 0;
        int i = 0;
        int len = vet.length -1;
        for(i = 0; i<len; i++){
            for(int j = 0; j<len-1; j++){
                if(vet[j] > vet[j + 1]){
                    aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            }
        }
    }
    
    
    public static void main(String[] args) {
        int[] array = {10,5,8,12,32};
        int len = array.length;
        for(int i=0; i<len; i++){
            System.out.println(" " + array[i]);
        }
        

    }
}
