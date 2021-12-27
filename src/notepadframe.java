
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.datatransfer.Clipboard;
import java.awt.event.ActionEvent;
import java.awt.event.TextEvent;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import javax.swing.JOptionPane;








public class notepadframe extends javax.swing.JFrame { 
    String programName="NotePad";
    String filename="";
    String holdText;
    String fn;
    String dir;
    boolean textchanged=false;
    String fileName;
    Clipboard clip=getToolkit().getSystemClipboard();

    
    public notepadframe() {
        initComponents();
        
        
    } 
    public void checkfile() throws IOException
    { 
    BufferedReader read;
    StringBuffer sb=new StringBuffer();
    try
    {
    read =new BufferedReader(new FileReader(filename));
    String line;
    while((line=read.readLine())!=null){
        sb.append(line+"\n");
    }
    TextArea.setText(sb.toString());
    read.close();
    }
    catch(FileNotFoundException e)
    {
        System.out.println("file not found");
        
    }
    catch(IOException ioe){
    }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogColor = new javax.swing.JDialog();
        colorChooser = new javax.swing.JColorChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        newMenu = new javax.swing.JMenu();
        openMenu = new javax.swing.JMenuItem();
        saveMenu = new javax.swing.JMenuItem();
        saveAsMenu = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenuItem();
        NEW = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        colorMenu = new javax.swing.JMenuItem();

        javax.swing.GroupLayout dialogColorLayout = new javax.swing.GroupLayout(dialogColor.getContentPane());
        dialogColor.getContentPane().setLayout(dialogColorLayout);
        dialogColorLayout.setHorizontalGroup(
            dialogColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogColorLayout.createSequentialGroup()
                .addComponent(colorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 728, Short.MAX_VALUE)
                .addContainerGap())
        );
        dialogColorLayout.setVerticalGroup(
            dialogColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogColorLayout.createSequentialGroup()
                .addComponent(colorChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Etsub's notepad");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane1.setViewportView(TextArea);

        newMenu.setText("File");
        newMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMenuActionPerformed(evt);
            }
        });

        openMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openMenu.setText("Open");
        openMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuActionPerformed(evt);
            }
        });
        newMenu.add(openMenu);

        saveMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        saveMenu.setText("Save");
        saveMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuActionPerformed(evt);
            }
        });
        newMenu.add(saveMenu);

        saveAsMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        saveAsMenu.setText("Save as");
        saveAsMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuActionPerformed(evt);
            }
        });
        newMenu.add(saveAsMenu);

        exitMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        exitMenu.setText("Exit");
        exitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuActionPerformed(evt);
            }
        });
        newMenu.add(exitMenu);

        NEW.setText("New");
        NEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NEWActionPerformed(evt);
            }
        });
        newMenu.add(NEW);

        jMenuBar1.add(newMenu);

        jMenu2.setText("Edit");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        colorMenu.setText("Text color");
        colorMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorMenuActionPerformed(evt);
            }
        });
        jMenu2.add(colorMenu);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuActionPerformed

if (filename.equals(""))  
    saveAs();
else 
    save(filename);
    }//GEN-LAST:event_saveMenuActionPerformed

    private void saveAsMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuActionPerformed
        // TODO add your handling code here:
        saveAs();
    }//GEN-LAST:event_saveAsMenuActionPerformed

    private void exitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuActionPerformed
