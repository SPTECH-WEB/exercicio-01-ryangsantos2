package com.exercicio1gitclassroom.exercicio1gitclassroom.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "faturas")

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Fatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //16 caractere fracionado em 4 partes, como um cartao
    @NotNull(message = "O campo do número do cartão não pode estar vazio")
    @Digits(integer = 16, fraction = 4, message = "Numero do cartao invalido")
    private String numeroCartao;

    @NotNull(message = "O campo nome não pode estar vazio")
    @Size(min = 3, max = 100, message = "Numero de caracteres invalido")
    private String nomeTitular;

    @NotNull(message = "O campo valor não pode estar vazio")
    @DecimalMax(value = "5000.0", message = "O valor deve ser maior que 9.99")
    @DecimalMin(value="10.0", message = "O valor máximo é de R$5000,00")
    private Double valor;

    @NotNull(message = "A data de pagamento não pode estar vazia")
    @FutureOrPresent(message = "A data de vencimento deve ser a data atual ou futura")
    private LocalDate dataPagamento;

    @NotNull(message = "O campo email não pode estar vazio")
    @Email(message = "Email inválido")
    private String emailContato;

}


