package command;


import Memento.Caretaker;


public class UndoCommand implements Command{

	private Caretaker ct;
	
	public UndoCommand(Caretaker ct) {
		this.ct = ct;
	}

	@Override
	public void execute() {
		if(!ct.getUndoList().isEmpty()){
		ct.undo();
		System.out.println("undo");}
		else{
			System.out.println("Cannot Undo");
		}
	}

}
