import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {

            JFrame ventana = new JFrame("Configuración de pantalla");
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setSize(600,500);
            ventana.setLocationRelativeTo(null);

            JPanel panelPrincipal = new JPanel(new BorderLayout());

            JLabel titulo = new JLabel("Configuración de pantalla");
            titulo.setHorizontalAlignment(SwingConstants.CENTER);

            JPanel panelFormulario = new JPanel(new GridLayout(5,2,10,10));
            panelFormulario.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));

            JComboBox<String> resoluciones =
                    new JComboBox<>(new String[]{
                            "1280x720",
                            "1920x1080",
                            "2560x1440",
                            "3840x2160"
                    });

            JComboBox<String> frecuencias =
                    new JComboBox<>(new String[]{
                            "60 Hz",
                            "75 Hz",
                            "120 Hz",
                            "144 Hz",
                            "240 Hz"
                    });

            JRadioButton RbutEstandar =
                    new JRadioButton("Estandar");

            JRadioButton RbutCine =
                    new JRadioButton("Cinematografico");

            JRadioButton RbutJuegos =
                    new JRadioButton("Juegos");

            ButtonGroup grupoModo = new ButtonGroup();
            grupoModo.add(RbutEstandar);
            grupoModo.add(RbutCine);
            grupoModo.add(RbutJuegos);

            JPanel panelColor =  new JPanel();
            panelColor.add(RbutEstandar);
            panelColor.add(RbutCine);
            panelColor.add(RbutJuegos);

            JCheckBox checkNocturno = new JCheckBox("Activar modo nocturno");

            JCheckBox checkAutomatico = new JCheckBox("Aplicar cambios automatico");

            JButton botAplicar =  new JButton("Aplicar");

            JButton botRestaurar =  new JButton("Restaurar valores predeterminados");

            panelFormulario.add(new JLabel("Resolucion: "));
            panelFormulario.add(resoluciones);
            panelFormulario.add(new JLabel("Frecuencia: "));
            panelFormulario.add(frecuencias);
            panelFormulario.add(new JLabel("Modo de color: "));
            panelFormulario.add(panelColor);

            panelFormulario.add(new JLabel(""));
            panelFormulario.add(checkNocturno);

            panelFormulario.add(new JLabel(""));
            panelFormulario.add(checkAutomatico);

            JPanel panelBotones = new JPanel();
            panelBotones.add(botAplicar);
            panelBotones.add(botRestaurar);

            panelPrincipal.add(titulo,BorderLayout.NORTH);
            panelPrincipal.add(panelFormulario,BorderLayout.CENTER);
            panelPrincipal.add(panelBotones,BorderLayout.SOUTH);

            ventana.add(panelPrincipal);
            ventana.setVisible(true);


        });
    }

}
