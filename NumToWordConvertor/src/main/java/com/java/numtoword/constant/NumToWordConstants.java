package com.java.numtoword.constant;



public final class NumToWordConstants  {

	  /** Opposite of {@link #FAILS}.  */
	  public static final boolean PASSES = true;
	  /** Opposite of {@link #PASSES}.  */
	  public static final boolean FAILS = false;
	  
	  /** Opposite of {@link #FAILURE}.  */
	  public static final boolean SUCCESS = true;
	  /** Opposite of {@link #SUCCESS}.  */
	  public static final boolean FAILURE = false;

	  /** 
	   Useful for {@link String} operations, which return an index of <tt>-1</tt> when 
	   an item is not found. 
	  */
	  public static final int NOT_FOUND = -1;
	  
	  /** System property - <tt>line.separator</tt>*/
	  public static final String NEW_LINE = System.getProperty("line.separator");
	  /** System property - <tt>file.separator</tt>*/
	  public static final String FILE_SEPARATOR = System.getProperty("file.separator");
	  /** System property - <tt>path.separator</tt>*/
	  public static final String PATH_SEPARATOR = System.getProperty("path.separator");
	  
	  public static final String EMPTY_STRING = " ";
	  public static final String SPACE = " ";
	  public static final String TAB = "\t";
	  public static final String SINGLE_QUOTE = "'";
	  public static final String PERIOD = ".";
	  public static final String DOUBLE_QUOTE = "\"";

	  // PRIVATE //

	  /**
	   The caller references the constants using <tt>Consts.EMPTY_STRING</tt>, 
	   and so on. Thus, the caller should be prevented from constructing objects of 
	   this class, by declaring this private constructor. 
	  */
	  private NumToWordConstants(){
	    //this prevents even the native class from 
	    //calling this ctor as well :
	    throw new AssertionError();
	  }
	}
	 
