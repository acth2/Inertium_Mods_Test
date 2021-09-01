package fr.anewplayerfr.test.init;

import fr.anewplayerfr.test.constructor.item.InteriumTest;
import fr.anewplayerfr.test.constructor.outils.InteriumAxeC;
import fr.anewplayerfr.test.constructor.outils.InteriumPickaxeC;
import fr.anewplayerfr.test.constructor.outils.InterniumSwordC;
import fr.anewplayerfr.test.utils.References;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = References.MODID)
public class ItemInit
{
    public static Item.ToolMaterial INTERIUM_AXE = EnumHelper.addToolMaterial("interium_axe", 0, 2150, 14,  6, 16);    
    public static Item.ToolMaterial INTERIUM_PICKAXE = EnumHelper.addToolMaterial("interium_pickaxe", 4, 2150, 14,  4, 16);    
    public static Item.ToolMaterial INTERIUM_SWORD = EnumHelper.addToolMaterial("interium_sword", 0, 1732, 6,  7, 15);    
    public static Item interium_sword;
    public static Item interium_pickaxe;
    public static Item interium_axe;
    
    
    //Material | Sword | Pickaxe | ex ex ex .. ..
	
	
	public static Item interium_test;
    
    public static void init()
    {
    	interium_test = new InteriumTest("interium_test");
    	interium_sword = new InterniumSwordC("interium_sword", INTERIUM_SWORD);
    	interium_pickaxe = new InteriumPickaxeC("interium_pickaxe", INTERIUM_PICKAXE);
    	interium_axe = new InteriumAxeC("interium_axe", INTERIUM_AXE, 6, 14);
    }
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(interium_test);
        event.getRegistry().registerAll(interium_sword);
        event.getRegistry().registerAll(interium_pickaxe);
        event.getRegistry().registerAll(interium_axe);
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event)
    {
        registerRender(interium_test);
        registerRender(interium_sword);
        registerRender(interium_pickaxe);
        registerRender(interium_axe);
    }

    private static void registerRender(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }


}

