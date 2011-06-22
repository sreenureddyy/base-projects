package com.sree.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.TreeSet;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class UnCompressFile {
	private JarFile jarFile;
	private byte[] jbuf;
	private TreeSet<String> directories;

	@SuppressWarnings("unchecked")
	private UnCompressFile(String fileName, String destDirectory) {
		this.jbuf = new byte[8092];
		this.directories = new TreeSet();
		try {
			this.jarFile = new JarFile(fileName);
			Enumeration jents = this.jarFile.entries();
			while (jents.hasMoreElements()) {
				extactFiles((JarEntry) jents.nextElement(), destDirectory);
			}
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}

	private void extactFiles(JarEntry entry, String destDirectory) {
		String jarName = entry.getName();

		if (jarName.startsWith("/")) {
			jarName = jarName.substring(1);
		}
		if (jarName.endsWith("/")) {
			return;
		}
		int ix = jarName.lastIndexOf('/');
		if (ix > 0) {
			String dirName = jarName.substring(0, ix);
			if (!this.directories.contains(destDirectory + dirName)) {
				File d = new File(destDirectory + dirName);
				if ((!d.exists()) || (!d.isDirectory())) {
					PrintLogging.print(5, "Creating Directory: "
							+ destDirectory + dirName);
					if (!d.mkdirs()) {
						PrintLogging.print(1, "Warning: unable to mkdir "
								+ destDirectory + dirName);
					}
					this.directories.add(destDirectory + dirName);
				}
			}
		}

		PrintLogging.print(5, "Creating file: " + destDirectory + jarName);
		if (!jarName.endsWith("/.")) {
			FileOutputStream os = null;
			try {
				os = new FileOutputStream(destDirectory + jarName);
				InputStream is = this.jarFile.getInputStream(entry);
				int n = 0;
				while ((n = is.read(this.jbuf)) > 0) {
					os.write(this.jbuf, 0, n);
				}
				is.close();
				os.close();
			} catch (FileNotFoundException e) {
				PrintLogging.print(1, "Unable to locate file: " + destDirectory
						+ jarName);
				PrintLogging.print(4, e.toString());
			} catch (IOException e) {
				PrintLogging.print(1, "Unable to proccess file: "
						+ destDirectory + jarName);
				PrintLogging.print(4, e.toString());
			}

		} else {
			PrintLogging.print(5, "Ignoring writting file: " + destDirectory
					+ jarName + ", since it is a directory place holder");
		}
	}

	public static void uncompress(String compressedFile, String destDirectory) {
		PrintLogging.print(4, "setup for decompression looks like: "
				+ compressedFile + " into " + destDirectory);
		new UnCompressFile(compressedFile, destDirectory);
	}
}