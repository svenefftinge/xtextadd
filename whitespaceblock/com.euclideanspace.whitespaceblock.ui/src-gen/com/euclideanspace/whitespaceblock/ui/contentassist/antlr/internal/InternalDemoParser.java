package com.euclideanspace.whitespaceblock.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.euclideanspace.whitespaceblock.services.DemoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDemoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WS", "RULE_SL_COMMENT", "RULE_LINECONTINUATION", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ANY_OTHER"
    };
    public static final int RULE_END=8;
    public static final int RULE_BEGIN=7;
    public static final int RULE_ID=9;
    public static final int RULE_WS=4;
    public static final int RULE_STRING=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_SL_COMMENT=5;
    public static final int RULE_INT=10;
    public static final int RULE_LINECONTINUATION=6;
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
    public String getGrammarFileName() { return "../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g"; }


     
     	private DemoGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DemoGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:61:1: ( ruleModel EOF )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:69:1: ruleModel : ( ( rule__Model__ContentsAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:73:2: ( ( ( rule__Model__ContentsAssignment ) ) )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:74:1: ( ( rule__Model__ContentsAssignment ) )
            {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:74:1: ( ( rule__Model__ContentsAssignment ) )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:75:1: ( rule__Model__ContentsAssignment )
            {
             before(grammarAccess.getModelAccess().getContentsAssignment()); 
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:76:1: ( rule__Model__ContentsAssignment )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:76:2: rule__Model__ContentsAssignment
            {
            pushFollow(FOLLOW_rule__Model__ContentsAssignment_in_ruleModel94);
            rule__Model__ContentsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getContentsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRecurse"
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:88:1: entryRuleRecurse : ruleRecurse EOF ;
    public final void entryRuleRecurse() throws RecognitionException {
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:89:1: ( ruleRecurse EOF )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:90:1: ruleRecurse EOF
            {
             before(grammarAccess.getRecurseRule()); 
            pushFollow(FOLLOW_ruleRecurse_in_entryRuleRecurse121);
            ruleRecurse();

            state._fsp--;

             after(grammarAccess.getRecurseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecurse128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRecurse"


    // $ANTLR start "ruleRecurse"
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:97:1: ruleRecurse : ( ( rule__Recurse__Group__0 ) ) ;
    public final void ruleRecurse() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:101:2: ( ( ( rule__Recurse__Group__0 ) ) )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:102:1: ( ( rule__Recurse__Group__0 ) )
            {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:102:1: ( ( rule__Recurse__Group__0 ) )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:103:1: ( rule__Recurse__Group__0 )
            {
             before(grammarAccess.getRecurseAccess().getGroup()); 
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:104:1: ( rule__Recurse__Group__0 )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:104:2: rule__Recurse__Group__0
            {
            pushFollow(FOLLOW_rule__Recurse__Group__0_in_ruleRecurse154);
            rule__Recurse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecurseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecurse"


    // $ANTLR start "rule__Recurse__Alternatives_1"
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:116:1: rule__Recurse__Alternatives_1 : ( ( ( rule__Recurse__NAssignment_1_0 ) ) | ( RULE_WS ) | ( RULE_SL_COMMENT ) | ( RULE_LINECONTINUATION ) | ( ( rule__Recurse__Group_1_4__0 ) ) );
    public final void rule__Recurse__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:120:1: ( ( ( rule__Recurse__NAssignment_1_0 ) ) | ( RULE_WS ) | ( RULE_SL_COMMENT ) | ( RULE_LINECONTINUATION ) | ( ( rule__Recurse__Group_1_4__0 ) ) )
            int alt1=5;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:121:1: ( ( rule__Recurse__NAssignment_1_0 ) )
                    {
                    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:121:1: ( ( rule__Recurse__NAssignment_1_0 ) )
                    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:122:1: ( rule__Recurse__NAssignment_1_0 )
                    {
                     before(grammarAccess.getRecurseAccess().getNAssignment_1_0()); 
                    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:123:1: ( rule__Recurse__NAssignment_1_0 )
                    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:123:2: rule__Recurse__NAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Recurse__NAssignment_1_0_in_rule__Recurse__Alternatives_1190);
                    rule__Recurse__NAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRecurseAccess().getNAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:127:6: ( RULE_WS )
                    {
                    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:127:6: ( RULE_WS )
                    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:128:1: RULE_WS
                    {
                     before(grammarAccess.getRecurseAccess().getWSTerminalRuleCall_1_1()); 
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__Recurse__Alternatives_1208); 
                     after(grammarAccess.getRecurseAccess().getWSTerminalRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:133:6: ( RULE_SL_COMMENT )
                    {
                    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:133:6: ( RULE_SL_COMMENT )
                    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:134:1: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getRecurseAccess().getSL_COMMENTTerminalRuleCall_1_2()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__Recurse__Alternatives_1225); 
                     after(grammarAccess.getRecurseAccess().getSL_COMMENTTerminalRuleCall_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:139:6: ( RULE_LINECONTINUATION )
                    {
                    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:139:6: ( RULE_LINECONTINUATION )
                    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:140:1: RULE_LINECONTINUATION
                    {
                     before(grammarAccess.getRecurseAccess().getLINECONTINUATIONTerminalRuleCall_1_3()); 
                    match(input,RULE_LINECONTINUATION,FOLLOW_RULE_LINECONTINUATION_in_rule__Recurse__Alternatives_1242); 
                     after(grammarAccess.getRecurseAccess().getLINECONTINUATIONTerminalRuleCall_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:145:6: ( ( rule__Recurse__Group_1_4__0 ) )
                    {
                    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:145:6: ( ( rule__Recurse__Group_1_4__0 ) )
                    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:146:1: ( rule__Recurse__Group_1_4__0 )
                    {
                     before(grammarAccess.getRecurseAccess().getGroup_1_4()); 
                    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:147:1: ( rule__Recurse__Group_1_4__0 )
                    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:147:2: rule__Recurse__Group_1_4__0
                    {
                    pushFollow(FOLLOW_rule__Recurse__Group_1_4__0_in_rule__Recurse__Alternatives_1259);
                    rule__Recurse__Group_1_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRecurseAccess().getGroup_1_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__Alternatives_1"


    // $ANTLR start "rule__Recurse__Group__0"
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:158:1: rule__Recurse__Group__0 : rule__Recurse__Group__0__Impl rule__Recurse__Group__1 ;
    public final void rule__Recurse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:162:1: ( rule__Recurse__Group__0__Impl rule__Recurse__Group__1 )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:163:2: rule__Recurse__Group__0__Impl rule__Recurse__Group__1
            {
            pushFollow(FOLLOW_rule__Recurse__Group__0__Impl_in_rule__Recurse__Group__0290);
            rule__Recurse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recurse__Group__1_in_rule__Recurse__Group__0293);
            rule__Recurse__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__Group__0"


    // $ANTLR start "rule__Recurse__Group__0__Impl"
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:170:1: rule__Recurse__Group__0__Impl : ( () ) ;
    public final void rule__Recurse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:174:1: ( ( () ) )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:175:1: ( () )
            {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:175:1: ( () )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:176:1: ()
            {
             before(grammarAccess.getRecurseAccess().getRecurseAction_0()); 
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:177:1: ()
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:179:1: 
            {
            }

             after(grammarAccess.getRecurseAccess().getRecurseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__Group__0__Impl"


    // $ANTLR start "rule__Recurse__Group__1"
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:189:1: rule__Recurse__Group__1 : rule__Recurse__Group__1__Impl ;
    public final void rule__Recurse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:193:1: ( rule__Recurse__Group__1__Impl )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:194:2: rule__Recurse__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Recurse__Group__1__Impl_in_rule__Recurse__Group__1351);
            rule__Recurse__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__Group__1"


    // $ANTLR start "rule__Recurse__Group__1__Impl"
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:200:1: rule__Recurse__Group__1__Impl : ( ( ( rule__Recurse__Alternatives_1 ) ) ( ( rule__Recurse__Alternatives_1 )* ) ) ;
    public final void rule__Recurse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:204:1: ( ( ( ( rule__Recurse__Alternatives_1 ) ) ( ( rule__Recurse__Alternatives_1 )* ) ) )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:205:1: ( ( ( rule__Recurse__Alternatives_1 ) ) ( ( rule__Recurse__Alternatives_1 )* ) )
            {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:205:1: ( ( ( rule__Recurse__Alternatives_1 ) ) ( ( rule__Recurse__Alternatives_1 )* ) )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:206:1: ( ( rule__Recurse__Alternatives_1 ) ) ( ( rule__Recurse__Alternatives_1 )* )
            {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:206:1: ( ( rule__Recurse__Alternatives_1 ) )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:207:1: ( rule__Recurse__Alternatives_1 )
            {
             before(grammarAccess.getRecurseAccess().getAlternatives_1()); 
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:208:1: ( rule__Recurse__Alternatives_1 )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:208:2: rule__Recurse__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Recurse__Alternatives_1_in_rule__Recurse__Group__1__Impl380);
            rule__Recurse__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getRecurseAccess().getAlternatives_1()); 

            }

            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:211:1: ( ( rule__Recurse__Alternatives_1 )* )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:212:1: ( rule__Recurse__Alternatives_1 )*
            {
             before(grammarAccess.getRecurseAccess().getAlternatives_1()); 
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:213:1: ( rule__Recurse__Alternatives_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_WS && LA2_0<=RULE_BEGIN)||LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:213:2: rule__Recurse__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__Recurse__Alternatives_1_in_rule__Recurse__Group__1__Impl392);
            	    rule__Recurse__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getRecurseAccess().getAlternatives_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__Group__1__Impl"


    // $ANTLR start "rule__Recurse__Group_1_4__0"
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:228:1: rule__Recurse__Group_1_4__0 : rule__Recurse__Group_1_4__0__Impl rule__Recurse__Group_1_4__1 ;
    public final void rule__Recurse__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:232:1: ( rule__Recurse__Group_1_4__0__Impl rule__Recurse__Group_1_4__1 )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:233:2: rule__Recurse__Group_1_4__0__Impl rule__Recurse__Group_1_4__1
            {
            pushFollow(FOLLOW_rule__Recurse__Group_1_4__0__Impl_in_rule__Recurse__Group_1_4__0429);
            rule__Recurse__Group_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recurse__Group_1_4__1_in_rule__Recurse__Group_1_4__0432);
            rule__Recurse__Group_1_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__Group_1_4__0"


    // $ANTLR start "rule__Recurse__Group_1_4__0__Impl"
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:240:1: rule__Recurse__Group_1_4__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__Recurse__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:244:1: ( ( RULE_BEGIN ) )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:245:1: ( RULE_BEGIN )
            {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:245:1: ( RULE_BEGIN )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:246:1: RULE_BEGIN
            {
             before(grammarAccess.getRecurseAccess().getBEGINTerminalRuleCall_1_4_0()); 
            match(input,RULE_BEGIN,FOLLOW_RULE_BEGIN_in_rule__Recurse__Group_1_4__0__Impl459); 
             after(grammarAccess.getRecurseAccess().getBEGINTerminalRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__Group_1_4__0__Impl"


    // $ANTLR start "rule__Recurse__Group_1_4__1"
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:257:1: rule__Recurse__Group_1_4__1 : rule__Recurse__Group_1_4__1__Impl rule__Recurse__Group_1_4__2 ;
    public final void rule__Recurse__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:261:1: ( rule__Recurse__Group_1_4__1__Impl rule__Recurse__Group_1_4__2 )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:262:2: rule__Recurse__Group_1_4__1__Impl rule__Recurse__Group_1_4__2
            {
            pushFollow(FOLLOW_rule__Recurse__Group_1_4__1__Impl_in_rule__Recurse__Group_1_4__1488);
            rule__Recurse__Group_1_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Recurse__Group_1_4__2_in_rule__Recurse__Group_1_4__1491);
            rule__Recurse__Group_1_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__Group_1_4__1"


    // $ANTLR start "rule__Recurse__Group_1_4__1__Impl"
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:269:1: rule__Recurse__Group_1_4__1__Impl : ( ( rule__Recurse__RAssignment_1_4_1 ) ) ;
    public final void rule__Recurse__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:273:1: ( ( ( rule__Recurse__RAssignment_1_4_1 ) ) )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:274:1: ( ( rule__Recurse__RAssignment_1_4_1 ) )
            {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:274:1: ( ( rule__Recurse__RAssignment_1_4_1 ) )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:275:1: ( rule__Recurse__RAssignment_1_4_1 )
            {
             before(grammarAccess.getRecurseAccess().getRAssignment_1_4_1()); 
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:276:1: ( rule__Recurse__RAssignment_1_4_1 )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:276:2: rule__Recurse__RAssignment_1_4_1
            {
            pushFollow(FOLLOW_rule__Recurse__RAssignment_1_4_1_in_rule__Recurse__Group_1_4__1__Impl518);
            rule__Recurse__RAssignment_1_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRecurseAccess().getRAssignment_1_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__Group_1_4__1__Impl"


    // $ANTLR start "rule__Recurse__Group_1_4__2"
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:286:1: rule__Recurse__Group_1_4__2 : rule__Recurse__Group_1_4__2__Impl ;
    public final void rule__Recurse__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:290:1: ( rule__Recurse__Group_1_4__2__Impl )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:291:2: rule__Recurse__Group_1_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Recurse__Group_1_4__2__Impl_in_rule__Recurse__Group_1_4__2548);
            rule__Recurse__Group_1_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__Group_1_4__2"


    // $ANTLR start "rule__Recurse__Group_1_4__2__Impl"
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:297:1: rule__Recurse__Group_1_4__2__Impl : ( RULE_END ) ;
    public final void rule__Recurse__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:301:1: ( ( RULE_END ) )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:302:1: ( RULE_END )
            {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:302:1: ( RULE_END )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:303:1: RULE_END
            {
             before(grammarAccess.getRecurseAccess().getENDTerminalRuleCall_1_4_2()); 
            match(input,RULE_END,FOLLOW_RULE_END_in_rule__Recurse__Group_1_4__2__Impl575); 
             after(grammarAccess.getRecurseAccess().getENDTerminalRuleCall_1_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__Group_1_4__2__Impl"


    // $ANTLR start "rule__Model__ContentsAssignment"
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:321:1: rule__Model__ContentsAssignment : ( ruleRecurse ) ;
    public final void rule__Model__ContentsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:325:1: ( ( ruleRecurse ) )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:326:1: ( ruleRecurse )
            {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:326:1: ( ruleRecurse )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:327:1: ruleRecurse
            {
             before(grammarAccess.getModelAccess().getContentsRecurseParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleRecurse_in_rule__Model__ContentsAssignment615);
            ruleRecurse();

            state._fsp--;

             after(grammarAccess.getModelAccess().getContentsRecurseParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ContentsAssignment"


    // $ANTLR start "rule__Recurse__NAssignment_1_0"
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:336:1: rule__Recurse__NAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Recurse__NAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:340:1: ( ( RULE_ID ) )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:341:1: ( RULE_ID )
            {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:341:1: ( RULE_ID )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:342:1: RULE_ID
            {
             before(grammarAccess.getRecurseAccess().getNIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Recurse__NAssignment_1_0646); 
             after(grammarAccess.getRecurseAccess().getNIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__NAssignment_1_0"


    // $ANTLR start "rule__Recurse__RAssignment_1_4_1"
    // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:351:1: rule__Recurse__RAssignment_1_4_1 : ( ruleRecurse ) ;
    public final void rule__Recurse__RAssignment_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:355:1: ( ( ruleRecurse ) )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:356:1: ( ruleRecurse )
            {
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:356:1: ( ruleRecurse )
            // ../com.euclideanspace.whitespaceblock.ui/src-gen/com/euclideanspace/whitespaceblock/ui/contentassist/antlr/internal/InternalDemo.g:357:1: ruleRecurse
            {
             before(grammarAccess.getRecurseAccess().getRRecurseParserRuleCall_1_4_1_0()); 
            pushFollow(FOLLOW_ruleRecurse_in_rule__Recurse__RAssignment_1_4_1677);
            ruleRecurse();

            state._fsp--;

             after(grammarAccess.getRecurseAccess().getRRecurseParserRuleCall_1_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recurse__RAssignment_1_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ContentsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecurse_in_entryRuleRecurse121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecurse128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__Group__0_in_ruleRecurse154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__NAssignment_1_0_in_rule__Recurse__Alternatives_1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__Recurse__Alternatives_1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__Recurse__Alternatives_1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LINECONTINUATION_in_rule__Recurse__Alternatives_1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__Group_1_4__0_in_rule__Recurse__Alternatives_1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__Group__0__Impl_in_rule__Recurse__Group__0290 = new BitSet(new long[]{0x00000000000002F0L});
    public static final BitSet FOLLOW_rule__Recurse__Group__1_in_rule__Recurse__Group__0293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__Group__1__Impl_in_rule__Recurse__Group__1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__Alternatives_1_in_rule__Recurse__Group__1__Impl380 = new BitSet(new long[]{0x00000000000002F2L});
    public static final BitSet FOLLOW_rule__Recurse__Alternatives_1_in_rule__Recurse__Group__1__Impl392 = new BitSet(new long[]{0x00000000000002F2L});
    public static final BitSet FOLLOW_rule__Recurse__Group_1_4__0__Impl_in_rule__Recurse__Group_1_4__0429 = new BitSet(new long[]{0x00000000000002F0L});
    public static final BitSet FOLLOW_rule__Recurse__Group_1_4__1_in_rule__Recurse__Group_1_4__0432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BEGIN_in_rule__Recurse__Group_1_4__0__Impl459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__Group_1_4__1__Impl_in_rule__Recurse__Group_1_4__1488 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Recurse__Group_1_4__2_in_rule__Recurse__Group_1_4__1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__RAssignment_1_4_1_in_rule__Recurse__Group_1_4__1__Impl518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Recurse__Group_1_4__2__Impl_in_rule__Recurse__Group_1_4__2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_END_in_rule__Recurse__Group_1_4__2__Impl575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecurse_in_rule__Model__ContentsAssignment615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Recurse__NAssignment_1_0646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecurse_in_rule__Recurse__RAssignment_1_4_1677 = new BitSet(new long[]{0x0000000000000002L});

}