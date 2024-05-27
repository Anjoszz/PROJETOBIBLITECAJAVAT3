package com.mycompany.projetofinalado;

import java.util.regex.Pattern;

public class Utilitarios {
    public static boolean validarCPF(String cpf) {
        // Implementação da validação de CPF (simplificada)
        return Pattern.matches("\\d{11}", cpf);
    }
}
