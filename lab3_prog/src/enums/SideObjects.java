package enums;

public enum SideObjects {
    BLANKET("одеяло"),
    TEXTBOOK("учебник"),
    WINDOW("окно");



    protected final String name;
    SideObjects(String rus_name) { name = rus_name;}
    public String getObjectRuName(){return name;}
}
