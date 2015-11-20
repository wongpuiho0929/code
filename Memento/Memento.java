package Memento;

import java.util.ArrayList;

import adapter.Xmember;

public interface Memento {

	public void restore();
	public void reRestore();
	public String getId();
	
}
