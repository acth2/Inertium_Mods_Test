package fr.anewplayerfr.test.init;

import fr.anewplayerfr.test.constructor.armor.InterniumArmorC;
import fr.anewplayerfr.test.utils.References;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = References.MODID)
public class ArmorInit
{

    public static ItemArmor.ArmorMaterial internium_armor_material = EnumHelper.addArmorMaterial("", References.MODID + ":" + "inertium", 4250, new int[]{4, 9, 7 , 4}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f);
    
    public static Item inertium_helmet;
    public static Item inertium_chesplate;
    public static Item inertium_leggings;
    public static Item inertium_boots;

    //Utility

    public static Item thief_helmet;


    public static void init()
    {
    	inertium_helmet = new InterniumArmorC("inertium_helmet", internium_armor_material, 2, EntityEquipmentSlot.HEAD);
    	inertium_chesplate = new InterniumArmorC("inertium_chesplate", internium_armor_material, 2, EntityEquipmentSlot.CHEST);
    	inertium_leggings = new InterniumArmorC("inertium_leggings", internium_armor_material, 2, EntityEquipmentSlot.LEGS);
    	inertium_boots = new InterniumArmorC("inertium_boots", internium_armor_material, 2, EntityEquipmentSlot.FEET);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(inertium_helmet);
        event.getRegistry().registerAll(inertium_chesplate);
        event.getRegistry().registerAll(inertium_leggings);
        event.getRegistry().registerAll(inertium_boots);
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event)
    {
        registerRender(inertium_helmet);
        registerRender(inertium_chesplate);
        registerRender(inertium_leggings);
        registerRender(inertium_boots);
    }

    private static void registerRender(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}

