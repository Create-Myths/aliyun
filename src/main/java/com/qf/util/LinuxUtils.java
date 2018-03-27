package com.qf.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import ch.ethz.ssh2.Connection;
import ch.ethz.ssh2.Session;
import ch.ethz.ssh2.StreamGobbler;
/**
 * Thanks for Everything.
 */
public class LinuxUtils {
	//LinuxUtils.execute("10.0.114.226", "root", "123", "shutdown -h now");
	public static int execute(String ip,String username,String password,String cmd){
		try
		{
			//注意导包，ssh链接linux
			Connection conn = new Connection(ip);
			conn.connect();
			boolean isAuthenticated = conn.authenticateWithPassword(username, password);
			if (isAuthenticated == false)
				throw new IOException("Authentication failed.");
			Session sess = conn.openSession();
			sess.execCommand(cmd);//指令：shutdown -h now,reboot
			InputStream stdout = new StreamGobbler(sess.getStdout());
			BufferedReader br = new BufferedReader(new InputStreamReader(stdout));
			while (true)
			{
				String line = br.readLine();
				if (line == null)
					break;
				System.out.println(line);
			}
			System.out.println("ExitCode: " + sess.getExitStatus());
			sess.close();
			conn.close();
			return 1;
		}
		catch (IOException e)
		{
			e.printStackTrace(System.err);
			System.exit(2);
			return 0;
		}
	}
}
