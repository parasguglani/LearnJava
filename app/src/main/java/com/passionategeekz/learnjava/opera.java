package com.passionategeekz.learnjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class opera extends AppCompatActivity {

    private String oper="Operators";
    private String operdata="Java provides a rich set of operators to manipulate variables. We can divide all the Java operators into the following groups −\n" +
            "\n" +
            "Arithmetic Operators\n" +
            "Relational Operators\n" +
            "Bitwise Operators\n" +
            "Logical Operators\n" +
            "Assignment Operators\n" +
            "Misc Operators";

    private String a="Arithmetic Operators";
    private String aa="Operator\tDescription\tExample\n" +
            "+ (Addition)\tAdds values on either side of the operator.\tA + B will give 30\n" +
            "- (Subtraction)\tSubtracts right-hand operand from left-hand operand.\tA - B will give -10\n" +
            "* (Multiplication)\tMultiplies values on either side of the operator.\tA * B will give 200\n" +
            "/ (Division)\tDivides left-hand operand by right-hand operand.\tB / A will give 2\n" +
            "% (Modulus)\tDivides left-hand operand by right-hand operand and returns remainder.\tB % A will give 0\n" +
            "++ (Increment)\tIncreases the value of operand by 1.\tB++ gives 21\n" +
            "-- (Decrement)\tDecreases the value of operand by 1.\tB-- gives 19";

    private String re="Relational Operators";
    private  String rel="Operator\tDescription\tExample\n" +
            "== (equal to)\tChecks if the values of two operands are equal or not, if yes then condition becomes true.\t(A == B) is not true.\n" +
            "!= (not equal to)\tChecks if the values of two operands are equal or not, if values are not equal then condition becomes true.\t(A != B) is true.\n" +
            "> (greater than)\tChecks if the value of left operand is greater than the value of right operand, if yes then condition becomes true.\t(A > B) is not true.\n" +
            "< (less than)\tChecks if the value of left operand is less than the value of right operand, if yes then condition becomes true.\t(A < B) is true.\n" +
            ">= (greater than or equal to)\tChecks if the value of left operand is greater than or equal to the value of right operand, if yes then condition becomes true.\t(A >= B) is not true.\n" +
            "<= (less than or equal to)\tChecks if the value of left operand is less than or equal to the value of right operand, if yes then condition becomes true.\t(A <= B) is true.";

    private String bit="Bitwise Operators";
    private  String bitdata="& (bitwise and)\tBinary AND Operator copies a bit to the result if it exists in both operands.\t(A & B) will give 12 which is 0000 1100\n" +
            "| (bitwise or)\tBinary OR Operator copies a bit if it exists in either operand.\t(A | B) will give 61 which is 0011 1101\n" +
            "^ (bitwise XOR)\tBinary XOR Operator copies the bit if it is set in one operand but not both.\t(A ^ B) will give 49 which is 0011 0001\n" +
            "~ (bitwise compliment)\tBinary Ones Complement Operator is unary and has the effect of 'flipping' bits.\t(~A ) will give -61 which is 1100 0011 in 2's complement form due to a signed binary number.\n" +
            "<< (left shift)\tBinary Left Shift Operator. The left operands value is moved left by the number of bits specified by the right operand.\tA << 2 will give 240 which is 1111 0000\n" +
            ">> (right shift)\tBinary Right Shift Operator. The left operands value is moved right by the number of bits specified by the right operand.\tA >> 2 will give 15 which is 1111\n" +
            ">>> (zero fill right shift)\tShift right zero fill operator. The left operands value is moved right by the number of bits specified by the right operand and shifted values are filled up with zeros.\tA >>>2 will give 15 which is 0000 1111";

    private String lo=" Logical Operators";
    private String lodata="Operator\tDescription\tExample\n" +
            "&& (logical and)\tCalled Logical AND operator. If both the operands are non-zero, then the condition becomes true.\t(A && B) is false\n" +
            "|| (logical or)\tCalled Logical OR Operator. If any of the two operands are non-zero, then the condition becomes true.\t(A || B) is true\n" +
            "! (logical not)\tCalled Logical NOT Operator. Use to reverses the logical state of its operand. If a condition is true then Logical NOT operator will make false.\t!(A && B) is true";

    private String ass="Assignment Operators";
    private String assdata="Operator\tDescription\tExample\n" +
            "=\tSimple assignment operator. Assigns values from right side operands to left side operand.\tC = A + B will assign value of A + B into C\n" +
            "+=\tAdd AND assignment operator. It adds right operand to the left operand and assign the result to left operand.\tC += A is equivalent to C = C + A\n" +
            "-=\tSubtract AND assignment operator. It subtracts right operand from the left operand and assign the result to left operand.\tC -= A is equivalent to C = C – A\n" +
            "*=\tMultiply AND assignment operator. It multiplies right operand with the left operand and assign the result to left operand.\tC *= A is equivalent to C = C * A\n" +
            "/=\tDivide AND assignment operator. It divides left operand with the right operand and assign the result to left operand.\tC /= A is equivalent to C = C / A\n" +
            "%=\tModulus AND assignment operator. It takes modulus using two operands and assign the result to left operand.\tC %= A is equivalent to C = C % A\n" +
            "<<=\tLeft shift AND assignment operator.\tC <<= 2 is same as C = C << 2\n" +
            ">>=\tRight shift AND assignment operator.\tC >>= 2 is same as C = C >> 2\n" +
            "&=\tBitwise AND assignment operator.\tC &= 2 is same as C = C & 2\n" +
            "^=\tbitwise exclusive OR and assignment operator.\tC ^= 2 is same as C = C ^ 2\n" +
            "|=\tbitwise inclusive OR and assignment operator.\tC |= 2 is same as C = C | 2\n";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opera);







    }
}
