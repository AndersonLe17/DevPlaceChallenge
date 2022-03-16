package Challenge_Algoritmos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/*
    Escribe una aplicación que solicite al usuario que ingrese una contraseña cualquiera.
    Después se le pedirá que ingrese nuevamente la contraseña, con 3 intentos. Cuando
    acierte ya no pedirá más la contraseña y mostrará un mensaje diciendo “Felicitaciones,
    recordás tu contraseña”. Si falla luego de 3 intentos se mostrará el mensaje “Tenes que
    ejercitar la memoria”. Los mensajes quedarán en pantalla a la espera que el usuario
    presione una tecla, luego de esto se cerrará el programa.

 */
public class Challenge2 {
    //Declaracion de Componentes
    JFrame frame;
    JLabel lMensaje;
    JLabel lPassword;
    JPasswordField tPassword;
    JLabel lPasswordRe;
    JTextField tPasswordRe;
    JButton bGuardar;
    JButton bProbar;
    JLabel lIntentos;
    JLabel lResultado;
    JLabel lCerrar;
    //Declaracion de Variables Primitivas
    String password;
    String prueba;
    int intentos = 0;

    public static void main(String[] args) {
        //Creacion del objeto de clase para la inicializacion del formulario
        Challenge2 challenge2 = new Challenge2();

    }
    
    //Metodo constructor
    Challenge2() {
        //Configuracion del JFrame
        frame = new JFrame("Recordador de Contraseña");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(400, 325);
        frame.setLocationRelativeTo(null);
        //Configuracion de Componente
        lPassword = new JLabel("Contraseña: ");
        lPassword.setBounds(25, 25, 95, 25);
        lPassword.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(lPassword);
        //Configuracion de Componente
        tPassword = new JPasswordField();
        tPassword.setBounds(125, 25, 200, 25);
        frame.add(tPassword);
        //Configuracion de Componente
        lMensaje = new JLabel("(Ingrese una Contraseña de cualquier tipo)");
        lMensaje.setFont(new Font("Calibri", Font.ITALIC, 11));
        lMensaje.setBounds(125, 45, 300, 25);
        frame.add(lMensaje);
        //Configuracion de Componente
        bGuardar = new JButton("Guardar");
        bGuardar.setBounds(150, 75, 100, 30);
        frame.add(bGuardar);
        //Configuracion de Componente
        lPasswordRe = new JLabel("¿Recuerdas?: ");
        lPasswordRe.setBounds(25, 120, 95, 25);
        lPasswordRe.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(lPasswordRe);
        //Configuracion de Componente
        tPasswordRe = new JTextField();
        tPasswordRe.setEnabled(false);
        tPasswordRe.setBounds(125, 120, 200, 25);
        frame.add(tPasswordRe);
        //Configuracion de Componente
        lMensaje = new JLabel("¿Recuerdas la contraseña que ingresaste?");
        lMensaje.setFont(new Font("Calibri", Font.ITALIC, 11));
        lMensaje.setBounds(125, 140, 300, 25);
        frame.add(lMensaje);
        //Configuracion de Componente
        bProbar = new JButton("Probar");
        bProbar.setEnabled(false);
        bProbar.setBounds(150, 170, 100, 30);
        frame.add(bProbar);
        //Configuracion de Componente
        lMensaje = new JLabel("Intentos: ");
        lMensaje.setBounds(15, 210, 75, 25);
        lMensaje.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(lMensaje);
        //Configuracion de Componente
        lIntentos = new JLabel("0");
        lIntentos.setBounds(95, 210, 10, 25);
        frame.add(lIntentos);
        //Configuracion de Componente
        lResultado = new JLabel("");
        lResultado.setHorizontalAlignment(SwingConstants.CENTER);
        lResultado.setBounds(75, 235, 250, 25);
        frame.add(lResultado);
        //Configuracion de Componente
        lCerrar = new JLabel("(Presione cualquier tecla para Terminar)");
        lCerrar.setFont(new Font("Calibri", Font.ITALIC, 11));
        lCerrar.setHorizontalAlignment(SwingConstants.CENTER);
        lCerrar.setBounds(75, 255, 250, 25);
        lCerrar.setVisible(false);
        frame.add(lCerrar);
        //Configuracion de ActionListener con el metodo a ejecutar al presionar el boton
        bGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Se guarda en la variable password el valor introducido en la contraseña
                password = tPassword.getText();
                //Se establece los estados de los botones y los textfield
                bGuardar.setEnabled(false);
                tPassword.setEnabled(false);
                tPasswordRe.setEnabled(true);
                bProbar.setEnabled(true);
            }

        });
        //Configuracion de ActionListener con el metodo a ejecutar al presionar el boton
        bProbar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Se guarda en la variable prueba el valor introducido en la prueba de contraseña
                prueba = tPasswordRe.getText();
                //Se incrementa en uno el numero de intentos
                intentos++;
                //Se establece el valor del texto en el componente lIntentos
                lIntentos.setText(String.valueOf(intentos));
                //Condicional para verificar el numero de intentos
                if (intentos < 3) {
                    //Condicional para evaluar la igualdad entre contraseñas
                    if (prueba.equals(password)) {
                        //Se establece los estados de los botones y los textfield
                        tPasswordRe.setEnabled(false);
                        bProbar.setEnabled(false);
                        lResultado.setForeground(Color.GREEN);
                        //Mensaje de Resultado
                        JOptionPane.showMessageDialog(null, "Felicitaciones, recordás tu contraseña");
                        //Se modifica el estado del valor del texto del Resultado
                        lResultado.setText("Felicitaciones, recordás tu contraseña");
                        lCerrar.setVisible(true);
                        //Se Agrega las funciones del KeyListener para establecer la escucha de presion de tecla
                        setKeyListener();

                    } else {
                        //Focus al textfield de prueba
                        tPasswordRe.requestFocus();

                    }

                } else {
                    //Se establece los estados de los botones y los textfield
                    tPasswordRe.setEnabled(false);
                    bProbar.setEnabled(false);
                    lResultado.setForeground(Color.RED);
                    //Mensaje de Resultado
                    JOptionPane.showMessageDialog(null, "Tenes que ejercitar la memoria");
                    //Se modifica el estado del valor del texto del Resultado
                    lResultado.setText("Tenes que ejercitar la memoria");
                    lCerrar.setVisible(true);
                    //Se Agrega las funciones del KeyListener para establecer la escucha de presion de tecla
                    setKeyListener();

                }
            }

        });

        frame.setVisible(true);
    }
    //Metodo para establecer y agregar los metodos del KeyListener
    public void setKeyListener() {
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //Al presionar una tecla el programa se cierra
                System.exit(0);
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

        });
    }

}
