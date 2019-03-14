public class MyRange {
    public boolean startWithInclude(String input) {
        return input.startsWith("[");
    }

    public boolean endWithInclude(String input) {
        return input.endsWith("]");
    }
}
