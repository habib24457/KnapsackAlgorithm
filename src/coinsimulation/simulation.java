
package coinsimulation;

import java.awt.Color;

import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class simulation extends javax.swing.JFrame {

  
    public simulation() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        display4 = new javax.swing.JTextField();
        display1 = new javax.swing.JTextField();
        display2 = new javax.swing.JTextField();
        display3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        capacitytxt = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        d1 = new javax.swing.JTextField();
        amountOutput = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        d2 = new javax.swing.JTextField();
        d3 = new javax.swing.JTextField();
        d4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        simu = new javax.swing.JTextArea();
        bc = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 204));
        setMinimumSize(new java.awt.Dimension(660, 330));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        getContentPane().add(one, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 80, 40));

        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        getContentPane().add(two, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 90, 40));

        three.setText("5");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        getContentPane().add(three, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 80, 40));

        four.setText("10");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });
        getContentPane().add(four, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 70, 40));

        five.setText("20");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });
        getContentPane().add(five, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 80, 40));

        six.setText("50");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });
        getContentPane().add(six, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 80, 40));

        seven.setText("100");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });
        getContentPane().add(seven, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 90, 40));

        eight.setText("500");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });
        getContentPane().add(eight, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 90, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("Enter the capacity");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 190, 30));
        getContentPane().add(display4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 70, 30));

        display1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display1ActionPerformed(evt);
            }
        });
        getContentPane().add(display1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 70, 30));

        display2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display2ActionPerformed(evt);
            }
        });
        getContentPane().add(display2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 70, 30));
        getContentPane().add(display3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 60, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("Select coins from the below...");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 20));

        capacitytxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capacitytxtActionPerformed(evt);
            }
        });
        getContentPane().add(capacitytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 70, 30));

        jButton9.setText("Submit");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 100, 40));

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 100, 40));

        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("     taka                       taka                     taka                    taka                  taka                      taka                 taka                   taka");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 640, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Simulation Process");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 210, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 204));
        jLabel7.setText("Your coins after Sorting");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 200, 30));
        getContentPane().add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 50, 30));

        amountOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountOutputActionPerformed(evt);
            }
        });
        getContentPane().add(amountOutput, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 40, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 204));
        jLabel8.setText("Total amount");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 120, 30));

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 140, 40));
        getContentPane().add(d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 50, 30));
        getContentPane().add(d3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 50, 30));
        getContentPane().add(d4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 50, 30));

        simu.setColumns(20);
        simu.setRows(5);
        jScrollPane1.setViewportView(simu);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 460, 270));

        bc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blue", "Green", "Yellow" }));
        bc.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                bcPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        bc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bcMouseClicked(evt);
            }
        });
        getContentPane().add(bc, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("Change Background color");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 230, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coinsimulation/images/1.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 370));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Highest coin", "Needed", "Amount"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 230, 270));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed

        String n;
      
      n=  one.getText();
      
      
      if(display1.getText().equals(""))
      {
          display1.setText(n);
          
      }
      else{
          if(display2.getText().equals(""))
          {
              display2.setText(n);
          }
          else{
              if(display3.getText().equals(""))
              {
                  display3.setText(n);
              }
              else{
                  if(display4.getText().equals(""))
                  {
                      display4.setText(n);
                  }
              }
          }
      }
     
              

    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        
       
       String n;
      
      n=  two.getText();
      
      
      if(display1.getText().equals(""))
      {
          display1.setText(n);
          
      }
      else{
          if(display2.getText().equals(""))
          {
              display2.setText(n);
          }
          else{
              if(display3.getText().equals(""))
              {
                  display3.setText(n);
              }
              else{
                  if(display4.getText().equals(""))
                  {
                      display4.setText(n);
                  }
              }
          }
      }
      
      
        
    }//GEN-LAST:event_twoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        display1.setText("");
         display2.setText("");
         display3.setText("");
         display4.setText("");
         capacitytxt.setText("");
         d1.setText("");
         d2.setText("");
         d3.setText("");
         d4.setText("");
         amountOutput.setText("");
         
         
         
         
          DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
          while(model.getRowCount()>0)
          {
              for(int i=0;i<(model.getRowCount());i++)
              {
                  model.removeRow(i);
              }
          }
          
         // simu.append("");
         simu.setText("");
         
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        // TODO add your handling code here:
              String n;
      
      n=  three.getText();
      
      
      if(display1.getText().equals(""))
      {
          display1.setText(n);
          
      }
      else{
          if(display2.getText().equals(""))
          {
              display2.setText(n);
          }
          else{
              if(display3.getText().equals(""))
              {
                  display3.setText(n);
              }
              else{
                  if(display4.getText().equals(""))
                  {
                      display4.setText(n);
                  }
              }
          }
      }
     
        
        
        
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        // TODO add your handling code here:
                String n;
      
      n=  four.getText();
      
      
      if(display1.getText().equals(""))
      {
          display1.setText(n);
          
      }
      else{
          if(display2.getText().equals(""))
          {
              display2.setText(n);
          }
          else{
              if(display3.getText().equals(""))
              {
                  display3.setText(n);
              }
              else{
                  if(display4.getText().equals(""))
                  {
                      display4.setText(n);
                  }
              }
          }
      }
     
        
        
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        // TODO add your handling code here:
                      String n;
      
      n=  five.getText();
      
      
      if(display1.getText().equals(""))
      {
          display1.setText(n);
          
      }
      else{
          if(display2.getText().equals(""))
          {
              display2.setText(n);
          }
          else{
              if(display3.getText().equals(""))
              {
                  display3.setText(n);
              }
              else{
                  if(display4.getText().equals(""))
                  {
                      display4.setText(n);
                  }
              }
          }
      }
     
        
        
        
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        // TODO add your handling code here:
                      String n;
      
      n=  six.getText();
      
      
      if(display1.getText().equals(""))
      {
          display1.setText(n);
          
      }
      else{
          if(display2.getText().equals(""))
          {
              display2.setText(n);
          }
          else{
              if(display3.getText().equals(""))
              {
                  display3.setText(n);
              }
              else{
                  if(display4.getText().equals(""))
                  {
                      display4.setText(n);
                  }
              }
          }
      }
     
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        // TODO add your handling code here:
                      String n;
      
      n=  seven.getText();
      
      
      if(display1.getText().equals(""))
      {
          display1.setText(n);
          
      }
      else{
          if(display2.getText().equals(""))
          {
              display2.setText(n);
          }
          else{
              if(display3.getText().equals(""))
              {
                  display3.setText(n);
              }
              else{
                  if(display4.getText().equals(""))
                  {
                      display4.setText(n);
                  }
              }
          }
      }
     
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        // TODO add your handling code here:              
        String n;
      
      n=  eight.getText();
      
      
      if(display1.getText().equals(""))
      {
          display1.setText(n);
          
      }
      else{
          if(display2.getText().equals(""))
          {
              display2.setText(n);
          }
          else{
              if(display3.getText().equals(""))
              {
                  display3.setText(n);
              }
              else{
                  if(display4.getText().equals(""))
                  {
                      display4.setText(n);
                  }
              }
          }
      }
     
    }//GEN-LAST:event_eightActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        double [] a=new double[4];
        int i=0;
        double cap;
        
        
        try{
           
            
       
         a[0] = Double.parseDouble(display1.getText());   
  a[1] = Double.parseDouble(display2.getText()); 
  a[2] = Double.parseDouble(display3.getText()); 
  a[3] = Double.parseDouble(display4.getText());    
   

    //sorting
    
      for (i = 0; i < a.length - 1; i++) 
      {
        int index = i;  
            for (int j = i + 1; j < a.length; j++){ 
                
                if (a[j] > a[index]){  
                    index = j;
                }
            }  
            
            double smallerNumber = a[index];   
            a[index] = a[i];  
            a[i] = smallerNumber;  
      }
      
      
/*for(i=0;i<4;i++)
{
    System.out.println(a[i]);
  
} 
    
   */
    
   }    
                        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Textfield can't be empty");
        }      
  
        cap =Double.parseDouble(capacitytxt.getText());
     
        //simulation2 s2=new simulation2(); 
      //s2.main(a,cap);
 
    String  answer=String.format("%.0f",a[0]);
     String  answer1=String.format("%.0f",a[1]);
      String  answer2=String.format("%.0f",a[2]);
       String  answer3=String.format("%.0f",a[3]);
  String  am=String.format("%.0f",cap);
       d1.setText(answer);
       d2.setText(answer1);
       d3.setText(answer2);
       d4.setText(answer3);
       amountOutput.setText(am);
  
       
       
      
       
       //double number;
       //int j=0;
       //int step=0;
       
                   
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void capacitytxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capacitytxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capacitytxtActionPerformed

    private void amountOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountOutputActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
            
       int [] p=new int[4];
       //int [] a=new int[4];
       int total;
       int num,c,f;
       int i=0,j=0;
       
       try{
           
           
           
             p[0] = Integer.parseInt(d1.getText());  
             p[1]=Integer.parseInt(d2.getText());
             p[2]=Integer.parseInt(d3.getText());
             p[3]=Integer.parseInt(d4.getText());
             
             //total=Double.parseDouble(amountOutput.getText());
             
             total=Integer.parseInt(amountOutput.getText());
             
             
             
               // num=total/p[i]; 
             //  int number = (int) num;
                
             // String  z=String.format("%d",number);
             
            
          DefaultTableModel model=(DefaultTableModel) jTable1.getModel();  
    
    while(total>0 && j!=4)
    {
        c=p[j];
        simu.append("Step="+(j+1)+"\n\n");
        
        simu.append(" Total amount is "+total);
        simu.append("\n\n");
        
        simu.append(" Highest coin is = "+c+"\n\n");
        
        simu.append("#The Number of required coins = Total amount / Highest coin");
        simu.append("\n\n");
        
        simu.append("=> "+total+" / "+c+"=");
      
        num=total/c;
        simu.append(""+num);
        simu.append("\n\n");
        model.addRow(new Object[]{c,num,total});
        
        simu.append(c+" Taka's Coin are required = "+num+"\n\n");
          j++;
     
     
        
        //total=total-(num*c);
          simu.append(" #Total = Total - (Number of Coins x Highest Coin)");
           simu.append("\n\n");
           
           simu.append(" #Here\n");
           
             simu.append("Number of Coin is  "+num+" x  Highest value of Coin is "+c);
             f=num*c;
              simu.append(" = "+f);
             simu.append("\n\n");
             
               simu.append("=> Total = "+total+"-"+f);
                simu.append("\n\n");
               total=total-f;
          
            simu.append("\n");
        
 simu.append("Updated total amount = "+total);
 
 simu.append("\n\n\n");
 
    }
    model.addRow(new Object[]{0,0,total});
    
    
   //simu.setBackground(Color.BLUE);
   simu.setForeground(Color.GREEN);
    
           Font fo=new Font("Arial",Font.BOLD, 14);
             simu.setFont(fo);
            
         simu.append("Thank you");    
               
           
           
           
       }catch(Exception e)
       {
          JOptionPane.showMessageDialog(null,"Sorry,This amount can't be divided\nPlease try another amount"); 
       }
        
      
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bcMouseClicked
        // TODO add your handling code here:
           
    }//GEN-LAST:event_bcMouseClicked

    private void bcPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_bcPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        String cl=(String) bc.getSelectedItem();
        if(cl=="Blue")
        {
           simu.setBackground(Color.blue);
        }
        else if(cl=="Yellow")
        {
            simu.setBackground(Color.yellow);
            simu.setForeground(Color.white);
        }
        else if(cl=="Green")
        {
            simu.setBackground(Color.green);
            simu.setForeground(Color.white);
        }
    }//GEN-LAST:event_bcPopupMenuWillBecomeInvisible

    private void display1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_display1ActionPerformed

    private void display2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_display2ActionPerformed

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
            java.util.logging.Logger.getLogger(simulation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(simulation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(simulation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(simulation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new simulation().setVisible(true);
           
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountOutput;
    private javax.swing.JComboBox<String> bc;
    private javax.swing.JTextField capacitytxt;
    private javax.swing.JTextField d1;
    private javax.swing.JTextField d2;
    private javax.swing.JTextField d3;
    private javax.swing.JTextField d4;
    private javax.swing.JTextField display1;
    private javax.swing.JTextField display2;
    private javax.swing.JTextField display3;
    private javax.swing.JTextField display4;
    private javax.swing.JButton eight;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton one;
    private javax.swing.JButton seven;
    private javax.swing.JTextArea simu;
    private javax.swing.JButton six;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    // End of variables declaration//GEN-END:variables
}
