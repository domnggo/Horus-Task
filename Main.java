import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List<Block> blocks1 = new ArrayList<>();
        blocks1.add(new BlockImp("red", "wood"));
        blocks1.add(new BlockImp("red", "wood"));
        blocks1.add(new BlockImp("red", "wood"));
        blocks1.add(new BlockImp("red", "wood"));
        List<Block> blocks2 = new ArrayList<>();
        blocks2.add(new BlockImp("red", "wood"));
        blocks2.add(new BlockImp("blue", "brick"));
        blocks2.add(new BlockImp("blue", "brick"));
        blocks2.add(new BlockImp("red", "glass"));
        blocks2.add(new BlockImp("grey", "wood"));
        Wall wall1 = new Wall(blocks1);
        Wall wall2 = new Wall(blocks2);

        System.out.println("Wall 1 has " + wall1.count() + " elements");
        System.out.println(wall1.findBlocksByMaterial("wood").size() + " wood elements");
        System.out.println(wall1.findBlocksByMaterial("glass").size() + " glass elements");

        if(wall1.findBlockByColor("red").isPresent())
            System.out.println("red color is present in wall 1");
        else System.out.println("red color is not present in wall 1");

        if(wall1.findBlockByColor("blue").isPresent())
            System.out.println("blue color is present in wall 1");
        else System.out.println("blue color is not present in wall 1");

        System.out.println("\nWall 2 has " + wall2.count() + " elements");
        System.out.println(wall2.findBlocksByMaterial("wood").size() + " wood elements");
        System.out.println(wall2.findBlocksByMaterial("glass").size() + " glass elements");
        System.out.println(wall2.findBlocksByMaterial("brick").size() + " brick elements");

        if(wall2.findBlockByColor("red").isPresent())
            System.out.println("red color is present in wall 2");
        else System.out.println("red color is not present in wall 2");

        if(wall2.findBlockByColor("blue").isPresent())
            System.out.println("blue color is present in wall 2");
        else System.out.println("blue color is not present in wall 2");

        if(wall2.findBlockByColor("green").isPresent())
            System.out.println("green color is present in wall 2");
        else System.out.println("green color is not present in wall 2");
    }
}