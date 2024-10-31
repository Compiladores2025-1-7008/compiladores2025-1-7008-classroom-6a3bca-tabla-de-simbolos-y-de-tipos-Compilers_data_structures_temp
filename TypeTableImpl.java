import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TypeTableImpl implements TypeTable {
    private Map<Integer, Type> types;
    private int nextTypeId; //

    public TypeTableImpl() {
        this.types = new HashMap<>();
        this.nextTypeId = 0;
    }

    @Override
    public int getTam(int id) {
        return types.containsKey(id) ? types.get(id).getTam() : -1;
    }

    @Override
    public int getItems(int id) {
        return types.containsKey(id) ? types.get(id).getItems() : -1;
    }

    @Override
    public String getName(int id) {
        return types.containsKey(id) ? types.get(id).getName() : null;
    }

    @Override
    public int getParenId(int id) {
        return types.containsKey(id) ? types.get(id).getParenId() : -1;
    }

    @Override
    public SymbolTable getParentStruct(int id) {
        return types.containsKey(id) ? types.get(id).getParentStruct() : null;
    }

    @Override
    public Optional<Type> getType(int id) {
        return Optional.ofNullable(types.get(id));
    }

    @Override
    public int addType(String name, int items, int parent) {
        Type newType = new TypeImpl(name, items, parent);
        int id = nextTypeId++;
        types.put(id, newType);
        return id;
    }

    @Override
    public int addType(String name, SymbolTable parent) {
        Type newType = new TypeImpl(name, parent);
        int id = nextTypeId++;
        types.put(id, newType);
        return id;
    }
}
