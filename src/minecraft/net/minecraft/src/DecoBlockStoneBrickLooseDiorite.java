package net.minecraft.src;

import java.util.Random;

public class DecoBlockStoneBrickLooseDiorite extends FCBlockLavaReceiver
{

    public DecoBlockStoneBrickLooseDiorite(int var1)
    {
        super(var1, Material.rock);
        this.setHardness(1.0F);
        this.setResistance(5.0F);
        this.SetPicksEffectiveOn();
        this.SetChiselsEffectiveOn();
        this.setStepSound(soundStoneFootstep);
        this.setUnlocalizedName("decoBlockDioriteBricksLoose");
        this.setCreativeTab(CreativeTabs.tabBlock);
        DecoManager.Register(this);
    }

    public boolean OnMortarApplied(World world, int x, int y, int z)
    {
        world.setBlockAndMetadataWithNotify(x, y, z, DecoDefs.stoneTypesStoneBrick.blockID, 2);
        return true;
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World var1, int var2, int var3, int var4, Random var5)
    {
        if (!this.CheckForFall(var1, var2, var3, var4))
        {
            if (this.GetHasLavaInCracks(var1, var2, var3, var4))
            {
                if (this.HasWaterAbove(var1, var2, var3, var4))
                {
                    var1.playAuxSFX(2227, var2, var3, var4, 0);
                    var1.setBlockWithNotify(var2, var3, var4, DecoDefs.stoneTypes.blockID);
                    var1.setBlockMetadataWithClient(var2, var3, var4, 2);
                    return;
                }
            }
            else if (this.HasLavaAbove(var1, var2, var3, var4))
            {
                this.SetHasLavaInCracks(var1, var2, var3, var4, true);
            }
        }
    }

    public void RandomUpdateTick(World var1, int var2, int var3, int var4, Random var5)
    {
        if (this.GetHasLavaInCracks(var1, var2, var3, var4) && var1.IsRainingAtPos(var2, var3 + 1, var4))
        {
            var1.playAuxSFX(2227, var2, var3, var4, 0);
            var1.setBlockWithNotify(var2, var3, var4, DecoDefs.stoneTypes.blockID);
            var1.setBlockMetadataWithClient(var2, var3, var4, 2);
        }
    }

    //CLIENT ONLY
    private Icon lavaCrackOverlay;
    
    public void registerIcons(IconRegister Register)
    {
    	super.registerIcons(Register);
    	lavaCrackOverlay = Register.registerIcon("ginger_overlay_dioriteBrickLava");
    }

    protected Icon GetLavaCracksOverlay()
    {
        return lavaCrackOverlay;
    }
    //
}
