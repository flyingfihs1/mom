package client;

import com.google.gson.Gson;
import model.Student;

import java.io.IOException;

public class ConsumeClient {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        String message = MqClient.consume();
        System.out.println("消费的消息为 : " + message);
        Student result = gson.fromJson(message, Student.class);
        System.out.println("接收到的对象：" + result);
    }
}
