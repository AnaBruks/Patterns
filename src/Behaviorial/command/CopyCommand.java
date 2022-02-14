package Behaviorial.command;

public class CopyCommand extends Command {
// Команда копирования

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
