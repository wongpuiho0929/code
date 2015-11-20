package command;

import java.util.Stack;

import Memento.Caretaker;
import Memento.Memento;

public class RedoCommand implements Command {

	private Caretaker ct;
	private Stack<Memento> redoList;

	public RedoCommand(Caretaker ct) {
		this.ct = ct;
		redoList = ct.getRedoList();
	}

	@Override
	public void execute() {
		if (!redoList.isEmpty()) {
			ct.redo();
			System.out.println("redo");
		}else{
			System.out.println("Cannot Redo");
		}

	}

}
