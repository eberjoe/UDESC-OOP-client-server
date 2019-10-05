package serverapp;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class ServerApp {

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(8830);
            do {
                Socket s = server.accept();
                System.out.println("Conectou-se o IP > " + s.getInetAddress().getHostAddress());
            } while (true);
        } catch (IOException ex) {
            System.out.println("Erro criando o server!");
        }
    }
    
}
