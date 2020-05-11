import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
public class TelaComTextoEBotoes extends JFrame implements ActionListener {
   private JTextField texto;
   private JLabel lblTexto;
   private JButton btnMostrar, btnLimpar, btnSair;
   public TelaComTextoEBotoes(){
      super("Seja Bem Vindo");
      JPanel painelEntradaTexto = new JPanel(new GridLayout(1, 2));
      JPanel painelEntrada = new JPanel(new FlowLayout());
      texto = new JTextField(14);
      lblTexto = new JLabel ("Digite um Texto de Entrada:");
      painelEntradaTexto.add(lblTexto);
      painelEntradaTexto.add(texto);
      painelEntrada.add(painelEntradaTexto);
      
      JPanel painelBotoes = new JPanel(new FlowLayout());
      btnMostrar = new JButton("Mostrar");
      btnLimpar = new JButton("Limpar");
      btnSair = new JButton("Sair");
      painelBotoes.add(btnMostrar);
      painelBotoes.add(btnLimpar);
      painelBotoes.add(btnSair);
      
      Container caixa = getContentPane();
      caixa.setLayout(new BorderLayout());
      caixa.add(painelEntrada, BorderLayout.CENTER);
      caixa.add(painelBotoes, BorderLayout.SOUTH);
      
      btnMostrar.addActionListener(this);
      btnLimpar.addActionListener(this);
      btnSair.addActionListener(this);
      
      setSize(400, 110);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setVisible(true);
   }
   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == btnMostrar) {
         String txt = texto.getText();
         JOptionPane.showMessageDialog(null, txt);
      } else if (e.getSource() == btnLimpar) {
         texto.setText("");
      } else {
         System.exit(0);
      }

   }
   public static void main(String[] args){
      SwingUtilities.invokeLater(new Runnable (){
         public void run (){
            new TelaComTextoEBotoes();
         }
      });
   }
}