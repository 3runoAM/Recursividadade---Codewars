import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

public class Solution {
    public static String stringify(Node list) {
        StringBuilder builder = new StringBuilder();
        builder.append(((list == null) ? "null" : list.getData() + " -> " + stringify(list.getNext())));
        return builder.toString();
    }
}