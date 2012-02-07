/**
 * 
 */
package com.sree.appserver;

import java.io.File;

import com.sree.server.utils.JumpStartPropertyFile;
import com.sree.server.utils.SystemProperties;


/**
 * @author Sree
 *
 */
public class StartDbServer implements Runnable{

	@Override
	public void run() {
		startDbServer();
	}
	
	public void startDbServer(){
		try {
			System.out.println("Starting database...");
			String fileToRead = SystemProperties.getCurrentPath()+File.separator+"conf"+File.separator+"conf.ini";
			JumpStartPropertyFile file = new JumpStartPropertyFile(fileToRead);

			String DIR = SystemProperties.getCurrentPath()+File.separator+ file.getProperty("mysql.parent.dir") + File.separator+file.getProperty("Config.DataBase")+File.separator+"bin"+File.separator;
			String[] CMD = file.getProperty("Startup.Win.MySql_CMD").replace("<replacement_path>", SystemProperties.getCurrentPath()+File.separator+file.getProperty("mysql.parent.dir")+File.separator+file.getProperty("Config.DataBase")).split(",");
			String[] ENV = file.getProperty("system.path").split(",");
			
			Runtime rt = Runtime.getRuntime();
			Process proc = rt.exec(CMD, ENV, new File(DIR));

			StreamGobbler errorGobbler = new StreamGobbler(proc
					.getErrorStream(), "ERROR");

			StreamGobbler outputGobbler = new StreamGobbler(proc
					.getInputStream(), "OUTPUT");

			errorGobbler.start();
			outputGobbler.start();

			proc.waitFor();
			//System.out.println("ExitValue: " + exitVal);
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

}
