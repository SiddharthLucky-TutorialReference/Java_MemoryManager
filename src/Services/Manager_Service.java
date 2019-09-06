package Services;

import Models.BlockSizer;
import Models.MemoryArray;
import Models.MemoryBlock;

public class Manager_Service
{
    private MemoryBlock memoryBlock_Service;
    private BlockSizer blockSizer_Service;
    private MemoryArray memoryArray_Service;

    public Manager_Service()
    {
        memoryBlock_Service = new MemoryBlock();
        memoryArray_Service = new MemoryArray();
        blockSizer_Service = new BlockSizer();
    }

    public MemoryBlock createMemoryBlock_Service(int id, String dataToSource, int blockSize)
    {
        memoryBlock_Service = new MemoryBlock(id, dataToSource, blockSize);
        return memoryBlock_Service;
    }

    public BlockSizer insertBlockSizerList_Service(MemoryBlock memoryBlock)
    {
        blockSizer_Service.insertIntoSizerList(memoryBlock);
        return blockSizer_Service;
    }

    public MemoryArray insertMemoryArray(BlockSizer blockSizer_Service)
    {
        if(memoryArray_Service.checkMemoryArraySize()==false)
        {
            memoryArray_Service.insertIntoMemoyArray(blockSizer_Service);
            System.out.println("Values inserted");
        }
        return memoryArray_Service;
    }

    public boolean checkIndexOfMemoryArray()
    {
        if(memoryArray_Service.findNextAvailableIndex()>=8)
        {
            return true;
        }
        return false;
    }
}
