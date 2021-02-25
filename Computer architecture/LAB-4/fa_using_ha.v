module fa_using_ha(a,b,c,sum,carry);

input a,b,c;
output sum;
output carry;

wire d;
wire e;
wire g;

halfadder adder1(a,b,d,e);
halfadder adder2(c,d,sum,g);
or(carry,g,e);

endmodule
