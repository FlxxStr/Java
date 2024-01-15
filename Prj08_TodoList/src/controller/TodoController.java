package controller;

public class TodoController {
 
	public Todo[] lista;
public TodoController() {
	lista = new Todo[5];
}

public void addTodo(String desc, int pos) {
	
	Todo temp=new Todo(desc);
	lista[pos] = temp;
	System.out.println("Todo aggiunto alla lista");
}
	}


