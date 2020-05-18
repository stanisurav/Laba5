
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Project3 {
public static void main(String args[]) {

String dlina = JOptionPane.showInputDialog("Длина (см)");

Font font = new Font(null, Font.ITALIC, 23);
Font font1 = new Font(null, Font.ITALIC, 11);
JFrame frame = new JFrame();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JPanel panel = (JPanel) frame.getContentPane();
Dimension size = new Dimension(200, 200);
frame.setLayout(null);

JLabel label1 = new JLabel("ПИ-218");
panel.add(label1);
label1.setFont(font);
label1.setBounds(750, 20, size.width, size.height);

JLabel label16 = new JLabel("Руководитель: Казанцев");
panel.add(label16);
label16.setFont(font);
label16.setBounds(670, 130, 300, 30);

JLabel label2 = new JLabel("Короленко С.С.");
panel.add(label2);
label2.setFont(font);
label2.setBounds(600, 100, size.width, size.height);

JLabel label4 = new JLabel("Шайхинуров Т.А.");
panel.add(label4);
label4.setFont(font);
label4.setBounds(600, 200, size.width, size.height);

JLabel labelmail1 = new JLabel("Fosterygaty@yandex.ru");
panel.add(labelmail1);
labelmail1.setFont(font);
labelmail1.setBounds(600, 250, 300, size.height);

JLabel label6 = new JLabel("Хисматуллин О.М.");
panel.add(label6);
label6.setFont(font);
label6.setBounds(600, 300, 300, size.height);

JLabel label8 = new JLabel("Исаев С.С.");
panel.add(label8);
label8.setFont(font);
label8.setBounds(600, 400, size.width, size.height);

JLabel label10 = new JLabel("V=" + 0.6*100*0.02*100*Double.parseDouble(dlina)+" cм^3 =" + (0.6*100*0.02*100*Double.parseDouble(dlina))/1000000+" м^3");
panel.add(label10);
label10.setFont(font);
label10.setBounds(610, 500, size.width+1000, size.height);

ImageIcon imgIco = new ImageIcon("./src/usatu.jpg");
Image image = imgIco.getImage();
Image newimg = image.getScaledInstance(450, 200, java.awt.Image.SCALE_SMOOTH);
imgIco = new ImageIcon(newimg);
JLabel img = new JLabel(imgIco);
panel.add(img);
img.setBounds(0,0, size.width+250,size.height+250);

JButton button1 = new JButton("Мнемосхема");
panel.add(button1);
button1.setFont(font);
button1.setBounds(200, 500, size.width, size.height);

JButton button2 = new JButton("Информация ");
panel.add(button2);
button2.setFont(font);
button2.setBounds(200, 400, 200, 100);

JLabel labelInf = new JLabel("Кнопка информации добавлена");
panel.add(labelInf);
labelInf.setFont(font);
labelInf.setBounds(100, 280, 450, 200);

JLabel labelI = new JLabel(info.info);
panel.add(labelI);
labelI.setFont(font);
labelI.setBounds(100, 10, 450, 150);

button1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
ImageIcon imgIco1 = new ImageIcon("./src/mnemos.png");
Image image1 = imgIco1.getImage();
Image newimg1 = image1.getScaledInstance(450, 200, java.awt.Image.SCALE_SMOOTH);
imgIco1 = new ImageIcon(newimg1);
JLabel img1 = new JLabel(imgIco1);

JLabel label15 = new JLabel(
		"<html><b>Описание интерфейса для входа в депозитный калькулятор.</b>" + 
		"<b>При запуска приложения депозитного калькулятора </b>" + 
		"<b>открывается окно авторизации, куда мы вводим логин или пароль.</b>" + 
		"<b>Также присутствуют 2 кнопки ниже закрыть и войти.</b>" + 
		"<b>При входе будет доступен весь интерфейс калькулятора.</b>" + 
		"<b>Если нажать кнопку закрытия, то приложение будет закрыто.</b>");
panel.add(label15);
label15.setFont(font1);
label15.setBounds(850, 200, 500, 500);

JLabel label11 = new JLabel("ФГБОУ ВО");
panel.add(label11);
label11.setFont(font);
label11.setBounds(600, 10, 200, 30);

JLabel labelUGATU = new JLabel("Уфимский государственный авиационный технический университет");
panel.add(labelUGATU);
labelUGATU.setFont(font);
labelUGATU.setBounds(400, -15, size.width+800, size.height);


JLabel label9 = new JLabel("http://asu.ugatu.ac.ru/");
panel.add(label9);
label9.setFont(font);
label9.setBounds(850, 900, 300, 30);

panel.add(img1);
img1.setBounds(500,500, size.width+250,size.height+250);
}
});

frame.setPreferredSize(new Dimension(400, 600));

frame.setSize(1500, 1000);
frame.setVisible(true);
}
}