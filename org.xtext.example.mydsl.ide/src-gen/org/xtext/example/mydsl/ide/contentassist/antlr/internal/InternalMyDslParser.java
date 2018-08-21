package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INTEGER", "RULE_INSIDE2", "RULE_CONTENT", "RULE_ADD2", "RULE_PRINT", "RULE_ANY_OTHER", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'show'", "'['", "']'", "'('", "')'", "'(zip'"
    };
    public static final int RULE_STRING=12;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__19=19;
    public static final int RULE_ADD2=7;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_PRINT=8;
    public static final int EOF=-1;
    public static final int RULE_ID=10;
    public static final int RULE_WS=15;
    public static final int RULE_INSIDE2=5;
    public static final int RULE_ANY_OTHER=9;
    public static final int RULE_INT=11;
    public static final int RULE_ML_COMMENT=13;
    public static final int RULE_INTEGER=4;
    public static final int T__20=20;
    public static final int RULE_CONTENT=6;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__HaskellAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__HaskellAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__HaskellAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__HaskellAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Model__HaskellAssignment )*
            {
             before(grammarAccess.getModelAccess().getHaskellAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Model__HaskellAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Model__HaskellAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__HaskellAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getHaskellAssignment()); 

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


    // $ANTLR start "entryRuleHaskell"
    // InternalMyDsl.g:78:1: entryRuleHaskell : ruleHaskell EOF ;
    public final void entryRuleHaskell() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleHaskell EOF )
            // InternalMyDsl.g:80:1: ruleHaskell EOF
            {
             before(grammarAccess.getHaskellRule()); 
            pushFollow(FOLLOW_1);
            ruleHaskell();

            state._fsp--;

             after(grammarAccess.getHaskellRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHaskell"


    // $ANTLR start "ruleHaskell"
    // InternalMyDsl.g:87:1: ruleHaskell : ( ( rule__Haskell__Group__0 ) ) ;
    public final void ruleHaskell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Haskell__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Haskell__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Haskell__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Haskell__Group__0 )
            {
             before(grammarAccess.getHaskellAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Haskell__Group__0 )
            // InternalMyDsl.g:94:4: rule__Haskell__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Haskell__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHaskellAccess().getGroup()); 

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
    // $ANTLR end "ruleHaskell"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:103:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleExpression EOF )
            // InternalMyDsl.g:105:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:112:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Expression__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__Expression__Alternatives )
            // InternalMyDsl.g:119:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleZIP"
    // InternalMyDsl.g:128:1: entryRuleZIP : ruleZIP EOF ;
    public final void entryRuleZIP() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleZIP EOF )
            // InternalMyDsl.g:130:1: ruleZIP EOF
            {
             before(grammarAccess.getZIPRule()); 
            pushFollow(FOLLOW_1);
            ruleZIP();

            state._fsp--;

             after(grammarAccess.getZIPRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleZIP"


    // $ANTLR start "ruleZIP"
    // InternalMyDsl.g:137:1: ruleZIP : ( ( rule__ZIP__Group__0 ) ) ;
    public final void ruleZIP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__ZIP__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__ZIP__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__ZIP__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__ZIP__Group__0 )
            {
             before(grammarAccess.getZIPAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__ZIP__Group__0 )
            // InternalMyDsl.g:144:4: rule__ZIP__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ZIP__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getZIPAccess().getGroup()); 

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
    // $ANTLR end "ruleZIP"


    // $ANTLR start "entryRuleOP"
    // InternalMyDsl.g:153:1: entryRuleOP : ruleOP EOF ;
    public final void entryRuleOP() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleOP EOF )
            // InternalMyDsl.g:155:1: ruleOP EOF
            {
             before(grammarAccess.getOPRule()); 
            pushFollow(FOLLOW_1);
            ruleOP();

            state._fsp--;

             after(grammarAccess.getOPRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOP"


    // $ANTLR start "ruleOP"
    // InternalMyDsl.g:162:1: ruleOP : ( ( rule__OP__InsideAssignment )* ) ;
    public final void ruleOP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__OP__InsideAssignment )* ) )
            // InternalMyDsl.g:167:2: ( ( rule__OP__InsideAssignment )* )
            {
            // InternalMyDsl.g:167:2: ( ( rule__OP__InsideAssignment )* )
            // InternalMyDsl.g:168:3: ( rule__OP__InsideAssignment )*
            {
             before(grammarAccess.getOPAccess().getInsideAssignment()); 
            // InternalMyDsl.g:169:3: ( rule__OP__InsideAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_INSIDE2) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:169:4: rule__OP__InsideAssignment
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__OP__InsideAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getOPAccess().getInsideAssignment()); 

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
    // $ANTLR end "ruleOP"


    // $ANTLR start "entryRuleINSIDE"
    // InternalMyDsl.g:178:1: entryRuleINSIDE : ruleINSIDE EOF ;
    public final void entryRuleINSIDE() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleINSIDE EOF )
            // InternalMyDsl.g:180:1: ruleINSIDE EOF
            {
             before(grammarAccess.getINSIDERule()); 
            pushFollow(FOLLOW_1);
            ruleINSIDE();

            state._fsp--;

             after(grammarAccess.getINSIDERule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleINSIDE"


    // $ANTLR start "ruleINSIDE"
    // InternalMyDsl.g:187:1: ruleINSIDE : ( ( rule__INSIDE__Group__0 ) ) ;
    public final void ruleINSIDE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__INSIDE__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__INSIDE__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__INSIDE__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__INSIDE__Group__0 )
            {
             before(grammarAccess.getINSIDEAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__INSIDE__Group__0 )
            // InternalMyDsl.g:194:4: rule__INSIDE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__INSIDE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getINSIDEAccess().getGroup()); 

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
    // $ANTLR end "ruleINSIDE"


    // $ANTLR start "entryRuleTAB"
    // InternalMyDsl.g:203:1: entryRuleTAB : ruleTAB EOF ;
    public final void entryRuleTAB() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleTAB EOF )
            // InternalMyDsl.g:205:1: ruleTAB EOF
            {
             before(grammarAccess.getTABRule()); 
            pushFollow(FOLLOW_1);
            ruleTAB();

            state._fsp--;

             after(grammarAccess.getTABRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTAB"


    // $ANTLR start "ruleTAB"
    // InternalMyDsl.g:212:1: ruleTAB : ( ( rule__TAB__Alternatives ) ) ;
    public final void ruleTAB() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__TAB__Alternatives ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__TAB__Alternatives ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__TAB__Alternatives ) )
            // InternalMyDsl.g:218:3: ( rule__TAB__Alternatives )
            {
             before(grammarAccess.getTABAccess().getAlternatives()); 
            // InternalMyDsl.g:219:3: ( rule__TAB__Alternatives )
            // InternalMyDsl.g:219:4: rule__TAB__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TAB__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTABAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTAB"


    // $ANTLR start "entryRuleADD"
    // InternalMyDsl.g:228:1: entryRuleADD : ruleADD EOF ;
    public final void entryRuleADD() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleADD EOF )
            // InternalMyDsl.g:230:1: ruleADD EOF
            {
             before(grammarAccess.getADDRule()); 
            pushFollow(FOLLOW_1);
            ruleADD();

            state._fsp--;

             after(grammarAccess.getADDRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleADD"


    // $ANTLR start "ruleADD"
    // InternalMyDsl.g:237:1: ruleADD : ( ( rule__ADD__Group__0 ) ) ;
    public final void ruleADD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__ADD__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__ADD__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__ADD__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__ADD__Group__0 )
            {
             before(grammarAccess.getADDAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__ADD__Group__0 )
            // InternalMyDsl.g:244:4: rule__ADD__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ADD__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getADDAccess().getGroup()); 

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
    // $ANTLR end "ruleADD"


    // $ANTLR start "entryRuleN"
    // InternalMyDsl.g:253:1: entryRuleN : ruleN EOF ;
    public final void entryRuleN() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleN EOF )
            // InternalMyDsl.g:255:1: ruleN EOF
            {
             before(grammarAccess.getNRule()); 
            pushFollow(FOLLOW_1);
            ruleN();

            state._fsp--;

             after(grammarAccess.getNRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleN"


    // $ANTLR start "ruleN"
    // InternalMyDsl.g:262:1: ruleN : ( ( rule__N__Group__0 ) ) ;
    public final void ruleN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__N__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__N__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__N__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__N__Group__0 )
            {
             before(grammarAccess.getNAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__N__Group__0 )
            // InternalMyDsl.g:269:4: rule__N__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__N__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNAccess().getGroup()); 

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
    // $ANTLR end "ruleN"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalMyDsl.g:277:1: rule__Expression__Alternatives : ( ( ( rule__Expression__ZipAssignment_0 ) ) | ( ( rule__Expression__Group_1__0 ) ) | ( ( rule__Expression__Group_2__0 ) ) | ( ( rule__Expression__NAssignment_3 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:281:1: ( ( ( rule__Expression__ZipAssignment_0 ) ) | ( ( rule__Expression__Group_1__0 ) ) | ( ( rule__Expression__Group_2__0 ) ) | ( ( rule__Expression__NAssignment_3 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 19:
                {
                alt3=3;
                }
                break;
            case RULE_INTEGER:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:282:2: ( ( rule__Expression__ZipAssignment_0 ) )
                    {
                    // InternalMyDsl.g:282:2: ( ( rule__Expression__ZipAssignment_0 ) )
                    // InternalMyDsl.g:283:3: ( rule__Expression__ZipAssignment_0 )
                    {
                     before(grammarAccess.getExpressionAccess().getZipAssignment_0()); 
                    // InternalMyDsl.g:284:3: ( rule__Expression__ZipAssignment_0 )
                    // InternalMyDsl.g:284:4: rule__Expression__ZipAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__ZipAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getZipAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:288:2: ( ( rule__Expression__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:288:2: ( ( rule__Expression__Group_1__0 ) )
                    // InternalMyDsl.g:289:3: ( rule__Expression__Group_1__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1()); 
                    // InternalMyDsl.g:290:3: ( rule__Expression__Group_1__0 )
                    // InternalMyDsl.g:290:4: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:294:2: ( ( rule__Expression__Group_2__0 ) )
                    {
                    // InternalMyDsl.g:294:2: ( ( rule__Expression__Group_2__0 ) )
                    // InternalMyDsl.g:295:3: ( rule__Expression__Group_2__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_2()); 
                    // InternalMyDsl.g:296:3: ( rule__Expression__Group_2__0 )
                    // InternalMyDsl.g:296:4: rule__Expression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:300:2: ( ( rule__Expression__NAssignment_3 ) )
                    {
                    // InternalMyDsl.g:300:2: ( ( rule__Expression__NAssignment_3 ) )
                    // InternalMyDsl.g:301:3: ( rule__Expression__NAssignment_3 )
                    {
                     before(grammarAccess.getExpressionAccess().getNAssignment_3()); 
                    // InternalMyDsl.g:302:3: ( rule__Expression__NAssignment_3 )
                    // InternalMyDsl.g:302:4: rule__Expression__NAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__NAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getNAssignment_3()); 

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__TAB__Alternatives"
    // InternalMyDsl.g:310:1: rule__TAB__Alternatives : ( ( ( rule__TAB__ContentAssignment_0 ) ) | ( ( rule__TAB__AddAssignment_1 )* ) );
    public final void rule__TAB__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:314:1: ( ( ( rule__TAB__ContentAssignment_0 ) ) | ( ( rule__TAB__AddAssignment_1 )* ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_CONTENT) ) {
                alt5=1;
            }
            else if ( (LA5_0==EOF||LA5_0==RULE_ADD2||LA5_0==20) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:315:2: ( ( rule__TAB__ContentAssignment_0 ) )
                    {
                    // InternalMyDsl.g:315:2: ( ( rule__TAB__ContentAssignment_0 ) )
                    // InternalMyDsl.g:316:3: ( rule__TAB__ContentAssignment_0 )
                    {
                     before(grammarAccess.getTABAccess().getContentAssignment_0()); 
                    // InternalMyDsl.g:317:3: ( rule__TAB__ContentAssignment_0 )
                    // InternalMyDsl.g:317:4: rule__TAB__ContentAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TAB__ContentAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTABAccess().getContentAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:321:2: ( ( rule__TAB__AddAssignment_1 )* )
                    {
                    // InternalMyDsl.g:321:2: ( ( rule__TAB__AddAssignment_1 )* )
                    // InternalMyDsl.g:322:3: ( rule__TAB__AddAssignment_1 )*
                    {
                     before(grammarAccess.getTABAccess().getAddAssignment_1()); 
                    // InternalMyDsl.g:323:3: ( rule__TAB__AddAssignment_1 )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ADD2) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:323:4: rule__TAB__AddAssignment_1
                    	    {
                    	    pushFollow(FOLLOW_5);
                    	    rule__TAB__AddAssignment_1();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                     after(grammarAccess.getTABAccess().getAddAssignment_1()); 

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
    // $ANTLR end "rule__TAB__Alternatives"


    // $ANTLR start "rule__Haskell__Group__0"
    // InternalMyDsl.g:331:1: rule__Haskell__Group__0 : rule__Haskell__Group__0__Impl rule__Haskell__Group__1 ;
    public final void rule__Haskell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:335:1: ( rule__Haskell__Group__0__Impl rule__Haskell__Group__1 )
            // InternalMyDsl.g:336:2: rule__Haskell__Group__0__Impl rule__Haskell__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Haskell__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Haskell__Group__1();

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
    // $ANTLR end "rule__Haskell__Group__0"


    // $ANTLR start "rule__Haskell__Group__0__Impl"
    // InternalMyDsl.g:343:1: rule__Haskell__Group__0__Impl : ( 'show' ) ;
    public final void rule__Haskell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:347:1: ( ( 'show' ) )
            // InternalMyDsl.g:348:1: ( 'show' )
            {
            // InternalMyDsl.g:348:1: ( 'show' )
            // InternalMyDsl.g:349:2: 'show'
            {
             before(grammarAccess.getHaskellAccess().getShowKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getHaskellAccess().getShowKeyword_0()); 

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
    // $ANTLR end "rule__Haskell__Group__0__Impl"


    // $ANTLR start "rule__Haskell__Group__1"
    // InternalMyDsl.g:358:1: rule__Haskell__Group__1 : rule__Haskell__Group__1__Impl ;
    public final void rule__Haskell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:362:1: ( rule__Haskell__Group__1__Impl )
            // InternalMyDsl.g:363:2: rule__Haskell__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Haskell__Group__1__Impl();

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
    // $ANTLR end "rule__Haskell__Group__1"


    // $ANTLR start "rule__Haskell__Group__1__Impl"
    // InternalMyDsl.g:369:1: rule__Haskell__Group__1__Impl : ( ( rule__Haskell__ExpressionAssignment_1 ) ) ;
    public final void rule__Haskell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:373:1: ( ( ( rule__Haskell__ExpressionAssignment_1 ) ) )
            // InternalMyDsl.g:374:1: ( ( rule__Haskell__ExpressionAssignment_1 ) )
            {
            // InternalMyDsl.g:374:1: ( ( rule__Haskell__ExpressionAssignment_1 ) )
            // InternalMyDsl.g:375:2: ( rule__Haskell__ExpressionAssignment_1 )
            {
             before(grammarAccess.getHaskellAccess().getExpressionAssignment_1()); 
            // InternalMyDsl.g:376:2: ( rule__Haskell__ExpressionAssignment_1 )
            // InternalMyDsl.g:376:3: rule__Haskell__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Haskell__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHaskellAccess().getExpressionAssignment_1()); 

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
    // $ANTLR end "rule__Haskell__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalMyDsl.g:385:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:389:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalMyDsl.g:390:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

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
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalMyDsl.g:397:1: rule__Expression__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:401:1: ( ( '[' ) )
            // InternalMyDsl.g:402:1: ( '[' )
            {
            // InternalMyDsl.g:402:1: ( '[' )
            // InternalMyDsl.g:403:2: '['
            {
             before(grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_0()); 

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
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalMyDsl.g:412:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:1: ( rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2 )
            // InternalMyDsl.g:417:2: rule__Expression__Group_1__1__Impl rule__Expression__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__2();

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
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalMyDsl.g:424:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__OpAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:428:1: ( ( ( rule__Expression__OpAssignment_1_1 ) ) )
            // InternalMyDsl.g:429:1: ( ( rule__Expression__OpAssignment_1_1 ) )
            {
            // InternalMyDsl.g:429:1: ( ( rule__Expression__OpAssignment_1_1 ) )
            // InternalMyDsl.g:430:2: ( rule__Expression__OpAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getOpAssignment_1_1()); 
            // InternalMyDsl.g:431:2: ( rule__Expression__OpAssignment_1_1 )
            // InternalMyDsl.g:431:3: rule__Expression__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getOpAssignment_1_1()); 

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
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__2"
    // InternalMyDsl.g:439:1: rule__Expression__Group_1__2 : rule__Expression__Group_1__2__Impl ;
    public final void rule__Expression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:443:1: ( rule__Expression__Group_1__2__Impl )
            // InternalMyDsl.g:444:2: rule__Expression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__2__Impl();

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
    // $ANTLR end "rule__Expression__Group_1__2"


    // $ANTLR start "rule__Expression__Group_1__2__Impl"
    // InternalMyDsl.g:450:1: rule__Expression__Group_1__2__Impl : ( ']' ) ;
    public final void rule__Expression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:454:1: ( ( ']' ) )
            // InternalMyDsl.g:455:1: ( ']' )
            {
            // InternalMyDsl.g:455:1: ( ']' )
            // InternalMyDsl.g:456:2: ']'
            {
             before(grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_1_2()); 

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
    // $ANTLR end "rule__Expression__Group_1__2__Impl"


    // $ANTLR start "rule__Expression__Group_2__0"
    // InternalMyDsl.g:466:1: rule__Expression__Group_2__0 : rule__Expression__Group_2__0__Impl rule__Expression__Group_2__1 ;
    public final void rule__Expression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:470:1: ( rule__Expression__Group_2__0__Impl rule__Expression__Group_2__1 )
            // InternalMyDsl.g:471:2: rule__Expression__Group_2__0__Impl rule__Expression__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Expression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_2__1();

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
    // $ANTLR end "rule__Expression__Group_2__0"


    // $ANTLR start "rule__Expression__Group_2__0__Impl"
    // InternalMyDsl.g:478:1: rule__Expression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Expression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:482:1: ( ( '(' ) )
            // InternalMyDsl.g:483:1: ( '(' )
            {
            // InternalMyDsl.g:483:1: ( '(' )
            // InternalMyDsl.g:484:2: '('
            {
             before(grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__Expression__Group_2__0__Impl"


    // $ANTLR start "rule__Expression__Group_2__1"
    // InternalMyDsl.g:493:1: rule__Expression__Group_2__1 : rule__Expression__Group_2__1__Impl rule__Expression__Group_2__2 ;
    public final void rule__Expression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:497:1: ( rule__Expression__Group_2__1__Impl rule__Expression__Group_2__2 )
            // InternalMyDsl.g:498:2: rule__Expression__Group_2__1__Impl rule__Expression__Group_2__2
            {
            pushFollow(FOLLOW_10);
            rule__Expression__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_2__2();

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
    // $ANTLR end "rule__Expression__Group_2__1"


    // $ANTLR start "rule__Expression__Group_2__1__Impl"
    // InternalMyDsl.g:505:1: rule__Expression__Group_2__1__Impl : ( ( rule__Expression__TabAssignment_2_1 ) ) ;
    public final void rule__Expression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:509:1: ( ( ( rule__Expression__TabAssignment_2_1 ) ) )
            // InternalMyDsl.g:510:1: ( ( rule__Expression__TabAssignment_2_1 ) )
            {
            // InternalMyDsl.g:510:1: ( ( rule__Expression__TabAssignment_2_1 ) )
            // InternalMyDsl.g:511:2: ( rule__Expression__TabAssignment_2_1 )
            {
             before(grammarAccess.getExpressionAccess().getTabAssignment_2_1()); 
            // InternalMyDsl.g:512:2: ( rule__Expression__TabAssignment_2_1 )
            // InternalMyDsl.g:512:3: rule__Expression__TabAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__TabAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getTabAssignment_2_1()); 

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
    // $ANTLR end "rule__Expression__Group_2__1__Impl"


    // $ANTLR start "rule__Expression__Group_2__2"
    // InternalMyDsl.g:520:1: rule__Expression__Group_2__2 : rule__Expression__Group_2__2__Impl ;
    public final void rule__Expression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:524:1: ( rule__Expression__Group_2__2__Impl )
            // InternalMyDsl.g:525:2: rule__Expression__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_2__2__Impl();

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
    // $ANTLR end "rule__Expression__Group_2__2"


    // $ANTLR start "rule__Expression__Group_2__2__Impl"
    // InternalMyDsl.g:531:1: rule__Expression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Expression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:535:1: ( ( ')' ) )
            // InternalMyDsl.g:536:1: ( ')' )
            {
            // InternalMyDsl.g:536:1: ( ')' )
            // InternalMyDsl.g:537:2: ')'
            {
             before(grammarAccess.getExpressionAccess().getRightParenthesisKeyword_2_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getRightParenthesisKeyword_2_2()); 

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
    // $ANTLR end "rule__Expression__Group_2__2__Impl"


    // $ANTLR start "rule__ZIP__Group__0"
    // InternalMyDsl.g:547:1: rule__ZIP__Group__0 : rule__ZIP__Group__0__Impl rule__ZIP__Group__1 ;
    public final void rule__ZIP__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:551:1: ( rule__ZIP__Group__0__Impl rule__ZIP__Group__1 )
            // InternalMyDsl.g:552:2: rule__ZIP__Group__0__Impl rule__ZIP__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ZIP__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ZIP__Group__1();

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
    // $ANTLR end "rule__ZIP__Group__0"


    // $ANTLR start "rule__ZIP__Group__0__Impl"
    // InternalMyDsl.g:559:1: rule__ZIP__Group__0__Impl : ( '(zip' ) ;
    public final void rule__ZIP__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:563:1: ( ( '(zip' ) )
            // InternalMyDsl.g:564:1: ( '(zip' )
            {
            // InternalMyDsl.g:564:1: ( '(zip' )
            // InternalMyDsl.g:565:2: '(zip'
            {
             before(grammarAccess.getZIPAccess().getZipKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getZIPAccess().getZipKeyword_0()); 

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
    // $ANTLR end "rule__ZIP__Group__0__Impl"


    // $ANTLR start "rule__ZIP__Group__1"
    // InternalMyDsl.g:574:1: rule__ZIP__Group__1 : rule__ZIP__Group__1__Impl rule__ZIP__Group__2 ;
    public final void rule__ZIP__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:578:1: ( rule__ZIP__Group__1__Impl rule__ZIP__Group__2 )
            // InternalMyDsl.g:579:2: rule__ZIP__Group__1__Impl rule__ZIP__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ZIP__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ZIP__Group__2();

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
    // $ANTLR end "rule__ZIP__Group__1"


    // $ANTLR start "rule__ZIP__Group__1__Impl"
    // InternalMyDsl.g:586:1: rule__ZIP__Group__1__Impl : ( '[' ) ;
    public final void rule__ZIP__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:590:1: ( ( '[' ) )
            // InternalMyDsl.g:591:1: ( '[' )
            {
            // InternalMyDsl.g:591:1: ( '[' )
            // InternalMyDsl.g:592:2: '['
            {
             before(grammarAccess.getZIPAccess().getLeftSquareBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getZIPAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__ZIP__Group__1__Impl"


    // $ANTLR start "rule__ZIP__Group__2"
    // InternalMyDsl.g:601:1: rule__ZIP__Group__2 : rule__ZIP__Group__2__Impl rule__ZIP__Group__3 ;
    public final void rule__ZIP__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:605:1: ( rule__ZIP__Group__2__Impl rule__ZIP__Group__3 )
            // InternalMyDsl.g:606:2: rule__ZIP__Group__2__Impl rule__ZIP__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ZIP__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ZIP__Group__3();

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
    // $ANTLR end "rule__ZIP__Group__2"


    // $ANTLR start "rule__ZIP__Group__2__Impl"
    // InternalMyDsl.g:613:1: rule__ZIP__Group__2__Impl : ( ( rule__ZIP__Op2Assignment_2 ) ) ;
    public final void rule__ZIP__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:617:1: ( ( ( rule__ZIP__Op2Assignment_2 ) ) )
            // InternalMyDsl.g:618:1: ( ( rule__ZIP__Op2Assignment_2 ) )
            {
            // InternalMyDsl.g:618:1: ( ( rule__ZIP__Op2Assignment_2 ) )
            // InternalMyDsl.g:619:2: ( rule__ZIP__Op2Assignment_2 )
            {
             before(grammarAccess.getZIPAccess().getOp2Assignment_2()); 
            // InternalMyDsl.g:620:2: ( rule__ZIP__Op2Assignment_2 )
            // InternalMyDsl.g:620:3: rule__ZIP__Op2Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ZIP__Op2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getZIPAccess().getOp2Assignment_2()); 

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
    // $ANTLR end "rule__ZIP__Group__2__Impl"


    // $ANTLR start "rule__ZIP__Group__3"
    // InternalMyDsl.g:628:1: rule__ZIP__Group__3 : rule__ZIP__Group__3__Impl rule__ZIP__Group__4 ;
    public final void rule__ZIP__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:632:1: ( rule__ZIP__Group__3__Impl rule__ZIP__Group__4 )
            // InternalMyDsl.g:633:2: rule__ZIP__Group__3__Impl rule__ZIP__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__ZIP__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ZIP__Group__4();

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
    // $ANTLR end "rule__ZIP__Group__3"


    // $ANTLR start "rule__ZIP__Group__3__Impl"
    // InternalMyDsl.g:640:1: rule__ZIP__Group__3__Impl : ( ']' ) ;
    public final void rule__ZIP__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:644:1: ( ( ']' ) )
            // InternalMyDsl.g:645:1: ( ']' )
            {
            // InternalMyDsl.g:645:1: ( ']' )
            // InternalMyDsl.g:646:2: ']'
            {
             before(grammarAccess.getZIPAccess().getRightSquareBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getZIPAccess().getRightSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__ZIP__Group__3__Impl"


    // $ANTLR start "rule__ZIP__Group__4"
    // InternalMyDsl.g:655:1: rule__ZIP__Group__4 : rule__ZIP__Group__4__Impl rule__ZIP__Group__5 ;
    public final void rule__ZIP__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:659:1: ( rule__ZIP__Group__4__Impl rule__ZIP__Group__5 )
            // InternalMyDsl.g:660:2: rule__ZIP__Group__4__Impl rule__ZIP__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ZIP__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ZIP__Group__5();

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
    // $ANTLR end "rule__ZIP__Group__4"


    // $ANTLR start "rule__ZIP__Group__4__Impl"
    // InternalMyDsl.g:667:1: rule__ZIP__Group__4__Impl : ( '[' ) ;
    public final void rule__ZIP__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:671:1: ( ( '[' ) )
            // InternalMyDsl.g:672:1: ( '[' )
            {
            // InternalMyDsl.g:672:1: ( '[' )
            // InternalMyDsl.g:673:2: '['
            {
             before(grammarAccess.getZIPAccess().getLeftSquareBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getZIPAccess().getLeftSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__ZIP__Group__4__Impl"


    // $ANTLR start "rule__ZIP__Group__5"
    // InternalMyDsl.g:682:1: rule__ZIP__Group__5 : rule__ZIP__Group__5__Impl rule__ZIP__Group__6 ;
    public final void rule__ZIP__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:686:1: ( rule__ZIP__Group__5__Impl rule__ZIP__Group__6 )
            // InternalMyDsl.g:687:2: rule__ZIP__Group__5__Impl rule__ZIP__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__ZIP__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ZIP__Group__6();

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
    // $ANTLR end "rule__ZIP__Group__5"


    // $ANTLR start "rule__ZIP__Group__5__Impl"
    // InternalMyDsl.g:694:1: rule__ZIP__Group__5__Impl : ( ( rule__ZIP__Op3Assignment_5 ) ) ;
    public final void rule__ZIP__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:698:1: ( ( ( rule__ZIP__Op3Assignment_5 ) ) )
            // InternalMyDsl.g:699:1: ( ( rule__ZIP__Op3Assignment_5 ) )
            {
            // InternalMyDsl.g:699:1: ( ( rule__ZIP__Op3Assignment_5 ) )
            // InternalMyDsl.g:700:2: ( rule__ZIP__Op3Assignment_5 )
            {
             before(grammarAccess.getZIPAccess().getOp3Assignment_5()); 
            // InternalMyDsl.g:701:2: ( rule__ZIP__Op3Assignment_5 )
            // InternalMyDsl.g:701:3: rule__ZIP__Op3Assignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ZIP__Op3Assignment_5();

            state._fsp--;


            }

             after(grammarAccess.getZIPAccess().getOp3Assignment_5()); 

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
    // $ANTLR end "rule__ZIP__Group__5__Impl"


    // $ANTLR start "rule__ZIP__Group__6"
    // InternalMyDsl.g:709:1: rule__ZIP__Group__6 : rule__ZIP__Group__6__Impl rule__ZIP__Group__7 ;
    public final void rule__ZIP__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:713:1: ( rule__ZIP__Group__6__Impl rule__ZIP__Group__7 )
            // InternalMyDsl.g:714:2: rule__ZIP__Group__6__Impl rule__ZIP__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__ZIP__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ZIP__Group__7();

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
    // $ANTLR end "rule__ZIP__Group__6"


    // $ANTLR start "rule__ZIP__Group__6__Impl"
    // InternalMyDsl.g:721:1: rule__ZIP__Group__6__Impl : ( ']' ) ;
    public final void rule__ZIP__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:725:1: ( ( ']' ) )
            // InternalMyDsl.g:726:1: ( ']' )
            {
            // InternalMyDsl.g:726:1: ( ']' )
            // InternalMyDsl.g:727:2: ']'
            {
             before(grammarAccess.getZIPAccess().getRightSquareBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getZIPAccess().getRightSquareBracketKeyword_6()); 

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
    // $ANTLR end "rule__ZIP__Group__6__Impl"


    // $ANTLR start "rule__ZIP__Group__7"
    // InternalMyDsl.g:736:1: rule__ZIP__Group__7 : rule__ZIP__Group__7__Impl ;
    public final void rule__ZIP__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:740:1: ( rule__ZIP__Group__7__Impl )
            // InternalMyDsl.g:741:2: rule__ZIP__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ZIP__Group__7__Impl();

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
    // $ANTLR end "rule__ZIP__Group__7"


    // $ANTLR start "rule__ZIP__Group__7__Impl"
    // InternalMyDsl.g:747:1: rule__ZIP__Group__7__Impl : ( ')' ) ;
    public final void rule__ZIP__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:751:1: ( ( ')' ) )
            // InternalMyDsl.g:752:1: ( ')' )
            {
            // InternalMyDsl.g:752:1: ( ')' )
            // InternalMyDsl.g:753:2: ')'
            {
             before(grammarAccess.getZIPAccess().getRightParenthesisKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getZIPAccess().getRightParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__ZIP__Group__7__Impl"


    // $ANTLR start "rule__INSIDE__Group__0"
    // InternalMyDsl.g:763:1: rule__INSIDE__Group__0 : rule__INSIDE__Group__0__Impl rule__INSIDE__Group__1 ;
    public final void rule__INSIDE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:767:1: ( rule__INSIDE__Group__0__Impl rule__INSIDE__Group__1 )
            // InternalMyDsl.g:768:2: rule__INSIDE__Group__0__Impl rule__INSIDE__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__INSIDE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__INSIDE__Group__1();

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
    // $ANTLR end "rule__INSIDE__Group__0"


    // $ANTLR start "rule__INSIDE__Group__0__Impl"
    // InternalMyDsl.g:775:1: rule__INSIDE__Group__0__Impl : ( ( rule__INSIDE__Inside2Assignment_0 ) ) ;
    public final void rule__INSIDE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:779:1: ( ( ( rule__INSIDE__Inside2Assignment_0 ) ) )
            // InternalMyDsl.g:780:1: ( ( rule__INSIDE__Inside2Assignment_0 ) )
            {
            // InternalMyDsl.g:780:1: ( ( rule__INSIDE__Inside2Assignment_0 ) )
            // InternalMyDsl.g:781:2: ( rule__INSIDE__Inside2Assignment_0 )
            {
             before(grammarAccess.getINSIDEAccess().getInside2Assignment_0()); 
            // InternalMyDsl.g:782:2: ( rule__INSIDE__Inside2Assignment_0 )
            // InternalMyDsl.g:782:3: rule__INSIDE__Inside2Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__INSIDE__Inside2Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getINSIDEAccess().getInside2Assignment_0()); 

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
    // $ANTLR end "rule__INSIDE__Group__0__Impl"


    // $ANTLR start "rule__INSIDE__Group__1"
    // InternalMyDsl.g:790:1: rule__INSIDE__Group__1 : rule__INSIDE__Group__1__Impl ;
    public final void rule__INSIDE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:794:1: ( rule__INSIDE__Group__1__Impl )
            // InternalMyDsl.g:795:2: rule__INSIDE__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__INSIDE__Group__1__Impl();

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
    // $ANTLR end "rule__INSIDE__Group__1"


    // $ANTLR start "rule__INSIDE__Group__1__Impl"
    // InternalMyDsl.g:801:1: rule__INSIDE__Group__1__Impl : ( RULE_INTEGER ) ;
    public final void rule__INSIDE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:805:1: ( ( RULE_INTEGER ) )
            // InternalMyDsl.g:806:1: ( RULE_INTEGER )
            {
            // InternalMyDsl.g:806:1: ( RULE_INTEGER )
            // InternalMyDsl.g:807:2: RULE_INTEGER
            {
             before(grammarAccess.getINSIDEAccess().getINTEGERTerminalRuleCall_1()); 
            match(input,RULE_INTEGER,FOLLOW_2); 
             after(grammarAccess.getINSIDEAccess().getINTEGERTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__INSIDE__Group__1__Impl"


    // $ANTLR start "rule__ADD__Group__0"
    // InternalMyDsl.g:817:1: rule__ADD__Group__0 : rule__ADD__Group__0__Impl rule__ADD__Group__1 ;
    public final void rule__ADD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:821:1: ( rule__ADD__Group__0__Impl rule__ADD__Group__1 )
            // InternalMyDsl.g:822:2: rule__ADD__Group__0__Impl rule__ADD__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ADD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ADD__Group__1();

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
    // $ANTLR end "rule__ADD__Group__0"


    // $ANTLR start "rule__ADD__Group__0__Impl"
    // InternalMyDsl.g:829:1: rule__ADD__Group__0__Impl : ( ( rule__ADD__Add2Assignment_0 ) ) ;
    public final void rule__ADD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:833:1: ( ( ( rule__ADD__Add2Assignment_0 ) ) )
            // InternalMyDsl.g:834:1: ( ( rule__ADD__Add2Assignment_0 ) )
            {
            // InternalMyDsl.g:834:1: ( ( rule__ADD__Add2Assignment_0 ) )
            // InternalMyDsl.g:835:2: ( rule__ADD__Add2Assignment_0 )
            {
             before(grammarAccess.getADDAccess().getAdd2Assignment_0()); 
            // InternalMyDsl.g:836:2: ( rule__ADD__Add2Assignment_0 )
            // InternalMyDsl.g:836:3: rule__ADD__Add2Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ADD__Add2Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getADDAccess().getAdd2Assignment_0()); 

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
    // $ANTLR end "rule__ADD__Group__0__Impl"


    // $ANTLR start "rule__ADD__Group__1"
    // InternalMyDsl.g:844:1: rule__ADD__Group__1 : rule__ADD__Group__1__Impl ;
    public final void rule__ADD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:848:1: ( rule__ADD__Group__1__Impl )
            // InternalMyDsl.g:849:2: rule__ADD__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ADD__Group__1__Impl();

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
    // $ANTLR end "rule__ADD__Group__1"


    // $ANTLR start "rule__ADD__Group__1__Impl"
    // InternalMyDsl.g:855:1: rule__ADD__Group__1__Impl : ( RULE_INTEGER ) ;
    public final void rule__ADD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:859:1: ( ( RULE_INTEGER ) )
            // InternalMyDsl.g:860:1: ( RULE_INTEGER )
            {
            // InternalMyDsl.g:860:1: ( RULE_INTEGER )
            // InternalMyDsl.g:861:2: RULE_INTEGER
            {
             before(grammarAccess.getADDAccess().getINTEGERTerminalRuleCall_1()); 
            match(input,RULE_INTEGER,FOLLOW_2); 
             after(grammarAccess.getADDAccess().getINTEGERTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__ADD__Group__1__Impl"


    // $ANTLR start "rule__N__Group__0"
    // InternalMyDsl.g:871:1: rule__N__Group__0 : rule__N__Group__0__Impl rule__N__Group__1 ;
    public final void rule__N__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:875:1: ( rule__N__Group__0__Impl rule__N__Group__1 )
            // InternalMyDsl.g:876:2: rule__N__Group__0__Impl rule__N__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__N__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__N__Group__1();

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
    // $ANTLR end "rule__N__Group__0"


    // $ANTLR start "rule__N__Group__0__Impl"
    // InternalMyDsl.g:883:1: rule__N__Group__0__Impl : ( ( rule__N__IntegerAssignment_0 ) ) ;
    public final void rule__N__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:887:1: ( ( ( rule__N__IntegerAssignment_0 ) ) )
            // InternalMyDsl.g:888:1: ( ( rule__N__IntegerAssignment_0 ) )
            {
            // InternalMyDsl.g:888:1: ( ( rule__N__IntegerAssignment_0 ) )
            // InternalMyDsl.g:889:2: ( rule__N__IntegerAssignment_0 )
            {
             before(grammarAccess.getNAccess().getIntegerAssignment_0()); 
            // InternalMyDsl.g:890:2: ( rule__N__IntegerAssignment_0 )
            // InternalMyDsl.g:890:3: rule__N__IntegerAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__N__IntegerAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNAccess().getIntegerAssignment_0()); 

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
    // $ANTLR end "rule__N__Group__0__Impl"


    // $ANTLR start "rule__N__Group__1"
    // InternalMyDsl.g:898:1: rule__N__Group__1 : rule__N__Group__1__Impl ;
    public final void rule__N__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:902:1: ( rule__N__Group__1__Impl )
            // InternalMyDsl.g:903:2: rule__N__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__N__Group__1__Impl();

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
    // $ANTLR end "rule__N__Group__1"


    // $ANTLR start "rule__N__Group__1__Impl"
    // InternalMyDsl.g:909:1: rule__N__Group__1__Impl : ( ( rule__N__PrintAssignment_1 ) ) ;
    public final void rule__N__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:913:1: ( ( ( rule__N__PrintAssignment_1 ) ) )
            // InternalMyDsl.g:914:1: ( ( rule__N__PrintAssignment_1 ) )
            {
            // InternalMyDsl.g:914:1: ( ( rule__N__PrintAssignment_1 ) )
            // InternalMyDsl.g:915:2: ( rule__N__PrintAssignment_1 )
            {
             before(grammarAccess.getNAccess().getPrintAssignment_1()); 
            // InternalMyDsl.g:916:2: ( rule__N__PrintAssignment_1 )
            // InternalMyDsl.g:916:3: rule__N__PrintAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__N__PrintAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNAccess().getPrintAssignment_1()); 

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
    // $ANTLR end "rule__N__Group__1__Impl"


    // $ANTLR start "rule__Model__HaskellAssignment"
    // InternalMyDsl.g:925:1: rule__Model__HaskellAssignment : ( ruleHaskell ) ;
    public final void rule__Model__HaskellAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:929:1: ( ( ruleHaskell ) )
            // InternalMyDsl.g:930:2: ( ruleHaskell )
            {
            // InternalMyDsl.g:930:2: ( ruleHaskell )
            // InternalMyDsl.g:931:3: ruleHaskell
            {
             before(grammarAccess.getModelAccess().getHaskellHaskellParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleHaskell();

            state._fsp--;

             after(grammarAccess.getModelAccess().getHaskellHaskellParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__HaskellAssignment"


    // $ANTLR start "rule__Haskell__ExpressionAssignment_1"
    // InternalMyDsl.g:940:1: rule__Haskell__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Haskell__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:944:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:945:2: ( ruleExpression )
            {
            // InternalMyDsl.g:945:2: ( ruleExpression )
            // InternalMyDsl.g:946:3: ruleExpression
            {
             before(grammarAccess.getHaskellAccess().getExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getHaskellAccess().getExpressionExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Haskell__ExpressionAssignment_1"


    // $ANTLR start "rule__Expression__ZipAssignment_0"
    // InternalMyDsl.g:955:1: rule__Expression__ZipAssignment_0 : ( ruleZIP ) ;
    public final void rule__Expression__ZipAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:959:1: ( ( ruleZIP ) )
            // InternalMyDsl.g:960:2: ( ruleZIP )
            {
            // InternalMyDsl.g:960:2: ( ruleZIP )
            // InternalMyDsl.g:961:3: ruleZIP
            {
             before(grammarAccess.getExpressionAccess().getZipZIPParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleZIP();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getZipZIPParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Expression__ZipAssignment_0"


    // $ANTLR start "rule__Expression__OpAssignment_1_1"
    // InternalMyDsl.g:970:1: rule__Expression__OpAssignment_1_1 : ( ruleOP ) ;
    public final void rule__Expression__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:974:1: ( ( ruleOP ) )
            // InternalMyDsl.g:975:2: ( ruleOP )
            {
            // InternalMyDsl.g:975:2: ( ruleOP )
            // InternalMyDsl.g:976:3: ruleOP
            {
             before(grammarAccess.getExpressionAccess().getOpOPParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOP();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOpOPParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Expression__OpAssignment_1_1"


    // $ANTLR start "rule__Expression__TabAssignment_2_1"
    // InternalMyDsl.g:985:1: rule__Expression__TabAssignment_2_1 : ( ruleTAB ) ;
    public final void rule__Expression__TabAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:989:1: ( ( ruleTAB ) )
            // InternalMyDsl.g:990:2: ( ruleTAB )
            {
            // InternalMyDsl.g:990:2: ( ruleTAB )
            // InternalMyDsl.g:991:3: ruleTAB
            {
             before(grammarAccess.getExpressionAccess().getTabTABParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTAB();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getTabTABParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Expression__TabAssignment_2_1"


    // $ANTLR start "rule__Expression__NAssignment_3"
    // InternalMyDsl.g:1000:1: rule__Expression__NAssignment_3 : ( ruleN ) ;
    public final void rule__Expression__NAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1004:1: ( ( ruleN ) )
            // InternalMyDsl.g:1005:2: ( ruleN )
            {
            // InternalMyDsl.g:1005:2: ( ruleN )
            // InternalMyDsl.g:1006:3: ruleN
            {
             before(grammarAccess.getExpressionAccess().getNNParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleN();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getNNParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Expression__NAssignment_3"


    // $ANTLR start "rule__ZIP__Op2Assignment_2"
    // InternalMyDsl.g:1015:1: rule__ZIP__Op2Assignment_2 : ( ruleOP ) ;
    public final void rule__ZIP__Op2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1019:1: ( ( ruleOP ) )
            // InternalMyDsl.g:1020:2: ( ruleOP )
            {
            // InternalMyDsl.g:1020:2: ( ruleOP )
            // InternalMyDsl.g:1021:3: ruleOP
            {
             before(grammarAccess.getZIPAccess().getOp2OPParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOP();

            state._fsp--;

             after(grammarAccess.getZIPAccess().getOp2OPParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ZIP__Op2Assignment_2"


    // $ANTLR start "rule__ZIP__Op3Assignment_5"
    // InternalMyDsl.g:1030:1: rule__ZIP__Op3Assignment_5 : ( ruleOP ) ;
    public final void rule__ZIP__Op3Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1034:1: ( ( ruleOP ) )
            // InternalMyDsl.g:1035:2: ( ruleOP )
            {
            // InternalMyDsl.g:1035:2: ( ruleOP )
            // InternalMyDsl.g:1036:3: ruleOP
            {
             before(grammarAccess.getZIPAccess().getOp3OPParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleOP();

            state._fsp--;

             after(grammarAccess.getZIPAccess().getOp3OPParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ZIP__Op3Assignment_5"


    // $ANTLR start "rule__OP__InsideAssignment"
    // InternalMyDsl.g:1045:1: rule__OP__InsideAssignment : ( ruleINSIDE ) ;
    public final void rule__OP__InsideAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1049:1: ( ( ruleINSIDE ) )
            // InternalMyDsl.g:1050:2: ( ruleINSIDE )
            {
            // InternalMyDsl.g:1050:2: ( ruleINSIDE )
            // InternalMyDsl.g:1051:3: ruleINSIDE
            {
             before(grammarAccess.getOPAccess().getInsideINSIDEParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleINSIDE();

            state._fsp--;

             after(grammarAccess.getOPAccess().getInsideINSIDEParserRuleCall_0()); 

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
    // $ANTLR end "rule__OP__InsideAssignment"


    // $ANTLR start "rule__INSIDE__Inside2Assignment_0"
    // InternalMyDsl.g:1060:1: rule__INSIDE__Inside2Assignment_0 : ( RULE_INSIDE2 ) ;
    public final void rule__INSIDE__Inside2Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1064:1: ( ( RULE_INSIDE2 ) )
            // InternalMyDsl.g:1065:2: ( RULE_INSIDE2 )
            {
            // InternalMyDsl.g:1065:2: ( RULE_INSIDE2 )
            // InternalMyDsl.g:1066:3: RULE_INSIDE2
            {
             before(grammarAccess.getINSIDEAccess().getInside2INSIDE2TerminalRuleCall_0_0()); 
            match(input,RULE_INSIDE2,FOLLOW_2); 
             after(grammarAccess.getINSIDEAccess().getInside2INSIDE2TerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__INSIDE__Inside2Assignment_0"


    // $ANTLR start "rule__TAB__ContentAssignment_0"
    // InternalMyDsl.g:1075:1: rule__TAB__ContentAssignment_0 : ( RULE_CONTENT ) ;
    public final void rule__TAB__ContentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1079:1: ( ( RULE_CONTENT ) )
            // InternalMyDsl.g:1080:2: ( RULE_CONTENT )
            {
            // InternalMyDsl.g:1080:2: ( RULE_CONTENT )
            // InternalMyDsl.g:1081:3: RULE_CONTENT
            {
             before(grammarAccess.getTABAccess().getContentCONTENTTerminalRuleCall_0_0()); 
            match(input,RULE_CONTENT,FOLLOW_2); 
             after(grammarAccess.getTABAccess().getContentCONTENTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__TAB__ContentAssignment_0"


    // $ANTLR start "rule__TAB__AddAssignment_1"
    // InternalMyDsl.g:1090:1: rule__TAB__AddAssignment_1 : ( ruleADD ) ;
    public final void rule__TAB__AddAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1094:1: ( ( ruleADD ) )
            // InternalMyDsl.g:1095:2: ( ruleADD )
            {
            // InternalMyDsl.g:1095:2: ( ruleADD )
            // InternalMyDsl.g:1096:3: ruleADD
            {
             before(grammarAccess.getTABAccess().getAddADDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleADD();

            state._fsp--;

             after(grammarAccess.getTABAccess().getAddADDParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__TAB__AddAssignment_1"


    // $ANTLR start "rule__ADD__Add2Assignment_0"
    // InternalMyDsl.g:1105:1: rule__ADD__Add2Assignment_0 : ( RULE_ADD2 ) ;
    public final void rule__ADD__Add2Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1109:1: ( ( RULE_ADD2 ) )
            // InternalMyDsl.g:1110:2: ( RULE_ADD2 )
            {
            // InternalMyDsl.g:1110:2: ( RULE_ADD2 )
            // InternalMyDsl.g:1111:3: RULE_ADD2
            {
             before(grammarAccess.getADDAccess().getAdd2ADD2TerminalRuleCall_0_0()); 
            match(input,RULE_ADD2,FOLLOW_2); 
             after(grammarAccess.getADDAccess().getAdd2ADD2TerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ADD__Add2Assignment_0"


    // $ANTLR start "rule__N__IntegerAssignment_0"
    // InternalMyDsl.g:1120:1: rule__N__IntegerAssignment_0 : ( RULE_INTEGER ) ;
    public final void rule__N__IntegerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1124:1: ( ( RULE_INTEGER ) )
            // InternalMyDsl.g:1125:2: ( RULE_INTEGER )
            {
            // InternalMyDsl.g:1125:2: ( RULE_INTEGER )
            // InternalMyDsl.g:1126:3: RULE_INTEGER
            {
             before(grammarAccess.getNAccess().getIntegerINTEGERTerminalRuleCall_0_0()); 
            match(input,RULE_INTEGER,FOLLOW_2); 
             after(grammarAccess.getNAccess().getIntegerINTEGERTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__N__IntegerAssignment_0"


    // $ANTLR start "rule__N__PrintAssignment_1"
    // InternalMyDsl.g:1135:1: rule__N__PrintAssignment_1 : ( RULE_PRINT ) ;
    public final void rule__N__PrintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1139:1: ( ( RULE_PRINT ) )
            // InternalMyDsl.g:1140:2: ( RULE_PRINT )
            {
            // InternalMyDsl.g:1140:2: ( RULE_PRINT )
            // InternalMyDsl.g:1141:3: RULE_PRINT
            {
             before(grammarAccess.getNAccess().getPrintPRINTTerminalRuleCall_1_0()); 
            match(input,RULE_PRINT,FOLLOW_2); 
             after(grammarAccess.getNAccess().getPrintPRINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__N__PrintAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000002A0010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000100L});

}