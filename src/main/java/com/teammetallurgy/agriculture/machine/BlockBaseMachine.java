package com.teammetallurgy.agriculture.machine;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.teammetallurgy.agriculture.Agriculture;
import com.teammetallurgy.metallurgycore.machines.BlockMetallurgyCore;

public class BlockBaseMachine extends BlockMetallurgyCore
{

    public BlockBaseMachine()
    {
        this.setBlockTextureName("minecraft:brick");
        this.setHardness(3F);
    }
    
    @Override
    public TileEntity createNewTileEntity(World world, int meta)
    {
        return null;
    }

    @Override
    protected void doOnActivate(World world, int x, int y, int z, EntityPlayer player, int side, float xOffset, float yOffset, float zOffset)
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public CreativeTabs getCreativeTabToDisplayOn()
    {
       return Agriculture.instance.creativeTabBlock;
    }
    
    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @Override
    public int getRenderType()
    {
        return -1;
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

}
