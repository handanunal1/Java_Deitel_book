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
			builder.append(String.format("Absolute path: %s%n", path.toAbsolutePath()));

			if (Files.isDirectory(path)) {
				builder.append(String.format("%nDirectory contents:%n"));
				DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);

				for (Path p : directoryStream) {
					builder.append(String.format("%s%n", p));
				}
				outputArea.setText(builder.toString()); // display String content
			}

		} else {
			JOptionPane.showMessageDialog(this, path.getFileName() + " does not exist.", "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}

	}

	private Path GetFileOrDirectoryPath() {

		JFileChooser jfilechooser = new JFileChooser();
		jfilechooser.setFileSelectionMode ( JFileChooser.FILES_AND_DIRECTORIES) ;
		int result = jfilechooser.showOpenDialog(this);
		if(result == jfilechooser.CANCEL_OPTION)
		{
			System.exit(1);
		}

		return jfilechooser.getSelectedFile().toPath();
	}

}
