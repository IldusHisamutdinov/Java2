package lesson6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    Socket socket = null;

    //Конструктор сервера
    public Server() {
        try (ServerSocket serverSocket = new ServerSocket(9090)) {
            System.out.println("Сервер запущен, ожидаем подключения...");
            socket = serverSocket.accept();
            System.out.println("Клиент подключился " + socket.getLocalAddress());
            new Exchange(socket);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //Создаем объект сервера, дальше отработает конструктор
        new Server();
    }
}
