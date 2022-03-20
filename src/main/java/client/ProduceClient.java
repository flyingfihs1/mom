package client;

import com.google.gson.Gson;
import model.Student;

import java.io.IOException;


public class ProduceClient {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        Student student = new Student("1910300103", "tj");
        System.out.println("生产者生产对象消息：" + student);
        MqClient.produce(gson.toJson(student));
    }
}
