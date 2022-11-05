package selenium_NavigateOnClick;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.openqa.selenium.chrome.ChromeDriver;


public class NavigateOnClick implements ActionListener {
	
	private JFrame frame;
	private JPanel panel;
	
	public NavigateOnClick() {
		
		frame = new JFrame();
		
		JButton button = new JButton("Navigate on Chrome");
		button.addActionListener(this);
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(100,100, 100, 100));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Navigate on Click");
		frame.pack();
		frame.setVisible(true);
	}
	
	
	

	public static void main(String[] args) {
		
		new NavigateOnClick();
		
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		//System.setProperty("webdriver.chrome.driver", "/Users/giorgiodesimone/Downloads/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}

}
