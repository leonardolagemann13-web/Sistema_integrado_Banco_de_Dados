package view;
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.ClienteController;
public class TelaCadastroCliente {
    // Construtor
    public TelaCadastroCliente(){
        JFrame tela = new JFrame("Cadastro de clientes");
        tela.setSize(1000,750);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(new BorderLayout());

        JLabel titulo = new JLabel("## Cadastro de Clientes ##", JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 34));
        titulo.setForeground(Color.WHITE);

        JPanel topo = new JPanel();
        topo.setBackground(new Color(70, 130, 180));
        topo.add(titulo);

        // Formulário
        JPanel formulario = new JPanel();
        formulario.setLayout(new GridLayout(11, 2, 15, 15));
        formulario.setBorder(BorderFactory.createEmptyBorder(
                30,50,30,50
        ));
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setFont(new Font("Verdana", Font.BOLD, 18));
        JTextField txtNome = new JTextField();
        txtNome.setFont(new Font("Tahoma", Font.PLAIN, 18));

        JLabel lblSobrenome = new JLabel("Sobrenome:");
        lblSobrenome.setFont(new Font("Verdana", Font.BOLD, 18));
        JTextField txtSobrenome = new JTextField();
        txtSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 18));

        JLabel lblIdade = new JLabel("Idade:");
        lblIdade.setFont(new Font("Verdana", Font.BOLD, 18));
        JTextField txtIdade = new JTextField();
        txtIdade.setFont(new Font("Tahoma", Font.PLAIN, 18));

        JLabel lblTelefone = new JLabel("Telefone:");
        lblTelefone.setFont(new Font("Verdana", Font.BOLD, 18));
        JTextField txtTelefone = new JTextField();
        txtTelefone.setFont(new Font("Tahoma", Font.PLAIN, 18));

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setFont(new Font("Verdana", Font.BOLD, 18));
        JTextField txtEmail = new JTextField();
        txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));

        JLabel lblCpf = new JLabel("CPF:");
        lblCpf.setFont(new Font("Verdana", Font.BOLD, 18));
        JTextField txtCpf = new JTextField();
        txtCpf.setFont(new Font("Tahoma", Font.PLAIN, 18));

        JLabel lblRg = new JLabel("RG:");
        lblRg.setFont(new Font("Verdana", Font.BOLD, 18));
        JTextField txtRg = new JTextField();
        txtRg.setFont(new Font("Tahoma", Font.PLAIN, 18));

        JLabel lblEndereco = new JLabel("Endereço:");
        lblEndereco.setFont(new Font("Verdana", Font.BOLD, 18));
        JTextField txtEndereco = new JTextField();
        txtEndereco.setFont(new Font("Tahoma", Font.PLAIN, 18));

        JLabel lblCidade = new JLabel("Cidade:");
        lblCidade.setFont(new Font("Verdana", Font.BOLD, 18));
        JTextField txtCidade = new JTextField();
        txtCidade.setFont(new Font("Tahoma", Font.PLAIN, 18));

        JLabel lblEstado = new JLabel("Estado:");
        lblEstado.setFont(new Font("Verdana", Font.BOLD, 18));
        JTextField txtEstado = new JTextField();
        txtEstado.setFont(new Font("Tahoma", Font.PLAIN, 18));

        JButton btnSalvar = new JButton("Salvar cliente");
        btnSalvar.setFont(new Font("Arial", Font.BOLD, 24));
        btnSalvar.setBackground(new Color(34, 139,34));
        btnSalvar.setForeground(Color.WHITE);

        // Adiciona os componentes
        formulario.add(lblNome);
        formulario.add(txtNome);

        formulario.add(lblSobrenome);
        formulario.add(txtSobrenome);

        formulario.add(lblIdade);
        formulario.add(txtIdade);

        formulario.add(lblTelefone);
        formulario.add(txtTelefone);

        formulario.add(lblEmail);
        formulario.add(txtEmail);

        formulario.add(lblCpf);
        formulario.add(txtCpf);

        formulario.add(lblRg);
        formulario.add(txtRg);

        formulario.add(lblEndereco);
        formulario.add(txtEndereco);

        formulario.add(lblCidade);
        formulario.add(txtCidade);

        formulario.add(lblEstado);
        formulario.add(txtEstado);

        formulario.add(new JLabel());
        formulario.add(btnSalvar);

        ClienteController controller = new ClienteController();

        // Evento do botão
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nome = txtNome.getText();
                    String sobrenome = txtSobrenome.getText();
                    int idade = Integer.parseInt(txtIdade.getText());
                    String telefone = txtTelefone.getText();
                    String email = txtEmail.getText();
                    String cpf = txtCpf.getText();
                    String rg = txtRg.getText();
                    String endereco = txtEndereco.getText();
                    String cidade = txtCidade.getText();
                    String estado = txtEstado.getText();

                    // salvar cliente
                    controller.cadastrarCliente(
                            nome, sobrenome,idade,telefone,email,cpf,rg,
                            endereco,cidade,estado
                    );
                    JOptionPane.showMessageDialog(null,
                            "Cliente salvo com sucesso!");
                }catch (Exception erro){
                    JOptionPane.showMessageDialog(null,
                            "Erro: " + erro);
                }
            }
        });
        // Adiciona paineis
        painel.add(topo, BorderLayout.NORTH);
        painel.add(formulario, BorderLayout.CENTER);
        tela.add(painel);
        tela.setVisible(true);
    }
}













