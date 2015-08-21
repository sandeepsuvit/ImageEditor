package com.dotedlabs.app.controller;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JToolBar;

public class ApplicationController extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					ApplicationController frame = new ApplicationController();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ApplicationController() {
			
		setIconImage(Toolkit.getDefaultToolkit().getImage(ApplicationController.class.getResource("/com/dotedlabs/app/resources/image-editor-icon.png")));
		setTitle("ImageEditor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		setExtendedState(JFrame.MAXIMIZED_BOTH); 
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mnFile.add(mntmOpen);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mnFile.add(mntmSave);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenuItem mntmUndo = new JMenuItem("Undo");
		mnEdit.add(mntmUndo);
		
		JMenuItem mntmRedo = new JMenuItem("Redo");
		mnEdit.add(mntmRedo);
		
		JMenu mnFilter = new JMenu("Filter");
		menuBar.add(mnFilter);
		
		JMenuItem mntmGreyscale = new JMenuItem("Greyscale");
		mnFilter.add(mntmGreyscale);
		
		JMenuItem mntmContrast = new JMenuItem("Contrast");
		mnFilter.add(mntmContrast);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mnHelp.add(mntmAbout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(ApplicationController.class.getResource("/com/dotedlabs/app/resources/open-icon-24.png")));
		toolBar.add(btnNewButton_1);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(ApplicationController.class.getResource("/com/dotedlabs/app/resources/save-icon-24.png")));
		toolBar.add(button);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(ApplicationController.class.getResource("/com/dotedlabs/app/resources/crop-icon-24.png")));
		toolBar.add(btnNewButton);
	}
}
