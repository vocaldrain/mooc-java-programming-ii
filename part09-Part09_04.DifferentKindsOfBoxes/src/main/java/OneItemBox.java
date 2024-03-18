public class OneItemBox extends Box {
    private Item item;
    private boolean hasItem;

    public OneItemBox() {
        this.hasItem = false;
    }

    @Override
    public void add(Item item) {
        if (!hasItem) {
            this.item = item;
            this.hasItem = true;
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.item != null && this.item.equals(item);
    }
}