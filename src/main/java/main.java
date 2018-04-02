public class main {

    public static void main(String args[]){
      Robot robot1 = new Robot(1, 2,"N");
      System.out.println(robot1.navigateRobot("LMLMLMLMM"));

        Robot robot2 = new Robot(3,3,"E");
        System.out.println(robot2.navigateRobot("MMRMMRMRRM"));
    }
}
