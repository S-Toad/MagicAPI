package com.elmakers.mine.bukkit.api.block;

import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.util.BlockVector;

/**
 * Stores a cached Block. Stores the coordinates and world, but will look up a block reference on demand.
 * 
 * This also stores the block state using the MaterialAndData structure as a base, and can be
 * used to restore a previously stored state.
 * 
 * In addition, BlockData instances can be linked to each other for layered undo queues that work
 * even when undone out of order.
 * 
 */
public interface BlockData extends MaterialAndData {
	public long getId();
	public World getWorld();
	public String getWorldName();
	public Block getBlock();
	public BlockVector getPosition();
	public void restore();
	public void commit();
	public boolean undo();

	public BlockData getNextState();
	public void setNextState(BlockData next);
	public BlockData getPriorState();
	public void setPriorState(BlockData prior);
}