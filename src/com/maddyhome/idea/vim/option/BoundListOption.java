package com.maddyhome.idea.vim.option;

/*
* IdeaVim - A Vim emulator plugin for IntelliJ Idea
* Copyright (C) 2003 Rick Maddy
*
* This program is free software; you can redistribute it and/or
* modify it under the terms of the GNU General Public License
* as published by the Free Software Foundation; either version 2
* of the License, or (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program; if not, write to the Free Software
* Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
*/

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 */
public class BoundListOption extends ListOption
{
    BoundListOption(String name, String abbrev, String[] dflt, String[] values)
    {
        super(name, abbrev, dflt, null);

        this.values = new ArrayList(Arrays.asList(values));
    }

    public boolean set(String val)
    {
        ArrayList vals = parseVals(val);
        if (values.containsAll(vals))
        {
            set(vals);
        }

        return true;
    }

    public boolean append(String val)
    {
        ArrayList vals = parseVals(val);
        if (values.containsAll(vals))
        {
            append(vals);
        }

        return true;
    }

    public boolean prepend(String val)
    {
        ArrayList vals = parseVals(val);
        if (values.containsAll(vals))
        {
            prepend(vals);
        }

        return true;
    }

    public boolean remove(String val)
    {
        ArrayList vals = parseVals(val);
        if (values.containsAll(vals))
        {
            remove(vals);
        }

        return true;
    }

    protected ArrayList values;
}
