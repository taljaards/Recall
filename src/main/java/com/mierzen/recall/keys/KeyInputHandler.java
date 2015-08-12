package com.mierzen.recall.keys;

import com.mierzen.recall.BindPressRequest;
import com.mierzen.recall.Recall;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class KeyInputHandler
{
    @SideOnly(Side.CLIENT)
    @SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
    public void onEvent(InputEvent.KeyInputEvent event)
    {
        if (KeyBindings.recallKey.isPressed())
        {
            Recall.network.sendToServer(new BindPressRequest());
        }
    }


}
