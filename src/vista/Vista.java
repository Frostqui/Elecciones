/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import elecciones.Circunscripcion;
import elecciones.Eleccion;
import elecciones.FormacionPolitica;
import elecciones.Lista;
import elecciones.Militante;
import elecciones.PartidoPolitico;
import elecciones.Votantes;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diego
 */
public class Vista extends javax.swing.JFrame {

    ArrayList <Circunscripcion> circunscripciones = new ArrayList<>();
    ArrayList <FormacionPolitica> formaciones = new ArrayList<>();
    ArrayList <Militante> militantes = new ArrayList<>();
    ArrayList <Votantes> votantes = new ArrayList<>();
    Eleccion eleccion;
    ArrayList<Eleccion> historico = new ArrayList<Eleccion>();
    boolean votosManuales = false;
    
    
    
     
    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanelCirc = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cargarTexto = new javax.swing.JTextArea();
        panel_nuevosdatos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaCircunscripciones = new javax.swing.JTable();
        boton_addCircunscripcion = new javax.swing.JButton();
        boton_addPartido = new javax.swing.JButton();
        jTextFieldNombreCircuns = new javax.swing.JTextField();
        jTextFieldPoblacionCircuns = new javax.swing.JTextField();
        jTextFieldParticipacionCircuns = new javax.swing.JTextField();
        jPanelPartidos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNombrePP = new javax.swing.JTextField();
        jTextFieldSiglasPP = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextFieldLogoPP = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePP = new javax.swing.JTable();
        boton_crearpartido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.darkGray);
        jPanel1.setToolTipText("");

        jButton1.setText("DATOS");

        jButton2.setText("ELECCIONES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton3.setText("Cargar datos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        cargarTexto.setColumns(20);
        cargarTexto.setRows(5);
        cargarTexto.setName("cargarTexto"); // NOI18N
        jScrollPane1.setViewportView(cargarTexto);
        cargarTexto.getAccessibleContext().setAccessibleName("cargarTexto");
        cargarTexto.getAccessibleContext().setAccessibleDescription("cargarTexto");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(279, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 309, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelCirc.addTab("Cargar", jPanel3);

        jTablaCircunscripciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Siglas", "Secretario"
            }
        ));
        jScrollPane2.setViewportView(jTablaCircunscripciones);

        boton_addCircunscripcion.setText("Añadir Circunscripcion");
        boton_addCircunscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_addCircunscripcionActionPerformed(evt);
            }
        });

        boton_addPartido.setText("Añadir Partidos");
        boton_addPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_addPartidoActionPerformed(evt);
            }
        });

        jTextFieldNombreCircuns.setText("Nombre ");

        jTextFieldPoblacionCircuns.setText("Poblacion");

        jTextFieldParticipacionCircuns.setText("Participacion");

        javax.swing.GroupLayout panel_nuevosdatosLayout = new javax.swing.GroupLayout(panel_nuevosdatos);
        panel_nuevosdatos.setLayout(panel_nuevosdatosLayout);
        panel_nuevosdatosLayout.setHorizontalGroup(
            panel_nuevosdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_nuevosdatosLayout.createSequentialGroup()
                .addGroup(panel_nuevosdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_nuevosdatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(panel_nuevosdatosLayout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addGroup(panel_nuevosdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boton_addCircunscripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                            .addComponent(boton_addPartido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldNombreCircuns)
                            .addComponent(jTextFieldPoblacionCircuns)
                            .addComponent(jTextFieldParticipacionCircuns))
                        .addGap(0, 312, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_nuevosdatosLayout.setVerticalGroup(
            panel_nuevosdatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_nuevosdatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(boton_addPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldNombreCircuns, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldPoblacionCircuns, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldParticipacionCircuns, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                .addComponent(boton_addCircunscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelCirc.addTab("Nuevos datos", panel_nuevosdatos);

        jLabel1.setText("Nombre");

        jLabel2.setText("Siglas");

        jLabel3.setText("Logo");

        jLabel4.setText("Secretario");

        jTextFieldNombrePP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombrePPActionPerformed(evt);
            }
        });

        jButton4.setText("Añadir votantes");

        jButton5.setText("Añadir Simpatizantes");

        jButton6.setText("Añadir militantes");

        jTablePP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTablePP);

        boton_crearpartido.setText("Añadir Partido");
        boton_crearpartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_crearpartidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPartidosLayout = new javax.swing.GroupLayout(jPanelPartidos);
        jPanelPartidos.setLayout(jPanelPartidosLayout);
        jPanelPartidosLayout.setHorizontalGroup(
            jPanelPartidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPartidosLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanelPartidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPartidosLayout.createSequentialGroup()
                        .addGroup(jPanelPartidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPartidosLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldNombrePP, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelPartidosLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldSiglasPP, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)
                        .addGroup(jPanelPartidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(28, 28, 28)
                        .addGroup(jPanelPartidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldLogoPP, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelPartidosLayout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPartidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
            .addGroup(jPanelPartidosLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(boton_crearpartido, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPartidosLayout.setVerticalGroup(
            jPanelPartidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPartidosLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanelPartidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNombrePP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLogoPP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanelPartidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSiglasPP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanelPartidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boton_crearpartido, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelCirc.addTab("Crear partidos", jPanelPartidos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelCirc, javax.swing.GroupLayout.PREFERRED_SIZE, 953, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCirc)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        // Si ya hay una eleccion creada, advertimos de la pérdida de datos.
        if(historico.size()>=1){
            int n = JOptionPane.showConfirmDialog(
                TabBienvenido,
                "ADVERTENCIA: Si cargas una elección borraras los datos \nde la elección actual. ¿Deseas continuar?",
                "PELIGRO PELIGRO PELIGRO",
                JOptionPane.YES_NO_OPTION);
            if(n!=0){
                // Si no dice que quiere continuar, nos vamos
                cargarTexto.append("\nCarga de elección cancelada por el usuario");
                return;
            } else {
                cargarTexto.append("\nForzando la carga de elección desde disco, se eliminarán los datos actuales");
            }
        }

        JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showOpenDialog(TabBienvenido);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            cargarTexto.append("\nArchivo elegido: " + chooser.getSelectedFile().getName());
            File archivo = chooser.getSelectedFile();

            try{
                try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(archivo))) {
                    historico = (ArrayList<Eleccion>) entrada.readObject();
                }
                // actualizarTablaHistorico();
            } catch (IOException e){
                cargarTexto.append("\nHa ocurrido un error al intentar abrir el archivo: "+e.getLocalizedMessage());

            } catch (ClassNotFoundException e){
                cargarTexto.append("\nClase no válida (¿Archivo corrupto?)");

            } catch(ClassCastException e){
                cargarTexto.append("\nEl archivo no era una elección válida (¿Archivo corrupto?)");
            } catch(Exception e){
                e.printStackTrace();
                cargarTexto.append("\nError indefinido al intentar abrir el archivo");
                cargarTexto.append(e.getMessage());
                cargarTexto.append(e.toString());
            }

        } else {
            cargarTexto.append("Operacion cancelada por el usuario.");

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void boton_addCircunscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_addCircunscripcionActionPerformed
      if(formaciones.size()<2){
            JOptionPane.showMessageDialog(jFrame2, "Debe haber al menos dos formaciones políticas para poder hacer elecciones",
                    "Datos insuficientes", JOptionPane.WARNING_MESSAGE);
        } else if(jTextFieldNombreCircuns.getText().equals("")||
                    jTextFieldPoblacionCircuns.getText().equals("")||
                    jTextFieldParticipacionCircuns.getText().equals("")){
            JOptionPane.showMessageDialog(jFrame2, "Todos los campos son obligatorios",
                    "Datos insuficientes", JOptionPane.WARNING_MESSAGE);            
        } else {
            try {
                double participacion = Double.parseDouble(jTextFieldParticipacionCircuns.getText());
                if(participacion>1||participacion<=0) throw new IllegalArgumentException();
                // Crea el partido político
                Circunscripcion circunscripcion = new Circunscripcion(
                        jTextFieldNombreCircuns.getText(),
                        Integer.parseInt(jTextFieldPoblacionCircuns.getText()),
                        participacion
                );

                // Asignamos las formaciones creadas anteriormente a la circunscripcion
                circunscripcion.setFormaciones(formaciones);
                
                    for(FormacionPolitica f: formaciones){
                        
                        ArrayList<Militante> temporal = new ArrayList<>();
                       
                            for (int i = 0; i < circunscripcion.getEscaños(); i++) {
                                temporal.add(f.getMilitantes().get(i));
                            }
                            
                            
                                circunscripcion.getListasPartidos().add(new Lista(
                                        temporal,
                                        f,
                                        circunscripcion.getNombre(),
                                        f.getNombre()+" "+circunscripcion.getNombre()
                                ));
                    }  




                        // Creamos un nuevo conjunto temporal de partidos
                        formaciones = new ArrayList<>();

                        // Añadimos la circunscripcion creada a la tabla en elecciones
                        DefaultTableModel modeloCircunscripcion = (DefaultTableModel) jTablaCircunscripciones.getModel();
                        modeloCircunscripcion.addRow(new Object[]{
                                jTextFieldNombreCircuns.getText(),
                                Integer.parseInt(jTextFieldPoblacionCircuns.getText()),
                                participacion,
                                circunscripcion.getEscaños()
                        });

                        // Añadimos la circunscripcion creada a la lista temporal de circunscripciones
                        circunscripciones.add(circunscripcion);
//                        historico.get(jTableHistorico.getSelectedRow()).setEleccionesEnCircunscripcion(circunscripciones);

                        // Resetamos todos los campos del formulario
                        jTextFieldNombreCircuns.setText("");
                        jTextFieldPoblacionCircuns.setText("");
                        jTextFieldParticipacionCircuns.setText("");

                        // Resetamos la tabla
                       // DefaultTableModel modeloPart = (DefaultTableModel) jTablePP.getModel();
                       // modeloPart.setRowCount(0);

                        // Cerramos la ventana
                        // TODO add your handling code here:

                        jButton3.setEnabled(true);
                    

            } catch (NumberFormatException e){
                /* JOptionPane.showMessageDialog(jFrame3, "Introduce numeros validos porfavor",
                    "Datos no válidos", JOptionPane.ERROR_MESSAGE);*/
            } catch (IllegalArgumentException e){
                /* //JOptionPane.showMessageDialog(jFrame3, "La participación debe ser mayor a 0 y menor o igual a 1",
                    "Datos no válidos", JOptionPane.ERROR_MESSAGE);*/
            } catch (IndexOutOfBoundsException e){
                            JOptionPane.showMessageDialog(jFrame2, "No hay suficientes militantes para rellenar la lista de algún partido",
                            "Datos insuficientes", JOptionPane.WARNING_MESSAGE);
                        }
        }
                                                      

    }//GEN-LAST:event_boton_addCircunscripcionActionPerformed

    private void boton_addPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_addPartidoActionPerformed
      
      
         jPanelCirc.setSelectedIndex(2);
    }//GEN-LAST:event_boton_addPartidoActionPerformed

    private void jTextFieldNombrePPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombrePPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombrePPActionPerformed

    private void boton_crearpartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_crearpartidoActionPerformed
           if(militantes==null||votantes==null||militantes.size()<2){
            JOptionPane.showMessageDialog(jFrame3, "Por favor, introduce al menos 2 Militantes y 1 Simpatizante",
                    "Datos insuficientes", JOptionPane.WARNING_MESSAGE);
        } else if(jTextFieldNombrePP.getText().equals("")||
                jTextFieldSiglasPP.getText().equals("")||
                jTextFieldLogoPP.getText().equals("")){
            JOptionPane.showMessageDialog(jFrame3, "Todos los campos son obligatorios",
                    "Campos no válidos", JOptionPane.ERROR_MESSAGE);
        } else {
            // Crea el partido político
            PartidoPolitico partido = new PartidoPolitico(
                    jTextFieldNombrePP.getText(),
                    jTextFieldSiglasPP.getText(),
                    jTextFieldLogoPP.getText()
            );

            // Setea el campo Siglas de todos los votantes
            for(Votantes vot:votantes){
                vot.setSiglasPartido(jTextFieldSiglasPP.getText());
            }

            // Asignamos los objetos temporales militantes y votantes creados hasta ahora al partido
            partido.setMilitantes(militantes);
            partido.setVotantes(votantes);
            // PENDIENTE, AÑADIR SIMPATIZANTES
            // Creamos un nuevo conjunto vacío de militantes y votantes temporal
            militantes = new ArrayList<>();
            votantes = new ArrayList<>();

            // Añadimos el partido creado a la tabla de formaciones en circunscripciones
            DefaultTableModel modeloPartidos = (DefaultTableModel) jTablePP.getModel();
            modeloPartidos.addRow(new Object[]{
                    jTextFieldNombrePP.getText(),
                    jTextFieldSiglasPP.getText(),
                    "Partido"
            });

            // Añadimos el partido a la lista temporal de formaciones.
            formaciones.add(partido);

            // Resetamos todos los campos del formulario
            jTextFieldNombrePP.setText("");
            jTextFieldSiglasPP.setText("");
            jTextFieldLogoPP.setText("");

            // Resetamos la tabla
           // DefaultTableModel modeloVot = (DefaultTableModel) jTableVotantesPP.getModel();
           // modeloVot.setRowCount(0);

            // Cerramos la ventana
          //  jPanelPartidos.
        }   
    }//GEN-LAST:event_boton_crearpartidoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }
    
    
    
    
    
    
    
     
    
    
     private JFrame jFrame3 = new JFrame();
     private javax.swing.JFrame jFrame2;
     
     
  private javax.swing.JPanel TabBienvenido;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_addCircunscripcion;
    private javax.swing.JButton boton_addPartido;
    private javax.swing.JButton boton_crearpartido;
    private javax.swing.JTextArea cargarTexto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jPanelCirc;
    private javax.swing.JPanel jPanelPartidos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTablaCircunscripciones;
    private javax.swing.JTable jTablePP;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextFieldLogoPP;
    private javax.swing.JTextField jTextFieldNombreCircuns;
    private javax.swing.JTextField jTextFieldNombrePP;
    private javax.swing.JTextField jTextFieldParticipacionCircuns;
    private javax.swing.JTextField jTextFieldPoblacionCircuns;
    private javax.swing.JTextField jTextFieldSiglasPP;
    private javax.swing.JPanel panel_nuevosdatos;
    // End of variables declaration//GEN-END:variables

   


}
