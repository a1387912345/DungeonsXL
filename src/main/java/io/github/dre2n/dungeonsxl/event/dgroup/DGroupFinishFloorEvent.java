/*
 * Copyright (C) 2012-2016 Frank Baumann
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.github.dre2n.dungeonsxl.event.dgroup;

import io.github.dre2n.dungeonsxl.player.DGroup;
import io.github.dre2n.dungeonsxl.world.GameWorld;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

/**
 * @author Daniel Saukel
 */
public class DGroupFinishFloorEvent extends DGroupEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;

    private GameWorld finished;
    private String next;

    public DGroupFinishFloorEvent(DGroup dGroup, GameWorld finished, String next) {
        super(dGroup);
        this.finished = finished;
        this.next = next;
    }

    /**
     * @return the finished
     */
    public GameWorld getFinished() {
        return finished;
    }

    /**
     * @param finished
     * the name of the GameWorld to set
     */
    public void setFinished(GameWorld finished) {
        this.finished = finished;
    }

    /**
     * @return the next
     */
    public String getNext() {
        return next;
    }

    /**
     * @param next
     * the name of the GameWorld to set
     */
    public void setNext(String next) {
        this.next = next;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

}
