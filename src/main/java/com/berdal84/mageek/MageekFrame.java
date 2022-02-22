/*
 * The MIT License
 *
 * Copyright 2022 Berdal84.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.berdal84.mageek;

import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.TreePath;
import net.imagej.ops.OpService;
import org.scijava.Context;
import org.scijava.app.StatusService;
import org.scijava.command.CommandService;
import org.scijava.log.LogService;
import org.scijava.plugin.Parameter;
import org.scijava.thread.ThreadService;
import org.scijava.ui.UIService;

/**
 *
 * @author berenger
 */
public class MageekFrame extends javax.swing.JFrame {

    /**
     * Creates new form MageekFrame
     */
    public MageekFrame(final Context ctx) {
        ctx.inject(this);
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

        jFileChooser1 = new javax.swing.JFileChooser();
        progressBar = new javax.swing.JProgressBar();
        batchCheckBox = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        processBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sourceDirectoryTextEdit = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        browseBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        fileTextArea = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        extensionPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        statsTextArea = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        progressBar.setSize(new java.awt.Dimension(146, 40));
        progressBar.setStringPainted(true);

        batchCheckBox.setSelected(true);
        batchCheckBox.setText("Batch");
        batchCheckBox.setToolTipText("Enable by default, will process the images in background (faster).");
        batchCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batchCheckBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Files to process:");

        cancelBtn.setText("Cancel");

        processBtn.setText("Process");

        jLabel2.setText("Extensions:");

        sourceDirectoryTextEdit.setEditable(false);
        sourceDirectoryTextEdit.setText("/Users/berenger/");

        jLabel3.setText("Source directory:");

        browseBtn.setText("Browse");

        fileTextArea.setEditable(false);
        fileTextArea.setBorder(null);
        jScrollPane2.setViewportView(fileTextArea);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Welcome to Mageek !");

        statusLabel.setBackground(new java.awt.Color(153, 153, 153));
        statusLabel.setText("Status: Please select a source folder");

        extensionPanel.setAutoscrolls(true);

        javax.swing.GroupLayout extensionPanelLayout = new javax.swing.GroupLayout(extensionPanel);
        extensionPanel.setLayout(extensionPanelLayout);
        extensionPanelLayout.setHorizontalGroup(
            extensionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
        );
        extensionPanelLayout.setVerticalGroup(
            extensionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        statsTextArea.setEditable(false);
        statsTextArea.setBorder(null);
        jScrollPane3.setViewportView(statsTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(batchCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(processBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(statusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(extensionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(sourceDirectoryTextEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addComponent(browseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sourceDirectoryTextEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(browseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(extensionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(batchCheckBox)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(processBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158)
                .addComponent(statusLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(350, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void batchCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batchCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_batchCheckBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox batchCheckBox;
    private javax.swing.JButton browseBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JPanel extensionPanel;
    private javax.swing.JTextPane fileTextArea;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton processBtn;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JTextField sourceDirectoryTextEdit;
    private javax.swing.JTextPane statsTextArea;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables

    @Parameter
    private OpService ops;

    @Parameter
    private LogService log;

    @Parameter
    private StatusService status;

    @Parameter
    private CommandService cmd;

    @Parameter
    private ThreadService thread;

    @Parameter
    private UIService ui;

    private ActionListener extensionCheckedListener;

    public TreePath getTreeRoot(){
        return tree.getPathForRow(0);
    }
    
    public void addExtensionCheckedListener(ActionListener listener) {
        extensionCheckedListener = listener;
    }

    public void addBrowseListener(ActionListener listener) {
        browseBtn.addActionListener(listener);
    }
        
    public void addLaunchProcessListener(ActionListener listener) {
        processBtn.addActionListener(listener);
    }

    public void setStatus(String str) {
        statusLabel.setText(String.format("Status: %s", str));
    }

    public void setProgress(int n) {
        progressBar.setValue(n);
    }

    public void setSourceDirectory(String path) {
        sourceDirectoryTextEdit.setText(path);
    }

    public void setExtensions(String[] extensions) {

        extensionPanel.removeAll();
        for (String eachExtension : extensions) {
            JCheckBox checkbox = new JCheckBox(String.format("*.%s", eachExtension));
            checkbox.setSelected(true);
            checkbox.setActionCommand(eachExtension);
            checkbox.addActionListener(extensionCheckedListener);
            extensionPanel.add(checkbox);
        }
    }

    public void setExtensionVisible(boolean visible) {
        extensionPanel.setVisible(visible);
    }

    public List<String> getCheckedExtensions() {
        List<String> result = new ArrayList<String>();
        for (Component c : extensionPanel.getComponents()) {
            JCheckBox cb = (JCheckBox) c;
            if (cb.isSelected()) {
                result.add(cb.getActionCommand());
            }
        }
        return result;
    }

    public void setStats(String message) {
        statsTextArea.removeAll();
        statsTextArea.setText(message);
    }

    void clearFileList() {
        fileTextArea.removeAll();
    };
    
    void setFileList(ArrayList<File> scannedFiles) {
        fileTextArea.removeAll();
        StringBuilder sb = new StringBuilder();
        scannedFiles.forEach( (each) -> {
            sb.append(each);
            sb.append('\n');
        });
        fileTextArea.setText(sb.toString());
    };
}
