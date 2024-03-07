
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;
import java.io.IOException;

public class TestMyTest4FileVisitor {
	
	static Map<String, Integer> variables = new HashMap<>();
static public class VariableInfo {
	private String name; 
	private int value;
	public VariableInfo(String name, int value) {
	this.name = name;
	this.value = value;
	
    }
	public void setValueVariableInfo(String name,int value){
		this.name = name;
		this.value = value;
	}
	public int getintValueVariableInfo()
	{
		return this.value;
	}
	public String getNameVariableInfo()
	{
		return this.name;
	}
}
public static class MyTest4FileVisitor extends
test4BaseVisitor<VariableInfo>
{
	// ключ значение для аннотирования
	
	ParseTreeProperty<VariableInfo> values = new ParseTreeProperty<VariableInfo>();
	// Геттеры и сеттеры для ассоциирования узлов со значениями
	public void setValue(ParseTree node, int value, String name)
	{
		VariableInfo info = new VariableInfo(name,value);
		values.put(node,info);
	}
	public void getValue(ParseTree node, int value, String name)
	{
		values.get(node);
	}
	
	

	
	public VariableInfo visitMov(test4Parser.MovContext ctx) { 
		
		
		VariableInfo name =  visit(ctx.operand1());
		VariableInfo value =  visit(ctx.operand2());
		VariableInfo info = new VariableInfo(name.getNameVariableInfo(),value.getintValueVariableInfo());
		variables.put(name.getNameVariableInfo(),value.getintValueVariableInfo());

		return info;
		
		}
		
	public VariableInfo visitAdd(test4Parser.AddContext ctx) { 
		
		
		VariableInfo name =  visit(ctx.operand1());
		VariableInfo value =  visit(ctx.operand2());
		Integer value2 = variables.get(name.getNameVariableInfo());
		variables.put(name.getNameVariableInfo(),value.getintValueVariableInfo()+value2);
		VariableInfo info = new VariableInfo(name.getNameVariableInfo(),value.getintValueVariableInfo());
	
		

		return info;
		
		}
		
	public VariableInfo visitXchg(test4Parser.XchgContext ctx) {
    VariableInfo name1Info = visit(ctx.operand1());
    VariableInfo name2Info = visit(ctx.operand2());
    String name1 = name1Info.getNameVariableInfo();
    String name2 = name2Info.getNameVariableInfo();

    // Проверяем, существуют ли обе переменные в хеш-таблице.
    // Если одной из переменных не существует, инициализируем её значением 0.
    Integer value1 = variables.getOrDefault(name1, 0);
    Integer value2 = variables.getOrDefault(name2, 0);

    // Выполняем обмен значениями.
    variables.put(name1, value2);
    variables.put(name2, value1);

    // Возвращаем информацию о выполнении операции. В зависимости от вашей задачи,
    // может потребоваться возвращать более осмысленный результат.
    return new VariableInfo("", 0);
}

	
		
		
	public VariableInfo visitSub(test4Parser.SubContext ctx) { 
		
		
		VariableInfo name =  visit(ctx.operand1());
		VariableInfo value =  visit(ctx.operand2());
		Integer value2 = variables.get(name.getNameVariableInfo());
		variables.put(name.getNameVariableInfo(),value2-value.getintValueVariableInfo());
		VariableInfo info = new VariableInfo(name.getNameVariableInfo(),value.getintValueVariableInfo());
	
		

		return info;
		
		}

	public VariableInfo visitOperand1(test4Parser.Operand1Context ctx)
	{
		String name = ctx.ID().getText();
		VariableInfo info = new VariableInfo(name, 0);
		return info;
	}
	public VariableInfo visitOperand2(test4Parser.Operand2Context ctx) {
    if (ctx.INT() != null) {
        // Операнд является целым числом
        int value = Integer.parseInt(ctx.INT().getText());
        return new VariableInfo("", value);
    } else if (ctx.ID() != null) {
        // Операнд является идентификатором
        String name = ctx.ID().getText();
        Integer value = variables.get(name);
        if (value == null) {
          
            value = 0; 
        }
        return new VariableInfo(name, value);
    } else {
        throw new RuntimeException("Operand2 не содержит ни INT, ни ID");
    }
}

	    
}
public static void main(String[] args) throws IOException {
        // Использование System.in для чтения ввода из консоли
        CharStream input = CharStreams.fromStream(System.in);

        // Создание лексера и парсера
        test4Lexer lexer = new test4Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        test4Parser parser = new test4Parser(tokens);

        // Построение дерева разбора начиная с начального правила 'programm'
        ParseTree tree = parser.programm();

        // Создание и использование визитора для обхода дерева разбора
        MyTest4FileVisitor visitor = new MyTest4FileVisitor();
        visitor.visit(tree);
		TestMyTest4FileVisitor.variables.forEach((key, value) -> System.out.println(key + " = " + value));

        // Вывод результатов
        
    }

}