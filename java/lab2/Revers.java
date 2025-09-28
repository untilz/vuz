public class Revers {
  public static void main(String[] args){
    String[] line = args;
    String tool = "";
    for(int i = 0; i < (line.length / 2); i++){
       tool = line[i];
       line[i] = line[line.length - i - 1];
       line[line.length - i - 1] = tool;
    }
    for(int i = 0; i < line.length; i++){
      System.out.print(line[i] + " ");
    }
  }
}
