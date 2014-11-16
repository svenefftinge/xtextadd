package com.euclideanspace.whitespaceblock;

import org.antlr.runtime.CommonToken;

/**
 * This is intended to hold a phantom token, that it a token that has been
 * inserted in a custom parser but is not linked to any text in the editor.
 * 
 * It relies on returning an index range with zero length which feels to
 * me like a hack because it could easily be broken by possible changes
 * in Xtext code.
 * 
 * Since this is a phantom node we don't want any references back to
 * the input text so we make the length zero.
 * 
 * @author Martin Baker
 */
public class PhantomToken extends CommonToken {

	/**
	 * is Serializable so have static id
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Construct a token to which is not linked to any text in the editor but will be
	 * parsed. The stop and start indexes are both set to the 
	 * @param type A token type defined in the Internal Lexer
	 * @param previousToken A reference to the token immediately preceding this in the token stream
	 * @author Martin Baker
	 */
	public PhantomToken(int type,CommonToken previousToken) {
		super(previousToken.getInputStream(),
			type,
			previousToken.getChannel(),
			previousToken.getStopIndex(), // start index set to STOP index of previous
			previousToken.getStopIndex()); // stop index also set to stop index of previous
	}

	/** Text value is irrelevant since we always return "".
	 * @author Martin Baker
	 */
	@Override
	public String getText() {
		return "";
	}

	@Override
	public String toString() {
		String channelStr = "";
		if ( channel>0 ) {
			channelStr=",channel="+channel;
		}
		return "[phantom token"+getTokenIndex()+channelStr+"]";
	}
}
