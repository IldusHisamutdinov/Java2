package lesson6;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Exchange {
    private Socket socket = null;
    private DataInputStream in = null;
    private DataOutputStream out = null;

    private Scanner scanner = new Scanner(System.in);

    //Конструктор для клиента
    public Exchange(Socket socket){
        try {
            this.socket = socket;
            this.in = new DataInputStream(socket.getInputStream());
            this.out = new DataOutputStream(socket.getOutputStream());
            Thread receiveMsg = new Thread(()->this.receiveMsg());
            Thread sendMsg = new Thread(()->this.sendMsg());
            receiveMsg.start();
            sendMsg.setDaemon(true);
            sendMsg.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Метод получения сообщений из входного потока
    public void receiveMsg(){
        try{
            while (true) {
                String str = in.readUTF();
                System.out.println(str);
                if (str.equals("/end")) {
                    System.out.println("Получена команда на отключение");
                    out.writeUTF("/end");
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
    }

    //Метод отправки сообщений в выходной поток
    public void sendMsg(){
        try {
            while (true){
                String str = scanner.nextLine();
                if (!str.trim().isEmpty()){
                    out.writeUTF(str);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void closeConnection () {
        try {
            System.out.println("Закрываем входной поток");
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Закрываем выходной поток");
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Закрываем сокет");
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}