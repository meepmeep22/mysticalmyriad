package com.dtendr.mysticalmyriad.block;

import com.dtendr.mysticalmyriad.creativetab.CreativeTabMM;
import com.dtendr.mysticalmyriad.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockMM extends Block
{
    public BlockMM(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabMM.MM_TAB);
    }

    public BlockMM()
    {
        this(Material.rock);
        this.setCreativeTab(CreativeTabMM.MM_TAB);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
