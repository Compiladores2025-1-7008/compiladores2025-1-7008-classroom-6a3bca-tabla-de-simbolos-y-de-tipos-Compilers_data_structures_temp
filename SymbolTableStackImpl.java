import java.util.Optional;
import java.util.Stack;

public class SymbolTableStackImpl implements SymbolTableStack {
    private Stack<SymbolTable> stack;

    public SymbolTableStackImpl() {
        this.stack = new Stack<>();
    }

    @Override
    public void push(SymbolTable table) {
        stack.push(table);
    }

    @Override
    public SymbolTable pop() {
        return stack.isEmpty() ? null : stack.pop();
    }

    @Override
    public Optional<SymbolTable> peek() {
        return stack.isEmpty() ? Optional.empty() : Optional.of(stack.peek());
    }

    @Override
    public Optional<SymbolTable> base() {
        return stack.isEmpty() ? Optional.empty() : Optional.of(stack.firstElement());
    }

    @Override
    public Optional<SymbolTable> lookup(String id) {
        for (int i = stack.size() - 1; i >= 0; i--) {
            SymbolTable table = stack.get(i);
            if (table.containsSymbol(id)) {
                return Optional.of(table);
            }
        }
        return Optional.empty();
    }
}
