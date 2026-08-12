package br.edu.nexuslog.legacy;

public class LegacyShippingService {
    public double process(String customerName, String freightType, double weightKg, String carrier) {

        double price = 0.0;

        // Ao invez de utilizar os ifs, utilizar um Enum para os tipos de frete é uma melhor opção, juntemente dele já colocariamos os valores fixos necessários para realizar o calculo do valor do frete, e, com isso, pderíamos fazer um método separado justamente para calcular isso, já que a formula é a mesma para todos os tipos presentes.
        if ("ECONOMICO".equals(freightType)) {
            price = 10.0 + weightKg * 1.5;
        } else if ("EXPRESSO".equals(freightType)) {
            price = 25.0 + weightKg * 3.0;
        } else if ("PRIORITARIO".equals(freightType)) {
            price = 40.0 + weightKg * 4.5;
        }

        // Também poderíamos utilizar Enums para as diferentes transportadoras, o que evitaria erro de ter q digirar gorretamente a transportadora, e facilitaria para a seleção do usuário
        if ("CORREIOS".equals(carrier)) {
            System.out.println("Chamando API Correios...");
        } else if ("RAPIDEX".equals(carrier)) {
            System.out.println("Chamando API Rapidex...");
        }

        // Criar um método para gerenciar o envio de notificações, e um expecífico para gerenciar cada tipo de notificação, por exemplo essa mostrada, um método com a estrutura de envio das notificações de email e um método para gerenciar a estrutura que essas notificações deve ser estruturada em todos os tipos diferentes de envio
        System.out.println("Enviando e-mail para " + customerName);

        // Método para gerar o log de envio, e um outro para gerencia-lo
        System.out.println("Registrando log de envio para " + customerName);
        return price;
    }
}