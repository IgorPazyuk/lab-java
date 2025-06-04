import java.util.ArrayList;
import java.util.List;

abstract class GardenTree {
    protected String name;

    public GardenTree(String name) {
        this.name = name;
    }

    public class Branch {
        public void describeBranch() {
            System.out.println("Гілка дерева " + name);
        }
    }

    public static class Info {
        public static void showGeneralInfo() {
            System.out.println("Садові дерева потребують сонця та води.");
        }
    }

    public abstract void grow();
}

class AppleTree extends GardenTree {
    public AppleTree() {
        super("Яблуня");
    }

    @Override
    public void grow() {
        System.out.println("Яблуня росте і дає яблука.");
    }
}

class CherryTree extends GardenTree {
    public CherryTree() {
        super("Вишня");
    }

    @Override
    public void grow() {
        System.out.println("Вишня росте і цвіте рожевими квітами.");
    }
}

class Garden {
    private List<GardenTree> trees = new ArrayList<>();

    public void addTree(GardenTree tree) {
        trees.add(tree);
    }

    public void showGarden() {
        for (GardenTree tree : trees) {
            tree.grow();
        }
    }
}

class TreeCare {
    public void waterTree(GardenTree tree) {
        System.out.println("Полив дерева: " + tree.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();

        GardenTree apple = new AppleTree();
        GardenTree cherry = new CherryTree();

        garden.addTree(apple);
        garden.addTree(cherry);

        TreeCare care = new TreeCare();
        care.waterTree(apple);
        care.waterTree(cherry);

        garden.showGarden();

        GardenTree.Branch appleBranch = apple.new Branch();
        appleBranch.describeBranch();


        GardenTree.Info.showGeneralInfo();

        class Gardener {
            void prune(GardenTree tree) {
                System.out.println("Обрізка дерева: " + tree.name);
            }
        }

        Gardener gardener = new Gardener();
        gardener.prune(apple);
        gardener.prune(cherry);
    }
}
