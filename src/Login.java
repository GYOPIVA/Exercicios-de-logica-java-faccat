package Faccat;

import javax.swing.*;

public class Login {

    public static void main(String[] args) {

        String[] usuarios = {"Admin", "Gio2026", "LocalUser"};
        String[] senhas = {"Admin2026", "Giovany@2026", "Local@user"};

        String usuarioDigitado = JOptionPane.showInputDialog("Digite seu usuário:");

        int indiceUsuario = -1;

        // Procura o usuário e guarda seu índice
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i].equals(usuarioDigitado)) {
                indiceUsuario = i;
                break;
            }
        }

        // Usuário não encontrado
        if (indiceUsuario == -1) {
            JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
            return;
        }

        byte tentativas = 3;
        boolean loginRealizado = false;

        while (tentativas > 0) {

            String senhaDigitada = JOptionPane.showInputDialog(
                    "Digite sua senha:\nTentativas restantes: " + tentativas);

            if (senhaDigitada.equals(senhas[indiceUsuario])) {
                loginRealizado = true;
                break;
            }

            tentativas--;

            if (tentativas > 0) {
                JOptionPane.showMessageDialog(
                        null,
                        "Senha inválida!\nRestam " + tentativas + " tentativa(s)."
                );
            }
        }

        if (loginRealizado) {
            JOptionPane.showMessageDialog(null,
                    "Login efetuado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Acesso bloqueado! Você excedeu o número de tentativas.");
        }
    }
}