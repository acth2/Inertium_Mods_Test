package fr.anewplayerfr.test.init;

import fr.anewplayerfr.test.constructor.block.InteriumBlockC;
import fr.anewplayerfr.test.utils.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = References.MODID)
public class BlockInit
{
	public static Block interium_block;
	
	public static void init()
	{
		interium_block = new InteriumBlockC("interium_block", Material.ROCK);
	}
	
	@SubscribeEvent
    public static void registerBlock(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(interium_block);
    }

    @SubscribeEvent
    public static void registerItemBlock(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
                       new ItemBlock(interium_block).setRegistryName(interium_block.getRegistryName()));
    }

    @SubscribeEvent
    public static void RegisterRenders(ModelRegistryEvent event)
    {
        RegisterRender(Item.getItemFromBlock(interium_block));
    }

    public static void RegisterRender(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(),   "inventory"));
    }
}
