// $ANTLR 3.5 Properties.g 2014-01-29 11:59:57

package com.edukera.website.client.data.parser;

import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

@SuppressWarnings("all")
public class PropertiesParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLOCK_COMMENT", "CONTENT", "EQUALS", 
		"ID", "LINE_COMMENT", "LINE_COMMENT2", "NEWLINE"
	};
	public static final int EOF=-1;
	public static final int BLOCK_COMMENT=4;
	public static final int CONTENT=5;
	public static final int EQUALS=6;
	public static final int ID=7;
	public static final int LINE_COMMENT=8;
	public static final int LINE_COMMENT2=9;
	public static final int NEWLINE=10;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public PropertiesParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public PropertiesParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return PropertiesParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Properties.g"; }


	  public Map<String, String> mMap = new HashMap<String, String>();



	// $ANTLR start "properties"
	// Properties.g:18:1: properties : ( p1 | p2 )* ;
	public final void properties() throws RecognitionException {
		try {
			// Properties.g:18:11: ( ( p1 | p2 )* )
			// Properties.g:19:2: ( p1 | p2 )*
			{
			// Properties.g:19:2: ( p1 | p2 )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID) ) {
					alt1=1;
				}
				else if ( (LA1_0==CONTENT) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// Properties.g:19:2: p1
					{
					pushFollow(FOLLOW_p1_in_properties31);
					p1();
					state._fsp--;

					}
					break;
				case 2 :
					// Properties.g:19:7: p2
					{
					pushFollow(FOLLOW_p2_in_properties35);
					p2();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "properties"



	// $ANTLR start "p1"
	// Properties.g:22:1: p1 : k= ID EQUALS v= CONTENT NEWLINE ;
	public final void p1() throws RecognitionException {
		Token k=null;
		Token v=null;

		try {
			// Properties.g:22:3: (k= ID EQUALS v= CONTENT NEWLINE )
			// Properties.g:23:2: k= ID EQUALS v= CONTENT NEWLINE
			{
			k=(Token)match(input,ID,FOLLOW_ID_in_p147); 
			match(input,EQUALS,FOLLOW_EQUALS_in_p149); 
			v=(Token)match(input,CONTENT,FOLLOW_CONTENT_in_p153); 
			match(input,NEWLINE,FOLLOW_NEWLINE_in_p155); 
			mMap.put((k!=null?k.getText():null), (v!=null?v.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "p1"



	// $ANTLR start "p2"
	// Properties.g:26:1: p2 : k= CONTENT EQUALS v= CONTENT NEWLINE ;
	public final void p2() throws RecognitionException {
		Token k=null;
		Token v=null;

		try {
			// Properties.g:26:3: (k= CONTENT EQUALS v= CONTENT NEWLINE )
			// Properties.g:27:2: k= CONTENT EQUALS v= CONTENT NEWLINE
			{
			k=(Token)match(input,CONTENT,FOLLOW_CONTENT_in_p267); 
			match(input,EQUALS,FOLLOW_EQUALS_in_p269); 
			v=(Token)match(input,CONTENT,FOLLOW_CONTENT_in_p273); 
			match(input,NEWLINE,FOLLOW_NEWLINE_in_p275); 
			mMap.put((k!=null?k.getText():null), (v!=null?v.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "p2"

	// Delegated rules



	public static final BitSet FOLLOW_p1_in_properties31 = new BitSet(new long[]{0x00000000000000A2L});
	public static final BitSet FOLLOW_p2_in_properties35 = new BitSet(new long[]{0x00000000000000A2L});
	public static final BitSet FOLLOW_ID_in_p147 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_EQUALS_in_p149 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CONTENT_in_p153 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_NEWLINE_in_p155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTENT_in_p267 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_EQUALS_in_p269 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_CONTENT_in_p273 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_NEWLINE_in_p275 = new BitSet(new long[]{0x0000000000000002L});
}
