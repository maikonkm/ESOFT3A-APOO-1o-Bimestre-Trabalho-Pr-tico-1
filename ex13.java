package EXE13;
/******************************************************************************
Curso: Engenharia de Software
Disciplina: Análise e Projeto Orientado a Objetos
Professor: José Carlos Flores
Turma: ESOFT3A
Exercício: 13 - Interface e Implementação
Componentes:

 Guilherme Garcia Da Cruz - 25229817-2
 Lucas Henrique Zeferino  - 25119616-2
 Maikon Vinicio Duarte dos Santos - 25165588-2

Data: 17 de Março de 2026
Descritivo: Programa que define uma interface Veiculo com métodos
            acelerar() e frear(), implementada pela classe Carro
*******************************************************************************/

// ==========================================
// INTERFACE: Veiculo
// Define o "contrato" que toda classe veiculo deve seguir
// Qualquer classe que implemente Veiculo OBRIGATORIAMENTE
// deve ter os metodos acelerar() e frear()
// ==========================================
interface Veiculo {

    // -----------------------------------------------
    // METODO ABSTRATO: acelerar()
    // Nao possui corpo aqui — cada classe que implementar
    // a interface e responsavel por definir o comportamento
    // -----------------------------------------------
    void acelerar();

    // -----------------------------------------------
    // METODO ABSTRATO: frear()
    // Assim como acelerar(), e apenas uma assinatura —
    // a implementacao fica na classe Carro
    // -----------------------------------------------
    void frear();
}


// ==========================================
// CLASSE: Carro
// Implementa a interface Veiculo
// O "implements Veiculo" obriga a classe a definir
// todos os metodos declarados na interface
// ==========================================
class Carro implements Veiculo {

    // Atributos privados — so acessiveis dentro desta classe
    private String modelo;       // Armazena o modelo do carro
    private int velocidadeAtual; // Armazena a velocidade atual em km/h

    // -----------------------------------------------
    // CONSTRUTOR de Carro
    // Chamado ao criar: new Carro("Civic")
    // Inicializa o modelo e define velocidade como 0
    // -----------------------------------------------
    public Carro(String modelo) {
        this.modelo = modelo;
        this.velocidadeAtual = 0; // Carro comeca parado
    }

    // -----------------------------------------------
    // METODO IMPLEMENTADO: acelerar()
    // Implementacao obrigatoria exigida pela interface Veiculo
    // Aumenta a velocidade em 10 km/h a cada chamada
    // e exibe a velocidade atual no console
    // -----------------------------------------------
    @Override
    public void acelerar() {
        velocidadeAtual += 10;
        System.out.println(modelo + " acelerando... Velocidade atual: " + velocidadeAtual + " km/h");
    }

    // -----------------------------------------------
    // METODO IMPLEMENTADO: frear()
    // Implementacao obrigatoria exigida pela interface Veiculo
    // Reduz a velocidade em 10 km/h a cada chamada
    // Garante que a velocidade nao fique negativa
    // -----------------------------------------------
    @Override
    public void frear() {
        if (velocidadeAtual > 0) {
            velocidadeAtual -= 10;
            if (velocidadeAtual < 0) velocidadeAtual = 0;
            System.out.println(modelo + " freando...    Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println(modelo + " ja esta parado!");
        }
    }

    // -----------------------------------------------
    // GETTER: getModelo()
    // Retorna o valor do atributo privado "modelo"
    // -----------------------------------------------
    public String getModelo() { return modelo; }

    // -----------------------------------------------
    // GETTER: getVelocidadeAtual()
    // Retorna a velocidade atual do carro
    // -----------------------------------------------
    public int getVelocidadeAtual() { return velocidadeAtual; }
}


// ==========================================
// CLASSE PRINCIPAL: Main
// Ponto de entrada do programa — o Java sempre comeca pelo main()
// ==========================================
public class Main {

    // -----------------------------------------------
    // METODO: main()
    // E o primeiro metodo executado quando o programa roda
    // "public static void" = acessivel, nao precisa de objeto, nao retorna nada
    // "String[] args" = argumentos opcionais passados pelo terminal
    // -----------------------------------------------
    public static void main(String[] args) {

        // Cria o primeiro carro — variavel do tipo Veiculo (polimorfismo)
        Veiculo carro1 = new Carro("Civic");

        System.out.println("=== Teste com: Civic ===");
        carro1.acelerar(); // Velocidade: 10 km/h
        carro1.acelerar(); // Velocidade: 20 km/h
        carro1.acelerar(); // Velocidade: 30 km/h
        carro1.frear();    // Velocidade: 20 km/h
        carro1.frear();    // Velocidade: 10 km/h
        carro1.frear();    // Velocidade: 0 km/h
        carro1.frear();    // Ja esta parado!

        System.out.println("---");

        // Cria o segundo carro com modelo diferente
        Veiculo carro2 = new Carro("Fusca");

        System.out.println("=== Teste com: Fusca ===");
        carro2.acelerar(); // Velocidade: 10 km/h
        carro2.acelerar(); // Velocidade: 20 km/h
        carro2.frear();    // Velocidade: 10 km/h
    }
}