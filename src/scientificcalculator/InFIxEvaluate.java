package scientificcalculator;


public class InFIxEvaluate {
    public final String divideZero = " Undefined ";

    // To Check Precedence
    public int prec(char ch) {
        if (ch == '!') {
            return 5;
        } else if (ch == '(' || ch == ')') {
            return 4;
        } else if (ch == '^') {
            return 3;
        } else if (ch == '/' || ch == '*') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        } else
            return -1;

    }

    // Calculation method
    public Object calculate(double num1, double num2, char op) {
        switch (op) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    return divideZero;
                } else {
                    return num1 / num2;
                }
            case '^':
                return Math.pow(num1, num2);
            default:
                return 0;

        }
    }

    // factorial method
    public double factorial(double y) {
        double fact = 1;
        if (y == 0 || y == 1) {
            fact = 1;
        } else {
            for (int i = 2; i <= y; i++) {
                fact *= i;
            }
        }
        return fact;
    }

    // INFIX to PREFIX and PREFIX Evaluation
    public String evaluate(String str) {
        // Stack<Double> operand = new Stack<Double>();
        Stack operand = new Stack();
        // Stack<Character> operator = new Stack<Character>();
        Char_Stack operator = new Char_Stack();
        
        for (int i = 0; i < str.length(); i++) {
            //checks and stores the ch
            char ch = str.charAt(i);
            //builts a number
            if (Character.isDigit(ch)) {
                String value = "";
                while (i < str.length()) {
                    if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.') {
                        value += str.charAt(i); // value=value+str.charAt(i)
                        i++;
                    } else {
                        break;
                    }

                }
                i--;
                operand.push(Double.parseDouble(value));
            }

            else if (ch == '!') {
                double facValue = factorial(operand.peek());
                operand.pop();
                operand.push(facValue);

            }
            // For COS Function
            else if (ch == 'c') {
                String Cvalue = "";
                i = i + 3;
                while (i < str.length()) {
                    if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.') {
                        Cvalue += str.charAt(i);
                        i++;
                    } else {
                        break;
                    }

                }
                i--;

                double CosValue = Math.cos(Double.parseDouble(Cvalue));
                operand.push(CosValue);

            }
            // For SIN Function
            else if (ch == 's') {
                String Svalue = "";
                i = i + 3;
                while (i < str.length()) {
                    if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.') {
                        Svalue += str.charAt(i);
                        i++;
                    } else {
                        break;
                    }

                }
                i--;

                double SinValue = Math.sin(Double.parseDouble(Svalue));
                operand.push(SinValue);

            }
            // For TAN Function
            else if (ch == 't') {
                String Tvalue = "";
                i = i + 3;
                while (i < str.length()) {
                    if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.') {
                        Tvalue += str.charAt(i);
                        i++;
                    } else {
                        break;
                    }

                }
                i--;

                double TanValue = Math.tan(Double.parseDouble(Tvalue));
                operand.push(TanValue);

            }
            // For LOG Function
            else if (ch == 'l') {
                String Lvalue = "";
                i = i + 3;
                while (i < str.length()) {
                    if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.') {
                        Lvalue += str.charAt(i);
                        i++;
                    } else {
                        break;
                    }

                }
                i--;

                double LogValue = Math.log10(Double.parseDouble(Lvalue));
                operand.push(LogValue);

            }
            // For Square Root
            else if (ch == '√') {
                String SRvalue = "";
                i = i + 1;
                while (i < str.length()) {
                    if (Character.isDigit(str.charAt(i)) || str.charAt(i) == '.') {
                        SRvalue += str.charAt(i);
                        i++;
                    } else {
                        break;
                    }

                }
                i--;

                double SqrtValue = Math.sqrt(Double.parseDouble(SRvalue));
                operand.push(SqrtValue);

            }

            else if (ch == '(') {
                operator.push(ch);
            } 
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^') { // When operator comes then
                                                                                        // check for
                if (operator.isEmpty()) {
                    operator.push(ch);
                } else if (operator.peek() == '(') {
                    operator.push(ch);
                } else if (prec(operator.peek()) >= prec(ch)) {
                    char op = operator.pop();
                    double num2 = operand.pop();
                    double num1 = operand.pop();
                    Object value = calculate(num1, num2, op);
                    if (value instanceof String)
                        return divideZero;
                    operand.push((double) value);
                    operator.push(ch);
                } else {
                    operator.push(ch);
                }
            } else if (ch == ')') {
                while (operator.peek() != '(') {
                    char op = operator.pop();
                    double num2 = operand.pop();
                    double num1 = operand.pop();
                    Object value = calculate(num1, num2, op);
                    if (value instanceof String)
                        return divideZero;
                    operand.push((double) value);
                }
                operator.pop();
            }
        }
        // Ending of expression
        while (operator.size() != 0) {
            char op = operator.pop();
            double num2 = operand.pop();
            double num1 = operand.pop();
            Object value = calculate(num1, num2, op);
            if (value instanceof String)
                return divideZero;
            operand.push((double) value);
        }

        return String.valueOf(operand.pop());
    }

    
    
}
