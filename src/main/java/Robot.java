import java.util.HashMap;
import java.util.Map;

public class Robot {
    int xCoordinate;
    int yCoordinate;
    String compassDirection;
    Map<String,String> leftTurn = new HashMap<>();
    Map<String,String> rightTurn = new HashMap<>();


    Robot(int xCoordinate, int yCoordinate, String compassDirection) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.compassDirection = compassDirection;

        leftTurn.put("N","W");
        leftTurn.put("S", "E");
        leftTurn.put("E", "N");
        leftTurn.put("W", "S");

        rightTurn.put("W", "N");
        rightTurn.put("S", "W");
        rightTurn.put("E", "S");
        rightTurn.put("N", "E");

    }

    public void turnRightOrLeft(String direction){
        if(direction.equals("L")){
            this.compassDirection = leftTurn.get(compassDirection);

        }else{
            this.compassDirection = rightTurn.get(compassDirection);

        }

    }

    public void moveForward(){
        if(this.compassDirection.equals("N")){
            this.yCoordinate++;
        }else if(this.compassDirection.equals("S")){
            this.yCoordinate--;
        }else if(this.compassDirection.equals("E")){
            this.xCoordinate++;
        }else
            this.xCoordinate--;

    }

    public String navigateRobot(String directions){
        for(int i=0;i<directions.length();i++){
            if(directions.charAt(i)=='M'){
                this.moveForward();
            }else{
                this.turnRightOrLeft(String.valueOf(directions.charAt(i)));
            }

        }
        return xCoordinate+" "+yCoordinate+" "+compassDirection;

    }

}
