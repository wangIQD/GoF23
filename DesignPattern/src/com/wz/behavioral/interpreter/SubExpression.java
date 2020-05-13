package com.wz.behavioral.interpreter;

import java.util.HashMap;

/**
 * @author 隔壁老王
 * @create 2020-05-06 19:46
 * @description
 */
//加法解释器
public class SubExpression extends SymbolExpression {

	public SubExpression(Expression left, Expression right) {
		super(left, right);
	}

	//求出left 和 right 表达式相减后的结果
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var) - super.right.interpreter(var);
	}
}
