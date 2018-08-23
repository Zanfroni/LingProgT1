package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_OP", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'show'", "'['", "']'", "'('", "')'", "'zip'", "'length'", "','", "'++'"
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
    public static final int RULE_OP=6;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=5;
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_haskell_0_0= ruleHaskell ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_haskell_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_haskell_0_0= ruleHaskell ) )* )
            // InternalMyDsl.g:78:2: ( (lv_haskell_0_0= ruleHaskell ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_haskell_0_0= ruleHaskell ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_haskell_0_0= ruleHaskell )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_haskell_0_0= ruleHaskell )
            	    // InternalMyDsl.g:80:4: lv_haskell_0_0= ruleHaskell
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getHaskellHaskellParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_haskell_0_0=ruleHaskell();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"haskell",
            	    					lv_haskell_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.Haskell");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleHaskell"
    // InternalMyDsl.g:100:1: entryRuleHaskell returns [EObject current=null] : iv_ruleHaskell= ruleHaskell EOF ;
    public final EObject entryRuleHaskell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHaskell = null;


        try {
            // InternalMyDsl.g:100:48: (iv_ruleHaskell= ruleHaskell EOF )
            // InternalMyDsl.g:101:2: iv_ruleHaskell= ruleHaskell EOF
            {
             newCompositeNode(grammarAccess.getHaskellRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHaskell=ruleHaskell();

            state._fsp--;

             current =iv_ruleHaskell; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHaskell"


    // $ANTLR start "ruleHaskell"
    // InternalMyDsl.g:107:1: ruleHaskell returns [EObject current=null] : (otherlv_0= 'show' ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleHaskell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (otherlv_0= 'show' ( (lv_expression_1_0= ruleExpression ) ) ) )
            // InternalMyDsl.g:114:2: (otherlv_0= 'show' ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // InternalMyDsl.g:114:2: (otherlv_0= 'show' ( (lv_expression_1_0= ruleExpression ) ) )
            // InternalMyDsl.g:115:3: otherlv_0= 'show' ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getHaskellAccess().getShowKeyword_0());
            		
            // InternalMyDsl.g:119:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalMyDsl.g:120:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalMyDsl.g:120:4: (lv_expression_1_0= ruleExpression )
            // InternalMyDsl.g:121:5: lv_expression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getHaskellAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHaskellRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleHaskell"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:142:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:142:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:143:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:149:1: ruleExpression returns [EObject current=null] : ( ( (lv_complement_0_0= ruleComplement ) ) ( (lv_concat_1_0= ruleConcat ) )? ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_complement_0_0 = null;

        EObject lv_concat_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:155:2: ( ( ( (lv_complement_0_0= ruleComplement ) ) ( (lv_concat_1_0= ruleConcat ) )? ) )
            // InternalMyDsl.g:156:2: ( ( (lv_complement_0_0= ruleComplement ) ) ( (lv_concat_1_0= ruleConcat ) )? )
            {
            // InternalMyDsl.g:156:2: ( ( (lv_complement_0_0= ruleComplement ) ) ( (lv_concat_1_0= ruleConcat ) )? )
            // InternalMyDsl.g:157:3: ( (lv_complement_0_0= ruleComplement ) ) ( (lv_concat_1_0= ruleConcat ) )?
            {
            // InternalMyDsl.g:157:3: ( (lv_complement_0_0= ruleComplement ) )
            // InternalMyDsl.g:158:4: (lv_complement_0_0= ruleComplement )
            {
            // InternalMyDsl.g:158:4: (lv_complement_0_0= ruleComplement )
            // InternalMyDsl.g:159:5: lv_complement_0_0= ruleComplement
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getComplementComplementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_complement_0_0=ruleComplement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					set(
            						current,
            						"complement",
            						lv_complement_0_0,
            						"org.xtext.example.mydsl.MyDsl.Complement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:176:3: ( (lv_concat_1_0= ruleConcat ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:177:4: (lv_concat_1_0= ruleConcat )
                    {
                    // InternalMyDsl.g:177:4: (lv_concat_1_0= ruleConcat )
                    // InternalMyDsl.g:178:5: lv_concat_1_0= ruleConcat
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getConcatConcatParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_concat_1_0=ruleConcat();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"concat",
                    						lv_concat_1_0,
                    						"org.xtext.example.mydsl.MyDsl.Concat");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleComplement"
    // InternalMyDsl.g:199:1: entryRuleComplement returns [EObject current=null] : iv_ruleComplement= ruleComplement EOF ;
    public final EObject entryRuleComplement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplement = null;


        try {
            // InternalMyDsl.g:199:51: (iv_ruleComplement= ruleComplement EOF )
            // InternalMyDsl.g:200:2: iv_ruleComplement= ruleComplement EOF
            {
             newCompositeNode(grammarAccess.getComplementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplement=ruleComplement();

            state._fsp--;

             current =iv_ruleComplement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComplement"


    // $ANTLR start "ruleComplement"
    // InternalMyDsl.g:206:1: ruleComplement returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) | (otherlv_1= '[' ( (lv_numbers_2_0= ruleNumbers ) ) otherlv_3= ']' ) | (otherlv_4= '(' ( (lv_function_5_0= ruleFunction ) ) otherlv_6= ')' ) ) ;
    public final EObject ruleComplement() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_numbers_2_0 = null;

        EObject lv_function_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:212:2: ( ( ( (lv_id_0_0= RULE_ID ) ) | (otherlv_1= '[' ( (lv_numbers_2_0= ruleNumbers ) ) otherlv_3= ']' ) | (otherlv_4= '(' ( (lv_function_5_0= ruleFunction ) ) otherlv_6= ')' ) ) )
            // InternalMyDsl.g:213:2: ( ( (lv_id_0_0= RULE_ID ) ) | (otherlv_1= '[' ( (lv_numbers_2_0= ruleNumbers ) ) otherlv_3= ']' ) | (otherlv_4= '(' ( (lv_function_5_0= ruleFunction ) ) otherlv_6= ')' ) )
            {
            // InternalMyDsl.g:213:2: ( ( (lv_id_0_0= RULE_ID ) ) | (otherlv_1= '[' ( (lv_numbers_2_0= ruleNumbers ) ) otherlv_3= ']' ) | (otherlv_4= '(' ( (lv_function_5_0= ruleFunction ) ) otherlv_6= ')' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 15:
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
                    // InternalMyDsl.g:214:3: ( (lv_id_0_0= RULE_ID ) )
                    {
                    // InternalMyDsl.g:214:3: ( (lv_id_0_0= RULE_ID ) )
                    // InternalMyDsl.g:215:4: (lv_id_0_0= RULE_ID )
                    {
                    // InternalMyDsl.g:215:4: (lv_id_0_0= RULE_ID )
                    // InternalMyDsl.g:216:5: lv_id_0_0= RULE_ID
                    {
                    lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_id_0_0, grammarAccess.getComplementAccess().getIdIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComplementRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"id",
                    						lv_id_0_0,
                    						"org.xtext.example.mydsl.MyDsl.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:233:3: (otherlv_1= '[' ( (lv_numbers_2_0= ruleNumbers ) ) otherlv_3= ']' )
                    {
                    // InternalMyDsl.g:233:3: (otherlv_1= '[' ( (lv_numbers_2_0= ruleNumbers ) ) otherlv_3= ']' )
                    // InternalMyDsl.g:234:4: otherlv_1= '[' ( (lv_numbers_2_0= ruleNumbers ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getComplementAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalMyDsl.g:238:4: ( (lv_numbers_2_0= ruleNumbers ) )
                    // InternalMyDsl.g:239:5: (lv_numbers_2_0= ruleNumbers )
                    {
                    // InternalMyDsl.g:239:5: (lv_numbers_2_0= ruleNumbers )
                    // InternalMyDsl.g:240:6: lv_numbers_2_0= ruleNumbers
                    {

                    						newCompositeNode(grammarAccess.getComplementAccess().getNumbersNumbersParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_numbers_2_0=ruleNumbers();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplementRule());
                    						}
                    						set(
                    							current,
                    							"numbers",
                    							lv_numbers_2_0,
                    							"org.xtext.example.mydsl.MyDsl.Numbers");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getComplementAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:263:3: (otherlv_4= '(' ( (lv_function_5_0= ruleFunction ) ) otherlv_6= ')' )
                    {
                    // InternalMyDsl.g:263:3: (otherlv_4= '(' ( (lv_function_5_0= ruleFunction ) ) otherlv_6= ')' )
                    // InternalMyDsl.g:264:4: otherlv_4= '(' ( (lv_function_5_0= ruleFunction ) ) otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getComplementAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalMyDsl.g:268:4: ( (lv_function_5_0= ruleFunction ) )
                    // InternalMyDsl.g:269:5: (lv_function_5_0= ruleFunction )
                    {
                    // InternalMyDsl.g:269:5: (lv_function_5_0= ruleFunction )
                    // InternalMyDsl.g:270:6: lv_function_5_0= ruleFunction
                    {

                    						newCompositeNode(grammarAccess.getComplementAccess().getFunctionFunctionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_function_5_0=ruleFunction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplementRule());
                    						}
                    						set(
                    							current,
                    							"function",
                    							lv_function_5_0,
                    							"org.xtext.example.mydsl.MyDsl.Function");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getComplementAccess().getRightParenthesisKeyword_2_2());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleComplement"


    // $ANTLR start "entryRuleFunction"
    // InternalMyDsl.g:296:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalMyDsl.g:296:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalMyDsl.g:297:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalMyDsl.g:303:1: ruleFunction returns [EObject current=null] : ( ( (lv_element_0_0= ruleElement ) ) | (otherlv_1= 'zip' otherlv_2= '[' ( (lv_numb1_3_0= ruleNumbers ) ) otherlv_4= ']' otherlv_5= '[' ( (lv_numb2_6_0= ruleNumbers ) ) otherlv_7= ']' ) | (otherlv_8= 'length' otherlv_9= '(' this_Complement_10= ruleComplement otherlv_11= ')' ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_element_0_0 = null;

        EObject lv_numb1_3_0 = null;

        EObject lv_numb2_6_0 = null;

        EObject this_Complement_10 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:309:2: ( ( ( (lv_element_0_0= ruleElement ) ) | (otherlv_1= 'zip' otherlv_2= '[' ( (lv_numb1_3_0= ruleNumbers ) ) otherlv_4= ']' otherlv_5= '[' ( (lv_numb2_6_0= ruleNumbers ) ) otherlv_7= ']' ) | (otherlv_8= 'length' otherlv_9= '(' this_Complement_10= ruleComplement otherlv_11= ')' ) ) )
            // InternalMyDsl.g:310:2: ( ( (lv_element_0_0= ruleElement ) ) | (otherlv_1= 'zip' otherlv_2= '[' ( (lv_numb1_3_0= ruleNumbers ) ) otherlv_4= ']' otherlv_5= '[' ( (lv_numb2_6_0= ruleNumbers ) ) otherlv_7= ']' ) | (otherlv_8= 'length' otherlv_9= '(' this_Complement_10= ruleComplement otherlv_11= ')' ) )
            {
            // InternalMyDsl.g:310:2: ( ( (lv_element_0_0= ruleElement ) ) | (otherlv_1= 'zip' otherlv_2= '[' ( (lv_numb1_3_0= ruleNumbers ) ) otherlv_4= ']' otherlv_5= '[' ( (lv_numb2_6_0= ruleNumbers ) ) otherlv_7= ']' ) | (otherlv_8= 'length' otherlv_9= '(' this_Complement_10= ruleComplement otherlv_11= ')' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:311:3: ( (lv_element_0_0= ruleElement ) )
                    {
                    // InternalMyDsl.g:311:3: ( (lv_element_0_0= ruleElement ) )
                    // InternalMyDsl.g:312:4: (lv_element_0_0= ruleElement )
                    {
                    // InternalMyDsl.g:312:4: (lv_element_0_0= ruleElement )
                    // InternalMyDsl.g:313:5: lv_element_0_0= ruleElement
                    {

                    					newCompositeNode(grammarAccess.getFunctionAccess().getElementElementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_element_0_0=ruleElement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionRule());
                    					}
                    					set(
                    						current,
                    						"element",
                    						lv_element_0_0,
                    						"org.xtext.example.mydsl.MyDsl.Element");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:331:3: (otherlv_1= 'zip' otherlv_2= '[' ( (lv_numb1_3_0= ruleNumbers ) ) otherlv_4= ']' otherlv_5= '[' ( (lv_numb2_6_0= ruleNumbers ) ) otherlv_7= ']' )
                    {
                    // InternalMyDsl.g:331:3: (otherlv_1= 'zip' otherlv_2= '[' ( (lv_numb1_3_0= ruleNumbers ) ) otherlv_4= ']' otherlv_5= '[' ( (lv_numb2_6_0= ruleNumbers ) ) otherlv_7= ']' )
                    // InternalMyDsl.g:332:4: otherlv_1= 'zip' otherlv_2= '[' ( (lv_numb1_3_0= ruleNumbers ) ) otherlv_4= ']' otherlv_5= '[' ( (lv_numb2_6_0= ruleNumbers ) ) otherlv_7= ']'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getZipKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftSquareBracketKeyword_1_1());
                    			
                    // InternalMyDsl.g:340:4: ( (lv_numb1_3_0= ruleNumbers ) )
                    // InternalMyDsl.g:341:5: (lv_numb1_3_0= ruleNumbers )
                    {
                    // InternalMyDsl.g:341:5: (lv_numb1_3_0= ruleNumbers )
                    // InternalMyDsl.g:342:6: lv_numb1_3_0= ruleNumbers
                    {

                    						newCompositeNode(grammarAccess.getFunctionAccess().getNumb1NumbersParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_numb1_3_0=ruleNumbers();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionRule());
                    						}
                    						set(
                    							current,
                    							"numb1",
                    							lv_numb1_3_0,
                    							"org.xtext.example.mydsl.MyDsl.Numbers");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getRightSquareBracketKeyword_1_3());
                    			
                    otherlv_5=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getLeftSquareBracketKeyword_1_4());
                    			
                    // InternalMyDsl.g:367:4: ( (lv_numb2_6_0= ruleNumbers ) )
                    // InternalMyDsl.g:368:5: (lv_numb2_6_0= ruleNumbers )
                    {
                    // InternalMyDsl.g:368:5: (lv_numb2_6_0= ruleNumbers )
                    // InternalMyDsl.g:369:6: lv_numb2_6_0= ruleNumbers
                    {

                    						newCompositeNode(grammarAccess.getFunctionAccess().getNumb2NumbersParserRuleCall_1_5_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_numb2_6_0=ruleNumbers();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionRule());
                    						}
                    						set(
                    							current,
                    							"numb2",
                    							lv_numb2_6_0,
                    							"org.xtext.example.mydsl.MyDsl.Numbers");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getRightSquareBracketKeyword_1_6());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:392:3: (otherlv_8= 'length' otherlv_9= '(' this_Complement_10= ruleComplement otherlv_11= ')' )
                    {
                    // InternalMyDsl.g:392:3: (otherlv_8= 'length' otherlv_9= '(' this_Complement_10= ruleComplement otherlv_11= ')' )
                    // InternalMyDsl.g:393:4: otherlv_8= 'length' otherlv_9= '(' this_Complement_10= ruleComplement otherlv_11= ')'
                    {
                    otherlv_8=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getFunctionAccess().getLengthKeyword_2_0());
                    			
                    otherlv_9=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2_1());
                    			

                    				newCompositeNode(grammarAccess.getFunctionAccess().getComplementParserRuleCall_2_2());
                    			
                    pushFollow(FOLLOW_9);
                    this_Complement_10=ruleComplement();

                    state._fsp--;


                    				current = this_Complement_10;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_11=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_2_3());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleNumbers"
    // InternalMyDsl.g:418:1: entryRuleNumbers returns [EObject current=null] : iv_ruleNumbers= ruleNumbers EOF ;
    public final EObject entryRuleNumbers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumbers = null;


        try {
            // InternalMyDsl.g:418:48: (iv_ruleNumbers= ruleNumbers EOF )
            // InternalMyDsl.g:419:2: iv_ruleNumbers= ruleNumbers EOF
            {
             newCompositeNode(grammarAccess.getNumbersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumbers=ruleNumbers();

            state._fsp--;

             current =iv_ruleNumbers; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumbers"


    // $ANTLR start "ruleNumbers"
    // InternalMyDsl.g:425:1: ruleNumbers returns [EObject current=null] : ( ( ( (lv_one_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_numb_2_0= ruleNumbers ) ) ) | ( (lv_two_3_0= RULE_INT ) ) ) ;
    public final EObject ruleNumbers() throws RecognitionException {
        EObject current = null;

        Token lv_one_0_0=null;
        Token otherlv_1=null;
        Token lv_two_3_0=null;
        EObject lv_numb_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:431:2: ( ( ( ( (lv_one_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_numb_2_0= ruleNumbers ) ) ) | ( (lv_two_3_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:432:2: ( ( ( (lv_one_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_numb_2_0= ruleNumbers ) ) ) | ( (lv_two_3_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:432:2: ( ( ( (lv_one_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_numb_2_0= ruleNumbers ) ) ) | ( (lv_two_3_0= RULE_INT ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==19) ) {
                    alt5=1;
                }
                else if ( (LA5_1==EOF||LA5_1==14) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:433:3: ( ( (lv_one_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_numb_2_0= ruleNumbers ) ) )
                    {
                    // InternalMyDsl.g:433:3: ( ( (lv_one_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_numb_2_0= ruleNumbers ) ) )
                    // InternalMyDsl.g:434:4: ( (lv_one_0_0= RULE_INT ) ) otherlv_1= ',' ( (lv_numb_2_0= ruleNumbers ) )
                    {
                    // InternalMyDsl.g:434:4: ( (lv_one_0_0= RULE_INT ) )
                    // InternalMyDsl.g:435:5: (lv_one_0_0= RULE_INT )
                    {
                    // InternalMyDsl.g:435:5: (lv_one_0_0= RULE_INT )
                    // InternalMyDsl.g:436:6: lv_one_0_0= RULE_INT
                    {
                    lv_one_0_0=(Token)match(input,RULE_INT,FOLLOW_12); 

                    						newLeafNode(lv_one_0_0, grammarAccess.getNumbersAccess().getOneINTTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNumbersRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"one",
                    							lv_one_0_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getNumbersAccess().getCommaKeyword_0_1());
                    			
                    // InternalMyDsl.g:456:4: ( (lv_numb_2_0= ruleNumbers ) )
                    // InternalMyDsl.g:457:5: (lv_numb_2_0= ruleNumbers )
                    {
                    // InternalMyDsl.g:457:5: (lv_numb_2_0= ruleNumbers )
                    // InternalMyDsl.g:458:6: lv_numb_2_0= ruleNumbers
                    {

                    						newCompositeNode(grammarAccess.getNumbersAccess().getNumbNumbersParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_numb_2_0=ruleNumbers();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNumbersRule());
                    						}
                    						set(
                    							current,
                    							"numb",
                    							lv_numb_2_0,
                    							"org.xtext.example.mydsl.MyDsl.Numbers");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:477:3: ( (lv_two_3_0= RULE_INT ) )
                    {
                    // InternalMyDsl.g:477:3: ( (lv_two_3_0= RULE_INT ) )
                    // InternalMyDsl.g:478:4: (lv_two_3_0= RULE_INT )
                    {
                    // InternalMyDsl.g:478:4: (lv_two_3_0= RULE_INT )
                    // InternalMyDsl.g:479:5: lv_two_3_0= RULE_INT
                    {
                    lv_two_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_two_3_0, grammarAccess.getNumbersAccess().getTwoINTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNumbersRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"two",
                    						lv_two_3_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleNumbers"


    // $ANTLR start "entryRuleConcat"
    // InternalMyDsl.g:499:1: entryRuleConcat returns [EObject current=null] : iv_ruleConcat= ruleConcat EOF ;
    public final EObject entryRuleConcat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcat = null;


        try {
            // InternalMyDsl.g:499:47: (iv_ruleConcat= ruleConcat EOF )
            // InternalMyDsl.g:500:2: iv_ruleConcat= ruleConcat EOF
            {
             newCompositeNode(grammarAccess.getConcatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcat=ruleConcat();

            state._fsp--;

             current =iv_ruleConcat; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConcat"


    // $ANTLR start "ruleConcat"
    // InternalMyDsl.g:506:1: ruleConcat returns [EObject current=null] : (otherlv_0= '++' ( ( (lv_id_1_0= RULE_ID ) ) | ( (lv_op_2_0= RULE_OP ) ) ) ( (lv_new_3_0= ruleNewConcat ) )? ) ;
    public final EObject ruleConcat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token lv_op_2_0=null;
        EObject lv_new_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:512:2: ( (otherlv_0= '++' ( ( (lv_id_1_0= RULE_ID ) ) | ( (lv_op_2_0= RULE_OP ) ) ) ( (lv_new_3_0= ruleNewConcat ) )? ) )
            // InternalMyDsl.g:513:2: (otherlv_0= '++' ( ( (lv_id_1_0= RULE_ID ) ) | ( (lv_op_2_0= RULE_OP ) ) ) ( (lv_new_3_0= ruleNewConcat ) )? )
            {
            // InternalMyDsl.g:513:2: (otherlv_0= '++' ( ( (lv_id_1_0= RULE_ID ) ) | ( (lv_op_2_0= RULE_OP ) ) ) ( (lv_new_3_0= ruleNewConcat ) )? )
            // InternalMyDsl.g:514:3: otherlv_0= '++' ( ( (lv_id_1_0= RULE_ID ) ) | ( (lv_op_2_0= RULE_OP ) ) ) ( (lv_new_3_0= ruleNewConcat ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getConcatAccess().getPlusSignPlusSignKeyword_0());
            		
            // InternalMyDsl.g:518:3: ( ( (lv_id_1_0= RULE_ID ) ) | ( (lv_op_2_0= RULE_OP ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_OP) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:519:4: ( (lv_id_1_0= RULE_ID ) )
                    {
                    // InternalMyDsl.g:519:4: ( (lv_id_1_0= RULE_ID ) )
                    // InternalMyDsl.g:520:5: (lv_id_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:520:5: (lv_id_1_0= RULE_ID )
                    // InternalMyDsl.g:521:6: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(lv_id_1_0, grammarAccess.getConcatAccess().getIdIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConcatRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"id",
                    							lv_id_1_0,
                    							"org.xtext.example.mydsl.MyDsl.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:538:4: ( (lv_op_2_0= RULE_OP ) )
                    {
                    // InternalMyDsl.g:538:4: ( (lv_op_2_0= RULE_OP ) )
                    // InternalMyDsl.g:539:5: (lv_op_2_0= RULE_OP )
                    {
                    // InternalMyDsl.g:539:5: (lv_op_2_0= RULE_OP )
                    // InternalMyDsl.g:540:6: lv_op_2_0= RULE_OP
                    {
                    lv_op_2_0=(Token)match(input,RULE_OP,FOLLOW_5); 

                    						newLeafNode(lv_op_2_0, grammarAccess.getConcatAccess().getOpOPTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConcatRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"op",
                    							lv_op_2_0,
                    							"org.xtext.example.mydsl.MyDsl.OP");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:557:3: ( (lv_new_3_0= ruleNewConcat ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:558:4: (lv_new_3_0= ruleNewConcat )
                    {
                    // InternalMyDsl.g:558:4: (lv_new_3_0= ruleNewConcat )
                    // InternalMyDsl.g:559:5: lv_new_3_0= ruleNewConcat
                    {

                    					newCompositeNode(grammarAccess.getConcatAccess().getNewNewConcatParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_new_3_0=ruleNewConcat();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConcatRule());
                    					}
                    					set(
                    						current,
                    						"new",
                    						lv_new_3_0,
                    						"org.xtext.example.mydsl.MyDsl.NewConcat");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleConcat"


    // $ANTLR start "entryRuleNewConcat"
    // InternalMyDsl.g:580:1: entryRuleNewConcat returns [EObject current=null] : iv_ruleNewConcat= ruleNewConcat EOF ;
    public final EObject entryRuleNewConcat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewConcat = null;


        try {
            // InternalMyDsl.g:580:50: (iv_ruleNewConcat= ruleNewConcat EOF )
            // InternalMyDsl.g:581:2: iv_ruleNewConcat= ruleNewConcat EOF
            {
             newCompositeNode(grammarAccess.getNewConcatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNewConcat=ruleNewConcat();

            state._fsp--;

             current =iv_ruleNewConcat; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNewConcat"


    // $ANTLR start "ruleNewConcat"
    // InternalMyDsl.g:587:1: ruleNewConcat returns [EObject current=null] : (otherlv_0= '++' ( (lv_haskell_1_0= ruleHaskell ) ) ) ;
    public final EObject ruleNewConcat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_haskell_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:593:2: ( (otherlv_0= '++' ( (lv_haskell_1_0= ruleHaskell ) ) ) )
            // InternalMyDsl.g:594:2: (otherlv_0= '++' ( (lv_haskell_1_0= ruleHaskell ) ) )
            {
            // InternalMyDsl.g:594:2: (otherlv_0= '++' ( (lv_haskell_1_0= ruleHaskell ) ) )
            // InternalMyDsl.g:595:3: otherlv_0= '++' ( (lv_haskell_1_0= ruleHaskell ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getNewConcatAccess().getPlusSignPlusSignKeyword_0());
            		
            // InternalMyDsl.g:599:3: ( (lv_haskell_1_0= ruleHaskell ) )
            // InternalMyDsl.g:600:4: (lv_haskell_1_0= ruleHaskell )
            {
            // InternalMyDsl.g:600:4: (lv_haskell_1_0= ruleHaskell )
            // InternalMyDsl.g:601:5: lv_haskell_1_0= ruleHaskell
            {

            					newCompositeNode(grammarAccess.getNewConcatAccess().getHaskellHaskellParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_haskell_1_0=ruleHaskell();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNewConcatRule());
            					}
            					set(
            						current,
            						"haskell",
            						lv_haskell_1_0,
            						"org.xtext.example.mydsl.MyDsl.Haskell");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleNewConcat"


    // $ANTLR start "entryRuleElement"
    // InternalMyDsl.g:622:1: entryRuleElement returns [String current=null] : iv_ruleElement= ruleElement EOF ;
    public final String entryRuleElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleElement = null;


        try {
            // InternalMyDsl.g:622:47: (iv_ruleElement= ruleElement EOF )
            // InternalMyDsl.g:623:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalMyDsl.g:629:1: ruleElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (this_OP_1= RULE_OP this_INT_2= RULE_INT )* ) ;
    public final AntlrDatatypeRuleToken ruleElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_OP_1=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:635:2: ( (this_INT_0= RULE_INT (this_OP_1= RULE_OP this_INT_2= RULE_INT )* ) )
            // InternalMyDsl.g:636:2: (this_INT_0= RULE_INT (this_OP_1= RULE_OP this_INT_2= RULE_INT )* )
            {
            // InternalMyDsl.g:636:2: (this_INT_0= RULE_INT (this_OP_1= RULE_OP this_INT_2= RULE_INT )* )
            // InternalMyDsl.g:637:3: this_INT_0= RULE_INT (this_OP_1= RULE_OP this_INT_2= RULE_INT )*
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getElementAccess().getINTTerminalRuleCall_0());
            		
            // InternalMyDsl.g:644:3: (this_OP_1= RULE_OP this_INT_2= RULE_INT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_OP) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:645:4: this_OP_1= RULE_OP this_INT_2= RULE_INT
            	    {
            	    this_OP_1=(Token)match(input,RULE_OP,FOLLOW_6); 

            	    				current.merge(this_OP_1);
            	    			

            	    				newLeafNode(this_OP_1, grammarAccess.getElementAccess().getOPTerminalRuleCall_1_0());
            	    			
            	    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_15); 

            	    				current.merge(this_INT_2);
            	    			

            	    				newLeafNode(this_INT_2, grammarAccess.getElementAccess().getINTTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
                }
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
    // $ANTLR end "ruleElement"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000042L});

}