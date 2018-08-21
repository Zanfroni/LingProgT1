/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.example.mydsl.myDsl.Model

@RunWith(XtextRunner)
@InjectWith(MyDslInjectorProvider)
class MyDslParsingTest {
	@Inject
	ParseHelper<Model> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			show n ++ " bottles!"
		''')
		Assert.assertNotNull(result)
		//Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void loadModel2() {
		val result = parseHelper.parse('''
			show [1,2,3]
		''')
		Assert.assertNotNull(result)
		//Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void loadModel3() {
		val result = parseHelper.parse('''
			show (2+4)
		''')
		Assert.assertNotNull(result)
		//Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void loadModel4() {
		val result = parseHelper.parse('''
			show (zip [1,2,3] [5,4,3])
		''')
		Assert.assertNotNull(result)
		//Assert.assertTrue(result.eResource.errors.isEmpty)
	}
	
	@Test
	def void loadModel5() {
		val result = parseHelper.parse('''
			show (length (lines contents)) ++ " bottles!"
		''')
		Assert.assertNotNull(result)
		//Assert.assertTrue(result.eResource.errors.isEmpty)
	}
}
