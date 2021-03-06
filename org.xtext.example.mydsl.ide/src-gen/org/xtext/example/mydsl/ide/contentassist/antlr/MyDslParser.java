/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getComplementAccess().getAlternatives(), "rule__Complement__Alternatives");
			builder.put(grammarAccess.getFunctionAccess().getAlternatives(), "rule__Function__Alternatives");
			builder.put(grammarAccess.getNumbersAccess().getAlternatives(), "rule__Numbers__Alternatives");
			builder.put(grammarAccess.getConcatAccess().getAlternatives_1(), "rule__Concat__Alternatives_1");
			builder.put(grammarAccess.getHaskellAccess().getGroup(), "rule__Haskell__Group__0");
			builder.put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
			builder.put(grammarAccess.getComplementAccess().getGroup_1(), "rule__Complement__Group_1__0");
			builder.put(grammarAccess.getComplementAccess().getGroup_2(), "rule__Complement__Group_2__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup_1(), "rule__Function__Group_1__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup_2(), "rule__Function__Group_2__0");
			builder.put(grammarAccess.getNumbersAccess().getGroup_0(), "rule__Numbers__Group_0__0");
			builder.put(grammarAccess.getConcatAccess().getGroup(), "rule__Concat__Group__0");
			builder.put(grammarAccess.getNewConcatAccess().getGroup(), "rule__NewConcat__Group__0");
			builder.put(grammarAccess.getElementAccess().getGroup(), "rule__Element__Group__0");
			builder.put(grammarAccess.getElementAccess().getGroup_1(), "rule__Element__Group_1__0");
			builder.put(grammarAccess.getModelAccess().getHaskellAssignment(), "rule__Model__HaskellAssignment");
			builder.put(grammarAccess.getHaskellAccess().getExpressionAssignment_1(), "rule__Haskell__ExpressionAssignment_1");
			builder.put(grammarAccess.getExpressionAccess().getComplementAssignment_0(), "rule__Expression__ComplementAssignment_0");
			builder.put(grammarAccess.getExpressionAccess().getConcatAssignment_1(), "rule__Expression__ConcatAssignment_1");
			builder.put(grammarAccess.getComplementAccess().getIdAssignment_0(), "rule__Complement__IdAssignment_0");
			builder.put(grammarAccess.getComplementAccess().getNumbersAssignment_1_1(), "rule__Complement__NumbersAssignment_1_1");
			builder.put(grammarAccess.getComplementAccess().getFunctionAssignment_2_1(), "rule__Complement__FunctionAssignment_2_1");
			builder.put(grammarAccess.getFunctionAccess().getElementAssignment_0(), "rule__Function__ElementAssignment_0");
			builder.put(grammarAccess.getFunctionAccess().getNumb1Assignment_1_2(), "rule__Function__Numb1Assignment_1_2");
			builder.put(grammarAccess.getFunctionAccess().getNumb2Assignment_1_5(), "rule__Function__Numb2Assignment_1_5");
			builder.put(grammarAccess.getNumbersAccess().getOneAssignment_0_0(), "rule__Numbers__OneAssignment_0_0");
			builder.put(grammarAccess.getNumbersAccess().getNumbAssignment_0_2(), "rule__Numbers__NumbAssignment_0_2");
			builder.put(grammarAccess.getNumbersAccess().getTwoAssignment_1(), "rule__Numbers__TwoAssignment_1");
			builder.put(grammarAccess.getConcatAccess().getIdAssignment_1_0(), "rule__Concat__IdAssignment_1_0");
			builder.put(grammarAccess.getConcatAccess().getOpAssignment_1_1(), "rule__Concat__OpAssignment_1_1");
			builder.put(grammarAccess.getConcatAccess().getNewAssignment_2(), "rule__Concat__NewAssignment_2");
			builder.put(grammarAccess.getNewConcatAccess().getHaskellAssignment_1(), "rule__NewConcat__HaskellAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
