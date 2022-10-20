public class StringReverso {
    
    static String Reverso(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    /* Caso não permita StringBuffer:
     *
     *
     * Usando for:
     *  static String ReversoFor(String str) {
     *      String reverse = "";
     *      for (int i = str.length()-1; i>=0; i--){
     *          reverse += str.charAt(i);
     *      }
     *      return reverse;
     *  }
     * 
     * 
     * Usando while:
     * 
     *  static String ReversoWhile(String str) {
     *      char[] in = st.toCharArray();
     *      int begin = 0;
     *      int end = in.length-1;
     *      char temp;
     *      while(end>begin) {
     *          temp = in[begin];
     *          in[begin] = in[end];
     *          in[end] = temp;
     *          end--;
     *          begin++;
     *      }
     *      return new String(in);
     *   
     * }
     */

    public static void main(String[] args) {
        String input = "luppi";
        System.out.println(Reverso(input));
    }
}
