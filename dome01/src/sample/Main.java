package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    // 继承Application  需要重写方法
    @Override
    // 创建一个 舞台 可以理解为程序的界面
    public void start(Stage primaryStage) throws Exception{
        // 类加载器 加载当前的fxml文件
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        // 设置一个title
        primaryStage.setTitle("by finger");
        // 设置一个窗口大小
        primaryStage.setScene(new Scene(root, 500, 300));
        // 展示窗口
        primaryStage.show();
    }

    public static void main(String[] args) {
        //运行程序
        launch(args);
    }
}
