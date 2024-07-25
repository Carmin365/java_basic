   public class ExemploOperadores {
        public static void main(String[] args) {
            int a = 15, b = 5;
    
            // Operadores aritméticos
            int soma = a + b;
            int subtracao = a - b;
            int multiplicacao = a * b;
            int divisao = a / b;
            int modulo = a % b;
    
            // Operadores relacionais
            boolean maiorQue = a > b;
            boolean menorIgual = a <= b;
    
            // Operadores lógicos
            boolean e = maiorQue && menorIgual; // E lógico
            boolean ou = maiorQue || menorIgual; // Ou lógico
            boolean negacao = !maiorQue; // Negação
    
            System.out.println("Soma: " + soma);
            // ... outros resultados
        }
    }

