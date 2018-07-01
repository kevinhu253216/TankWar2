import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankClient extends Frame {

    public static void main(String[] args){
        TankClient tc = new TankClient();
        tc.launchFrame();
    }

    public void launchFrame(){
        this.setLocation(400,300);
        this.setSize(800,600);
        this.addWindowListener(new WindowAdapter() {// 匿名类 类短小，不涉及将来的扩展，不涉及重要的业务逻辑
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setResizable(false);//不能改变大小
        this.setTitle("TankWar");
        this.setVisible(true);
    }
}
