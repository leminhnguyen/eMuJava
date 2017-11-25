/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package emujava;

import java.io.*;
import java.awt.*;
import javax.swing.*;
import emujava.*;

/**
 *
 * @author jBillu
 */
public class EMWizard extends javax.swing.JDialog {
    
    private int CARD_NUMBER=0;
//    private int MUTOP_COUNT=0;

    /**
     * Creates new form EMWizard
     */
    public EMWizard(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        try {
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            int x = ( (int )dim.getWidth() - 407 ) / 2;
            int y = ( (int )dim.getHeight() - 317 ) / 2;
            this.setLocation( x, y );
        } catch( Exception except ) {
            except.printStackTrace();
        } //END try-catch BLOCK
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EMuJava Wizard");
        setResizable(false);

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Next >>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("<< Back");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.CardLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText(" Provide project details along with source code for which test cases need");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 36, 367, -1));

        jLabel2.setText("to be generated.");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 56, 280, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Step 1 of 3 - Project Details");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 317, 19));

        jLabel4.setText("Project Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 91, -1, -1));

        jLabel5.setText("Project Location");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 123, -1, -1));

        jLabel6.setText("Class 1");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 155, -1, -1));

        jLabel7.setText("Class 2 (Optional)");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 187, -1, -1));

        jTextField1.setText("C:/jBillu/EMuJavaTests");
        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 120, 200, -1));

        jButton4.setText("Browse");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 119, -1, -1));

        jTextField2.setText("Test");
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 88, 200, -1));

        jTextField3.setText("C:/Users/jBillu/Documents/Stack.java");
        jTextField3.setToolTipText("");
        jTextField3.setEnabled(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 152, 200, -1));

        jTextField4.setEnabled(false);
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 184, 200, -1));

        jButton5.setText("Browse");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 151, -1, -1));

        jButton6.setText("Browse");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 183, -1, -1));

        jPanel1.add(jPanel2, "card2");

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Step 2 of 3 - Mutation Operators");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel9.setText("Select mutation operators from the following list that you want to use ");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 36, -1, -1));

        jLabel10.setText("during mutation testing in order to generate test case set.");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 56, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "  Structured  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 102)));

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("ABS");
        jCheckBox1.setToolTipText("Absolute Value Insertion (ABS)");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });

        jCheckBox2.setText("AOR");
        jCheckBox2.setToolTipText("Arithmatic Operator Replacement (AOR)");
        jCheckBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox2ItemStateChanged(evt);
            }
        });

        jCheckBox3.setText("LCR");
        jCheckBox3.setToolTipText("Logical Connector Replacement (LCR)");
        jCheckBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox3ItemStateChanged(evt);
            }
        });

        jCheckBox4.setText("ROR");
        jCheckBox4.setToolTipText("Relational Operator Replacement (ROR)");
        jCheckBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox4ItemStateChanged(evt);
            }
        });

        jCheckBox5.setText("UOI");
        jCheckBox5.setToolTipText("Unary Operator Insertion (UOI)");
        jCheckBox5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox5ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 180, 160));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "  Object-Oriented  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 102)));

        jCheckBox6.setText("IOP");
        jCheckBox6.setToolTipText("Overriding Method Deletion (IOP)");
        jCheckBox6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox6ItemStateChanged(evt);
            }
        });

        jCheckBox7.setText("PNC");
        jCheckBox7.setToolTipText("new Method Call with Child Class Type (PNC)");
        jCheckBox7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox7ItemStateChanged(evt);
            }
        });

        jCheckBox8.setText("OMD");
        jCheckBox8.setToolTipText("Overloading Method Deletion (OMD)");
        jCheckBox8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox8ItemStateChanged(evt);
            }
        });

        jCheckBox9.setText("JID");
        jCheckBox9.setToolTipText("Member Variable Initialization Deletion (JID)");
        jCheckBox9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox9ItemStateChanged(evt);
            }
        });

        jCheckBox10.setText("EOC");
        jCheckBox10.setToolTipText("Reference Comparison & Content Comparison (EOC)");
        jCheckBox10.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox10ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox8)
                    .addComponent(jCheckBox9)
                    .addComponent(jCheckBox10))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 80, 180, 160));

        jPanel1.add(jPanel4, "card3");

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Step 3 of 3 - GA Configuration");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel12.setText("Provide the desired values to GA configuration parameters that will be");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 36, -1, -1));

        jLabel13.setText("used by the tool during test case generation process.");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 56, -1, -1));

        jLabel14.setText("Population Size");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 91, -1, -1));

        jLabel15.setText("Generation Type");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 123, -1, -1));

        jLabel16.setText("Mutation Rate");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 155, -1, -1));

        jLabel17.setText("Max. Iterations");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 187, -1, -1));

        jTextField5.setText("50");
        jPanel6.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 88, 150, -1));

        jTextField6.setText("5");
        jTextField6.setToolTipText("");
        jPanel6.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 152, 150, -1));

        jTextField7.setText("10");
        jPanel6.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 184, 150, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "eMuJava", "eMuJava v.2", "Random", "Standard GA" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel6.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 120, 150, -1));

        jLabel18.setText("Test Cases");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 91, -1, -1));

        jLabel19.setText("Iterations");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 155, -1, -1));

        jPanel1.add(jPanel6, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addGap(10, 10, 10))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Cancel Button
        int result = JOptionPane.showConfirmDialog( null, "Are you sure you want to cancel this process?", "Confirm Cancellation", JOptionPane.YES_NO_OPTION );
        if( result==JOptionPane.YES_OPTION ) {
            this.setVisible( false );
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Next Button
        CardLayout card = ( CardLayout )jPanel1.getLayout();
        if( CARD_NUMBER==0 ) {
            if( jTextField2.getText()==null || jTextField2.getText().equals( "" ) ) {
                JOptionPane.showMessageDialog( null, "Incorrect project name provided, please re-enter.", "Input Error", JOptionPane.ERROR_MESSAGE );
            } else {
                EMConstants.PROJECT_NAME = jTextField2.getText();
                if( jTextField1.getText()==null || jTextField1.getText().equals( "" ) ) {
                    JOptionPane.showMessageDialog( null, "Incorrect project location provided, please re-select.", "Input Error", JOptionPane.ERROR_MESSAGE );
                } else {
                    EMConstants.PROJECT_LOCATION = jTextField1.getText();
                    if( !EMConstants.PROJECT_LOCATION.endsWith( "/" ) ) {
                        EMConstants.PROJECT_LOCATION = EMConstants.PROJECT_LOCATION + "/";
                    } //END if STATEMENT
                    if( jTextField3.getText()==null || jTextField3.getText().equals( "" ) || !jTextField3.getText().endsWith( ".java" ) ) {
                        JOptionPane.showMessageDialog( null, "The selected class 1 is not a Java class, please re-select.", "Input Error", JOptionPane.ERROR_MESSAGE );
                    } else {
                        EMConstants.CLASS_1 = jTextField3.getText();
                        if( jTextField4.getText()==null || jTextField4.getText().equals( "" ) ) {
                            card.next( jPanel1 );
                            CARD_NUMBER++;
                            jButton3.setEnabled( true );                            
                        } else if( jTextField4.getText().endsWith( ".java" ) ) {
                            EMConstants.CLASS_2 = jTextField4.getText();
                            card.next( jPanel1 );
                            CARD_NUMBER++;
                            jButton3.setEnabled( true );                            
                        } else {
                            JOptionPane.showMessageDialog( null, "The selected class 2 is not a Java class, please re-select.", "Input Error", JOptionPane.ERROR_MESSAGE );
                        } //END if-else STATEMENT
                    } //END if-else STATEMENT
                } //END if-else STATEMENT
            } //END if-else STATEMENT
        } else if( CARD_NUMBER==1 ) {
            if( EMConstants.MUTATION_OPERATORS.size()<1 ) {
                JOptionPane.showMessageDialog( null, "No mutation operator has been selected, you must select at least 1.", "Input Error", JOptionPane.ERROR_MESSAGE );
            } else {
                CARD_NUMBER++;
                card.next( jPanel1 );
                jButton2.setText( "Finish" );                
            }  //END if-else STATEMENT
        } else {
            try {
                EMConstants.POPULATION_SIZE = Integer.parseInt( jTextField5.getText() );
                if( jComboBox1.getSelectedIndex()==0 ) {
                    EMConstants.GEN_TYPE = "eMuJava";
                } else if( jComboBox1.getSelectedIndex()==1 ) {
                    EMConstants.GEN_TYPE = "eMuJava v.2";
                } else if( jComboBox1.getSelectedIndex()==2 ) {
                    EMConstants.GEN_TYPE = "Random";
                } else if( jComboBox1.getSelectedIndex()==3 ) {
                    EMConstants.GEN_TYPE = "Standard GA";
                } //END if-else STATEMENT
                EMConstants.MUTATION_RATE = Integer.parseInt( jTextField6.getText() );
                EMConstants.MAX_ITERATIONS = Integer.parseInt( jTextField7.getText() );
                
                EMController controller = EMController.create();
                controller.createNewProject();
                
                this.setVisible( false );
            } catch( Exception e ) {
                JOptionPane.showMessageDialog( null, "Invalid GA configuration parameters, please re-enter..", "Input Error", JOptionPane.ERROR_MESSAGE );
            } //END try-catch BLOCK
        } //END if-else STATMENT
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Back Button
        CardLayout card = ( CardLayout )jPanel1.getLayout();
        if( CARD_NUMBER==2 ){
            CARD_NUMBER--;
            jButton2.setText( "Next >>" );
            card.previous( jPanel1 );
        } else {
            CARD_NUMBER--;
            jButton3.setEnabled( false );
            card.previous( jPanel1 );
        } //END if-else STATEMENT
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Project Location's Browse Button
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode( JFileChooser.DIRECTORIES_ONLY );
        int result = fileChooser.showOpenDialog( this );
        if( result!=JFileChooser.CANCEL_OPTION ) {
            File pFile = fileChooser.getSelectedFile();
            jTextField1.setText( pFile.toURI().toString().substring( 6 ) );
        } //END if STATEMENT
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // CLASS 1 Browse Button
        JFileChooser fileChooser = new JFileChooser( EMConstants.CLASSPATH );
        fileChooser.setFileSelectionMode( JFileChooser.FILES_ONLY );
        int result = fileChooser.showOpenDialog( this );
        if( result!=JFileChooser.CANCEL_OPTION ) {
            File pFile = fileChooser.getSelectedFile();
            if( pFile.getName().endsWith( ".java" ) ) {
                jTextField3.setText( pFile.toURI().toString().substring( 6 ) );
            } else {
                JOptionPane.showMessageDialog( null, "The selected class 1 is not a Java class, please re-select.", "Input Error", JOptionPane.ERROR_MESSAGE );
            } //END if-else STATEMENT
        } //END if STATEMENT
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // CLASS 2 Browse Button
        JFileChooser fileChooser = new JFileChooser( EMConstants.CLASSPATH );
        fileChooser.setFileSelectionMode( JFileChooser.FILES_ONLY );
        int result = fileChooser.showOpenDialog( this );
        if( result!=JFileChooser.CANCEL_OPTION ) {
            File pFile = fileChooser.getSelectedFile();
            if( pFile.getName().endsWith( ".java" ) ) {
                jTextField4.setText( pFile.toURI().toString().substring( 6 ) );
            } else {
                JOptionPane.showMessageDialog( null, "The selected class 2 is not a Java class, please re-select.", "Input Error", JOptionPane.ERROR_MESSAGE );
            } //END if-else STATEMENT
        } //END if STATEMENT
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        JCheckBox jcb = ( JCheckBox )evt.getSource();
        if( jcb.isSelected() ) {
            EMConstants.MUTATION_OPERATORS.add( "ABS" );
        } else {
            EMConstants.MUTATION_OPERATORS.remove( "ABS" );
        } //END if-else STATEMENT
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox2ItemStateChanged
        JCheckBox jcb = ( JCheckBox )evt.getSource();
        if( jcb.isSelected() ) {
            EMConstants.MUTATION_OPERATORS.add( "AOR" );
        } else {
            EMConstants.MUTATION_OPERATORS.remove( "AOR" );
        } //END if-else STATEMENT
    }//GEN-LAST:event_jCheckBox2ItemStateChanged

    private void jCheckBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox3ItemStateChanged
        JCheckBox jcb = ( JCheckBox )evt.getSource();
        if( jcb.isSelected() ) {
            EMConstants.MUTATION_OPERATORS.add( "LCR" );
        } else {
            EMConstants.MUTATION_OPERATORS.remove( "LCR" );
        } //END if-else STATEMENT
    }//GEN-LAST:event_jCheckBox3ItemStateChanged

    private void jCheckBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox4ItemStateChanged
        JCheckBox jcb = ( JCheckBox )evt.getSource();
        if( jcb.isSelected() ) {
            EMConstants.MUTATION_OPERATORS.add( "ROR" );
        } else {
            EMConstants.MUTATION_OPERATORS.remove( "ROR" );
        } //END if-else STATEMENT
    }//GEN-LAST:event_jCheckBox4ItemStateChanged

    private void jCheckBox5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox5ItemStateChanged
        JCheckBox jcb = ( JCheckBox )evt.getSource();
        if( jcb.isSelected() ) {
            EMConstants.MUTATION_OPERATORS.add( "UOI" );
        } else {
            EMConstants.MUTATION_OPERATORS.remove( "UOI" );
        } //END if-else STATEMENT
    }//GEN-LAST:event_jCheckBox5ItemStateChanged

    private void jCheckBox6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox6ItemStateChanged
        JCheckBox jcb = ( JCheckBox )evt.getSource();
        if( jcb.isSelected() ) {
            EMConstants.MUTATION_OPERATORS.add( "IOP" );
        } else {
            EMConstants.MUTATION_OPERATORS.remove( "IOP" );
        } //END if-else STATEMENT
    }//GEN-LAST:event_jCheckBox6ItemStateChanged

    private void jCheckBox7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox7ItemStateChanged
        JCheckBox jcb = ( JCheckBox )evt.getSource();
        if( jcb.isSelected() ) {
            EMConstants.MUTATION_OPERATORS.add( "PNC" );
        } else {
            EMConstants.MUTATION_OPERATORS.remove( "PNC" );
        } //END if-else STATEMENT
    }//GEN-LAST:event_jCheckBox7ItemStateChanged

    private void jCheckBox8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox8ItemStateChanged
        JCheckBox jcb = ( JCheckBox )evt.getSource();
        if( jcb.isSelected() ) {
            EMConstants.MUTATION_OPERATORS.add( "OMD" );
        } else {
            EMConstants.MUTATION_OPERATORS.remove( "OMD" );
        } //END if-else STATEMENT
    }//GEN-LAST:event_jCheckBox8ItemStateChanged

    private void jCheckBox9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox9ItemStateChanged
        JCheckBox jcb = ( JCheckBox )evt.getSource();
        if( jcb.isSelected() ) {
            EMConstants.MUTATION_OPERATORS.add( "JID" );
        } else {
            EMConstants.MUTATION_OPERATORS.remove( "JID" );
        } //END if-else STATEMENT
    }//GEN-LAST:event_jCheckBox9ItemStateChanged

    private void jCheckBox10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox10ItemStateChanged
        JCheckBox jcb = ( JCheckBox )evt.getSource();
        if( jcb.isSelected() ) {
            EMConstants.MUTATION_OPERATORS.add( "EOC" );
        } else {
            EMConstants.MUTATION_OPERATORS.remove( "EOC" );
        } //END if-else STATEMENT
    }//GEN-LAST:event_jCheckBox10ItemStateChanged

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EMWizard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EMWizard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EMWizard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EMWizard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EMWizard dialog = new EMWizard(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    public static javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
