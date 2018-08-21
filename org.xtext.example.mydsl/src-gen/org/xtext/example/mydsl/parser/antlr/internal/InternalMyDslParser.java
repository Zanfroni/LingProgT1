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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INSIDE2", "RULE_INTEGER", "RULE_CONTENT", "RULE_ADD2", "RULE_PRINT", "RULE_ANY_OTHER", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'show'", "'['", "']'", "'('", "')'", "'(zip'"
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
    public static final int RULE_INSIDE2=4;
    public static final int RULE_ANY_OTHER=9;
    public static final int RULE_INT=11;
    public static final int RULE_ML_COMMENT=13;
    public static final int RULE_INTEGER=5;
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

                if ( (LA1_0==16) ) {
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
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

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
    // InternalMyDsl.g:149:1: ruleExpression returns [EObject current=null] : ( ( (lv_zip_0_0= ruleZIP ) ) | (otherlv_1= '[' ( (lv_op_2_0= ruleOP ) ) otherlv_3= ']' ) | (otherlv_4= '(' ( (lv_tab_5_0= ruleTAB ) ) otherlv_6= ')' ) | ( (lv_n_7_0= ruleN ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_zip_0_0 = null;

        EObject lv_op_2_0 = null;

        EObject lv_tab_5_0 = null;

        EObject lv_n_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:155:2: ( ( ( (lv_zip_0_0= ruleZIP ) ) | (otherlv_1= '[' ( (lv_op_2_0= ruleOP ) ) otherlv_3= ']' ) | (otherlv_4= '(' ( (lv_tab_5_0= ruleTAB ) ) otherlv_6= ')' ) | ( (lv_n_7_0= ruleN ) ) ) )
            // InternalMyDsl.g:156:2: ( ( (lv_zip_0_0= ruleZIP ) ) | (otherlv_1= '[' ( (lv_op_2_0= ruleOP ) ) otherlv_3= ']' ) | (otherlv_4= '(' ( (lv_tab_5_0= ruleTAB ) ) otherlv_6= ')' ) | ( (lv_n_7_0= ruleN ) ) )
            {
            // InternalMyDsl.g:156:2: ( ( (lv_zip_0_0= ruleZIP ) ) | (otherlv_1= '[' ( (lv_op_2_0= ruleOP ) ) otherlv_3= ']' ) | (otherlv_4= '(' ( (lv_tab_5_0= ruleTAB ) ) otherlv_6= ')' ) | ( (lv_n_7_0= ruleN ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 19:
                {
                alt2=3;
                }
                break;
            case RULE_INTEGER:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:157:3: ( (lv_zip_0_0= ruleZIP ) )
                    {
                    // InternalMyDsl.g:157:3: ( (lv_zip_0_0= ruleZIP ) )
                    // InternalMyDsl.g:158:4: (lv_zip_0_0= ruleZIP )
                    {
                    // InternalMyDsl.g:158:4: (lv_zip_0_0= ruleZIP )
                    // InternalMyDsl.g:159:5: lv_zip_0_0= ruleZIP
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getZipZIPParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_zip_0_0=ruleZIP();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"zip",
                    						lv_zip_0_0,
                    						"org.xtext.example.mydsl.MyDsl.ZIP");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:177:3: (otherlv_1= '[' ( (lv_op_2_0= ruleOP ) ) otherlv_3= ']' )
                    {
                    // InternalMyDsl.g:177:3: (otherlv_1= '[' ( (lv_op_2_0= ruleOP ) ) otherlv_3= ']' )
                    // InternalMyDsl.g:178:4: otherlv_1= '[' ( (lv_op_2_0= ruleOP ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getExpressionAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalMyDsl.g:182:4: ( (lv_op_2_0= ruleOP ) )
                    // InternalMyDsl.g:183:5: (lv_op_2_0= ruleOP )
                    {
                    // InternalMyDsl.g:183:5: (lv_op_2_0= ruleOP )
                    // InternalMyDsl.g:184:6: lv_op_2_0= ruleOP
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getOpOPParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_op_2_0=ruleOP();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_2_0,
                    							"org.xtext.example.mydsl.MyDsl.OP");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:207:3: (otherlv_4= '(' ( (lv_tab_5_0= ruleTAB ) ) otherlv_6= ')' )
                    {
                    // InternalMyDsl.g:207:3: (otherlv_4= '(' ( (lv_tab_5_0= ruleTAB ) ) otherlv_6= ')' )
                    // InternalMyDsl.g:208:4: otherlv_4= '(' ( (lv_tab_5_0= ruleTAB ) ) otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getExpressionAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalMyDsl.g:212:4: ( (lv_tab_5_0= ruleTAB ) )
                    // InternalMyDsl.g:213:5: (lv_tab_5_0= ruleTAB )
                    {
                    // InternalMyDsl.g:213:5: (lv_tab_5_0= ruleTAB )
                    // InternalMyDsl.g:214:6: lv_tab_5_0= ruleTAB
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getTabTABParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_tab_5_0=ruleTAB();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"tab",
                    							lv_tab_5_0,
                    							"org.xtext.example.mydsl.MyDsl.TAB");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_2_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:237:3: ( (lv_n_7_0= ruleN ) )
                    {
                    // InternalMyDsl.g:237:3: ( (lv_n_7_0= ruleN ) )
                    // InternalMyDsl.g:238:4: (lv_n_7_0= ruleN )
                    {
                    // InternalMyDsl.g:238:4: (lv_n_7_0= ruleN )
                    // InternalMyDsl.g:239:5: lv_n_7_0= ruleN
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getNNParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_n_7_0=ruleN();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"n",
                    						lv_n_7_0,
                    						"org.xtext.example.mydsl.MyDsl.N");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleZIP"
    // InternalMyDsl.g:260:1: entryRuleZIP returns [EObject current=null] : iv_ruleZIP= ruleZIP EOF ;
    public final EObject entryRuleZIP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleZIP = null;


        try {
            // InternalMyDsl.g:260:44: (iv_ruleZIP= ruleZIP EOF )
            // InternalMyDsl.g:261:2: iv_ruleZIP= ruleZIP EOF
            {
             newCompositeNode(grammarAccess.getZIPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleZIP=ruleZIP();

            state._fsp--;

             current =iv_ruleZIP; 
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
    // $ANTLR end "entryRuleZIP"


    // $ANTLR start "ruleZIP"
    // InternalMyDsl.g:267:1: ruleZIP returns [EObject current=null] : (otherlv_0= '(zip' otherlv_1= '[' ( (lv_op2_2_0= ruleOP ) ) otherlv_3= ']' otherlv_4= '[' ( (lv_op3_5_0= ruleOP ) ) otherlv_6= ']' otherlv_7= ')' ) ;
    public final EObject ruleZIP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_op2_2_0 = null;

        EObject lv_op3_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:273:2: ( (otherlv_0= '(zip' otherlv_1= '[' ( (lv_op2_2_0= ruleOP ) ) otherlv_3= ']' otherlv_4= '[' ( (lv_op3_5_0= ruleOP ) ) otherlv_6= ']' otherlv_7= ')' ) )
            // InternalMyDsl.g:274:2: (otherlv_0= '(zip' otherlv_1= '[' ( (lv_op2_2_0= ruleOP ) ) otherlv_3= ']' otherlv_4= '[' ( (lv_op3_5_0= ruleOP ) ) otherlv_6= ']' otherlv_7= ')' )
            {
            // InternalMyDsl.g:274:2: (otherlv_0= '(zip' otherlv_1= '[' ( (lv_op2_2_0= ruleOP ) ) otherlv_3= ']' otherlv_4= '[' ( (lv_op3_5_0= ruleOP ) ) otherlv_6= ']' otherlv_7= ')' )
            // InternalMyDsl.g:275:3: otherlv_0= '(zip' otherlv_1= '[' ( (lv_op2_2_0= ruleOP ) ) otherlv_3= ']' otherlv_4= '[' ( (lv_op3_5_0= ruleOP ) ) otherlv_6= ']' otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getZIPAccess().getZipKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getZIPAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalMyDsl.g:283:3: ( (lv_op2_2_0= ruleOP ) )
            // InternalMyDsl.g:284:4: (lv_op2_2_0= ruleOP )
            {
            // InternalMyDsl.g:284:4: (lv_op2_2_0= ruleOP )
            // InternalMyDsl.g:285:5: lv_op2_2_0= ruleOP
            {

            					newCompositeNode(grammarAccess.getZIPAccess().getOp2OPParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_op2_2_0=ruleOP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getZIPRule());
            					}
            					set(
            						current,
            						"op2",
            						lv_op2_2_0,
            						"org.xtext.example.mydsl.MyDsl.OP");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getZIPAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getZIPAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalMyDsl.g:310:3: ( (lv_op3_5_0= ruleOP ) )
            // InternalMyDsl.g:311:4: (lv_op3_5_0= ruleOP )
            {
            // InternalMyDsl.g:311:4: (lv_op3_5_0= ruleOP )
            // InternalMyDsl.g:312:5: lv_op3_5_0= ruleOP
            {

            					newCompositeNode(grammarAccess.getZIPAccess().getOp3OPParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_op3_5_0=ruleOP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getZIPRule());
            					}
            					set(
            						current,
            						"op3",
            						lv_op3_5_0,
            						"org.xtext.example.mydsl.MyDsl.OP");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getZIPAccess().getRightSquareBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getZIPAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleZIP"


    // $ANTLR start "entryRuleOP"
    // InternalMyDsl.g:341:1: entryRuleOP returns [EObject current=null] : iv_ruleOP= ruleOP EOF ;
    public final EObject entryRuleOP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOP = null;


        try {
            // InternalMyDsl.g:341:43: (iv_ruleOP= ruleOP EOF )
            // InternalMyDsl.g:342:2: iv_ruleOP= ruleOP EOF
            {
             newCompositeNode(grammarAccess.getOPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOP=ruleOP();

            state._fsp--;

             current =iv_ruleOP; 
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
    // $ANTLR end "entryRuleOP"


    // $ANTLR start "ruleOP"
    // InternalMyDsl.g:348:1: ruleOP returns [EObject current=null] : ( (lv_inside_0_0= ruleINSIDE ) )* ;
    public final EObject ruleOP() throws RecognitionException {
        EObject current = null;

        EObject lv_inside_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:354:2: ( ( (lv_inside_0_0= ruleINSIDE ) )* )
            // InternalMyDsl.g:355:2: ( (lv_inside_0_0= ruleINSIDE ) )*
            {
            // InternalMyDsl.g:355:2: ( (lv_inside_0_0= ruleINSIDE ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_INSIDE2) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:356:3: (lv_inside_0_0= ruleINSIDE )
            	    {
            	    // InternalMyDsl.g:356:3: (lv_inside_0_0= ruleINSIDE )
            	    // InternalMyDsl.g:357:4: lv_inside_0_0= ruleINSIDE
            	    {

            	    				newCompositeNode(grammarAccess.getOPAccess().getInsideINSIDEParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_10);
            	    lv_inside_0_0=ruleINSIDE();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getOPRule());
            	    				}
            	    				add(
            	    					current,
            	    					"inside",
            	    					lv_inside_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.INSIDE");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleOP"


    // $ANTLR start "entryRuleINSIDE"
    // InternalMyDsl.g:377:1: entryRuleINSIDE returns [EObject current=null] : iv_ruleINSIDE= ruleINSIDE EOF ;
    public final EObject entryRuleINSIDE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleINSIDE = null;


        try {
            // InternalMyDsl.g:377:47: (iv_ruleINSIDE= ruleINSIDE EOF )
            // InternalMyDsl.g:378:2: iv_ruleINSIDE= ruleINSIDE EOF
            {
             newCompositeNode(grammarAccess.getINSIDERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleINSIDE=ruleINSIDE();

            state._fsp--;

             current =iv_ruleINSIDE; 
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
    // $ANTLR end "entryRuleINSIDE"


    // $ANTLR start "ruleINSIDE"
    // InternalMyDsl.g:384:1: ruleINSIDE returns [EObject current=null] : ( ( (lv_inside2_0_0= RULE_INSIDE2 ) ) this_INTEGER_1= RULE_INTEGER ) ;
    public final EObject ruleINSIDE() throws RecognitionException {
        EObject current = null;

        Token lv_inside2_0_0=null;
        Token this_INTEGER_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:390:2: ( ( ( (lv_inside2_0_0= RULE_INSIDE2 ) ) this_INTEGER_1= RULE_INTEGER ) )
            // InternalMyDsl.g:391:2: ( ( (lv_inside2_0_0= RULE_INSIDE2 ) ) this_INTEGER_1= RULE_INTEGER )
            {
            // InternalMyDsl.g:391:2: ( ( (lv_inside2_0_0= RULE_INSIDE2 ) ) this_INTEGER_1= RULE_INTEGER )
            // InternalMyDsl.g:392:3: ( (lv_inside2_0_0= RULE_INSIDE2 ) ) this_INTEGER_1= RULE_INTEGER
            {
            // InternalMyDsl.g:392:3: ( (lv_inside2_0_0= RULE_INSIDE2 ) )
            // InternalMyDsl.g:393:4: (lv_inside2_0_0= RULE_INSIDE2 )
            {
            // InternalMyDsl.g:393:4: (lv_inside2_0_0= RULE_INSIDE2 )
            // InternalMyDsl.g:394:5: lv_inside2_0_0= RULE_INSIDE2
            {
            lv_inside2_0_0=(Token)match(input,RULE_INSIDE2,FOLLOW_11); 

            					newLeafNode(lv_inside2_0_0, grammarAccess.getINSIDEAccess().getInside2INSIDE2TerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getINSIDERule());
            					}
            					setWithLastConsumed(
            						current,
            						"inside2",
            						lv_inside2_0_0,
            						"org.xtext.example.mydsl.MyDsl.INSIDE2");
            				

            }


            }

            this_INTEGER_1=(Token)match(input,RULE_INTEGER,FOLLOW_2); 

            			newLeafNode(this_INTEGER_1, grammarAccess.getINSIDEAccess().getINTEGERTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleINSIDE"


    // $ANTLR start "entryRuleTAB"
    // InternalMyDsl.g:418:1: entryRuleTAB returns [EObject current=null] : iv_ruleTAB= ruleTAB EOF ;
    public final EObject entryRuleTAB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTAB = null;


        try {
            // InternalMyDsl.g:418:44: (iv_ruleTAB= ruleTAB EOF )
            // InternalMyDsl.g:419:2: iv_ruleTAB= ruleTAB EOF
            {
             newCompositeNode(grammarAccess.getTABRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTAB=ruleTAB();

            state._fsp--;

             current =iv_ruleTAB; 
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
    // $ANTLR end "entryRuleTAB"


    // $ANTLR start "ruleTAB"
    // InternalMyDsl.g:425:1: ruleTAB returns [EObject current=null] : ( ( (lv_content_0_0= RULE_CONTENT ) ) | ( (lv_add_1_0= ruleADD ) )* ) ;
    public final EObject ruleTAB() throws RecognitionException {
        EObject current = null;

        Token lv_content_0_0=null;
        EObject lv_add_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:431:2: ( ( ( (lv_content_0_0= RULE_CONTENT ) ) | ( (lv_add_1_0= ruleADD ) )* ) )
            // InternalMyDsl.g:432:2: ( ( (lv_content_0_0= RULE_CONTENT ) ) | ( (lv_add_1_0= ruleADD ) )* )
            {
            // InternalMyDsl.g:432:2: ( ( (lv_content_0_0= RULE_CONTENT ) ) | ( (lv_add_1_0= ruleADD ) )* )
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
                    // InternalMyDsl.g:433:3: ( (lv_content_0_0= RULE_CONTENT ) )
                    {
                    // InternalMyDsl.g:433:3: ( (lv_content_0_0= RULE_CONTENT ) )
                    // InternalMyDsl.g:434:4: (lv_content_0_0= RULE_CONTENT )
                    {
                    // InternalMyDsl.g:434:4: (lv_content_0_0= RULE_CONTENT )
                    // InternalMyDsl.g:435:5: lv_content_0_0= RULE_CONTENT
                    {
                    lv_content_0_0=(Token)match(input,RULE_CONTENT,FOLLOW_2); 

                    					newLeafNode(lv_content_0_0, grammarAccess.getTABAccess().getContentCONTENTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTABRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"content",
                    						lv_content_0_0,
                    						"org.xtext.example.mydsl.MyDsl.CONTENT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:452:3: ( (lv_add_1_0= ruleADD ) )*
                    {
                    // InternalMyDsl.g:452:3: ( (lv_add_1_0= ruleADD ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ADD2) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:453:4: (lv_add_1_0= ruleADD )
                    	    {
                    	    // InternalMyDsl.g:453:4: (lv_add_1_0= ruleADD )
                    	    // InternalMyDsl.g:454:5: lv_add_1_0= ruleADD
                    	    {

                    	    					newCompositeNode(grammarAccess.getTABAccess().getAddADDParserRuleCall_1_0());
                    	    				
                    	    pushFollow(FOLLOW_12);
                    	    lv_add_1_0=ruleADD();

                    	    state._fsp--;


                    	    					if (current==null) {
                    	    						current = createModelElementForParent(grammarAccess.getTABRule());
                    	    					}
                    	    					add(
                    	    						current,
                    	    						"add",
                    	    						lv_add_1_0,
                    	    						"org.xtext.example.mydsl.MyDsl.ADD");
                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


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
    // $ANTLR end "ruleTAB"


    // $ANTLR start "entryRuleADD"
    // InternalMyDsl.g:475:1: entryRuleADD returns [EObject current=null] : iv_ruleADD= ruleADD EOF ;
    public final EObject entryRuleADD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleADD = null;


        try {
            // InternalMyDsl.g:475:44: (iv_ruleADD= ruleADD EOF )
            // InternalMyDsl.g:476:2: iv_ruleADD= ruleADD EOF
            {
             newCompositeNode(grammarAccess.getADDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleADD=ruleADD();

            state._fsp--;

             current =iv_ruleADD; 
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
    // $ANTLR end "entryRuleADD"


    // $ANTLR start "ruleADD"
    // InternalMyDsl.g:482:1: ruleADD returns [EObject current=null] : ( ( (lv_add2_0_0= RULE_ADD2 ) ) this_INTEGER_1= RULE_INTEGER ) ;
    public final EObject ruleADD() throws RecognitionException {
        EObject current = null;

        Token lv_add2_0_0=null;
        Token this_INTEGER_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:488:2: ( ( ( (lv_add2_0_0= RULE_ADD2 ) ) this_INTEGER_1= RULE_INTEGER ) )
            // InternalMyDsl.g:489:2: ( ( (lv_add2_0_0= RULE_ADD2 ) ) this_INTEGER_1= RULE_INTEGER )
            {
            // InternalMyDsl.g:489:2: ( ( (lv_add2_0_0= RULE_ADD2 ) ) this_INTEGER_1= RULE_INTEGER )
            // InternalMyDsl.g:490:3: ( (lv_add2_0_0= RULE_ADD2 ) ) this_INTEGER_1= RULE_INTEGER
            {
            // InternalMyDsl.g:490:3: ( (lv_add2_0_0= RULE_ADD2 ) )
            // InternalMyDsl.g:491:4: (lv_add2_0_0= RULE_ADD2 )
            {
            // InternalMyDsl.g:491:4: (lv_add2_0_0= RULE_ADD2 )
            // InternalMyDsl.g:492:5: lv_add2_0_0= RULE_ADD2
            {
            lv_add2_0_0=(Token)match(input,RULE_ADD2,FOLLOW_11); 

            					newLeafNode(lv_add2_0_0, grammarAccess.getADDAccess().getAdd2ADD2TerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getADDRule());
            					}
            					setWithLastConsumed(
            						current,
            						"add2",
            						lv_add2_0_0,
            						"org.xtext.example.mydsl.MyDsl.ADD2");
            				

            }


            }

            this_INTEGER_1=(Token)match(input,RULE_INTEGER,FOLLOW_2); 

            			newLeafNode(this_INTEGER_1, grammarAccess.getADDAccess().getINTEGERTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleADD"


    // $ANTLR start "entryRuleN"
    // InternalMyDsl.g:516:1: entryRuleN returns [EObject current=null] : iv_ruleN= ruleN EOF ;
    public final EObject entryRuleN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleN = null;


        try {
            // InternalMyDsl.g:516:42: (iv_ruleN= ruleN EOF )
            // InternalMyDsl.g:517:2: iv_ruleN= ruleN EOF
            {
             newCompositeNode(grammarAccess.getNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleN=ruleN();

            state._fsp--;

             current =iv_ruleN; 
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
    // $ANTLR end "entryRuleN"


    // $ANTLR start "ruleN"
    // InternalMyDsl.g:523:1: ruleN returns [EObject current=null] : ( ( (lv_integer_0_0= RULE_INTEGER ) ) ( (lv_print_1_0= RULE_PRINT ) ) ) ;
    public final EObject ruleN() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token lv_print_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:529:2: ( ( ( (lv_integer_0_0= RULE_INTEGER ) ) ( (lv_print_1_0= RULE_PRINT ) ) ) )
            // InternalMyDsl.g:530:2: ( ( (lv_integer_0_0= RULE_INTEGER ) ) ( (lv_print_1_0= RULE_PRINT ) ) )
            {
            // InternalMyDsl.g:530:2: ( ( (lv_integer_0_0= RULE_INTEGER ) ) ( (lv_print_1_0= RULE_PRINT ) ) )
            // InternalMyDsl.g:531:3: ( (lv_integer_0_0= RULE_INTEGER ) ) ( (lv_print_1_0= RULE_PRINT ) )
            {
            // InternalMyDsl.g:531:3: ( (lv_integer_0_0= RULE_INTEGER ) )
            // InternalMyDsl.g:532:4: (lv_integer_0_0= RULE_INTEGER )
            {
            // InternalMyDsl.g:532:4: (lv_integer_0_0= RULE_INTEGER )
            // InternalMyDsl.g:533:5: lv_integer_0_0= RULE_INTEGER
            {
            lv_integer_0_0=(Token)match(input,RULE_INTEGER,FOLLOW_13); 

            					newLeafNode(lv_integer_0_0, grammarAccess.getNAccess().getIntegerINTEGERTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNRule());
            					}
            					setWithLastConsumed(
            						current,
            						"integer",
            						lv_integer_0_0,
            						"org.xtext.example.mydsl.MyDsl.INTEGER");
            				

            }


            }

            // InternalMyDsl.g:549:3: ( (lv_print_1_0= RULE_PRINT ) )
            // InternalMyDsl.g:550:4: (lv_print_1_0= RULE_PRINT )
            {
            // InternalMyDsl.g:550:4: (lv_print_1_0= RULE_PRINT )
            // InternalMyDsl.g:551:5: lv_print_1_0= RULE_PRINT
            {
            lv_print_1_0=(Token)match(input,RULE_PRINT,FOLLOW_2); 

            					newLeafNode(lv_print_1_0, grammarAccess.getNAccess().getPrintPRINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNRule());
            					}
            					setWithLastConsumed(
            						current,
            						"print",
            						lv_print_1_0,
            						"org.xtext.example.mydsl.MyDsl.PRINT");
            				

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
    // $ANTLR end "ruleN"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000002A0020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001000C0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000100L});

}