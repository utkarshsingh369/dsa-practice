package recursion.IP_OP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// IP: ['a','b']   OP: [[], ['a'], ['b'], ['a', 'b']]

public class FindPowerSet {
  private static void util(List<Character> input, List<Character> intermediaryOutput, List<List<Character>> result){
    if(input.isEmpty()){
      result.add(intermediaryOutput);
      return;
    }
    char temp = input.removeFirst();
    util(new ArrayList<>(input), new ArrayList<>(intermediaryOutput), result);
    intermediaryOutput.add(temp);
    util(new ArrayList<>(input), new ArrayList<>(intermediaryOutput), result);
  }
  public static void main(String[] args) {
    List<Character> input = new ArrayList<>(Arrays.asList('a','b','c'));
    List<Character> intermediaryOutput = new ArrayList<>();
    List<List<Character>> result = new ArrayList<>();
    util(input, intermediaryOutput, result);
    System.out.println(result);
  }
}
