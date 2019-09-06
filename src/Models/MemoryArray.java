package Models;

public class MemoryArray
{
    private BlockSizer[] memoryArray = new BlockSizer[10];
    public int availableIndex = 1;
    private int memoryThreshold = 8;

    //Checks for the next available index in the memo
    public int findNextAvailableIndex()
    {
        for(availableIndex = 1; availableIndex <= 10; availableIndex++)
        {
            if(memoryArray[availableIndex]==null)
            {
                return availableIndex;
            }
        }
        return 0;
    }

    public void insertIntoMemoyArray(BlockSizer blockSizer)
    {
        //The Block sizer has been inserted into the array
        memoryArray[findNextAvailableIndex()] = blockSizer;
    }

    //Check if the array index is less to 80GB
    //return true if the array index is more than 9 or =9
    //return false if the array index is less than 9
    public boolean checkMemoryArraySize()
    {
        if(findNextAvailableIndex() == 9)
        {
            System.out.println("Memory Array is full");
            return true;
        }
        return false;
    }
}
