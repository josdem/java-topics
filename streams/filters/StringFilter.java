import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StringFilter {

  private List<String> parse(){
    return Arrays.asList("Java", "C++", "Lisp", "Haskell").
      stream().filter( p -> p.startsWith("J")).
      collect(Collectors.toList());
  }

  public static void main(String[] args){
    List<String> result = new StringFilter().parse();
    assert 1 == result.size();
    assert "Java" == result.get(0);
  }

}