package com.dtendr.mysticalmyriad;

import com.dtendr.mysticalmyriad.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="MysticalMyriad", name="Mystical Myriad", version="1.7.10-1.0")
public class MysticalMyriad
{
    @Mod.Instance("MysticalMyriad")
    public static MysticalMyriad instance;

    @SidedProxy(clientSide = "com.dtendr.mysticalmyriad.proxy.ClientProxy", serverSide = "com.dtendr.mysticalmyriad.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
