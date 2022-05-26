package sample;


import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;


import java.io.IOException;

public class Controller {

    @FXML
    private TextArea text1;

    @FXML
    private TextArea text2;

    @FXML
    void addString(MouseEvent event) throws IOException  {

// 文本1 使用gettext方法 获取输入的数据
        String text = text1.getText();
// new 一个加密类
        BASE64Encoder encoder = new BASE64Encoder();
// 调用加密的方法
        String data = encoder.encode(text.getBytes());
// 加密后的数据 显示在文本2里
        text2.setText(new String(data));
    }

    @FXML
    void delString(MouseEvent event) throws IOException {
// 获取数据
        String text = text2.getText();
// new 一个解密类
        BASE64Decoder decoder = new BASE64Decoder();
// 调用解密方法
        byte[] bytes = decoder.decodeBuffer(text);
// 把数据显示在文本1里
        text1.setText(new String(bytes));
    }

}
