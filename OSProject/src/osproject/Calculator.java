/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osproject;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anurag
 */
public class Calculator extends javax.swing.JInternalFrame {
    char o;
    int ctr;
    String value, cv, oBtn;
    Double answer, v1, v2;
    Double NumberConverted;
    int count;
    /**
     * Creates new form Calculator
     */
    public Calculator(int cnt) {
        initComponents();
        ctr=0;
        value="";cv="";oBtn="";
        answer=0d;
        v1=0d;v2=0d;NumberConverted=0d;
        count=cnt;
        //System.out.println(count+" Created");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tField = new javax.swing.JTextField();
        bCE = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        backspace = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        bDiv = new javax.swing.JButton();
        bPer = new javax.swing.JButton();
        bFrac = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        bMul = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        num1 = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        bSub = new javax.swing.JButton();
        bSqrt = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        bDot = new javax.swing.JButton();
        bAdd = new javax.swing.JButton();
        equals = new javax.swing.JButton();
        bInt = new javax.swing.JButton();
        num0 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setNormalBounds(new java.awt.Rectangle(10, 10, 10, 10));
        setPreferredSize(new java.awt.Dimension(300, 500));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameDeactivated(evt);
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameDeiconified(evt);
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        tField.setEditable(false);
        tField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tField.setText("0");
        tField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(139, 69, 19), 2));
        tField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFieldActionPerformed(evt);
            }
        });

        bCE.setText("CE");
        bCE.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCEActionPerformed(evt);
            }
        });

        clear.setText("C");
        clear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        backspace.setText("Backspace");
        backspace.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceActionPerformed(evt);
            }
        });

        num7.setText("7");
        num7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7ActionPerformed(evt);
            }
        });

        num8.setText("8");
        num8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8ActionPerformed(evt);
            }
        });

        num9.setText("9");
        num9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9ActionPerformed(evt);
            }
        });

        bDiv.setText("/");
        bDiv.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDivActionPerformed(evt);
            }
        });

        bPer.setText("%");
        bPer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPerActionPerformed(evt);
            }
        });

        bFrac.setText("1/x");
        bFrac.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bFrac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFracActionPerformed(evt);
            }
        });

        num5.setText("5");
        num5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5ActionPerformed(evt);
            }
        });

        num6.setText("6");
        num6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6ActionPerformed(evt);
            }
        });

        bMul.setText("x");
        bMul.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMulActionPerformed(evt);
            }
        });

        num4.setText("4");
        num4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4ActionPerformed(evt);
            }
        });

        num1.setText("1");
        num1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        num2.setText("2");
        num2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });

        bSub.setText("-");
        bSub.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubActionPerformed(evt);
            }
        });

        bSqrt.setText("sqrt");
        bSqrt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSqrtActionPerformed(evt);
            }
        });

        num3.setText("3");
        num3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });

        bDot.setText(".");
        bDot.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDotActionPerformed(evt);
            }
        });

        bAdd.setText("+");
        bAdd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        equals.setText("=");
        equals.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });

        bInt.setText("+/-");
        bInt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bInt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIntActionPerformed(evt);
            }
        });

        num0.setText("0");
        num0.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(num0, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(bInt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bDot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bMul, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(bFrac, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(bPer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bSub, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(bSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tField)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bCE, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(backspace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tField, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPer, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMul, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bFrac, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSub, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num0, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bInt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDot, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        ctr=0;
        v1=0d;
        v2=0d;
        value="";
        answer=0.;
        tField.setText("0");
    }//GEN-LAST:event_clearActionPerformed

    private void bCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCEActionPerformed
        ctr=0;
        value="";
        tField.setText("0");
    }//GEN-LAST:event_bCEActionPerformed

    private void num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num9ActionPerformed
        value+=9;
        tField.setText(value);
    }//GEN-LAST:event_num9ActionPerformed

    private void num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num8ActionPerformed
        value+=8;
        tField.setText(value);
    }//GEN-LAST:event_num8ActionPerformed

    private void bDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDivActionPerformed
        try{
            v1 = Double.parseDouble( tField.getText() );
            ctr=0;
            o = '/';
            value="";
            tField.setText("" +value);
        }
        catch(StringIndexOutOfBoundsException | NumberFormatException | NullPointerException str){}
    }//GEN-LAST:event_bDivActionPerformed

    private void bPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPerActionPerformed
        try{
            v1 = Double.parseDouble( tField.getText() );
            ctr=0;
            value="";
            answer=(v1/100);
            tField.setText("" +answer);
        }
        catch(StringIndexOutOfBoundsException | NumberFormatException | NullPointerException str){}
    }//GEN-LAST:event_bPerActionPerformed

    private void bFracActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFracActionPerformed
        try{
            ctr=0;
            value = "";
            Double NumberContainer = ( 1 / Double.parseDouble(tField.getText() ) );
            tField.setText("" +NumberContainer);
        }
        catch(StringIndexOutOfBoundsException | NumberFormatException | NullPointerException str){}
    }//GEN-LAST:event_bFracActionPerformed

    private void num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num5ActionPerformed
        value+=5;
        tField.setText(value);
    }//GEN-LAST:event_num5ActionPerformed

    private void num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num6ActionPerformed
        value+=6;
        tField.setText(value);
    }//GEN-LAST:event_num6ActionPerformed

    private void bMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMulActionPerformed
        try{
            v1 = Double.parseDouble( tField.getText() );
            ctr=0;
            o = 'x';
            value="";
            tField.setText("" +value);
        }
        catch(StringIndexOutOfBoundsException | NumberFormatException | NullPointerException str){}
    }//GEN-LAST:event_bMulActionPerformed

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2ActionPerformed
        value+=2;
        tField.setText(value);
    }//GEN-LAST:event_num2ActionPerformed

    private void bSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubActionPerformed
        try{
            v1 = Double.parseDouble( tField.getText() );
            ctr=0;
            o = '-';
            value="";
            tField.setText("" +value);
        }
        catch(StringIndexOutOfBoundsException | NumberFormatException | NullPointerException str){}
    }//GEN-LAST:event_bSubActionPerformed

    private void bSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSqrtActionPerformed
        try{
            ctr=0;
            value = "";
            v1 = Math.sqrt( Double.parseDouble( tField.getText() ) );
            tField.setText("" +v1);
        }
        catch(StringIndexOutOfBoundsException | NumberFormatException | NullPointerException str){}
    }//GEN-LAST:event_bSqrtActionPerformed

    private void num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num3ActionPerformed
        value+=3;
        tField.setText(value);
    }//GEN-LAST:event_num3ActionPerformed

    private void bDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDotActionPerformed
        if(ctr==0){
            value+=".";
            ctr+=1;
            tField.setText("" +value);
        }
    }//GEN-LAST:event_bDotActionPerformed

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        try{
            v1 = Double.parseDouble( tField.getText() );
            ctr=0;
            o = '+';
            value="";
            tField.setText("" +value);
        }
        catch(StringIndexOutOfBoundsException | NumberFormatException | NullPointerException str){}
    }//GEN-LAST:event_bAddActionPerformed

    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsActionPerformed
        try{
            value="";
            v2 = Double.parseDouble(tField.getText());
            ctr=0;
            switch (o) {
                case '+':
                    answer = v1 + v2;
                    tField.setText("" +answer);
                    value="";
                    v1=null;
                    v2=null;
                    break;
                case '-':
                    answer = v1 - v2;
                    tField.setText("" +answer);
                    value="";
                    v1=null;
                    v2=null;
                    break;
                case 'x':
                    answer = v1 * v2;
                    tField.setText("" +answer);
                    value="";
                    v1=null;
                    v2=null;
                    break;
                case '/':
                    answer = v1 / v2;
                    tField.setText("" +answer);
                    value="";
                    v1=null;
                    v2=null;
                    break;
                default:
                    break;
            }
        }
        catch(StringIndexOutOfBoundsException | NumberFormatException | NullPointerException str){}
    }//GEN-LAST:event_equalsActionPerformed

    private void bIntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIntActionPerformed
        try{
            ctr=0;
            NumberConverted = ( Double.parseDouble(tField.getText()) * -1 );
            value = "";
            tField.setText("" +NumberConverted);
        }
        catch(StringIndexOutOfBoundsException | NumberFormatException | NullPointerException str){}
    }//GEN-LAST:event_bIntActionPerformed

    private void tFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFieldActionPerformed

    private void num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num0ActionPerformed
        value+=0;
        tField.setText(value);
        //System.out.println(this.count+" button");
    }//GEN-LAST:event_num0ActionPerformed

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        value+=1;
        tField.setText(value);
    }//GEN-LAST:event_num1ActionPerformed

    private void num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num4ActionPerformed
        value+=4;
        tField.setText(value);
    }//GEN-LAST:event_num4ActionPerformed

    private void num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num7ActionPerformed
        value+=7;
        tField.setText(value);
    }//GEN-LAST:event_num7ActionPerformed

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceActionPerformed
        try{    
            value = value.substring(0, value.length()-1 );
            tField.setText("" +value);
        }
        catch(StringIndexOutOfBoundsException | NumberFormatException | NullPointerException str){}
    }//GEN-LAST:event_backspaceActionPerformed

    private void formInternalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameDeactivated
        
    }//GEN-LAST:event_formInternalFrameDeactivated

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        System.out.println("Closed!!!");
        Home.processList.removeItem("Calculator");
        
        Home.cal[count]=null;
                //System.out.println(count+" Del");
        
        
    }//GEN-LAST:event_formInternalFrameClosed

    private void formInternalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameDeiconified
        /*for(int i=0;i<10;i++){
            if(i!=count&&Home.cal[i]!=null)
                try {
                    Home.cal[i].setIcon(true);
                    System.out.println("SetIcon");
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
        for(int j=0;j<10;j++){
                System.out.println(j+" value of i");
                if(Home.cal[j]!=null&&j!=count){
                    
                    try {
                        Home.cal[j].setIcon(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
                if(Home.np[j]!=null){
                    try {
                            Home.np[j].setIcon(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(Home.sc[j]!=null){
                    try {
                            Home.sc[j].setIcon(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(Home.ter[j]!=null){
                    try {
                            Home.ter[j].setIcon(true);
                    } catch (PropertyVetoException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        //Home.schedulingFunction('c', count);
    }//GEN-LAST:event_formInternalFrameDeiconified


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bCE;
    private javax.swing.JButton bDiv;
    private javax.swing.JButton bDot;
    private javax.swing.JButton bFrac;
    private javax.swing.JButton bInt;
    private javax.swing.JButton bMul;
    private javax.swing.JButton bPer;
    private javax.swing.JButton bSqrt;
    private javax.swing.JButton bSub;
    private javax.swing.JButton backspace;
    private javax.swing.JButton clear;
    private javax.swing.JButton equals;
    private javax.swing.JButton num0;
    private javax.swing.JButton num1;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    private javax.swing.JTextField tField;
    // End of variables declaration//GEN-END:variables
}
