package Behaviorial.command;

import java.util.Stack;

public class CommandHistory {
// История команд в виде Стека

    private Stack<Command> history = new Stack<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}
