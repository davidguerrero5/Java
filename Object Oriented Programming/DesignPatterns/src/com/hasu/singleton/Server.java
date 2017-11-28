package com.hasu.singleton;

public class Server {
	
	private static Server server = null;
	protected int memory;
	protected int cpuCores;
	
	private Server(){
		memory = 16;
		cpuCores = 8;
	}
	
	public static Server getServer(){
		if(server == null){
			server = new Server();
		}
		return server;
	}
	
	@Override
	public String toString() {
		return String.format("Memory %dGB and cores %d", memory, cpuCores);
	}
}
