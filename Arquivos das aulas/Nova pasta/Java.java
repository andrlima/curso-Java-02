public class Exemplo {

    public static void main(String args[]) {

      int n1 = 2;
      int n2 = 3;
  
      // chamando (ou invocando) o método "somarValores"
      // "n1" e "n2" são os argumentos usados na chamada
      System.out.printf("%d + %d = %d\n\n", n1, n2, somarValores(n1, n2));

    }
  
    // "a" e "b" são os parâmetros do método "somarValores"
    public static int somarValores(int a, int b) { // cabeçalho do método "somarValores"

      return(a + b);

    }

    
  
}