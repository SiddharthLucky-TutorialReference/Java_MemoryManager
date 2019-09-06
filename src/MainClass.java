import Models.BlockSizer;
import Models.MemoryBlock;
import Services.Manager_Service;

public class MainClass
{
    public static void main(String[] args)
    {
        Manager_Service manager_service;
        manager_service = new Manager_Service();

        MemoryBlock memoryBlock1, memoryBlock2;

        //You can use manager service to access the array memory space
        memoryBlock1 = manager_service.createMemoryBlock_Service(1,"How are ya", 5);
        memoryBlock2 = manager_service.createMemoryBlock_Service(2,"Test values",5);

        BlockSizer blockSizer1 =  manager_service.insertBlockSizerList_Service(memoryBlock1);
        manager_service.insertBlockSizerList_Service(memoryBlock2);

        System.out.println(manager_service.insertMemoryArray(blockSizer1).toString());
        System.out.println(manager_service.insertMemoryArray(blockSizer1).toString());
        System.out.println(manager_service.insertMemoryArray(blockSizer1).toString());
        System.out.println(manager_service.insertMemoryArray(blockSizer1).toString());
        System.out.println(manager_service.insertMemoryArray(blockSizer1).toString());
        System.out.println(manager_service.insertMemoryArray(blockSizer1).toString());
        System.out.println(manager_service.insertMemoryArray(blockSizer1).toString());
        System.out.println(manager_service.insertMemoryArray(blockSizer1).toString());
        System.out.println(manager_service.insertMemoryArray(blockSizer1).toString());
        System.out.println(manager_service.insertMemoryArray(blockSizer1).toString());
    }
}
