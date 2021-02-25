module halfadder(a,b,sum,carry);

input a,b;
output sum,carry;

and(sum,a,b);
xor(carry,a,b);

endmodule
