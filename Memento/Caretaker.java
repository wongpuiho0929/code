package Memento;

import java.util.ArrayList;
import java.util.Stack;
import adapter.Xmember;

public class Caretaker {
	private Stack<Memento> undoList;
	private Stack<Memento> redoList;
	
	public Caretaker(){
		undoList = new Stack<Memento>();
		redoList = new Stack<Memento>();
	}
	
	public void saveMemento(Xmember xmem,String command){
		Memento mmt = new DataMemento(xmem,command);
		undoList.push(mmt);
		redoList.clear();
	}
	
	public void saveMember(ArrayList<Xmember> memberList ,String id,String command){
		Memento mmt = new MemberMemento(memberList,id,command);
		undoList.push(mmt);
		redoList.clear();
	}
	
	public void undo(){
		redoList.push(undoList.pop());
		redoList.lastElement().restore();
	}
	
	public void redo(){
		undoList.push(redoList.pop());
		undoList.lastElement().reRestore();
	}

	public Stack<Memento> getUndoList() {
		return undoList;
	}

	public Stack<Memento> getRedoList() {
		return redoList;
	}		
}
