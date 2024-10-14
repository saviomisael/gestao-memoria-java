package med.voll.api.testes.memoria;

public class TestaString {
    public static void main(String[] args) {
        String valor1 = "alura"; // vai para o pool de strings, imutáveis
        String valor2 = "alura";
        System.out.println(valor1 == valor2);

        String valor3 = new String("alura");
        System.out.println(valor1 == valor3);
        System.out.println(valor1.equals(valor3));

        System.out.println(valor1.hashCode());

        valor1 = valor1 + "Programacao";
        System.out.println(valor1);

        System.out.println(valor1.hashCode());

        StringBuilder resultado = new StringBuilder(); // StringBuilder não é thread safe, mas o StringBuffer é
        for(int i = 1; i<=100; i++){
            resultado.append(i).append(" ");
        }
        System.out.println(resultado);
    }
}