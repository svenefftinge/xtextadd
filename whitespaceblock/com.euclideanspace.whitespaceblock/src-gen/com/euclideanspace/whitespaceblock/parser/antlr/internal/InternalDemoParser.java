package com.euclideanspace.whitespaceblock.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.euclideanspace.whitespaceblock.services.DemoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDemoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_WS", "RULE_SL_COMMENT", "RULE_LINECONTINUATION", "RULE_BEGIN", "RULE_END", "RULE_INT", "RULE_STRING", "RULE_ANY_OTHER"
    };
    public static final int RULE_END=9;
    public static final int RULE_BEGIN=8;
    public static final int RULE_ID=4;
    public static final int RULE_WS=5;
    public static final int RULE_STRING=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_SL_COMMENT=6;
    public static final int RULE_INT=10;
    public static final int RULE_LINECONTINUATION=7;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalDemoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDemoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDemoParser.tokenNames; }
    public String getGrammarFileName() { return "../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g"; }



     	private DemoGrammarAccess grammarAccess;
     	
        public InternalDemoParser(TokenStream input, DemoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected DemoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:76:1: ruleModel returns [EObject current=null] : ( (lv_contents_0_0= ruleRecurse ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_contents_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:79:28: ( ( (lv_contents_0_0= ruleRecurse ) ) )
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:80:1: ( (lv_contents_0_0= ruleRecurse ) )
            {
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:80:1: ( (lv_contents_0_0= ruleRecurse ) )
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:81:1: (lv_contents_0_0= ruleRecurse )
            {
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:81:1: (lv_contents_0_0= ruleRecurse )
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:82:3: lv_contents_0_0= ruleRecurse
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getContentsRecurseParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleRecurse_in_ruleModel130);
            lv_contents_0_0=ruleRecurse();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		add(
                   			current, 
                   			"contents",
                    		lv_contents_0_0, 
                    		"Recurse");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRecurse"
    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:106:1: entryRuleRecurse returns [EObject current=null] : iv_ruleRecurse= ruleRecurse EOF ;
    public final EObject entryRuleRecurse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecurse = null;


        try {
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:107:2: (iv_ruleRecurse= ruleRecurse EOF )
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:108:2: iv_ruleRecurse= ruleRecurse EOF
            {
             newCompositeNode(grammarAccess.getRecurseRule()); 
            pushFollow(FOLLOW_ruleRecurse_in_entryRuleRecurse165);
            iv_ruleRecurse=ruleRecurse();

            state._fsp--;

             current =iv_ruleRecurse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecurse175); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecurse"


    // $ANTLR start "ruleRecurse"
    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:115:1: ruleRecurse returns [EObject current=null] : ( () ( ( (lv_n_1_0= RULE_ID ) ) | this_WS_2= RULE_WS | this_SL_COMMENT_3= RULE_SL_COMMENT | this_LINECONTINUATION_4= RULE_LINECONTINUATION | (this_BEGIN_5= RULE_BEGIN ( (lv_r_6_0= ruleRecurse ) ) this_END_7= RULE_END ) )+ ) ;
    public final EObject ruleRecurse() throws RecognitionException {
        EObject current = null;

        Token lv_n_1_0=null;
        Token this_WS_2=null;
        Token this_SL_COMMENT_3=null;
        Token this_LINECONTINUATION_4=null;
        Token this_BEGIN_5=null;
        Token this_END_7=null;
        EObject lv_r_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:118:28: ( ( () ( ( (lv_n_1_0= RULE_ID ) ) | this_WS_2= RULE_WS | this_SL_COMMENT_3= RULE_SL_COMMENT | this_LINECONTINUATION_4= RULE_LINECONTINUATION | (this_BEGIN_5= RULE_BEGIN ( (lv_r_6_0= ruleRecurse ) ) this_END_7= RULE_END ) )+ ) )
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:119:1: ( () ( ( (lv_n_1_0= RULE_ID ) ) | this_WS_2= RULE_WS | this_SL_COMMENT_3= RULE_SL_COMMENT | this_LINECONTINUATION_4= RULE_LINECONTINUATION | (this_BEGIN_5= RULE_BEGIN ( (lv_r_6_0= ruleRecurse ) ) this_END_7= RULE_END ) )+ )
            {
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:119:1: ( () ( ( (lv_n_1_0= RULE_ID ) ) | this_WS_2= RULE_WS | this_SL_COMMENT_3= RULE_SL_COMMENT | this_LINECONTINUATION_4= RULE_LINECONTINUATION | (this_BEGIN_5= RULE_BEGIN ( (lv_r_6_0= ruleRecurse ) ) this_END_7= RULE_END ) )+ )
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:119:2: () ( ( (lv_n_1_0= RULE_ID ) ) | this_WS_2= RULE_WS | this_SL_COMMENT_3= RULE_SL_COMMENT | this_LINECONTINUATION_4= RULE_LINECONTINUATION | (this_BEGIN_5= RULE_BEGIN ( (lv_r_6_0= ruleRecurse ) ) this_END_7= RULE_END ) )+
            {
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:119:2: ()
            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:120:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRecurseAccess().getRecurseAction_0(),
                        current);
                

            }

            // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:125:2: ( ( (lv_n_1_0= RULE_ID ) ) | this_WS_2= RULE_WS | this_SL_COMMENT_3= RULE_SL_COMMENT | this_LINECONTINUATION_4= RULE_LINECONTINUATION | (this_BEGIN_5= RULE_BEGIN ( (lv_r_6_0= ruleRecurse ) ) this_END_7= RULE_END ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=6;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt1=1;
                    }
                    break;
                case RULE_WS:
                    {
                    alt1=2;
                    }
                    break;
                case RULE_SL_COMMENT:
                    {
                    alt1=3;
                    }
                    break;
                case RULE_LINECONTINUATION:
                    {
                    alt1=4;
                    }
                    break;
                case RULE_BEGIN:
                    {
                    alt1=5;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:125:3: ( (lv_n_1_0= RULE_ID ) )
            	    {
            	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:125:3: ( (lv_n_1_0= RULE_ID ) )
            	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:126:1: (lv_n_1_0= RULE_ID )
            	    {
            	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:126:1: (lv_n_1_0= RULE_ID )
            	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:127:3: lv_n_1_0= RULE_ID
            	    {
            	    lv_n_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRecurse227); 

            	    			newLeafNode(lv_n_1_0, grammarAccess.getRecurseAccess().getNIDTerminalRuleCall_1_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRecurseRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"n",
            	            		lv_n_1_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:144:6: this_WS_2= RULE_WS
            	    {
            	    this_WS_2=(Token)match(input,RULE_WS,FOLLOW_RULE_WS_in_ruleRecurse249); 
            	     
            	        newLeafNode(this_WS_2, grammarAccess.getRecurseAccess().getWSTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:149:6: this_SL_COMMENT_3= RULE_SL_COMMENT
            	    {
            	    this_SL_COMMENT_3=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleRecurse265); 
            	     
            	        newLeafNode(this_SL_COMMENT_3, grammarAccess.getRecurseAccess().getSL_COMMENTTerminalRuleCall_1_2()); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:154:6: this_LINECONTINUATION_4= RULE_LINECONTINUATION
            	    {
            	    this_LINECONTINUATION_4=(Token)match(input,RULE_LINECONTINUATION,FOLLOW_RULE_LINECONTINUATION_in_ruleRecurse281); 
            	     
            	        newLeafNode(this_LINECONTINUATION_4, grammarAccess.getRecurseAccess().getLINECONTINUATIONTerminalRuleCall_1_3()); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:159:6: (this_BEGIN_5= RULE_BEGIN ( (lv_r_6_0= ruleRecurse ) ) this_END_7= RULE_END )
            	    {
            	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:159:6: (this_BEGIN_5= RULE_BEGIN ( (lv_r_6_0= ruleRecurse ) ) this_END_7= RULE_END )
            	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:159:7: this_BEGIN_5= RULE_BEGIN ( (lv_r_6_0= ruleRecurse ) ) this_END_7= RULE_END
            	    {
            	    this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_ruleRecurse298); 
            	     
            	        newLeafNode(this_BEGIN_5, grammarAccess.getRecurseAccess().getBEGINTerminalRuleCall_1_4_0()); 
            	        
            	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:163:1: ( (lv_r_6_0= ruleRecurse ) )
            	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:164:1: (lv_r_6_0= ruleRecurse )
            	    {
            	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:164:1: (lv_r_6_0= ruleRecurse )
            	    // ../com.euclideanspace.whitespaceblock/src-gen/com/euclideanspace/whitespaceblock/parser/antlr/internal/InternalDemo.g:165:3: lv_r_6_0= ruleRecurse
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRecurseAccess().getRRecurseParserRuleCall_1_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRecurse_in_ruleRecurse318);
            	    lv_r_6_0=ruleRecurse();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRecurseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"r",
            	            		lv_r_6_0, 
            	            		"Recurse");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_END_7=(Token)match(input,RULE_END,FOLLOW_RULE_END_in_ruleRecurse329); 
            	     
            	        newLeafNode(this_END_7, grammarAccess.getRecurseAccess().getENDTerminalRuleCall_1_4_2()); 
            	        

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecurse"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecurse_in_ruleModel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecurse_in_entryRuleRecurse165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecurse175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRecurse227 = new BitSet(new long[]{0x00000000000001F2L});
    public static final BitSet FOLLOW_RULE_WS_in_ruleRecurse249 = new BitSet(new long[]{0x00000000000001F2L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleRecurse265 = new BitSet(new long[]{0x00000000000001F2L});
    public static final BitSet FOLLOW_RULE_LINECONTINUATION_in_ruleRecurse281 = new BitSet(new long[]{0x00000000000001F2L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_ruleRecurse298 = new BitSet(new long[]{0x00000000000001F0L});
    public static final BitSet FOLLOW_ruleRecurse_in_ruleRecurse318 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_END_in_ruleRecurse329 = new BitSet(new long[]{0x00000000000001F2L});

}