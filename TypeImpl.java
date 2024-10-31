public class TypeImpl implements Type, TypeParent {
    private String name;
    private short items;
    private short tam;
    private int parenId;
    private SymbolTable parentStruct;

    public TypeImpl(String name, short items, short tam, int parenId, SymbolTable parentStruct) {
        this.name = name;
        this.items = items;
        this.tam = tam;
        this.parenId = parenId;
        this.parentStruct = parentStruct;
    }

    public TypeImpl(String name, SymbolTable parentStruct) {
        this(name, (short) 0, (short) 0, -1, parentStruct);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public short getItems() {
        return items;
    }

    @Override
    public short getTam() {
        return tam;
    }

    @Override
    public int getParenId() {
        return parenId;
    }

    @Override
    public SymbolTable getParentStruct() {
        return parentStruct;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItems(short items) {
        this.items = items;
    }

    public void setTam(short tam) {
        this.tam = tam;
    }

    public void setParenId(int parenId) {
        this.parenId = parenId;
    }

    public void setParentStruct(SymbolTable parentStruct) {
        this.parentStruct = parentStruct;
    }
}
