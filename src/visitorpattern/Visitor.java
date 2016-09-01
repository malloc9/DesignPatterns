package visitorpattern;

public interface Visitor {
	void visit(HtmlElement element);

	void visit(HtmlParentElement parentElement);
}
