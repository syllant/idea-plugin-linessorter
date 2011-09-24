**Lines Sorter** is a plugin for Intellij IDEA which sorts lines in text files (available from IDEA built-in Plugin Manager).

Just select lines and call either *Edit->Sort Lines* menu, or *Alt+ Shift+L* shortcut. When no lines are selected, whole file is sorted.

##Notes
* sort is only case-insensitive and ascending. Sort feature could use some more advanced options, but I don't need them now.
* when file ends with empty lines (only one line separator on the line), these empty lines are preserved at the end (they are not included in sort)
* see [Property Sorter](http://plugins.intellij.net/plugin/?idea&id=4055) plugin to sort property files smarter