import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;

public class RegexTech {
  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    String[] regexes = new String[3];
    regexes[0] = "^(([2][0-5][0-5]|[1]?[0-9]?[0-9])[.]){3}([2][0-5][0-5]|[1]?[0-9]?[0-9])";
    regexes[1] = "^(http)[s]?";
    regexes[2] = "";
    /*String[] types = {"IP address","URL","filename"};
    ArrayList<ArrayList<String>> arr = new ArrayList<ArrayList<String>>();
    for(int i = 0; i < 3; i++) {
      Scanner fin = new Scanner(new File(in.nextLine()));
      arr.add(new ArrayList<String>());
      while(fin.hasNextLine()) {
        arr.get(i).add(fin.nextLine());
      }
    }
    for(int i = 0; i < arr.size(); i++) {
      for(int j = 0; j < arr.get(i).size(); j++) {
        System.out.println(
          arr.get(i).get(j)+" is"+
          (arr.get(i).get(j).matches(regexes[i]) ? " " : " not ")+
          "a valid "+types[i]
        );
      }
      System.out.print("\n");
    */
    System.out.println(in.nextLine().matches(regexes[1]));
  }
}