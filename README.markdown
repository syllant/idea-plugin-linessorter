**Lines Sorter** is a plugin for Intellij-based products that sorts lines in text files (available from the Plugin Manager).

Just select lines and call either *Edit->Sort Lines* menu, or *Alt+ Shift+L* shortcut. When no lines are selected, the whole file is sorted.

##Notes
* Sort is only case-insensitive and ascending
* When the file ends with empty lines (only one line separator on the line), these empty lines are preserved at the end (they are not included in sort)
* See [Property Sorter](https://plugins.jetbrains.com/plugin/4055) plugin to sort property files in a smarter way
* See [String Manipulation ](https://plugins.jetbrains.com/plugin/2162) for more advanced features about string operations. Should sort features have been implemented at the time, my plugin would not have existed!
