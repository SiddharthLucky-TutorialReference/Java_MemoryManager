package Models;

import java.util.ArrayList;
import java.util.List;

public class BlockSizer
{
    private List<MemoryBlock> sizerList = new ArrayList<>();
    private int sizeRegulator = 0;
    private boolean checker = false;

    //Insert values into the Sizer List
    public List<MemoryBlock> insertIntoSizerList(MemoryBlock memoryBlock)
    {
        reInitializeSizerList();
        if(regulateSizeCheck() == true)
        {
            sizerList.add(memoryBlock);
        }
        return sizerList;
    }

    //Reset the Size Regulator when inserted into the index
    public void resetSizeRegulatorAndChecker()
    {
        sizeRegulator = 0;
        checker = false;
        System.out.println("Size Regulator value Reset.");
    }

    //Reset the Checker Flag
    public void resetChecker()
    {
        checker = false;
        System.out.println("Checker value Reset.");
    }

    //Check if the memory blocks in the List are below regulated size = 10GB
    public boolean regulateSizeCheck()
    {
        int tempSizeHolder;
        for(MemoryBlock memoryBlock : sizerList)
        {
            tempSizeHolder = memoryBlock.getSize();
            sizeRegulator = sizeRegulator + tempSizeHolder;
        }
        if(sizeRegulator <= 10)
        {
            checker = true;
            System.out.println("The values can be inserted into the sizer list");
        }
        return checker;
    }

    //Reinitialize the array for a new index
    public void reInitializeSizerList()
    {
        if(regulateSizeCheck()==false)
        {
            sizerList = new ArrayList<>();
            setSizerList(sizerList);
            System.out.println("The Sizer List is reinitialized for new index");
        }
    }

    public List<MemoryBlock> getSizerList() {
        return sizerList;
    }

    public void setSizerList(List<MemoryBlock> sizerList) {
        this.sizerList = sizerList;
    }
}
