
package myPackage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class GUI extends javax.swing.JFrame {
    TodoList T;
    public GUI() {
        initComponents();
        T = new TodoList();
        tasksPanel.setLayout(new BoxLayout(tasksPanel, BoxLayout.Y_AXIS));
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        Heading = new javax.swing.JLabel();
        addTaskField = new javax.swing.JTextField();
        addTaskButton = new javax.swing.JButton();
        priorityValue = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tasksPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(153, 0, 0));

        Heading.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        Heading.setForeground(new java.awt.Color(255, 255, 255));
        Heading.setText("To-Do List ");

        addTaskField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        addTaskButton.setBackground(new java.awt.Color(0, 204, 0));
        addTaskButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        addTaskButton.setText("Add Task");
        addTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTaskButtonActionPerformed(evt);
            }
        });

        priorityValue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        priorityValue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Priority");

        tasksPanel.setBackground(new java.awt.Color(255, 255, 255));
        tasksPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        tasksPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout tasksPanelLayout = new javax.swing.GroupLayout(tasksPanel);
        tasksPanel.setLayout(tasksPanelLayout);
        tasksPanelLayout.setHorizontalGroup(
            tasksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );
        tasksPanelLayout.setVerticalGroup(
            tasksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(tasksPanel);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(Heading))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addTaskField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(priorityValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addComponent(addTaskButton)))
                .addContainerGap(238, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(0, 204, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addTaskField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(priorityValue, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTaskButtonActionPerformed
        String task = addTaskField.getText();
        if(!task.isEmpty()){
        int priority = priorityValue.getSelectedIndex();
        Task t1 = new Task(task, priority);
        T.addTask(t1);
        tasksPanel.removeAll();
                        T.sortTasksByPriority();
                        for (Task t : T.getTasks()) {
                            this.addTaskToPanel(t);
                        }
                        tasksPanel.revalidate();
                        tasksPanel.repaint();
        addTaskField.setText("");
        
        }
        else{
            JOptionPane.showMessageDialog(null,"Please enter a name");
        }
        
    }//GEN-LAST:event_addTaskButtonActionPerformed
    public void addTaskToPanel(Task task) {
        JPanel taskPanel = new JPanel();
        taskPanel.setLayout(new BorderLayout());
        int taskPanelHeight = 50; // Specify the desired height here
        // Set the preferred size of the task panel
        taskPanel.setPreferredSize(new Dimension(tasksPanel.getWidth(), taskPanelHeight));
        
        JLabel taskLabel = new JLabel(task.getDescription());
        taskLabel.setFont(taskLabel.getFont().deriveFont(Font.BOLD, 14f));
        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
        labelPanel.add(taskLabel);
        JButton editButton = new JButton("Edit");
        JButton deleteButton = new JButton("Delete");
        JButton priorityButton = new JButton("Change Priority");
        
        // Set the font size of the buttons
        Font buttonFont = editButton.getFont().deriveFont(Font.BOLD,12f);
        editButton.setFont(buttonFont);
        deleteButton.setFont(buttonFont);
        priorityButton.setFont(buttonFont);

        // Set the size of the buttons
        Dimension buttonSize = new Dimension(80, 30);
        editButton.setPreferredSize(buttonSize);
        deleteButton.setPreferredSize(buttonSize);
        Dimension prButtonSize = new Dimension(130, 30);
        priorityButton.setPreferredSize(prButtonSize);
        
        editButton.setBackground(Color.YELLOW);
        deleteButton.setBackground(Color.RED);
        priorityButton.setBackground(Color.GREEN);
    
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(editButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(priorityButton);
        
        
        taskPanel.add(labelPanel, BorderLayout.WEST);
        taskPanel.add(buttonPanel, BorderLayout.EAST);
        
        

        tasksPanel.add(taskPanel);
        tasksPanel.revalidate();
        tasksPanel.repaint();

        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newDescription = JOptionPane.showInputDialog(GUI.this, "Enter new description:");
                try{
                if (!newDescription.isEmpty()) {
                    task.setDescription(newDescription);
                    taskLabel.setText(task.getDescription());
                    tasksPanel.revalidate();
                    tasksPanel.repaint();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Please enter a valid name");
                }
            }
            catch(NullPointerException d){}
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(GUI.this, "Are you sure you want to delete this task?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    T.removeTask(task);
                    tasksPanel.remove(taskPanel);
                    tasksPanel.revalidate();
                    tasksPanel.repaint();
                }
            }
        });

        priorityButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int newPriority = Integer.parseInt(JOptionPane.showInputDialog(GUI.this, "Enter new Priority (1-3):"));
                    if (newPriority >= 1 && newPriority <= 3) {
                        task.setPriority(newPriority);
                        // Update the tasksPanel by reordering the tasks based on their priorities
                        tasksPanel.removeAll();
                        T.sortTasksByPriority();
                        for (Task t : T.getTasks()) {
                            addTaskToPanel(t);
                        }
                        tasksPanel.revalidate();
                        tasksPanel.repaint();
                        JOptionPane.showMessageDialog(null, "Priority Updated Successfully");
                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter a valid priority");
                    }
                } catch (NumberFormatException d) {
                    
                }
            }
        });

    }
    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Heading;
    private javax.swing.JButton addTaskButton;
    private javax.swing.JTextField addTaskField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JComboBox<String> priorityValue;
    private javax.swing.JPanel tasksPanel;
    // End of variables declaration//GEN-END:variables
}
