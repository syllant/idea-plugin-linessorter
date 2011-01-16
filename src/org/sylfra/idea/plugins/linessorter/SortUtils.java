package org.sylfra.idea.plugins.linessorter;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Convenient class for sort functions
 * @author <a href="mailto:syllant@gmail.com">Sylvain FRANCOIS</a>
 * @version $Id$
 */
public class SortUtils
{
  private static final Comparator<String> DEFAULT_COMPARATOR = new DefaultComparator();

  public static void defaultSort(List<String> lines)
  {
    Collections.sort(lines, DEFAULT_COMPARATOR);
  }

  private static class DefaultComparator implements Comparator<String>
  {
    public int compare(String s1, String s2)
    {
      return s1.compareToIgnoreCase(s2);
    }
  }
}