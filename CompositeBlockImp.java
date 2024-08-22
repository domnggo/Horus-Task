import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CompositeBlockImp implements CompositeBlock{
    private List<Block> blocks;
    private Map<String,Long> compositeColor;
    private Map<String,Long> compositeMaterial;
    private int count;

    public CompositeBlockImp(List<Block> blocks){
        this.blocks = blocks;
        this.compositeColor = blocks.stream()
                .collect(Collectors.groupingBy(Block::getColor, Collectors.counting()));
        this.compositeMaterial = blocks.stream()
                .collect(Collectors.groupingBy(Block::getColor, Collectors.counting()));
    }
    @Override
    public List<Block> getBlocks() {
        return blocks;
    }

    @Override
    public String getColor() {
        return compositeColor.size() == 1 ? compositeColor.keySet().iterator().next() : "mixed colors";
    }

    @Override
    public String getMaterial() {
        return compositeMaterial.size() == 1 ? compositeMaterial.keySet().iterator().next() : "mixed materials";
    }
}
