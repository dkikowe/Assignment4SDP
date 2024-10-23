package Memento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.type("Hello, ");
        history.save(editor);

        editor.type("World!");
        System.out.println("Current Text: " + editor.getText());

        history.undo(editor);
        System.out.println("After Undo: " + editor.getText());
    }
}