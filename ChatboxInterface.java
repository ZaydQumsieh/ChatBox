//Pranay Sen
//Cumstain
//Fall Project

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChatboxInterface extends JFrame implements ActionListener {
   private final Font titleFont = new Font("Arial", Font.BOLD, 48);
   private final Font messageFont = new Font("Arial", Font.PLAIN, 35);
   private JLabel title;
   private JTextArea chatHistory;
   private JTextField enterMessage;
   private JButton sendMessage;
   
  
   public ChatboxInterface() throws Exception {
      setSize(1300, 1100);
      setLayout(null);
      setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      
      title = new JLabel("Chat with your friends!");
      title.setBounds(400, 25, 900, 100);
      title.setFont(titleFont);
      add(title);
      
      chatHistory = new JTextArea();
      chatHistory.setBounds(50, 100 , 1175, 700);
      chatHistory.setEditable(false);
      chatHistory.setFont(messageFont);
      chatHistory.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
      add(chatHistory);
      
      
      enterMessage = new JTextField();
      enterMessage.setBounds(50, 825, 975, 175);
      enterMessage.setFont(messageFont);
      add(enterMessage);
      
      ImageIcon sendIcon = new ImageIcon("send.png");
      
      sendMessage = new JButton(sendIcon);
      sendMessage.setBounds(1050, 825, 175, 175);
      sendMessage.addActionListener(this);
      add(sendMessage);
      
      this.getRootPane().setDefaultButton(sendMessage);

      
      setVisible(true);
      
   }
   
   public void actionPerformed(ActionEvent e) {
      String message = enterMessage.getText();
      enterMessage.setText("");
      String messageHistory = chatHistory.getText();
      chatHistory.setText(messageHistory + "\n" + "Pranay: " +  message + "\n" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      
   }
   
   public static void main(String[] args) throws Exception{
      new ChatboxInterface();
   }
}