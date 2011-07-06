package com.sree.common.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;

public class CompressFile {
	static final int BUFFER = 10240;

	public static void compress(String srcDirectory, String compressedFile) {
		FileOutputStream dest = null;
		try {
			dest = new FileOutputStream(compressedFile);
			JarOutputStream out = null;
			try {
				out = new JarOutputStream(new BufferedOutputStream(dest));
			} catch (IOException e) {
				PrintLogging.print(4, e.toString());
			}

			int i = srcDirectory.lastIndexOf("/");
			String srcFile = srcDirectory.substring(i + 1, srcDirectory
					.length());

			out = jarDir(out, srcDirectory, srcFile);
			try {
				out.close();
			} catch (IOException e) {
				PrintLogging.print(4, e.toString());
			}
		} catch (FileNotFoundException e) {
			PrintLogging.print(4, e.toString());
		}
	}

	private static JarOutputStream jarDir(JarOutputStream out,
			String srcDirectory, String currentDir) {
		PrintLogging.print(5, "Information passed to jarDir: " + srcDirectory
				+ "," + currentDir);

		String relativeCurrentDir = currentDir;
		if (relativeCurrentDir.startsWith("/")) {
			relativeCurrentDir = currentDir.replaceFirst("/", "");
		}

		try {
			BufferedInputStream origin = null;

			byte[] data = new byte[10240];

			File f = new File(srcDirectory);
			String[] files = f.list();

			for (int i = 0; i < files.length; i++) {
				if (!new File(srcDirectory + "/" + files[i]).isDirectory()) {
					String fileName = relativeCurrentDir + "/" + files[i];
					if (fileName.startsWith("/")) {
						fileName = fileName.replaceFirst("/", "");
					}
					PrintLogging.print(5, "Adding: " + relativeCurrentDir + "/"
							+ files[i]);

					FileInputStream fi = new FileInputStream(srcDirectory + "/"
							+ files[i]);
					origin = new BufferedInputStream(fi, 10240);

					JarEntry entry = new JarEntry(fileName);
					out.putNextEntry(entry);
					int count;
					while ((count = origin.read(data, 0, 10240)) != -1) {
						out.write(data, 0, count);
					}
					origin.close();
				} else {
					PrintLogging.print(5, "Recursing to directory: "
							+ currentDir + "/" + files[i]);

					jarDir(out, srcDirectory + "/" + files[i], currentDir + "/"
							+ files[i]);
				}

			}

			if (files.length == 0) {
				PrintLogging.print(5, "Located empty directory: " + currentDir
						+ "/");
				JarEntry entry = new JarEntry(relativeCurrentDir + "/");
				out.putNextEntry(entry);
			}

			return out;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return out;
	}
}