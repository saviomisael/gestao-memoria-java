package med.voll.api.testes.memoria;

import med.voll.api.domain.paciente.Paciente;

import java.util.Optional;

public class Principal {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
//        paciente.consultas(); // gera StackOverflowError
        System.out.println(paciente);

        Paciente paciente2 = new Paciente(); // não é criado na Stack mas sim na Heap
        System.out.println(paciente == paciente2);

        paciente2 = paciente;
        System.out.println(paciente == paciente2);

        String nome = "Iasmin"; //String é uma classe

        paciente.setNome(nome);
        System.out.println(paciente2.getNome());

        paciente2.setNome("Savio");
        System.out.println(paciente.getNome());

        Optional<String> textoOpt = Optional.ofNullable(null);
        textoOpt.ifPresent(texto -> {
            System.out.println(texto.length());
        });
    }
}
