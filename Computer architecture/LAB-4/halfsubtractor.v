module halfadder();

reg b;
reg a;

wire difference;
wire borrow;
wire inter;

xor(difference,a,b);
not(inter,a);
and(borrow,inter,b);


initial
begin
    $monitor("a=%b, b=%b, difference=%b, borrow=%b" , a, b, difference, borrow);
    a = 0;b = 0;#10;
    a = 0;b = 1;#10;
    a = 1;b = 0;#10;
    a = 1;b = 1;#10;
    $finish;
end
endmodule
