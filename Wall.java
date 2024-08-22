import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
public class Wall implements Structure{
    private List<Block> blocks;
    public CompositeBlock compositeBlock;
    public Wall(List<Block> blocks)
    {
        this.blocks = blocks;
        compositeBlock = new CompositeBlockImp(blocks);
    }
    @Override
    public Optional<Block> findBlockByColor(String color) {
        if(compositeBlock.getColor().equals(color))
            return Optional.of(compositeBlock.getBlocks().getFirst());
        return compositeBlock.getBlocks().stream()
                .filter(b -> b.getColor().equals(color)).findFirst();
    }
    @Override
    public List<Block> findBlocksByMaterial(String material) {
        if(compositeBlock.getMaterial().equals(material))
            return compositeBlock.getBlocks();
        return compositeBlock.getBlocks().stream()
                .filter(b -> b.getMaterial().equals(material)).collect(Collectors.toList());
    }

    @Override
    public int count() {
        return compositeBlock.getBlocks().size();
    }
}
