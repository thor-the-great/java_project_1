import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class VarsTest {

    public static Map<Integer, String> doMap(List<Integer> list) {

        return list.stream().collect(Collectors.toMap(Integer::intValue, i->i.toString()));
    }


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);

        System.out.println(doMap(list));

    }
}

