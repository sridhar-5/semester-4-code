module halfadder1();

reg b;
reg a;
wire sum;
wire carry;

and(carry,a,b);
xor(sum,a,b);


initial
begin
    $monitor("a=%b, b=%b, sum=%b,carry=%b",a,b,sum,carry);
    a = 0;b = 0;#10;
    a = 0;b = 1;#10;
    a = 1;b = 0;#10;
    a = 1;b = 1;#10;
    $finish;
end
endmodule
