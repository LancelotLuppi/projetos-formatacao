public class NaoRepetido {
    public static void main(String[] args) {
        
        String input = "teetedr";

        for(char i: input.toCharArray()){
            if(input.indexOf(i) == input.lastIndexOf(i)){
                System.out.println(i);
                break;
            }
        }

    }
}
