package command;

import java.util.Stack;

import Memento.Caretaker;
import Memento.Memento;

public class ListCommand implements Command {

	private Caretaker ct;
	
	public ListCommand(Caretaker ct) {
		this.ct = ct;
	}

	@Override
	public void execute() {
		Stack<Memento> undo = ct.getUndoList();
		Stack<Memento> redo = ct.getRedoList();
		System.out.println("Undo List:");
		if(undo.size()==0){
			System.out.println("Empty");
		}
		for(int i=0;i<undo.size();i++){
			System.out.println(undo.get(i).getId());
		}
		System.out.println("\nRedo List:");
		if(redo.size()==0){
			System.out.println("Empty");
		}
		for(int i=0;i<redo.size();i++){
			System.out.println(redo.get(i).getId());
		}
		
	}

}
