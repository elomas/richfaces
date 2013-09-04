/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.richfaces.ui.select;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.EventName;
import org.richfaces.ui.attribute.EventsKeyProps;
import org.richfaces.ui.attribute.EventsMouseProps;
import org.richfaces.ui.attribute.FocusProps;

import javax.faces.component.UISelectOne;

/**
 * @author abelevich
 */
public abstract class AbstractSelectComponent extends UISelectOne implements EventsKeyProps, EventsMouseProps, FocusProps {
    /**
     * The width of the list element
     */
    @Attribute
    public abstract String getListWidth();

    /**
     * The height of the list element
     */
    @Attribute
    public abstract String getListHeight();

    /**
     * Javascript code executed when the list element loses focus and its value has been modified since gaining focus.
     */
    @Attribute(events = @EventName(value = "change", defaultEvent = true))
    public abstract String getOnchange();

    /**
     * Javascript code executed when an item is selected
     */
    @Attribute(events = @EventName("selectitem"))
    public abstract String getOnselectitem();

    // --------- select-props.xml

    @Attribute
    public abstract String getDefaultLabel();

    @Attribute
    public abstract String getItemClass();

    @Attribute
    public abstract String getSelectItemClass();

    @Attribute
    public abstract String getActiveClass();

    @Attribute
    public abstract String getChangedClass();

    @Attribute
    public abstract String getDisabledClass();

    @Attribute
    public abstract String getListClass();

    // --------- list events

    /**
     * Javascript code executed when the list element is shown
     */
    @Attribute(events = @EventName("listshow"))
    public abstract String getOnlistshow();

    /**
     * Javascript code executed when the list element is hidden
     */
    @Attribute(events = @EventName("listhide"))
    public abstract String getOnlisthide();

    /**
     * Javascript code executed when a pointer button is clicked over the list element.
     */
    @Attribute(events = @EventName("listclick"))
    public abstract String getOnlistclick();

    /**
     * Javascript code executed when a pointer button is double clicked over the list element.
     */
    @Attribute(events = @EventName("listdblclick"))
    public abstract String getOnlistdblclick();

    /**
     * Javascript code executed when a pointer button is pressed down over the list element.
     */
    @Attribute(events = @EventName("listmousedown"))
    public abstract String getOnlistmousedown();

    /**
     * Javascript code executed when a pointer button is released over the list element.
     */
    @Attribute(events = @EventName("listmouseup"))
    public abstract String getOnlistmouseup();

    /**
     * Javascript code executed when a pointer button is moved onto the list element.
     */
    @Attribute(events = @EventName("listmouseover"))
    public abstract String getOnlistmouseover();

    /**
     * Javascript code executed when a pointer button is moved within the list element.
     */
    @Attribute(events = @EventName("listmousemove"))
    public abstract String getOnlistmousemove();

    /**
     * Javascript code executed when a pointer button is moved away from the list element.
     */
    @Attribute(events = @EventName("listmouseout"))
    public abstract String getOnlistmouseout();

    /**
     * Javascript code executed when a key is pressed and released over the list element.
     */
    @Attribute(events = @EventName("listkeypress"))
    public abstract String getOnlistkeypress();

    /**
     * Javascript code executed when a key is pressed down over the list element.
     */
    @Attribute(events = @EventName("listkeydown"))
    public abstract String getOnlistkeydown();

    /**
     * Javascript code executed when a key is released over the list element.
     */
    @Attribute(events = @EventName("listkeyup"))
    public abstract String getOnlistkeyup();
}
