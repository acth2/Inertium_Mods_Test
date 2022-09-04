package fr.anewplayerfr.test;

import fr.anewplayerfr.test.creativetabs.InteriumTabs;
import fr.anewplayerfr.test.init.ArmorInit;
import fr.anewplayerfr.test.init.BlockInit;
import fr.anewplayerfr.test.init.ItemInit;
import fr.anewplayerfr.test.proxy.CommonProxy;
import fr.anewplayerfr.test.utils.References;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION, acceptedMinecraftVersions = References.MINECRAFT_VERSION)
public class Main
{
    @SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.COMMON_PROXY, modId = References.MODID)
    public static CommonProxy proxy;


    public static final CreativeTabs interTabs = new InteriumTabs("interiumtabs");

    
    


	private World worldIn;


    @Mod.EventHandler
    public void preiInit(FMLPreInitializationEvent event)
    {
       ItemInit.init();
       BlockInit.init();
       ArmorInit.init();
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        proxy.register();        
        
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {    	

    	//Welcome
    	
        System.out.println("#################");
        System.out.println("");
        System.out.println("Mod Dev pour faire un test...");
        System.out.println("By: AcTh2");
        System.out.println("^-^");
        System.out.println("");
        System.out.println("#################");
        
       
    }

}
