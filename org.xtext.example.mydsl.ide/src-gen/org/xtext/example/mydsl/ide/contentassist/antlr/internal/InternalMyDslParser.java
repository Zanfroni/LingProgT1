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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_OP", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'show'", "'['", "']'", "'('", "')'", "'zip'", "'length'", "','", "'++'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_OP=5;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=4;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;

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

                if ( (LA1_0==12) ) {
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
    // InternalMyDsl.g:112:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Expression__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Expression__Group__0 )
            // InternalMyDsl.g:119:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

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


    // $ANTLR start "entryRuleComplement"
    // InternalMyDsl.g:128:1: entryRuleComplement : ruleComplement EOF ;
    public final void entryRuleComplement() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleComplement EOF )
            // InternalMyDsl.g:130:1: ruleComplement EOF
            {
             before(grammarAccess.getComplementRule()); 
            pushFollow(FOLLOW_1);
            ruleComplement();

            state._fsp--;

             after(grammarAccess.getComplementRule()); 
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
    // $ANTLR end "entryRuleComplement"


    // $ANTLR start "ruleComplement"
    // InternalMyDsl.g:137:1: ruleComplement : ( ( rule__Complement__Alternatives ) ) ;
    public final void ruleComplement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Complement__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Complement__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Complement__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__Complement__Alternatives )
            {
             before(grammarAccess.getComplementAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__Complement__Alternatives )
            // InternalMyDsl.g:144:4: rule__Complement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Complement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComplementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleComplement"


    // $ANTLR start "entryRuleFunction"
    // InternalMyDsl.g:153:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleFunction EOF )
            // InternalMyDsl.g:155:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalMyDsl.g:162:1: ruleFunction : ( ( rule__Function__Alternatives ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Function__Alternatives ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Function__Alternatives ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Function__Alternatives ) )
            // InternalMyDsl.g:168:3: ( rule__Function__Alternatives )
            {
             before(grammarAccess.getFunctionAccess().getAlternatives()); 
            // InternalMyDsl.g:169:3: ( rule__Function__Alternatives )
            // InternalMyDsl.g:169:4: rule__Function__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Function__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleNumbers"
    // InternalMyDsl.g:178:1: entryRuleNumbers : ruleNumbers EOF ;
    public final void entryRuleNumbers() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleNumbers EOF )
            // InternalMyDsl.g:180:1: ruleNumbers EOF
            {
             before(grammarAccess.getNumbersRule()); 
            pushFollow(FOLLOW_1);
            ruleNumbers();

            state._fsp--;

             after(grammarAccess.getNumbersRule()); 
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
    // $ANTLR end "entryRuleNumbers"


    // $ANTLR start "ruleNumbers"
    // InternalMyDsl.g:187:1: ruleNumbers : ( ( rule__Numbers__Alternatives ) ) ;
    public final void ruleNumbers() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Numbers__Alternatives ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Numbers__Alternatives ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Numbers__Alternatives ) )
            // InternalMyDsl.g:193:3: ( rule__Numbers__Alternatives )
            {
             before(grammarAccess.getNumbersAccess().getAlternatives()); 
            // InternalMyDsl.g:194:3: ( rule__Numbers__Alternatives )
            // InternalMyDsl.g:194:4: rule__Numbers__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Numbers__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumbersAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNumbers"


    // $ANTLR start "entryRuleConcat"
    // InternalMyDsl.g:203:1: entryRuleConcat : ruleConcat EOF ;
    public final void entryRuleConcat() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleConcat EOF )
            // InternalMyDsl.g:205:1: ruleConcat EOF
            {
             before(grammarAccess.getConcatRule()); 
            pushFollow(FOLLOW_1);
            ruleConcat();

            state._fsp--;

             after(grammarAccess.getConcatRule()); 
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
    // $ANTLR end "entryRuleConcat"


    // $ANTLR start "ruleConcat"
    // InternalMyDsl.g:212:1: ruleConcat : ( ( rule__Concat__Group__0 ) ) ;
    public final void ruleConcat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Concat__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Concat__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Concat__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Concat__Group__0 )
            {
             before(grammarAccess.getConcatAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Concat__Group__0 )
            // InternalMyDsl.g:219:4: rule__Concat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Concat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConcatAccess().getGroup()); 

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
    // $ANTLR end "ruleConcat"


    // $ANTLR start "entryRuleNewConcat"
    // InternalMyDsl.g:228:1: entryRuleNewConcat : ruleNewConcat EOF ;
    public final void entryRuleNewConcat() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleNewConcat EOF )
            // InternalMyDsl.g:230:1: ruleNewConcat EOF
            {
             before(grammarAccess.getNewConcatRule()); 
            pushFollow(FOLLOW_1);
            ruleNewConcat();

            state._fsp--;

             after(grammarAccess.getNewConcatRule()); 
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
    // $ANTLR end "entryRuleNewConcat"


    // $ANTLR start "ruleNewConcat"
    // InternalMyDsl.g:237:1: ruleNewConcat : ( ( rule__NewConcat__Group__0 ) ) ;
    public final void ruleNewConcat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__NewConcat__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__NewConcat__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__NewConcat__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__NewConcat__Group__0 )
            {
             before(grammarAccess.getNewConcatAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__NewConcat__Group__0 )
            // InternalMyDsl.g:244:4: rule__NewConcat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NewConcat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNewConcatAccess().getGroup()); 

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
    // $ANTLR end "ruleNewConcat"


    // $ANTLR start "entryRuleElement"
    // InternalMyDsl.g:253:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleElement EOF )
            // InternalMyDsl.g:255:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalMyDsl.g:262:1: ruleElement : ( ( rule__Element__Group__0 ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Element__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Element__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Element__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Element__Group__0 )
            {
             before(grammarAccess.getElementAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Element__Group__0 )
            // InternalMyDsl.g:269:4: rule__Element__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getGroup()); 

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "rule__Complement__Alternatives"
    // InternalMyDsl.g:277:1: rule__Complement__Alternatives : ( ( ( rule__Complement__IdAssignment_0 ) ) | ( ( rule__Complement__Group_1__0 ) ) | ( ( rule__Complement__Group_2__0 ) ) );
    public final void rule__Complement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:281:1: ( ( ( rule__Complement__IdAssignment_0 ) ) | ( ( rule__Complement__Group_1__0 ) ) | ( ( rule__Complement__Group_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:282:2: ( ( rule__Complement__IdAssignment_0 ) )
                    {
                    // InternalMyDsl.g:282:2: ( ( rule__Complement__IdAssignment_0 ) )
                    // InternalMyDsl.g:283:3: ( rule__Complement__IdAssignment_0 )
                    {
                     before(grammarAccess.getComplementAccess().getIdAssignment_0()); 
                    // InternalMyDsl.g:284:3: ( rule__Complement__IdAssignment_0 )
                    // InternalMyDsl.g:284:4: rule__Complement__IdAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Complement__IdAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComplementAccess().getIdAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:288:2: ( ( rule__Complement__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:288:2: ( ( rule__Complement__Group_1__0 ) )
                    // InternalMyDsl.g:289:3: ( rule__Complement__Group_1__0 )
                    {
                     before(grammarAccess.getComplementAccess().getGroup_1()); 
                    // InternalMyDsl.g:290:3: ( rule__Complement__Group_1__0 )
                    // InternalMyDsl.g:290:4: rule__Complement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Complement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComplementAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:294:2: ( ( rule__Complement__Group_2__0 ) )
                    {
                    // InternalMyDsl.g:294:2: ( ( rule__Complement__Group_2__0 ) )
                    // InternalMyDsl.g:295:3: ( rule__Complement__Group_2__0 )
                    {
                     before(grammarAccess.getComplementAccess().getGroup_2()); 
                    // InternalMyDsl.g:296:3: ( rule__Complement__Group_2__0 )
                    // InternalMyDsl.g:296:4: rule__Complement__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Complement__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComplementAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Complement__Alternatives"


    // $ANTLR start "rule__Function__Alternatives"
    // InternalMyDsl.g:304:1: rule__Function__Alternatives : ( ( ( rule__Function__ElementAssignment_0 ) ) | ( ( rule__Function__Group_1__0 ) ) | ( ( rule__Function__Group_2__0 ) ) );
    public final void rule__Function__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:308:1: ( ( ( rule__Function__ElementAssignment_0 ) ) | ( ( rule__Function__Group_1__0 ) ) | ( ( rule__Function__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:309:2: ( ( rule__Function__ElementAssignment_0 ) )
                    {
                    // InternalMyDsl.g:309:2: ( ( rule__Function__ElementAssignment_0 ) )
                    // InternalMyDsl.g:310:3: ( rule__Function__ElementAssignment_0 )
                    {
                     before(grammarAccess.getFunctionAccess().getElementAssignment_0()); 
                    // InternalMyDsl.g:311:3: ( rule__Function__ElementAssignment_0 )
                    // InternalMyDsl.g:311:4: rule__Function__ElementAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function__ElementAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionAccess().getElementAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:315:2: ( ( rule__Function__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:315:2: ( ( rule__Function__Group_1__0 ) )
                    // InternalMyDsl.g:316:3: ( rule__Function__Group_1__0 )
                    {
                     before(grammarAccess.getFunctionAccess().getGroup_1()); 
                    // InternalMyDsl.g:317:3: ( rule__Function__Group_1__0 )
                    // InternalMyDsl.g:317:4: rule__Function__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:321:2: ( ( rule__Function__Group_2__0 ) )
                    {
                    // InternalMyDsl.g:321:2: ( ( rule__Function__Group_2__0 ) )
                    // InternalMyDsl.g:322:3: ( rule__Function__Group_2__0 )
                    {
                     before(grammarAccess.getFunctionAccess().getGroup_2()); 
                    // InternalMyDsl.g:323:3: ( rule__Function__Group_2__0 )
                    // InternalMyDsl.g:323:4: rule__Function__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Function__Alternatives"


    // $ANTLR start "rule__Numbers__Alternatives"
    // InternalMyDsl.g:331:1: rule__Numbers__Alternatives : ( ( ( rule__Numbers__Group_0__0 ) ) | ( ( rule__Numbers__TwoAssignment_1 ) ) );
    public final void rule__Numbers__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:335:1: ( ( ( rule__Numbers__Group_0__0 ) ) | ( ( rule__Numbers__TwoAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==14) ) {
                    alt4=2;
                }
                else if ( (LA4_1==19) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:336:2: ( ( rule__Numbers__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:336:2: ( ( rule__Numbers__Group_0__0 ) )
                    // InternalMyDsl.g:337:3: ( rule__Numbers__Group_0__0 )
                    {
                     before(grammarAccess.getNumbersAccess().getGroup_0()); 
                    // InternalMyDsl.g:338:3: ( rule__Numbers__Group_0__0 )
                    // InternalMyDsl.g:338:4: rule__Numbers__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Numbers__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNumbersAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:342:2: ( ( rule__Numbers__TwoAssignment_1 ) )
                    {
                    // InternalMyDsl.g:342:2: ( ( rule__Numbers__TwoAssignment_1 ) )
                    // InternalMyDsl.g:343:3: ( rule__Numbers__TwoAssignment_1 )
                    {
                     before(grammarAccess.getNumbersAccess().getTwoAssignment_1()); 
                    // InternalMyDsl.g:344:3: ( rule__Numbers__TwoAssignment_1 )
                    // InternalMyDsl.g:344:4: rule__Numbers__TwoAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Numbers__TwoAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNumbersAccess().getTwoAssignment_1()); 

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
    // $ANTLR end "rule__Numbers__Alternatives"


    // $ANTLR start "rule__Concat__Alternatives_1"
    // InternalMyDsl.g:352:1: rule__Concat__Alternatives_1 : ( ( ( rule__Concat__IdAssignment_1_0 ) ) | ( ( rule__Concat__OpAssignment_1_1 ) ) );
    public final void rule__Concat__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:356:1: ( ( ( rule__Concat__IdAssignment_1_0 ) ) | ( ( rule__Concat__OpAssignment_1_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_OP) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:357:2: ( ( rule__Concat__IdAssignment_1_0 ) )
                    {
                    // InternalMyDsl.g:357:2: ( ( rule__Concat__IdAssignment_1_0 ) )
                    // InternalMyDsl.g:358:3: ( rule__Concat__IdAssignment_1_0 )
                    {
                     before(grammarAccess.getConcatAccess().getIdAssignment_1_0()); 
                    // InternalMyDsl.g:359:3: ( rule__Concat__IdAssignment_1_0 )
                    // InternalMyDsl.g:359:4: rule__Concat__IdAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Concat__IdAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConcatAccess().getIdAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:363:2: ( ( rule__Concat__OpAssignment_1_1 ) )
                    {
                    // InternalMyDsl.g:363:2: ( ( rule__Concat__OpAssignment_1_1 ) )
                    // InternalMyDsl.g:364:3: ( rule__Concat__OpAssignment_1_1 )
                    {
                     before(grammarAccess.getConcatAccess().getOpAssignment_1_1()); 
                    // InternalMyDsl.g:365:3: ( rule__Concat__OpAssignment_1_1 )
                    // InternalMyDsl.g:365:4: rule__Concat__OpAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Concat__OpAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConcatAccess().getOpAssignment_1_1()); 

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
    // $ANTLR end "rule__Concat__Alternatives_1"


    // $ANTLR start "rule__Haskell__Group__0"
    // InternalMyDsl.g:373:1: rule__Haskell__Group__0 : rule__Haskell__Group__0__Impl rule__Haskell__Group__1 ;
    public final void rule__Haskell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:377:1: ( rule__Haskell__Group__0__Impl rule__Haskell__Group__1 )
            // InternalMyDsl.g:378:2: rule__Haskell__Group__0__Impl rule__Haskell__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalMyDsl.g:385:1: rule__Haskell__Group__0__Impl : ( 'show' ) ;
    public final void rule__Haskell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:389:1: ( ( 'show' ) )
            // InternalMyDsl.g:390:1: ( 'show' )
            {
            // InternalMyDsl.g:390:1: ( 'show' )
            // InternalMyDsl.g:391:2: 'show'
            {
             before(grammarAccess.getHaskellAccess().getShowKeyword_0()); 
            match(input,12,FOLLOW_2); 
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
    // InternalMyDsl.g:400:1: rule__Haskell__Group__1 : rule__Haskell__Group__1__Impl ;
    public final void rule__Haskell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:404:1: ( rule__Haskell__Group__1__Impl )
            // InternalMyDsl.g:405:2: rule__Haskell__Group__1__Impl
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
    // InternalMyDsl.g:411:1: rule__Haskell__Group__1__Impl : ( ( rule__Haskell__ExpressionAssignment_1 ) ) ;
    public final void rule__Haskell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:415:1: ( ( ( rule__Haskell__ExpressionAssignment_1 ) ) )
            // InternalMyDsl.g:416:1: ( ( rule__Haskell__ExpressionAssignment_1 ) )
            {
            // InternalMyDsl.g:416:1: ( ( rule__Haskell__ExpressionAssignment_1 ) )
            // InternalMyDsl.g:417:2: ( rule__Haskell__ExpressionAssignment_1 )
            {
             before(grammarAccess.getHaskellAccess().getExpressionAssignment_1()); 
            // InternalMyDsl.g:418:2: ( rule__Haskell__ExpressionAssignment_1 )
            // InternalMyDsl.g:418:3: rule__Haskell__ExpressionAssignment_1
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


    // $ANTLR start "rule__Expression__Group__0"
    // InternalMyDsl.g:427:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:431:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalMyDsl.g:432:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

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
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalMyDsl.g:439:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__ComplementAssignment_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:443:1: ( ( ( rule__Expression__ComplementAssignment_0 ) ) )
            // InternalMyDsl.g:444:1: ( ( rule__Expression__ComplementAssignment_0 ) )
            {
            // InternalMyDsl.g:444:1: ( ( rule__Expression__ComplementAssignment_0 ) )
            // InternalMyDsl.g:445:2: ( rule__Expression__ComplementAssignment_0 )
            {
             before(grammarAccess.getExpressionAccess().getComplementAssignment_0()); 
            // InternalMyDsl.g:446:2: ( rule__Expression__ComplementAssignment_0 )
            // InternalMyDsl.g:446:3: rule__Expression__ComplementAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ComplementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getComplementAssignment_0()); 

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
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalMyDsl.g:454:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:458:1: ( rule__Expression__Group__1__Impl )
            // InternalMyDsl.g:459:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__1__Impl();

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
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalMyDsl.g:465:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__ConcatAssignment_1 )? ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:469:1: ( ( ( rule__Expression__ConcatAssignment_1 )? ) )
            // InternalMyDsl.g:470:1: ( ( rule__Expression__ConcatAssignment_1 )? )
            {
            // InternalMyDsl.g:470:1: ( ( rule__Expression__ConcatAssignment_1 )? )
            // InternalMyDsl.g:471:2: ( rule__Expression__ConcatAssignment_1 )?
            {
             before(grammarAccess.getExpressionAccess().getConcatAssignment_1()); 
            // InternalMyDsl.g:472:2: ( rule__Expression__ConcatAssignment_1 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:472:3: rule__Expression__ConcatAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__ConcatAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getConcatAssignment_1()); 

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
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Complement__Group_1__0"
    // InternalMyDsl.g:481:1: rule__Complement__Group_1__0 : rule__Complement__Group_1__0__Impl rule__Complement__Group_1__1 ;
    public final void rule__Complement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:485:1: ( rule__Complement__Group_1__0__Impl rule__Complement__Group_1__1 )
            // InternalMyDsl.g:486:2: rule__Complement__Group_1__0__Impl rule__Complement__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Complement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complement__Group_1__1();

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
    // $ANTLR end "rule__Complement__Group_1__0"


    // $ANTLR start "rule__Complement__Group_1__0__Impl"
    // InternalMyDsl.g:493:1: rule__Complement__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Complement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:497:1: ( ( '[' ) )
            // InternalMyDsl.g:498:1: ( '[' )
            {
            // InternalMyDsl.g:498:1: ( '[' )
            // InternalMyDsl.g:499:2: '['
            {
             before(grammarAccess.getComplementAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getComplementAccess().getLeftSquareBracketKeyword_1_0()); 

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
    // $ANTLR end "rule__Complement__Group_1__0__Impl"


    // $ANTLR start "rule__Complement__Group_1__1"
    // InternalMyDsl.g:508:1: rule__Complement__Group_1__1 : rule__Complement__Group_1__1__Impl rule__Complement__Group_1__2 ;
    public final void rule__Complement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:512:1: ( rule__Complement__Group_1__1__Impl rule__Complement__Group_1__2 )
            // InternalMyDsl.g:513:2: rule__Complement__Group_1__1__Impl rule__Complement__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Complement__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complement__Group_1__2();

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
    // $ANTLR end "rule__Complement__Group_1__1"


    // $ANTLR start "rule__Complement__Group_1__1__Impl"
    // InternalMyDsl.g:520:1: rule__Complement__Group_1__1__Impl : ( ( rule__Complement__NumbersAssignment_1_1 ) ) ;
    public final void rule__Complement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:524:1: ( ( ( rule__Complement__NumbersAssignment_1_1 ) ) )
            // InternalMyDsl.g:525:1: ( ( rule__Complement__NumbersAssignment_1_1 ) )
            {
            // InternalMyDsl.g:525:1: ( ( rule__Complement__NumbersAssignment_1_1 ) )
            // InternalMyDsl.g:526:2: ( rule__Complement__NumbersAssignment_1_1 )
            {
             before(grammarAccess.getComplementAccess().getNumbersAssignment_1_1()); 
            // InternalMyDsl.g:527:2: ( rule__Complement__NumbersAssignment_1_1 )
            // InternalMyDsl.g:527:3: rule__Complement__NumbersAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Complement__NumbersAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComplementAccess().getNumbersAssignment_1_1()); 

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
    // $ANTLR end "rule__Complement__Group_1__1__Impl"


    // $ANTLR start "rule__Complement__Group_1__2"
    // InternalMyDsl.g:535:1: rule__Complement__Group_1__2 : rule__Complement__Group_1__2__Impl ;
    public final void rule__Complement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:539:1: ( rule__Complement__Group_1__2__Impl )
            // InternalMyDsl.g:540:2: rule__Complement__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Complement__Group_1__2__Impl();

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
    // $ANTLR end "rule__Complement__Group_1__2"


    // $ANTLR start "rule__Complement__Group_1__2__Impl"
    // InternalMyDsl.g:546:1: rule__Complement__Group_1__2__Impl : ( ']' ) ;
    public final void rule__Complement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:550:1: ( ( ']' ) )
            // InternalMyDsl.g:551:1: ( ']' )
            {
            // InternalMyDsl.g:551:1: ( ']' )
            // InternalMyDsl.g:552:2: ']'
            {
             before(grammarAccess.getComplementAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getComplementAccess().getRightSquareBracketKeyword_1_2()); 

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
    // $ANTLR end "rule__Complement__Group_1__2__Impl"


    // $ANTLR start "rule__Complement__Group_2__0"
    // InternalMyDsl.g:562:1: rule__Complement__Group_2__0 : rule__Complement__Group_2__0__Impl rule__Complement__Group_2__1 ;
    public final void rule__Complement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:1: ( rule__Complement__Group_2__0__Impl rule__Complement__Group_2__1 )
            // InternalMyDsl.g:567:2: rule__Complement__Group_2__0__Impl rule__Complement__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Complement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complement__Group_2__1();

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
    // $ANTLR end "rule__Complement__Group_2__0"


    // $ANTLR start "rule__Complement__Group_2__0__Impl"
    // InternalMyDsl.g:574:1: rule__Complement__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Complement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:578:1: ( ( '(' ) )
            // InternalMyDsl.g:579:1: ( '(' )
            {
            // InternalMyDsl.g:579:1: ( '(' )
            // InternalMyDsl.g:580:2: '('
            {
             before(grammarAccess.getComplementAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getComplementAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__Complement__Group_2__0__Impl"


    // $ANTLR start "rule__Complement__Group_2__1"
    // InternalMyDsl.g:589:1: rule__Complement__Group_2__1 : rule__Complement__Group_2__1__Impl rule__Complement__Group_2__2 ;
    public final void rule__Complement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:593:1: ( rule__Complement__Group_2__1__Impl rule__Complement__Group_2__2 )
            // InternalMyDsl.g:594:2: rule__Complement__Group_2__1__Impl rule__Complement__Group_2__2
            {
            pushFollow(FOLLOW_9);
            rule__Complement__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Complement__Group_2__2();

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
    // $ANTLR end "rule__Complement__Group_2__1"


    // $ANTLR start "rule__Complement__Group_2__1__Impl"
    // InternalMyDsl.g:601:1: rule__Complement__Group_2__1__Impl : ( ( rule__Complement__FunctionAssignment_2_1 ) ) ;
    public final void rule__Complement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:605:1: ( ( ( rule__Complement__FunctionAssignment_2_1 ) ) )
            // InternalMyDsl.g:606:1: ( ( rule__Complement__FunctionAssignment_2_1 ) )
            {
            // InternalMyDsl.g:606:1: ( ( rule__Complement__FunctionAssignment_2_1 ) )
            // InternalMyDsl.g:607:2: ( rule__Complement__FunctionAssignment_2_1 )
            {
             before(grammarAccess.getComplementAccess().getFunctionAssignment_2_1()); 
            // InternalMyDsl.g:608:2: ( rule__Complement__FunctionAssignment_2_1 )
            // InternalMyDsl.g:608:3: rule__Complement__FunctionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Complement__FunctionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getComplementAccess().getFunctionAssignment_2_1()); 

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
    // $ANTLR end "rule__Complement__Group_2__1__Impl"


    // $ANTLR start "rule__Complement__Group_2__2"
    // InternalMyDsl.g:616:1: rule__Complement__Group_2__2 : rule__Complement__Group_2__2__Impl ;
    public final void rule__Complement__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:620:1: ( rule__Complement__Group_2__2__Impl )
            // InternalMyDsl.g:621:2: rule__Complement__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Complement__Group_2__2__Impl();

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
    // $ANTLR end "rule__Complement__Group_2__2"


    // $ANTLR start "rule__Complement__Group_2__2__Impl"
    // InternalMyDsl.g:627:1: rule__Complement__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Complement__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:631:1: ( ( ')' ) )
            // InternalMyDsl.g:632:1: ( ')' )
            {
            // InternalMyDsl.g:632:1: ( ')' )
            // InternalMyDsl.g:633:2: ')'
            {
             before(grammarAccess.getComplementAccess().getRightParenthesisKeyword_2_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getComplementAccess().getRightParenthesisKeyword_2_2()); 

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
    // $ANTLR end "rule__Complement__Group_2__2__Impl"


    // $ANTLR start "rule__Function__Group_1__0"
    // InternalMyDsl.g:643:1: rule__Function__Group_1__0 : rule__Function__Group_1__0__Impl rule__Function__Group_1__1 ;
    public final void rule__Function__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:647:1: ( rule__Function__Group_1__0__Impl rule__Function__Group_1__1 )
            // InternalMyDsl.g:648:2: rule__Function__Group_1__0__Impl rule__Function__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Function__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_1__1();

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
    // $ANTLR end "rule__Function__Group_1__0"


    // $ANTLR start "rule__Function__Group_1__0__Impl"
    // InternalMyDsl.g:655:1: rule__Function__Group_1__0__Impl : ( 'zip' ) ;
    public final void rule__Function__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:659:1: ( ( 'zip' ) )
            // InternalMyDsl.g:660:1: ( 'zip' )
            {
            // InternalMyDsl.g:660:1: ( 'zip' )
            // InternalMyDsl.g:661:2: 'zip'
            {
             before(grammarAccess.getFunctionAccess().getZipKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getZipKeyword_1_0()); 

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
    // $ANTLR end "rule__Function__Group_1__0__Impl"


    // $ANTLR start "rule__Function__Group_1__1"
    // InternalMyDsl.g:670:1: rule__Function__Group_1__1 : rule__Function__Group_1__1__Impl rule__Function__Group_1__2 ;
    public final void rule__Function__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:674:1: ( rule__Function__Group_1__1__Impl rule__Function__Group_1__2 )
            // InternalMyDsl.g:675:2: rule__Function__Group_1__1__Impl rule__Function__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Function__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_1__2();

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
    // $ANTLR end "rule__Function__Group_1__1"


    // $ANTLR start "rule__Function__Group_1__1__Impl"
    // InternalMyDsl.g:682:1: rule__Function__Group_1__1__Impl : ( '[' ) ;
    public final void rule__Function__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:686:1: ( ( '[' ) )
            // InternalMyDsl.g:687:1: ( '[' )
            {
            // InternalMyDsl.g:687:1: ( '[' )
            // InternalMyDsl.g:688:2: '['
            {
             before(grammarAccess.getFunctionAccess().getLeftSquareBracketKeyword_1_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getLeftSquareBracketKeyword_1_1()); 

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
    // $ANTLR end "rule__Function__Group_1__1__Impl"


    // $ANTLR start "rule__Function__Group_1__2"
    // InternalMyDsl.g:697:1: rule__Function__Group_1__2 : rule__Function__Group_1__2__Impl rule__Function__Group_1__3 ;
    public final void rule__Function__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:701:1: ( rule__Function__Group_1__2__Impl rule__Function__Group_1__3 )
            // InternalMyDsl.g:702:2: rule__Function__Group_1__2__Impl rule__Function__Group_1__3
            {
            pushFollow(FOLLOW_7);
            rule__Function__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_1__3();

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
    // $ANTLR end "rule__Function__Group_1__2"


    // $ANTLR start "rule__Function__Group_1__2__Impl"
    // InternalMyDsl.g:709:1: rule__Function__Group_1__2__Impl : ( ( rule__Function__Numb1Assignment_1_2 ) ) ;
    public final void rule__Function__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:713:1: ( ( ( rule__Function__Numb1Assignment_1_2 ) ) )
            // InternalMyDsl.g:714:1: ( ( rule__Function__Numb1Assignment_1_2 ) )
            {
            // InternalMyDsl.g:714:1: ( ( rule__Function__Numb1Assignment_1_2 ) )
            // InternalMyDsl.g:715:2: ( rule__Function__Numb1Assignment_1_2 )
            {
             before(grammarAccess.getFunctionAccess().getNumb1Assignment_1_2()); 
            // InternalMyDsl.g:716:2: ( rule__Function__Numb1Assignment_1_2 )
            // InternalMyDsl.g:716:3: rule__Function__Numb1Assignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Function__Numb1Assignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNumb1Assignment_1_2()); 

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
    // $ANTLR end "rule__Function__Group_1__2__Impl"


    // $ANTLR start "rule__Function__Group_1__3"
    // InternalMyDsl.g:724:1: rule__Function__Group_1__3 : rule__Function__Group_1__3__Impl rule__Function__Group_1__4 ;
    public final void rule__Function__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:728:1: ( rule__Function__Group_1__3__Impl rule__Function__Group_1__4 )
            // InternalMyDsl.g:729:2: rule__Function__Group_1__3__Impl rule__Function__Group_1__4
            {
            pushFollow(FOLLOW_10);
            rule__Function__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_1__4();

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
    // $ANTLR end "rule__Function__Group_1__3"


    // $ANTLR start "rule__Function__Group_1__3__Impl"
    // InternalMyDsl.g:736:1: rule__Function__Group_1__3__Impl : ( ']' ) ;
    public final void rule__Function__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:740:1: ( ( ']' ) )
            // InternalMyDsl.g:741:1: ( ']' )
            {
            // InternalMyDsl.g:741:1: ( ']' )
            // InternalMyDsl.g:742:2: ']'
            {
             before(grammarAccess.getFunctionAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getRightSquareBracketKeyword_1_3()); 

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
    // $ANTLR end "rule__Function__Group_1__3__Impl"


    // $ANTLR start "rule__Function__Group_1__4"
    // InternalMyDsl.g:751:1: rule__Function__Group_1__4 : rule__Function__Group_1__4__Impl rule__Function__Group_1__5 ;
    public final void rule__Function__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:755:1: ( rule__Function__Group_1__4__Impl rule__Function__Group_1__5 )
            // InternalMyDsl.g:756:2: rule__Function__Group_1__4__Impl rule__Function__Group_1__5
            {
            pushFollow(FOLLOW_6);
            rule__Function__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_1__5();

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
    // $ANTLR end "rule__Function__Group_1__4"


    // $ANTLR start "rule__Function__Group_1__4__Impl"
    // InternalMyDsl.g:763:1: rule__Function__Group_1__4__Impl : ( '[' ) ;
    public final void rule__Function__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:767:1: ( ( '[' ) )
            // InternalMyDsl.g:768:1: ( '[' )
            {
            // InternalMyDsl.g:768:1: ( '[' )
            // InternalMyDsl.g:769:2: '['
            {
             before(grammarAccess.getFunctionAccess().getLeftSquareBracketKeyword_1_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getLeftSquareBracketKeyword_1_4()); 

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
    // $ANTLR end "rule__Function__Group_1__4__Impl"


    // $ANTLR start "rule__Function__Group_1__5"
    // InternalMyDsl.g:778:1: rule__Function__Group_1__5 : rule__Function__Group_1__5__Impl rule__Function__Group_1__6 ;
    public final void rule__Function__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:782:1: ( rule__Function__Group_1__5__Impl rule__Function__Group_1__6 )
            // InternalMyDsl.g:783:2: rule__Function__Group_1__5__Impl rule__Function__Group_1__6
            {
            pushFollow(FOLLOW_7);
            rule__Function__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_1__6();

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
    // $ANTLR end "rule__Function__Group_1__5"


    // $ANTLR start "rule__Function__Group_1__5__Impl"
    // InternalMyDsl.g:790:1: rule__Function__Group_1__5__Impl : ( ( rule__Function__Numb2Assignment_1_5 ) ) ;
    public final void rule__Function__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:794:1: ( ( ( rule__Function__Numb2Assignment_1_5 ) ) )
            // InternalMyDsl.g:795:1: ( ( rule__Function__Numb2Assignment_1_5 ) )
            {
            // InternalMyDsl.g:795:1: ( ( rule__Function__Numb2Assignment_1_5 ) )
            // InternalMyDsl.g:796:2: ( rule__Function__Numb2Assignment_1_5 )
            {
             before(grammarAccess.getFunctionAccess().getNumb2Assignment_1_5()); 
            // InternalMyDsl.g:797:2: ( rule__Function__Numb2Assignment_1_5 )
            // InternalMyDsl.g:797:3: rule__Function__Numb2Assignment_1_5
            {
            pushFollow(FOLLOW_2);
            rule__Function__Numb2Assignment_1_5();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNumb2Assignment_1_5()); 

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
    // $ANTLR end "rule__Function__Group_1__5__Impl"


    // $ANTLR start "rule__Function__Group_1__6"
    // InternalMyDsl.g:805:1: rule__Function__Group_1__6 : rule__Function__Group_1__6__Impl ;
    public final void rule__Function__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:809:1: ( rule__Function__Group_1__6__Impl )
            // InternalMyDsl.g:810:2: rule__Function__Group_1__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_1__6__Impl();

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
    // $ANTLR end "rule__Function__Group_1__6"


    // $ANTLR start "rule__Function__Group_1__6__Impl"
    // InternalMyDsl.g:816:1: rule__Function__Group_1__6__Impl : ( ']' ) ;
    public final void rule__Function__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:820:1: ( ( ']' ) )
            // InternalMyDsl.g:821:1: ( ']' )
            {
            // InternalMyDsl.g:821:1: ( ']' )
            // InternalMyDsl.g:822:2: ']'
            {
             before(grammarAccess.getFunctionAccess().getRightSquareBracketKeyword_1_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getRightSquareBracketKeyword_1_6()); 

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
    // $ANTLR end "rule__Function__Group_1__6__Impl"


    // $ANTLR start "rule__Function__Group_2__0"
    // InternalMyDsl.g:832:1: rule__Function__Group_2__0 : rule__Function__Group_2__0__Impl rule__Function__Group_2__1 ;
    public final void rule__Function__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:836:1: ( rule__Function__Group_2__0__Impl rule__Function__Group_2__1 )
            // InternalMyDsl.g:837:2: rule__Function__Group_2__0__Impl rule__Function__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Function__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_2__1();

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
    // $ANTLR end "rule__Function__Group_2__0"


    // $ANTLR start "rule__Function__Group_2__0__Impl"
    // InternalMyDsl.g:844:1: rule__Function__Group_2__0__Impl : ( 'length' ) ;
    public final void rule__Function__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:848:1: ( ( 'length' ) )
            // InternalMyDsl.g:849:1: ( 'length' )
            {
            // InternalMyDsl.g:849:1: ( 'length' )
            // InternalMyDsl.g:850:2: 'length'
            {
             before(grammarAccess.getFunctionAccess().getLengthKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getLengthKeyword_2_0()); 

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
    // $ANTLR end "rule__Function__Group_2__0__Impl"


    // $ANTLR start "rule__Function__Group_2__1"
    // InternalMyDsl.g:859:1: rule__Function__Group_2__1 : rule__Function__Group_2__1__Impl rule__Function__Group_2__2 ;
    public final void rule__Function__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:863:1: ( rule__Function__Group_2__1__Impl rule__Function__Group_2__2 )
            // InternalMyDsl.g:864:2: rule__Function__Group_2__1__Impl rule__Function__Group_2__2
            {
            pushFollow(FOLLOW_4);
            rule__Function__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_2__2();

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
    // $ANTLR end "rule__Function__Group_2__1"


    // $ANTLR start "rule__Function__Group_2__1__Impl"
    // InternalMyDsl.g:871:1: rule__Function__Group_2__1__Impl : ( '(' ) ;
    public final void rule__Function__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:875:1: ( ( '(' ) )
            // InternalMyDsl.g:876:1: ( '(' )
            {
            // InternalMyDsl.g:876:1: ( '(' )
            // InternalMyDsl.g:877:2: '('
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2_1()); 

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
    // $ANTLR end "rule__Function__Group_2__1__Impl"


    // $ANTLR start "rule__Function__Group_2__2"
    // InternalMyDsl.g:886:1: rule__Function__Group_2__2 : rule__Function__Group_2__2__Impl rule__Function__Group_2__3 ;
    public final void rule__Function__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:890:1: ( rule__Function__Group_2__2__Impl rule__Function__Group_2__3 )
            // InternalMyDsl.g:891:2: rule__Function__Group_2__2__Impl rule__Function__Group_2__3
            {
            pushFollow(FOLLOW_9);
            rule__Function__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_2__3();

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
    // $ANTLR end "rule__Function__Group_2__2"


    // $ANTLR start "rule__Function__Group_2__2__Impl"
    // InternalMyDsl.g:898:1: rule__Function__Group_2__2__Impl : ( ruleComplement ) ;
    public final void rule__Function__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:902:1: ( ( ruleComplement ) )
            // InternalMyDsl.g:903:1: ( ruleComplement )
            {
            // InternalMyDsl.g:903:1: ( ruleComplement )
            // InternalMyDsl.g:904:2: ruleComplement
            {
             before(grammarAccess.getFunctionAccess().getComplementParserRuleCall_2_2()); 
            pushFollow(FOLLOW_2);
            ruleComplement();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getComplementParserRuleCall_2_2()); 

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
    // $ANTLR end "rule__Function__Group_2__2__Impl"


    // $ANTLR start "rule__Function__Group_2__3"
    // InternalMyDsl.g:913:1: rule__Function__Group_2__3 : rule__Function__Group_2__3__Impl ;
    public final void rule__Function__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:917:1: ( rule__Function__Group_2__3__Impl )
            // InternalMyDsl.g:918:2: rule__Function__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_2__3__Impl();

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
    // $ANTLR end "rule__Function__Group_2__3"


    // $ANTLR start "rule__Function__Group_2__3__Impl"
    // InternalMyDsl.g:924:1: rule__Function__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Function__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:928:1: ( ( ')' ) )
            // InternalMyDsl.g:929:1: ( ')' )
            {
            // InternalMyDsl.g:929:1: ( ')' )
            // InternalMyDsl.g:930:2: ')'
            {
             before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_2_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_2_3()); 

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
    // $ANTLR end "rule__Function__Group_2__3__Impl"


    // $ANTLR start "rule__Numbers__Group_0__0"
    // InternalMyDsl.g:940:1: rule__Numbers__Group_0__0 : rule__Numbers__Group_0__0__Impl rule__Numbers__Group_0__1 ;
    public final void rule__Numbers__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:944:1: ( rule__Numbers__Group_0__0__Impl rule__Numbers__Group_0__1 )
            // InternalMyDsl.g:945:2: rule__Numbers__Group_0__0__Impl rule__Numbers__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__Numbers__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Numbers__Group_0__1();

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
    // $ANTLR end "rule__Numbers__Group_0__0"


    // $ANTLR start "rule__Numbers__Group_0__0__Impl"
    // InternalMyDsl.g:952:1: rule__Numbers__Group_0__0__Impl : ( ( rule__Numbers__OneAssignment_0_0 ) ) ;
    public final void rule__Numbers__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:956:1: ( ( ( rule__Numbers__OneAssignment_0_0 ) ) )
            // InternalMyDsl.g:957:1: ( ( rule__Numbers__OneAssignment_0_0 ) )
            {
            // InternalMyDsl.g:957:1: ( ( rule__Numbers__OneAssignment_0_0 ) )
            // InternalMyDsl.g:958:2: ( rule__Numbers__OneAssignment_0_0 )
            {
             before(grammarAccess.getNumbersAccess().getOneAssignment_0_0()); 
            // InternalMyDsl.g:959:2: ( rule__Numbers__OneAssignment_0_0 )
            // InternalMyDsl.g:959:3: rule__Numbers__OneAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Numbers__OneAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getNumbersAccess().getOneAssignment_0_0()); 

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
    // $ANTLR end "rule__Numbers__Group_0__0__Impl"


    // $ANTLR start "rule__Numbers__Group_0__1"
    // InternalMyDsl.g:967:1: rule__Numbers__Group_0__1 : rule__Numbers__Group_0__1__Impl rule__Numbers__Group_0__2 ;
    public final void rule__Numbers__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:971:1: ( rule__Numbers__Group_0__1__Impl rule__Numbers__Group_0__2 )
            // InternalMyDsl.g:972:2: rule__Numbers__Group_0__1__Impl rule__Numbers__Group_0__2
            {
            pushFollow(FOLLOW_6);
            rule__Numbers__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Numbers__Group_0__2();

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
    // $ANTLR end "rule__Numbers__Group_0__1"


    // $ANTLR start "rule__Numbers__Group_0__1__Impl"
    // InternalMyDsl.g:979:1: rule__Numbers__Group_0__1__Impl : ( ',' ) ;
    public final void rule__Numbers__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:983:1: ( ( ',' ) )
            // InternalMyDsl.g:984:1: ( ',' )
            {
            // InternalMyDsl.g:984:1: ( ',' )
            // InternalMyDsl.g:985:2: ','
            {
             before(grammarAccess.getNumbersAccess().getCommaKeyword_0_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getNumbersAccess().getCommaKeyword_0_1()); 

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
    // $ANTLR end "rule__Numbers__Group_0__1__Impl"


    // $ANTLR start "rule__Numbers__Group_0__2"
    // InternalMyDsl.g:994:1: rule__Numbers__Group_0__2 : rule__Numbers__Group_0__2__Impl ;
    public final void rule__Numbers__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:998:1: ( rule__Numbers__Group_0__2__Impl )
            // InternalMyDsl.g:999:2: rule__Numbers__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Numbers__Group_0__2__Impl();

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
    // $ANTLR end "rule__Numbers__Group_0__2"


    // $ANTLR start "rule__Numbers__Group_0__2__Impl"
    // InternalMyDsl.g:1005:1: rule__Numbers__Group_0__2__Impl : ( ( rule__Numbers__NumbAssignment_0_2 ) ) ;
    public final void rule__Numbers__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1009:1: ( ( ( rule__Numbers__NumbAssignment_0_2 ) ) )
            // InternalMyDsl.g:1010:1: ( ( rule__Numbers__NumbAssignment_0_2 ) )
            {
            // InternalMyDsl.g:1010:1: ( ( rule__Numbers__NumbAssignment_0_2 ) )
            // InternalMyDsl.g:1011:2: ( rule__Numbers__NumbAssignment_0_2 )
            {
             before(grammarAccess.getNumbersAccess().getNumbAssignment_0_2()); 
            // InternalMyDsl.g:1012:2: ( rule__Numbers__NumbAssignment_0_2 )
            // InternalMyDsl.g:1012:3: rule__Numbers__NumbAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Numbers__NumbAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getNumbersAccess().getNumbAssignment_0_2()); 

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
    // $ANTLR end "rule__Numbers__Group_0__2__Impl"


    // $ANTLR start "rule__Concat__Group__0"
    // InternalMyDsl.g:1021:1: rule__Concat__Group__0 : rule__Concat__Group__0__Impl rule__Concat__Group__1 ;
    public final void rule__Concat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1025:1: ( rule__Concat__Group__0__Impl rule__Concat__Group__1 )
            // InternalMyDsl.g:1026:2: rule__Concat__Group__0__Impl rule__Concat__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Concat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concat__Group__1();

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
    // $ANTLR end "rule__Concat__Group__0"


    // $ANTLR start "rule__Concat__Group__0__Impl"
    // InternalMyDsl.g:1033:1: rule__Concat__Group__0__Impl : ( '++' ) ;
    public final void rule__Concat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1037:1: ( ( '++' ) )
            // InternalMyDsl.g:1038:1: ( '++' )
            {
            // InternalMyDsl.g:1038:1: ( '++' )
            // InternalMyDsl.g:1039:2: '++'
            {
             before(grammarAccess.getConcatAccess().getPlusSignPlusSignKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getConcatAccess().getPlusSignPlusSignKeyword_0()); 

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
    // $ANTLR end "rule__Concat__Group__0__Impl"


    // $ANTLR start "rule__Concat__Group__1"
    // InternalMyDsl.g:1048:1: rule__Concat__Group__1 : rule__Concat__Group__1__Impl rule__Concat__Group__2 ;
    public final void rule__Concat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1052:1: ( rule__Concat__Group__1__Impl rule__Concat__Group__2 )
            // InternalMyDsl.g:1053:2: rule__Concat__Group__1__Impl rule__Concat__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Concat__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concat__Group__2();

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
    // $ANTLR end "rule__Concat__Group__1"


    // $ANTLR start "rule__Concat__Group__1__Impl"
    // InternalMyDsl.g:1060:1: rule__Concat__Group__1__Impl : ( ( rule__Concat__Alternatives_1 ) ) ;
    public final void rule__Concat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1064:1: ( ( ( rule__Concat__Alternatives_1 ) ) )
            // InternalMyDsl.g:1065:1: ( ( rule__Concat__Alternatives_1 ) )
            {
            // InternalMyDsl.g:1065:1: ( ( rule__Concat__Alternatives_1 ) )
            // InternalMyDsl.g:1066:2: ( rule__Concat__Alternatives_1 )
            {
             before(grammarAccess.getConcatAccess().getAlternatives_1()); 
            // InternalMyDsl.g:1067:2: ( rule__Concat__Alternatives_1 )
            // InternalMyDsl.g:1067:3: rule__Concat__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Concat__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getConcatAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Concat__Group__1__Impl"


    // $ANTLR start "rule__Concat__Group__2"
    // InternalMyDsl.g:1075:1: rule__Concat__Group__2 : rule__Concat__Group__2__Impl ;
    public final void rule__Concat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1079:1: ( rule__Concat__Group__2__Impl )
            // InternalMyDsl.g:1080:2: rule__Concat__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Concat__Group__2__Impl();

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
    // $ANTLR end "rule__Concat__Group__2"


    // $ANTLR start "rule__Concat__Group__2__Impl"
    // InternalMyDsl.g:1086:1: rule__Concat__Group__2__Impl : ( ( rule__Concat__NewAssignment_2 )? ) ;
    public final void rule__Concat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1090:1: ( ( ( rule__Concat__NewAssignment_2 )? ) )
            // InternalMyDsl.g:1091:1: ( ( rule__Concat__NewAssignment_2 )? )
            {
            // InternalMyDsl.g:1091:1: ( ( rule__Concat__NewAssignment_2 )? )
            // InternalMyDsl.g:1092:2: ( rule__Concat__NewAssignment_2 )?
            {
             before(grammarAccess.getConcatAccess().getNewAssignment_2()); 
            // InternalMyDsl.g:1093:2: ( rule__Concat__NewAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1093:3: rule__Concat__NewAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Concat__NewAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConcatAccess().getNewAssignment_2()); 

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
    // $ANTLR end "rule__Concat__Group__2__Impl"


    // $ANTLR start "rule__NewConcat__Group__0"
    // InternalMyDsl.g:1102:1: rule__NewConcat__Group__0 : rule__NewConcat__Group__0__Impl rule__NewConcat__Group__1 ;
    public final void rule__NewConcat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1106:1: ( rule__NewConcat__Group__0__Impl rule__NewConcat__Group__1 )
            // InternalMyDsl.g:1107:2: rule__NewConcat__Group__0__Impl rule__NewConcat__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__NewConcat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewConcat__Group__1();

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
    // $ANTLR end "rule__NewConcat__Group__0"


    // $ANTLR start "rule__NewConcat__Group__0__Impl"
    // InternalMyDsl.g:1114:1: rule__NewConcat__Group__0__Impl : ( '++' ) ;
    public final void rule__NewConcat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1118:1: ( ( '++' ) )
            // InternalMyDsl.g:1119:1: ( '++' )
            {
            // InternalMyDsl.g:1119:1: ( '++' )
            // InternalMyDsl.g:1120:2: '++'
            {
             before(grammarAccess.getNewConcatAccess().getPlusSignPlusSignKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNewConcatAccess().getPlusSignPlusSignKeyword_0()); 

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
    // $ANTLR end "rule__NewConcat__Group__0__Impl"


    // $ANTLR start "rule__NewConcat__Group__1"
    // InternalMyDsl.g:1129:1: rule__NewConcat__Group__1 : rule__NewConcat__Group__1__Impl ;
    public final void rule__NewConcat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1133:1: ( rule__NewConcat__Group__1__Impl )
            // InternalMyDsl.g:1134:2: rule__NewConcat__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewConcat__Group__1__Impl();

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
    // $ANTLR end "rule__NewConcat__Group__1"


    // $ANTLR start "rule__NewConcat__Group__1__Impl"
    // InternalMyDsl.g:1140:1: rule__NewConcat__Group__1__Impl : ( ( rule__NewConcat__HaskellAssignment_1 ) ) ;
    public final void rule__NewConcat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1144:1: ( ( ( rule__NewConcat__HaskellAssignment_1 ) ) )
            // InternalMyDsl.g:1145:1: ( ( rule__NewConcat__HaskellAssignment_1 ) )
            {
            // InternalMyDsl.g:1145:1: ( ( rule__NewConcat__HaskellAssignment_1 ) )
            // InternalMyDsl.g:1146:2: ( rule__NewConcat__HaskellAssignment_1 )
            {
             before(grammarAccess.getNewConcatAccess().getHaskellAssignment_1()); 
            // InternalMyDsl.g:1147:2: ( rule__NewConcat__HaskellAssignment_1 )
            // InternalMyDsl.g:1147:3: rule__NewConcat__HaskellAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NewConcat__HaskellAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNewConcatAccess().getHaskellAssignment_1()); 

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
    // $ANTLR end "rule__NewConcat__Group__1__Impl"


    // $ANTLR start "rule__Element__Group__0"
    // InternalMyDsl.g:1156:1: rule__Element__Group__0 : rule__Element__Group__0__Impl rule__Element__Group__1 ;
    public final void rule__Element__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1160:1: ( rule__Element__Group__0__Impl rule__Element__Group__1 )
            // InternalMyDsl.g:1161:2: rule__Element__Group__0__Impl rule__Element__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Element__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__1();

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
    // $ANTLR end "rule__Element__Group__0"


    // $ANTLR start "rule__Element__Group__0__Impl"
    // InternalMyDsl.g:1168:1: rule__Element__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Element__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1172:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1173:1: ( RULE_INT )
            {
            // InternalMyDsl.g:1173:1: ( RULE_INT )
            // InternalMyDsl.g:1174:2: RULE_INT
            {
             before(grammarAccess.getElementAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Element__Group__0__Impl"


    // $ANTLR start "rule__Element__Group__1"
    // InternalMyDsl.g:1183:1: rule__Element__Group__1 : rule__Element__Group__1__Impl ;
    public final void rule__Element__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1187:1: ( rule__Element__Group__1__Impl )
            // InternalMyDsl.g:1188:2: rule__Element__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group__1__Impl();

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
    // $ANTLR end "rule__Element__Group__1"


    // $ANTLR start "rule__Element__Group__1__Impl"
    // InternalMyDsl.g:1194:1: rule__Element__Group__1__Impl : ( ( rule__Element__Group_1__0 )* ) ;
    public final void rule__Element__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1198:1: ( ( ( rule__Element__Group_1__0 )* ) )
            // InternalMyDsl.g:1199:1: ( ( rule__Element__Group_1__0 )* )
            {
            // InternalMyDsl.g:1199:1: ( ( rule__Element__Group_1__0 )* )
            // InternalMyDsl.g:1200:2: ( rule__Element__Group_1__0 )*
            {
             before(grammarAccess.getElementAccess().getGroup_1()); 
            // InternalMyDsl.g:1201:2: ( rule__Element__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_OP) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1201:3: rule__Element__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Element__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getElementAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Element__Group__1__Impl"


    // $ANTLR start "rule__Element__Group_1__0"
    // InternalMyDsl.g:1210:1: rule__Element__Group_1__0 : rule__Element__Group_1__0__Impl rule__Element__Group_1__1 ;
    public final void rule__Element__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1214:1: ( rule__Element__Group_1__0__Impl rule__Element__Group_1__1 )
            // InternalMyDsl.g:1215:2: rule__Element__Group_1__0__Impl rule__Element__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Element__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group_1__1();

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
    // $ANTLR end "rule__Element__Group_1__0"


    // $ANTLR start "rule__Element__Group_1__0__Impl"
    // InternalMyDsl.g:1222:1: rule__Element__Group_1__0__Impl : ( RULE_OP ) ;
    public final void rule__Element__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1226:1: ( ( RULE_OP ) )
            // InternalMyDsl.g:1227:1: ( RULE_OP )
            {
            // InternalMyDsl.g:1227:1: ( RULE_OP )
            // InternalMyDsl.g:1228:2: RULE_OP
            {
             before(grammarAccess.getElementAccess().getOPTerminalRuleCall_1_0()); 
            match(input,RULE_OP,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getOPTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Element__Group_1__0__Impl"


    // $ANTLR start "rule__Element__Group_1__1"
    // InternalMyDsl.g:1237:1: rule__Element__Group_1__1 : rule__Element__Group_1__1__Impl ;
    public final void rule__Element__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1241:1: ( rule__Element__Group_1__1__Impl )
            // InternalMyDsl.g:1242:2: rule__Element__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group_1__1__Impl();

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
    // $ANTLR end "rule__Element__Group_1__1"


    // $ANTLR start "rule__Element__Group_1__1__Impl"
    // InternalMyDsl.g:1248:1: rule__Element__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Element__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1252:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1253:1: ( RULE_INT )
            {
            // InternalMyDsl.g:1253:1: ( RULE_INT )
            // InternalMyDsl.g:1254:2: RULE_INT
            {
             before(grammarAccess.getElementAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getINTTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__Element__Group_1__1__Impl"


    // $ANTLR start "rule__Model__HaskellAssignment"
    // InternalMyDsl.g:1264:1: rule__Model__HaskellAssignment : ( ruleHaskell ) ;
    public final void rule__Model__HaskellAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1268:1: ( ( ruleHaskell ) )
            // InternalMyDsl.g:1269:2: ( ruleHaskell )
            {
            // InternalMyDsl.g:1269:2: ( ruleHaskell )
            // InternalMyDsl.g:1270:3: ruleHaskell
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
    // InternalMyDsl.g:1279:1: rule__Haskell__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Haskell__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1283:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:1284:2: ( ruleExpression )
            {
            // InternalMyDsl.g:1284:2: ( ruleExpression )
            // InternalMyDsl.g:1285:3: ruleExpression
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


    // $ANTLR start "rule__Expression__ComplementAssignment_0"
    // InternalMyDsl.g:1294:1: rule__Expression__ComplementAssignment_0 : ( ruleComplement ) ;
    public final void rule__Expression__ComplementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1298:1: ( ( ruleComplement ) )
            // InternalMyDsl.g:1299:2: ( ruleComplement )
            {
            // InternalMyDsl.g:1299:2: ( ruleComplement )
            // InternalMyDsl.g:1300:3: ruleComplement
            {
             before(grammarAccess.getExpressionAccess().getComplementComplementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleComplement();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getComplementComplementParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Expression__ComplementAssignment_0"


    // $ANTLR start "rule__Expression__ConcatAssignment_1"
    // InternalMyDsl.g:1309:1: rule__Expression__ConcatAssignment_1 : ( ruleConcat ) ;
    public final void rule__Expression__ConcatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1313:1: ( ( ruleConcat ) )
            // InternalMyDsl.g:1314:2: ( ruleConcat )
            {
            // InternalMyDsl.g:1314:2: ( ruleConcat )
            // InternalMyDsl.g:1315:3: ruleConcat
            {
             before(grammarAccess.getExpressionAccess().getConcatConcatParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConcat();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getConcatConcatParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Expression__ConcatAssignment_1"


    // $ANTLR start "rule__Complement__IdAssignment_0"
    // InternalMyDsl.g:1324:1: rule__Complement__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__Complement__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1328:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1329:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1329:2: ( RULE_ID )
            // InternalMyDsl.g:1330:3: RULE_ID
            {
             before(grammarAccess.getComplementAccess().getIdIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComplementAccess().getIdIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Complement__IdAssignment_0"


    // $ANTLR start "rule__Complement__NumbersAssignment_1_1"
    // InternalMyDsl.g:1339:1: rule__Complement__NumbersAssignment_1_1 : ( ruleNumbers ) ;
    public final void rule__Complement__NumbersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1343:1: ( ( ruleNumbers ) )
            // InternalMyDsl.g:1344:2: ( ruleNumbers )
            {
            // InternalMyDsl.g:1344:2: ( ruleNumbers )
            // InternalMyDsl.g:1345:3: ruleNumbers
            {
             before(grammarAccess.getComplementAccess().getNumbersNumbersParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNumbers();

            state._fsp--;

             after(grammarAccess.getComplementAccess().getNumbersNumbersParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Complement__NumbersAssignment_1_1"


    // $ANTLR start "rule__Complement__FunctionAssignment_2_1"
    // InternalMyDsl.g:1354:1: rule__Complement__FunctionAssignment_2_1 : ( ruleFunction ) ;
    public final void rule__Complement__FunctionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1358:1: ( ( ruleFunction ) )
            // InternalMyDsl.g:1359:2: ( ruleFunction )
            {
            // InternalMyDsl.g:1359:2: ( ruleFunction )
            // InternalMyDsl.g:1360:3: ruleFunction
            {
             before(grammarAccess.getComplementAccess().getFunctionFunctionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getComplementAccess().getFunctionFunctionParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Complement__FunctionAssignment_2_1"


    // $ANTLR start "rule__Function__ElementAssignment_0"
    // InternalMyDsl.g:1369:1: rule__Function__ElementAssignment_0 : ( ruleElement ) ;
    public final void rule__Function__ElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1373:1: ( ( ruleElement ) )
            // InternalMyDsl.g:1374:2: ( ruleElement )
            {
            // InternalMyDsl.g:1374:2: ( ruleElement )
            // InternalMyDsl.g:1375:3: ruleElement
            {
             before(grammarAccess.getFunctionAccess().getElementElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getElementElementParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Function__ElementAssignment_0"


    // $ANTLR start "rule__Function__Numb1Assignment_1_2"
    // InternalMyDsl.g:1384:1: rule__Function__Numb1Assignment_1_2 : ( ruleNumbers ) ;
    public final void rule__Function__Numb1Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1388:1: ( ( ruleNumbers ) )
            // InternalMyDsl.g:1389:2: ( ruleNumbers )
            {
            // InternalMyDsl.g:1389:2: ( ruleNumbers )
            // InternalMyDsl.g:1390:3: ruleNumbers
            {
             before(grammarAccess.getFunctionAccess().getNumb1NumbersParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNumbers();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getNumb1NumbersParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Function__Numb1Assignment_1_2"


    // $ANTLR start "rule__Function__Numb2Assignment_1_5"
    // InternalMyDsl.g:1399:1: rule__Function__Numb2Assignment_1_5 : ( ruleNumbers ) ;
    public final void rule__Function__Numb2Assignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1403:1: ( ( ruleNumbers ) )
            // InternalMyDsl.g:1404:2: ( ruleNumbers )
            {
            // InternalMyDsl.g:1404:2: ( ruleNumbers )
            // InternalMyDsl.g:1405:3: ruleNumbers
            {
             before(grammarAccess.getFunctionAccess().getNumb2NumbersParserRuleCall_1_5_0()); 
            pushFollow(FOLLOW_2);
            ruleNumbers();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getNumb2NumbersParserRuleCall_1_5_0()); 

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
    // $ANTLR end "rule__Function__Numb2Assignment_1_5"


    // $ANTLR start "rule__Numbers__OneAssignment_0_0"
    // InternalMyDsl.g:1414:1: rule__Numbers__OneAssignment_0_0 : ( RULE_INT ) ;
    public final void rule__Numbers__OneAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1418:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1419:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1419:2: ( RULE_INT )
            // InternalMyDsl.g:1420:3: RULE_INT
            {
             before(grammarAccess.getNumbersAccess().getOneINTTerminalRuleCall_0_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumbersAccess().getOneINTTerminalRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Numbers__OneAssignment_0_0"


    // $ANTLR start "rule__Numbers__NumbAssignment_0_2"
    // InternalMyDsl.g:1429:1: rule__Numbers__NumbAssignment_0_2 : ( ruleNumbers ) ;
    public final void rule__Numbers__NumbAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1433:1: ( ( ruleNumbers ) )
            // InternalMyDsl.g:1434:2: ( ruleNumbers )
            {
            // InternalMyDsl.g:1434:2: ( ruleNumbers )
            // InternalMyDsl.g:1435:3: ruleNumbers
            {
             before(grammarAccess.getNumbersAccess().getNumbNumbersParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNumbers();

            state._fsp--;

             after(grammarAccess.getNumbersAccess().getNumbNumbersParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Numbers__NumbAssignment_0_2"


    // $ANTLR start "rule__Numbers__TwoAssignment_1"
    // InternalMyDsl.g:1444:1: rule__Numbers__TwoAssignment_1 : ( RULE_INT ) ;
    public final void rule__Numbers__TwoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1448:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1449:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1449:2: ( RULE_INT )
            // InternalMyDsl.g:1450:3: RULE_INT
            {
             before(grammarAccess.getNumbersAccess().getTwoINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumbersAccess().getTwoINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Numbers__TwoAssignment_1"


    // $ANTLR start "rule__Concat__IdAssignment_1_0"
    // InternalMyDsl.g:1459:1: rule__Concat__IdAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Concat__IdAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1463:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1464:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1464:2: ( RULE_ID )
            // InternalMyDsl.g:1465:3: RULE_ID
            {
             before(grammarAccess.getConcatAccess().getIdIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConcatAccess().getIdIDTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Concat__IdAssignment_1_0"


    // $ANTLR start "rule__Concat__OpAssignment_1_1"
    // InternalMyDsl.g:1474:1: rule__Concat__OpAssignment_1_1 : ( RULE_OP ) ;
    public final void rule__Concat__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1478:1: ( ( RULE_OP ) )
            // InternalMyDsl.g:1479:2: ( RULE_OP )
            {
            // InternalMyDsl.g:1479:2: ( RULE_OP )
            // InternalMyDsl.g:1480:3: RULE_OP
            {
             before(grammarAccess.getConcatAccess().getOpOPTerminalRuleCall_1_1_0()); 
            match(input,RULE_OP,FOLLOW_2); 
             after(grammarAccess.getConcatAccess().getOpOPTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Concat__OpAssignment_1_1"


    // $ANTLR start "rule__Concat__NewAssignment_2"
    // InternalMyDsl.g:1489:1: rule__Concat__NewAssignment_2 : ( ruleNewConcat ) ;
    public final void rule__Concat__NewAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1493:1: ( ( ruleNewConcat ) )
            // InternalMyDsl.g:1494:2: ( ruleNewConcat )
            {
            // InternalMyDsl.g:1494:2: ( ruleNewConcat )
            // InternalMyDsl.g:1495:3: ruleNewConcat
            {
             before(grammarAccess.getConcatAccess().getNewNewConcatParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNewConcat();

            state._fsp--;

             after(grammarAccess.getConcatAccess().getNewNewConcatParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Concat__NewAssignment_2"


    // $ANTLR start "rule__NewConcat__HaskellAssignment_1"
    // InternalMyDsl.g:1504:1: rule__NewConcat__HaskellAssignment_1 : ( ruleHaskell ) ;
    public final void rule__NewConcat__HaskellAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1508:1: ( ( ruleHaskell ) )
            // InternalMyDsl.g:1509:2: ( ruleHaskell )
            {
            // InternalMyDsl.g:1509:2: ( ruleHaskell )
            // InternalMyDsl.g:1510:3: ruleHaskell
            {
             before(grammarAccess.getNewConcatAccess().getHaskellHaskellParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHaskell();

            state._fsp--;

             after(grammarAccess.getNewConcatAccess().getHaskellHaskellParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__NewConcat__HaskellAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000022L});

}