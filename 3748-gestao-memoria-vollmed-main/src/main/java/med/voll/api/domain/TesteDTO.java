package med.voll.api.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "testes")
//@NoArgsConstructor não pode ser usado em um record / record serve para body mas não serve para entity
public record TesteDTO(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) int id, @Column(nullable = false) String nome, @Column(nullable = false) String sobrenome, @Column(nullable = false) LocalDate dataDeNascimento) {
    public int getIdade() {
        return Period.between(dataDeNascimento, LocalDate.now()).getYears();
    }
}
