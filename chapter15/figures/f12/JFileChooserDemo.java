package chapter15.figures.f12;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JFileChooser;

import java.awt.HeadlessException;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class JFileChooserDemo extends JFrame {
	private final JTextArea outputArea; // displays file contents

	public JFileChooserDemo() throws IOException {
		super("JFileChooser Demo");
		outputArea = new JTextArea();
		add(new JScrollPane(outputArea)); //
		analyzePath(); //
	}

	public void analyzePath() throws IOException {
		Path path = GetFileOrDirectoryPath();

		if (path != null && Files.exists(path)) // if exists
		{
			StringBuilder builder = new StringBuilder();
			builder.append(String.format("%s:%n", path.getFileName()));
			builder.append(String.format("%s a directory%n", Files.isDirectory(path) ? "Is" : "Is not"));
			builder.append(String.format("%s an absolute path%n", path.isAbsolute() ? "Is" : "Is not"));
			builder.append(String.format("Last modified: %s%n", Files.getLastModifiedTime(path)));
			builder.append(String.format("Size: %s%n", Files.size(path)));
			builder.append(String.format("Path: %s%n", path));
			builder.append(String.format("Absolute path: %s%n",   path.toAbsolutePath())); 
		}

	}

	private Path GetFileOrDirectoryPath() {
		// TODO Auto-generated method stub
		return null;
	}


}
