import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class teste extends JFrame {
    private JTextField tituloB, autorB, anoDePublicacaoB;
    private JButton cadastrarButton;
    private JButton encerrarCadastroButton;

    public teste() {
        setTitle("Livraria do Seu ZÉ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null); // Centraliza a janela na tela

        // Criação dos componentes
        JLabel titulo = new JLabel("Título:");
        JLabel autor = new JLabel("Autor:");
        JLabel anoDePublicacao = new JLabel("Ano de publicação:");

        this.tituloB = new JTextField(20);
        this.autorB = new JTextField(20);
        this.anoDePublicacaoB = new JTextField(5);

        cadastrarButton = new JButton("Cadastrar");
        encerrarCadastroButton = new JButton("Encerrar cadastro");

        // Adiciona os componentes ao painel
        JPanel panel = new JPanel(new GridLayout(9, 0));
        panel.add(titulo);
        panel.add(this.tituloB);
        panel.add(autor);
        panel.add(this.autorB);
        panel.add(anoDePublicacao);
        panel.add(this.anoDePublicacaoB);
        panel.add(new JLabel()); // Espaçamento
        panel.add(cadastrarButton);
        panel.add(encerrarCadastroButton);


        // Adiciona o painel ao JFrame
        add(panel);

//        encerrarCadastroButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                encerrarCadastro();
//            }
//        });

        // Adiciona um ouvinte de ação para o botão de cadastro
        cadastrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadasatrarLivro();
            }
        });

        setVisible(true);
    }

    private void cadasatrarLivro() {
        // Aqui você pode implementar a lógica para cadastrar o cliente
        String tituloDoLivro = tituloB.getText();
        String sobrenome = autorB.getText();
        int idade = Integer.parseInt(anoDePublicacaoB.getText());

//        private void encerrarCadasatro() {
//            // Aqui você pode implementar a lógica para cadastrar o cliente
//
//        }

        // Exemplo simples de saída dos dados cadastrados
        JOptionPane.showMessageDialog(this, "Livro cadastrado:\nTitulo: " + tituloDoLivro + "\nAutor: " + sobrenome + "\nAno de publicação: " + idade);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new teste();
            }
        });
    }

    public JTextField getTituloB() {
        return tituloB;
    }

    public void setTituloB(JTextField tituloB) {
        this.tituloB = tituloB;
    }

    public JTextField getAutorB() {
        return autorB;
    }

    public void setAutorB(JTextField autorB) {
        this.autorB = autorB;
    }

    public JTextField getAnoDePublicacaoB() {
        return anoDePublicacaoB;
    }

    public void setAnoDePublicacaoB(JTextField anoDePublicacaoB) {
        this.anoDePublicacaoB = anoDePublicacaoB;
    }

    public JButton getCadastrarButton() {
        return cadastrarButton;
    }

    public void setCadastrarButton(JButton cadastrarButton) {
        this.cadastrarButton = cadastrarButton;
    }

    public JButton getEncerrarCadastroButton() {
        return encerrarCadastroButton;
    }

    public void setEncerrarCadastroButton(JButton encerrarCadastroButton) {
        this.encerrarCadastroButton = encerrarCadastroButton;
    }
}
