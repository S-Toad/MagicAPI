package com.elmakers.mine.bukkit.api.event;

import com.elmakers.mine.bukkit.api.magic.Mage;
import com.elmakers.mine.bukkit.api.spell.Spell;
import com.elmakers.mine.bukkit.api.spell.SpellResult;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * A custom event that the Magic plugin will fire any time a
 * Mage casts a Spell.
 */
public class CastEvent extends Event {
    private final Mage mage;
    private final Spell spell;
    private final SpellResult spellResult;

    private static final HandlerList handlers = new HandlerList();

    public CastEvent(Mage mage, Spell spell, SpellResult result) {
        this.mage = mage;
        this.spell = spell;
        this.spellResult = result;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public Mage getMage() {
        return mage;
    }

    public Spell getSpell() {
        return spell;
    }

    public SpellResult getSpellResult() {
        return spellResult;
    }
}
