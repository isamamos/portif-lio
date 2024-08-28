import java.util.Scanner;

public class Decodificador {

    // Método para criptografar o texto (substituição simples de letras)
    public static String criptografar(String texto) {
        // Substitui 'a' por 'b', 'b' por 'c', e assim por diante
        StringBuilder textoCriptografado = new StringBuilder();
        for (char c : texto.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                textoCriptografado.append((char) ((c - 'a' + 1) % 26 + 'a'));
            } else if (c >= 'A' && c <= 'Z') {
                textoCriptografado.append((char) ((c - 'A' + 1) % 26 + 'A'));
            } else {
                textoCriptografado.append(c);
            }
        }
        return textoCriptografado.toString();
    }

    // Método para descriptografar o texto
    public static String descriptografar(String texto) {
        // Reverte a substituição feita no método criptografar
        StringBuilder textoDescriptografado = new StringBuilder();
        for (char c : texto.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                textoDescriptografado.append((char) ((c - 'a' - 1 + 26) % 26 + 'a'));
            } else if (c >= 'A' && c <= 'Z') {
                textoDescriptografado.append((char) ((c - 'A' - 1 + 26) % 26 + 'A'));
            } else {
                textoDescriptografado.append(c);
            }
        }
        return textoDescriptografado.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o texto a ser criptografado:");
        String texto = scanner.nextLine();
        
        String textoCriptografado = criptografar(texto);
        System.out.println("Texto criptografado: " + textoCriptografado);

        String textoDescriptografado = descriptografar(textoCriptografado);
        System.out.println("Texto descriptografado: " + textoDescriptografado);

        scanner.close();
    }
}
