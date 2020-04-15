package lesson6;

import java.io.IOException;
import java.net.Socket;


public class Client {
    private final String SERVER_ADDR = "localhost";
    private final int SERVER_PORT = 9090;

    private Socket socket;

    //Конструктор клиента
    public Client() {
        try {
            socket = new Socket(SERVER_ADDR, SERVER_PORT);
            new Exchange(socket);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //Создаем объект клиента, дальше отработает конструктор
        new Client();
    }



}
