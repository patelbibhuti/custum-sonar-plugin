/*
 * SonarQube Java Custom Rules Example
 * Copyright (C) 2018 MyCompany 
 *
 */
package com.company.customrules.check;

import com.google.common.collect.ImmutableList;
import java.util.List;

import org.sonar.check.Priority;
import org.sonar.check.Rule;
import org.sonar.plugins.java.api.IssuableSubscriptionVisitor;
import org.sonar.plugins.java.api.semantic.Symbol.MethodSymbol;
import org.sonar.plugins.java.api.tree.MethodTree;
import org.sonar.plugins.java.api.tree.Tree;

/**
 * To use subscription visitor, just extend the IssuableSubscriptionVisitor.
 * 
 * @author Bibhuti
 * 
 */
@Rule(
		key = "AvoidTooManyParametersForMethod",
		description = "Method should not have more then 5 parameters", 
		priority = Priority.MAJOR,
		tags = {"bug" }
)
public class AvoidTooManyParametersForMethodRule extends IssuableSubscriptionVisitor {

	@Override
	public List<Tree.Kind> nodesToVisit() {
		// Register to the kind of nodes you want to be called upon visit.
		return ImmutableList.of(Tree.Kind.METHOD);
	}

	@Override
	public void visitNode(Tree tree) {
		// Cast the node to the correct type :
		// in this case we registered only to one kind so we will only receive
		// MethodTree see Tree.Kind enum to know about which type you can
		// cast depending on Kind.
		MethodTree methodTree = (MethodTree) tree;

		// Retrieve symbol of method.
		MethodSymbol methodSymbol = methodTree.symbol();
		// Check method has only less then 5 argument.
		if (methodSymbol.parameterTypes().size() > 5) {
			// raise an issue on this node of the SyntaxTree
			reportIssue(tree, "Too many inputs parameters");
		}
	}
}
