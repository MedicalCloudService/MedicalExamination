/**
 * @author jugo
 * @descript define event & message
 */

package com.medici.app.model;

public class EventMessage
{
	public static final int	MSG_CUSTOM					= 1024;
	public static final int	MSG_FLIPPER_CLOSE			= MSG_CUSTOM + 1;
	public static final int	MSG_LOGIN					= MSG_CUSTOM + 2;
	public static final int	MSG_LOGINED					= MSG_CUSTOM + 3;
	public static final int	MSG_SHOW_LOGIN				= MSG_CUSTOM + 4;
	public static final int	MSG_SHOW_HISTORY			= MSG_CUSTOM + 5;
	public static final int	MSG_SELECTED				= MSG_CUSTOM + 6;
	public static final int	MSG_TEST_SELECTED			= MSG_CUSTOM + 7;
	public static final int	MSG_SHOW_TEST_EYE			= MSG_CUSTOM + 8;
	public static final int	MSG_SHOW_TEST_HEAR			= MSG_CUSTOM + 9;
	public static final int	MSG_SHOW_TEST_TREMBLE		= MSG_CUSTOM + 10;
	public static final int	MSG_SHOW_TEST_EXPRESSION	= MSG_CUSTOM + 11;
	public static final int	MSG_SHOW_TEST_PUZZLE		= MSG_CUSTOM + 12;
	public static final int	MSG_SHOW_TEST_WORD			= MSG_CUSTOM + 13;
	public static final int	MSG_SHOW_TEST_CARD			= MSG_CUSTOM + 14;
	public static final int	MSG_SHOW_TEST_SHAPE			= MSG_CUSTOM + 15;
	public static final int	MSG_SHOW_PERSON_INFO		= MSG_CUSTOM + 16;
	public static final int	MSG_SHOW_EXAMINATION		= MSG_CUSTOM + 17;
	public static final int	MSG_TEST_END_EYE			= MSG_CUSTOM + 18;
	public static final int	MSG_TEST_END_HEAR			= MSG_CUSTOM + 19;
	public static final int	MSG_SHOW_TEST_ATTENTION		= MSG_CUSTOM + 20;
	public static final int	MSG_CLOSE_MESSAGE_DIALOG	= MSG_CUSTOM + 21;

	/**
	 * @author jugo
	 * @descript define key code
	 */
	public static final int	KEY_BACK					= 4;
}