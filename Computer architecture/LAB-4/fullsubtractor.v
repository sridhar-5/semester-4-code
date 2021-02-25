module gatelevel2();

reg c;
reg a;
reg b;

wire a_b_res;
wire difference;
wire borrow;
wire not_a;
wire and_res;
wire res_not;
wire pre_res;

xor(a_b_res,a,b);
xor(difference,a_b_res,c);
not(not_a,a);
and(and_res,not_a,b);
not(res_not,a_b_res);
and(pre_res,c,res_not);
or(borrow,and_res,pre_res);

initial
begin
    $monitor("a=%b, b=%b, c=%b, difference=%b, borrow =%b", a, b, c, difference, borrow);
    a = 0;b = 0;c = 0;#10;
    a = 0;b = 0;c = 1;#10;
    a = 0;b = 1;c = 0;#10;
    a = 0;b = 1;c = 1;#10;
    a = 1;b = 0;c = 0;#10;
    a = 1;b = 0;c = 1;#10;
    a = 1;b = 1;c = 0;#10;
    a = 1;b = 1;c = 1;#10;
    $finish;
end
endmodule
