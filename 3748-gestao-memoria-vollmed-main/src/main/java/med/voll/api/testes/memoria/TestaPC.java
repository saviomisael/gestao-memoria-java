package med.voll.api.testes.memoria;

public class TestaPC {

    static {
        System.loadLibrary("nativedatetimeutils");
    }

    public static void main(String[] args) {
        System.out.println(1+2);
        System.out.println(soma(3, 5)); // PC Register guarda o endereço dos métodos que são chamados na linha 6, quando os métodos da linha 5 terminar o PC Register faz com que a thread main volte para a linha 6
        System.out.println(soma(4, 9));
//        new TestaPC().getSystemTime();
    }

    public static int soma(int valor1, int valor2){
        return valor1 + valor2;
    }

    public native String getSystemTime(); // chama métodos do c++
}
