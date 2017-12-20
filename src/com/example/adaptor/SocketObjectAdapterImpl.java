/**
 * @author Narendra Borhade
 *
 */
package com.example.adaptor;

public class SocketObjectAdapterImpl implements SocketAdaptor{

	//Using Composition for adapter pattern
	Socket socket = new Socket();
	
	@Override
	public Volt get120Volt() {
		return socket.getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt v = socket.getVolt();
		return convertVolt(v,10);
	}

	@Override
	public Volt get3Volt() {
		Volt v = socket.getVolt();
		return convertVolt(v,30);
	}
	
	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}

}
