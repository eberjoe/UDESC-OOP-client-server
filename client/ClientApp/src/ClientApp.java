import java.net.Socket;
import java.io.*;

public class ClientApp {

    public static void main(String[] args) {
        try{
        Socket client = new Socket("192.168.6.78", 8830);
        System.out.println("Conectado! " + client.toString());
        } catch (IOException ex) {
            System.out.println("Erro criando o cliente!");
        }
    }
    
}