if("".equals(TextArea.getText())){
System.exit(0);
}
else if(!textchanged){
    System.exit(0); 
}else{
        int confirm=JOptionPane.showConfirmDialog(null, "do you want to exit");
         if(confirm==JOptionPane.YES_OPTION)
                {
                if("".equals (filename)){
                    saveAs();
                }
                else{
                save(filename);
                }
                
                }else if(confirm==JOptionPane.NO_OPTION){
                  System.exit(0); 
                }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_exitMenuActionPerformed

    private void colorMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colorMenuActionPerformed

    private void openMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuActionPerformed
   if(TextArea.getText().length()<1){
  FileDialog fd= new FileDialog(notepadframe.this, "choose file",FileDialog.LOAD);
  fd.show();
  if(fd.getFile()!=null){
  filename=fd.getDirectory()+fd.getFile();
  setTitle(filename);
  checkFile();
  }
  TextArea.requestFocus();
   }else{int confirm=JOptionPane.showConfirmDialog(null, "do you want to open");
         if(confirm==JOptionPane.YES_OPTION)
                {
                if("".equals (filename)){
                    saveAs();
                }
                
                }
   }
        // TODO add your handling code here:
    }//GEN-LAST:event_openMenuActionPerformed

    private void newMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMenuActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_newMenuActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      if("".equals(TextArea.getText())){ 
          System.exit(0);
      }else if(!textchanged){    
          System.exit(0);
      }else{
        int confirm=JOptionPane.showConfirmDialog(null, "do you want to save before close","choose",JOptionPane.YES_NO_CANCEL_OPTION);
         if(confirm==JOptionPane.YES_OPTION)
                {
                if("".equals (filename)){
                    saveAs();
                }
                else{
                    save(filename);
                    System.exit(0);
                }}
          if(confirm==JOptionPane.NO_OPTION){
              System.exit(0);
          }
      }
        
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
  Color c= colorChooser.showDialog(null, "color diaog",Color.yellow) ;
TextArea.setForeground(c);
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void NEWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEWActionPerformed
newFile();        // TODO add your handling code here:
    }//GEN-LAST:event_NEWActionPerformed

   

  
    public void TextAreaTextValueChanged(java.awt.event.TextEvent evt)
    {
if(TextEvent.TEXT_VALUE_CHANGED!=0){
    if(!textchanged)
        setTitle("* "+getTitle());
    textchanged=true;
    saveMenu.setEnabled(true);
   
}
}
    
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
            java.util.logging.Logger.getLogger(notepadframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(notepadframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(notepadframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(notepadframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new notepadframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem NEW;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JColorChooser colorChooser;
    private javax.swing.JMenuItem colorMenu;
    private javax.swing.JDialog dialogColor;
    private javax.swing.JMenuItem exitMenu;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu newMenu;
    private javax.swing.JMenuItem openMenu;
    private javax.swing.JMenuItem saveAsMenu;
    private javax.swing.JMenuItem saveMenu;
    // End of variables declaration//GEN-END:variables

    private void saveAs() {
        FileDialog fd= new FileDialog(notepadframe.this, "save",FileDialog.SAVE);
        fd.show();
        if(fd.getFile()!=null)
        {
            fn=fd.getFile();
            dir=fd.getDirectory();
            filename= dir + fn +".txt";
            setTitle(filename);
            try
            {
                DataOutputStream d= new DataOutputStream(new FileOutputStream(filename));
                holdText= TextArea.getText();
                BufferedReader br= new BufferedReader(new StringReader(holdText));
                while((holdText= br.readLine()) !=null)
                {
                    d.writeBytes(holdText + "\r\n");
                    d.close();
                }
            }
            catch(Exception e)
            {
                System.out.println("file not found");
            }
            TextArea.requestFocus();
            save(filename);
        }
        }
        
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

     private void save(String filename) {
        setTitle(programName +" "+ filename);
        try
        {
            FileWriter out=new FileWriter(fn);
            out.write(TextArea.getText());
            out.close();
            
        }
        catch(Exception err)
        {
            System.out.println("Error: "+ err);
            textchanged= false;
            saveMenu.setEnabled(false);
            
        }
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void newFile() {
        if(TextArea.getText().length()<1){
            setTitle("untitled-"+programName);
            TextArea.setText("");
            textchanged=false; 
        }
        else if (!textchanged){
        setTitle("untitled-"+programName);
        TextArea.setText("");
        textchanged=false; 
        }else{
        int confirm=JOptionPane.showConfirmDialog(null, TextArea);
         if(confirm==JOptionPane.YES_OPTION)
                {
                if("".equals (filename)){
                    saveAs();
                }
                else{
                save(filename);
                }
                setTitle(programName);
                filename="";
                TextArea.setText("");
                textchanged=false; 
                }else if(confirm==JOptionPane.NO_OPTION){
                    setTitle(programName);
                     filename="";
                TextArea.setText("");
                textchanged=false; 
                }
        }
        
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void checkFile() {
        
        
        
        
        
    }
    }

