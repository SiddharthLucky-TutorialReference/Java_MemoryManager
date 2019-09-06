package Models;

//Multiple Memory blocks comprize to become a MemoryArray, but go through a BlockSizer
public class MemoryBlock
{
    private int id; //Consider id is same as the value of index stored.
    private int size;
    private int index_stored;
    private String dataToStore;

    public MemoryBlock()
    {

    }

    public MemoryBlock(int id, String dataToStore, int size) {
        this.id = id;
        this.dataToStore = dataToStore;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getIndex_stored() {
        return index_stored;
    }

    public void setIndex_stored(int index_stored) {
        this.index_stored = index_stored;
    }

    public String getDataToStore() {
        return dataToStore;
    }

    public void setDataToStore(String dataToStore) {
        this.dataToStore = dataToStore;
    }
}
