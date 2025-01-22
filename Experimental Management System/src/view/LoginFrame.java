package view;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class LoginFrame extends JFrame {
	JLabel l_id, l_role, l_password;
	JTextField t_id;
	JComboBox<String> c_role;
	JPasswordField p_password;
	JButton btn_reset, btn_login, btn_register;


	public LoginFrame() {
		setTitle("登录窗体");
		this.setSize(375, 250);
		this.setLocation(400, 200);
		init();
		this.setVisible(true);

	}

	void init() {
		this.setLayout(null);

		l_id = new JLabel("用户账号", JLabel.CENTER);
		l_role = new JLabel("用户类型", JLabel.CENTER);
		l_password = new JLabel("用户密码", JLabel.CENTER);

		t_id = new JTextField();
		c_role = new JComboBox<String>();
		c_role.addItem("学生");
		c_role.addItem("教师");
		c_role.addItem("管理员");
		p_password = new JPasswordField();
		btn_reset = new JButton("重置");
		btn_login = new JButton("登录");
		btn_register = new JButton("注册");
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3, 2, 5, 5));

		p.add(l_id);
		p.add(t_id);
		p.add(l_role);
		p.add(c_role);
		p.add(l_password);
		p.add(p_password);
		p.setBounds(5, 5, 280, 150);
		add(p);

		//	JPanel p1 = new JPanel();
		p = new JPanel();
		p.setLayout(new GridLayout(1, 3, 5, 5));
		p.add(btn_reset);
		p.add(btn_login);
		p.add(btn_register);
		p.setBounds(5, 160, 350, 50);

		add(p);


	}

	public static void main(String[] args) {
		new LoginFrame();
	}
}