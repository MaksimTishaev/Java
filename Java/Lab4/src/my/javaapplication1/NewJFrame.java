package my.javaapplication1;

import javax.swing.table.DefaultTableModel;
import java.util.LinkedList;
import java.io.*;
import java.util.Scanner;

public class NewJFrame extends javax.swing.JFrame {
    LinkedList<RecIntegral> List = new LinkedList<RecIntegral>();
    public NewJFrame() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabelError = new javax.swing.JLabel();
        jFileChooser1 = new javax.swing.JFileChooser();
        jButtonAdd = new javax.swing.JButton();
        jButtonDel = new javax.swing.JButton();
        jButtonFind = new javax.swing.JButton();
        jTextFieldLow = new javax.swing.JTextField();
        jTextFieldTop = new javax.swing.JTextField();
        jTextFieldStep = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonClear = new javax.swing.JButton();
        jButtonFill = new javax.swing.JButton();
        jButtonFileWriterText = new javax.swing.JButton();
        jButtonFileReaderText = new javax.swing.JButton();
        jButtonFileWriterBin = new javax.swing.JButton();
        jButtonFileReaderBin = new javax.swing.JButton();

        jDialog1.setTitle("Ошибка ввода");

        jLabelError.setText("jLabel4");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabelError)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabelError)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jFileChooser1.setDialogType(javax.swing.JFileChooser.CUSTOM_DIALOG);
        jFileChooser1.setApproveButtonToolTipText("");
        jFileChooser1.setDialogTitle("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lab4");

        jButtonAdd.setText("Добавить");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonDel.setText("Удалить");
        jButtonDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelActionPerformed(evt);
            }
        });

        jButtonFind.setText("Вычислить");
        jButtonFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFindActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Нижняя граница", "Верхняя граница", "Шаг", "Результат"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setText("Нижняя граница");

        jLabel2.setText("Верхняя граница");

        jLabel3.setText("Шаг");

        jButtonClear.setText("Очистить");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jButtonFill.setText("Заполнить");
        jButtonFill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFillActionPerformed(evt);
            }
        });

        jButtonFileWriterText.setText("Сохранение в текстовом виде");
        jButtonFileWriterText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFileWriterTextActionPerformed(evt);
            }
        });

        jButtonFileReaderText.setText("Загрузка в текстовом виде");
        jButtonFileReaderText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFileReaderTextActionPerformed(evt);
            }
        });

        jButtonFileWriterBin.setText("Сохранение в двоичном виде");
        jButtonFileWriterBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFileWriterBinActionPerformed(evt);
            }
        });

        jButtonFileReaderBin.setText("Загрузка в доичном виде");
        jButtonFileReaderBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFileReaderBinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonFind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                                    .addComponent(jTextFieldTop)
                                    .addComponent(jTextFieldStep)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextFieldLow))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonFill, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jButtonClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonFileWriterText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonFileReaderText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonFileWriterBin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonFileReaderBin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAdd)
                            .addComponent(jTextFieldLow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonFill))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonDel)
                            .addComponent(jTextFieldTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonClear))
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonFind)
                            .addComponent(jTextFieldStep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonFileWriterText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFileReaderText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonFileWriterBin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFileReaderBin)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        try {
            DefaultTableModel TModel = (DefaultTableModel) jTable1.getModel();
            if ((RecIntegral.isNumeric(jTextFieldLow.getText()) && RecIntegral.isNumeric(jTextFieldTop.getText()) && RecIntegral.isNumeric(jTextFieldStep.getText())) == false)
                throw new ExceptionRecIntegral("Ошибка при вводе исходных данных");
            else if (Double.parseDouble(jTextFieldLow.getText()) >= Double.parseDouble(jTextFieldTop.getText())) {
                throw new ExceptionRecIntegral("Ошибка при вводе исходных данных");
            }
            else {
                TModel.addRow(new Object[] {jTextFieldLow.getText(), jTextFieldTop.getText(), jTextFieldStep.getText()});
                List.addLast(new RecIntegral(Double.valueOf(jTextFieldLow.getText()), Double.valueOf(jTextFieldTop.getText()), Double.valueOf(jTextFieldStep.getText())));
            }
        } 
        catch (ExceptionRecIntegral ExRec) {
            jDialog1.setSize(250, 100);
            jDialog1.setLocationRelativeTo(null);
            jDialog1.setModal(true);
            jLabelError.setText(ExRec.getMessage());
            jDialog1.setVisible(true);
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelActionPerformed
        int row = jTable1.getSelectedRow();
        if (row != -1) {
            DefaultTableModel TModel = (DefaultTableModel) jTable1.getModel();
            TModel.removeRow(row);
            List.remove(row);
        }
    }//GEN-LAST:event_jButtonDelActionPerformed

    private void jButtonFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFindActionPerformed
        int row = jTable1.getSelectedRow();
        if (row != -1) {
        double h, a, b, res = 0;
            a = Double.parseDouble(jTable1.getValueAt(row, 0).toString());
            b = Double.parseDouble(jTable1.getValueAt(row, 1).toString());
            h = Double.parseDouble(jTable1.getValueAt(row, 2).toString());
            if ((b - a) % h < 0.0001 || (b - a) % h > h - 0.0001) {
                for (double i = a; i < b; i += h)
                    res += ((Math.sin(i * Math.PI / 180) + Math.sin((i + h) * Math.PI / 180)) * (h / 2));
                jTable1.setValueAt(String.format("%.4f",res), row, 3);
            }
        }
    }//GEN-LAST:event_jButtonFindActionPerformed

    private void jButtonFillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFillActionPerformed
        if (List.size() != -1) {
            DefaultTableModel TModel = (DefaultTableModel) jTable1.getModel();
            for (RecIntegral Rec: List)
                TModel.addRow(new Object[] {Rec.getA(), Rec.getB(), Rec.getH()});
        }
    }//GEN-LAST:event_jButtonFillActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        DefaultTableModel TModel = (DefaultTableModel) jTable1.getModel();
        TModel.setRowCount(0);
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonFileWriterTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFileWriterTextActionPerformed
        try {
            jFileChooser1.showDialog(null, "Выбор файла для сохранения");
            DefaultTableModel TModel = (DefaultTableModel) jTable1.getModel();
            int row = TModel.getRowCount();
            if (row != 0) {
                File ft = jFileChooser1.getSelectedFile();
                FileWriter fwt = new FileWriter(ft);
                ft.delete();
                for (RecIntegral Rec: List) {
                    fwt.write(Rec.getA() + "\n");
                    fwt.write(Rec.getB() + "\n");
                    fwt.write(Rec.getH() + "\n");
                }
                fwt.close();
            }
        }
        catch(Exception ex) {        
        }
    }//GEN-LAST:event_jButtonFileWriterTextActionPerformed

    private void jButtonFileReaderTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFileReaderTextActionPerformed
        try {
            jFileChooser1.showDialog(null, "Выбор файла для загрузки");
            DefaultTableModel TModel = (DefaultTableModel) jTable1.getModel();
            TModel.setRowCount(0);
            File ft = jFileChooser1.getSelectedFile();
            FileReader frt = new FileReader(ft);
            Scanner scan = new Scanner(frt);
            while (scan.hasNextLine()) 
                TModel.addRow(new Object[] {scan.nextLine(), scan.nextLine(), scan.nextLine()});
            frt.close();
            frt.close();
        }
        catch(Exception ex) {
        }
    }//GEN-LAST:event_jButtonFileReaderTextActionPerformed

    private void jButtonFileWriterBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFileWriterBinActionPerformed
        ObjectOutputStream fwb = null;
        try {
            jFileChooser1.showDialog(null, "Выбор файла для сохранения");
            File fb = jFileChooser1.getSelectedFile();
            fwb = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fb)));
            fb.delete();
            for (RecIntegral Rec: List) {
                fwb.writeObject(Rec);
            }
            fwb.close();
        } 
        catch (Exception ex ) {
        }

    }//GEN-LAST:event_jButtonFileWriterBinActionPerformed

    private void jButtonFileReaderBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFileReaderBinActionPerformed
        ObjectInputStream frb = null;
        try {
            jFileChooser1.showDialog(null, "Выбор файла для загрузки");
            File fb = jFileChooser1.getSelectedFile();
            DefaultTableModel TModel = (DefaultTableModel) jTable1.getModel();
            TModel.setRowCount(0);
            frb = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fb)));
            fb.delete();
            RecIntegral RecInt = null;
            while (frb.available() != -1) {
                RecInt = (RecIntegral)frb.readObject();
                TModel.addRow(new Object[] {Double.toString(RecInt.getA()), Double.toString(RecInt.getB()), Double.toString(RecInt.getH())});
            }
            frb.close();
        } 
        catch (Exception ex ) {
        }
        
    }//GEN-LAST:event_jButtonFileReaderBinActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDel;
    private javax.swing.JButton jButtonFileReaderBin;
    private javax.swing.JButton jButtonFileReaderText;
    private javax.swing.JButton jButtonFileWriterBin;
    private javax.swing.JButton jButtonFileWriterText;
    private javax.swing.JButton jButtonFill;
    private javax.swing.JButton jButtonFind;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldLow;
    private javax.swing.JTextField jTextFieldStep;
    private javax.swing.JTextField jTextFieldTop;
    // End of variables declaration//GEN-END:variables
}