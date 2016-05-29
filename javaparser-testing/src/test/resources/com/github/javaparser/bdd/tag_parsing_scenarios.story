Scenario: A class with a Lambdas is parsed by the Java Parser

Given a CompilationUnit
When the following source is parsed:
package bdd.samples;
import java.util.stream.Stream;
public class Tags {

    public static void main(String[] args) {
        <Alpha>
            <Beta b="b">
                <Gamma
                    $_g$ksdkjfJKHDAFG09814="b" />
                <Delta
                    g={1 + 2 + 4}
                    g2={this}
                    g3={'v'} />
            </Beta>
        </Alpha>
    }
}
Then tag in statement 1 in method 1 in class 1 is of type Alpha
Then tag in statement 1 in method 1 in class 1 is an opening tag
Then tag in statement 2 in method 1 in class 1 is of type Beta
Then tag in statement 2 in method 1 in class 1 is an opening tag
Then tag in statement 2 in method 1 in class 1 has an attribute called b
Then tag in statement 3 in method 1 in class 1 is of type Gamma
Then tag in statement 3 in method 1 in class 1 is a self-closing tag
Then tag in statement 3 in method 1 in class 1 has an attribute called $_g$ksdkjfJKHDAFG09814
Then tag in statement 4 in method 1 in class 1 is of type Delta
Then tag in statement 4 in method 1 in class 1 is a self-closing tag
Then tag in statement 4 in method 1 in class 1 has an attribute called g
Then tag in statement 4 in method 1 in class 1 has an attribute called g2
Then tag in statement 4 in method 1 in class 1 has an attribute called g3
Then tag in statement 5 in method 1 in class 1 is of type Beta
Then tag in statement 5 in method 1 in class 1 is a closing tag
Then tag in statement 6 in method 1 in class 1 is of type Alpha
Then tag in statement 6 in method 1 in class 1 is a closing tag