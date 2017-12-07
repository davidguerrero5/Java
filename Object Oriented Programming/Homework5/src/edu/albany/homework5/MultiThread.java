package edu.albany.homework5;

import java.io.*;
import java.util.*;

class MultiThread implements Runnable {
	private static BufferedReader bufferedReader = null;
	private List<String> list;

	static {
		try {
			bufferedReader = new BufferedReader(new FileReader("/Users/dguerrero/Desktop/test.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		String line = null;
		int count = 0;
		while (true) {
			this.list = new ArrayList<String>();
			synchronized (bufferedReader) {
				try {
					while ((line = bufferedReader.readLine()) != null) {
						if (count < 15) {
							list.add(line);
							count++;
						} else {
							list.add(line);
							count = 0;
							break;
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			try {
				Thread.sleep(20);
				display(this.list);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (line == null)
				break;
		}
	}

	public void display(List<String> list) {
		for (String str : list) {
			System.out.println(str);
		}
		if (list.size() >= 1)
			System.out.println("There are " + list.size() + " lines in this file.");
	}

	public static class GrepReader {
		public static void main(String[] args) {
			Thread thread1 = new Thread(new MultiThread(), "Thread 1");
			Thread thread2 = new Thread(new MultiThread(), "Thread 2");
			thread1.start();
			thread2.start();
		}
	}
}